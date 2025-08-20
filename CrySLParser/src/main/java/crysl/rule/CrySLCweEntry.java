package crysl.rule;

import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrySLCweEntry implements CrySLWeaknessEntry {
    private static final Logger log = LoggerFactory.getLogger(CrySLCweEntry.class);
    private static final Pattern CWE_RE = Pattern.compile("^CWE-\\d{4}-\\d{4,}$");

    private final String id;
    private final String url;

    public CrySLCweEntry(String rawId) {
        this(rawId, CweLinkPolicy.defaultPolicy());
    }

    public CrySLCweEntry(String rawId, CweLinkPolicy policy) {
        Objects.requireNonNull(rawId, "id");
        Objects.requireNonNull(policy, "policy");
        this.id = normalize(rawId);
        this.url = policy.urlFor(this.id).toString();
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getUrl() {
        return url;
    }

    private static String normalize(String s) {
        return s.trim().toUpperCase(Locale.ROOT);
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof CrySLCweEntry other) && id.equals(other.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "CWE[id=" + id + ", url=" + url + "]";
    }
}
