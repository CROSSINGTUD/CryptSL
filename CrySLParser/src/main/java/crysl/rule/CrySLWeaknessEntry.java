package crysl.rule;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CrySLWeaknessEntry entry = (CrySLWeaknessEntry) o;
        return Objects.equals(id, entry.id) && Objects.equals(link, entry.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, link);
    }

    @Override
    public String toString() {
        return id + " -> " + link;
    }
}
