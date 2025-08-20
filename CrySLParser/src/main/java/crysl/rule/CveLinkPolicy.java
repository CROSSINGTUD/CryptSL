package crysl.rule;

import java.net.URI;

public interface CveLinkPolicy {
    URI urlFor(String cveId);

    static CveLinkPolicy defaultPolicy() {
        return id -> URI.create("https://www.cve.org/CVERecord?id=" + id);
    }
}
