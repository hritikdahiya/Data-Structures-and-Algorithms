package com.interviewprep.bctci.chapter_30_SetsAndMaps.Problem_30_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DomainResolverTest {

    @Test
    public void domainResolverTest() {
        DomainResolver domainResolver = new DomainResolver();

        Assertions.assertFalse(domainResolver.hasSubDomain("1.2.3.4", "domain", "subdomain"));

        domainResolver.registerDomain("192.168.1.1", "example.com");
        domainResolver.registerDomain("192.168.1.1", "example.org");
        domainResolver.registerDomain("192.168.1.2", "domain.com");
        domainResolver.registerSubDomain("example.com", "a");
        domainResolver.registerSubDomain("example.com", "b");

        Assertions.assertTrue(domainResolver.hasSubDomain("192.168.1.1", "example.com", "a"));
        Assertions.assertFalse(domainResolver.hasSubDomain("192.168.1.1", "example.com", "c"));
        Assertions.assertFalse(domainResolver.hasSubDomain("127.0.0.1", "example.com", "a"));
        Assertions.assertFalse(domainResolver.hasSubDomain("192.168.1.1", "example.org", "a"));
        Assertions.assertFalse(domainResolver.hasSubDomain("192.168.1.2", "example.com", "a"));
    }
}