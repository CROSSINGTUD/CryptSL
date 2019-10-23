package de.darmstadt.tu.crossing.ui.wizard;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "de.darmstadt.tu.crossing.ui.wizard.messages"; //$NON-NLS-1$
	
	public static String HelloWorldFile_Label;
	public static String HelloWorldFile_Description;
	public static String CryptSLFile_Label;
	public static String CryptSLFile_Description;
	public static String Select_Project;
	public static String Select_Directory;
	public static String Project_NotExixst;
	public static String ClassName_Empty;
	public static String FileName_Empty;
	public static String PrimaryPage_Description;
	public static String CryptSL_Wizard_Title;
	public static String ClassName_ToolTip_Message;
	public static String FileName_ToolTip_Message;
	public static String Control_Page_Title;
	public static String NoteText1;
	public static String NoteText2;
	
	static {
	// initialize resource bundle
	NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
