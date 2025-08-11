package crysl.rule;

import java.util.List;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CrySLReferenceEntry that = (CrySLReferenceEntry) o;
        return Objects.equals(name, that.name)
                && Objects.equals(author, that.author)
                && Objects.equals(link, that.link)
                && Objects.equals(pageNumbers, that.pageNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, link, pageNumbers);
    }

    @Override
    public String toString() {
        return name + ", " + author + ", " + link + ", " + pageNumbers;
    }
}
