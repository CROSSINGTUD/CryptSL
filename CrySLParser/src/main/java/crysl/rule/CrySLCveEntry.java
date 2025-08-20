package crysl.rule;

import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrySLCveEntry implements CrySLVulnerabilityEntry {
    private static final Logger log = LoggerFactory.getLogger(CrySLCveEntry.class);
    private static final Pattern CVE_RE = Pattern.compile("^CWE-\\d+$");

    private final String id;
    private final String url;

    public CrySLCveEntry(String rawId) {
        this(rawId, CveLinkPolicy.defaultPolicy());
    }

    public CrySLCveEntry(String rawId, CveLinkPolicy policy) {
        Objects.requireNonNull(rawId, "id");
        Objects.requireNonNull(policy, "policy");
        this.id = normalize(rawId);
        this.url = policy.urlFor(this.id).toString();
    }

    @Override
    public String id() {
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
        return (o instanceof CrySLCveEntry other) && id.equals(other.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "CVE[id=" + id + ", url=" + url + "]";
    }
}
