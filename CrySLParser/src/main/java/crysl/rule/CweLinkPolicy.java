package crysl.rule;

import java.net.URI;

public interface CweLinkPolicy {
    URI urlFor(String cveId);

    static CweLinkPolicy defaultPolicy() {
        return id -> {
            String number = id.trim().replaceFirst("(?i)^CWE-", "").replaceAll("[^0-9]", "");
            return java.net.URI.create(
                    "https://cwe.mitre.org/data/definitions/" + number + ".html");
        };
    }
}
