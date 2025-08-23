package com.interviewprep.bctci.chapter_30_SetsAndMaps.Problem_30_5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DomainResolver {
    private final Map<String, String> domainIpMapping;
    private final Map<String, Set<String>> domainSubDomainMapping;

    public DomainResolver() {
        domainIpMapping = new HashMap<>();
        domainSubDomainMapping = new HashMap<>();
    }

    public void registerDomain(String ip, String domain) {
        if (domainIpMapping.containsKey(domain)) {
            throw new IllegalArgumentException("Domain is already registered with an IP address");
        }
        domainIpMapping.put(domain, ip);
    }

    public void registerSubDomain(String domain, String subDomain) {
        Set<String> subDomainSet = domainSubDomainMapping.getOrDefault(domain, new HashSet<>());
        subDomainSet.add(subDomain);

        if (!domainSubDomainMapping.containsKey(domain)) {
            domainSubDomainMapping.put(domain, subDomainSet);
        }
    }

    public boolean hasSubDomain(String ip, String domain, String subDomain) {
        String registeredIp = domainIpMapping.getOrDefault(domain, "");
        Set<String> subDomainSet = domainSubDomainMapping.getOrDefault(domain, new HashSet<>());

        return ip.equals(registeredIp) && subDomainSet.contains(subDomain);
    }
}
