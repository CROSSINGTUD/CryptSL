package crysl.rule;

public interface CrySLWeaknessEntry {
    String getId();

    String getUrl();

    default String getType() {
        return "CWE";
    }
}
