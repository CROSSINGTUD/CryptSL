package crysl.rule;

public class CrySLWeaknessEntry {
    private final String id;
    private final String link;

    public CrySLWeaknessEntry(String id, String link) {
        this.id = id;
        this.link = link;
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return link;
    }

    @Override
    public String toString() {
        return id + " -> " + link;
    }
}
