package crysl.rule;

import java.util.List;

public class CrySLReferenceEntry {
    private final String name;
    private final String author;
    private final String link;
    private final List<Integer> pageNumbers;

    public CrySLReferenceEntry(String name, String author, String link, List<Integer> pageNumbers) {
        this.name = name;
        this.author = author;
        this.link = link;
        this.pageNumbers = pageNumbers;
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

    public List<Integer> getPageNumbers() {
        return pageNumbers;
    }

    @Override
    public String toString() {
        return name + ", " + author + ", " + link + ", " + pageNumbers;
    }
}
