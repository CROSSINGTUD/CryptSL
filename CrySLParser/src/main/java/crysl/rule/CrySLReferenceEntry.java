package crysl.rule;

public class CrySLReferenceEntry {
    private final String name;
    private final String author;
    private final String link;

    public CrySLReferenceEntry(String name, String author, String link) {
        this.name = name;
        this.author = author;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getLink() {
        return link;
    }

    @Override
    public String toString() {
        return name + ", " + author + ", " + link;
    }
}
