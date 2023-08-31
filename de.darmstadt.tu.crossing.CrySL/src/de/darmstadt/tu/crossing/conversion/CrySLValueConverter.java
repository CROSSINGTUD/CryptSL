package de.darmstadt.tu.crossing.conversion;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;

import com.google.inject.Singleton;

@Singleton
public class CrySLValueConverter extends DefaultTerminalConverters {

	@ValueConverter(rule = "INTEGER")
	public IValueConverter<String> intConverter() {
		return new IntConverter();
	}

	private static class IntConverter
		implements IValueConverter<String>
	{
		@Override
		public String toString(String value) {
			return value.toString();
		};

		@Override
		public String toValue(String text, INode node) {
			try {
				// one might be null, never both
				text = text != null ? text : node.getText();
				if(!text.contains("^"))
					return text;
				String[] parts = text.split("\\^");
				int base = Integer.parseInt(parts[0]);
				int power = Integer.parseInt(parts[1]);
				return Integer.toString((int)Math.pow(base, power));
			}
			catch(Exception e) {
				throw new ValueConverterException("err", node, e);
			}
		};
	}

}

