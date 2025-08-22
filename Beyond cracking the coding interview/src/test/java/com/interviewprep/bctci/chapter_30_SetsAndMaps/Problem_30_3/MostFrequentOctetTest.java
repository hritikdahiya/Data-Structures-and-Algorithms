package com.interviewprep.bctci.chapter_30_SetsAndMaps.Problem_30_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MostFrequentOctetTest {

    @Test
    public void findMostFrequentOctetTest() {
        String[] ips = new String[]{
                "192.168.1.1",
                "192.168.1.2",
                "192.168.1.3",
                "10.0.0.1",
                "10.0.0.2"
        };
        String expectedOctet = "192";
        Assertions.assertEquals(expectedOctet, MostFrequentOctet.findMostFrequentOctet(ips));


        ips = new String[]{
                "10.0.0.1",
                "10.0.0.2"
        };
        expectedOctet = "10";
        Assertions.assertEquals(expectedOctet, MostFrequentOctet.findMostFrequentOctet(ips));

        ips = new String[]{};
        expectedOctet = "";
        Assertions.assertEquals(expectedOctet, MostFrequentOctet.findMostFrequentOctet(ips));
    }

    @Test
    public void findMostFrequentOctetWithArrayTest() {
        String[] ips = new String[]{
                "192.168.1.1",
                "192.168.1.2",
                "192.168.1.3",
                "10.0.0.1",
                "10.0.0.2"
        };
        String expectedOctet = "192";
        Assertions.assertEquals(expectedOctet, MostFrequentOctet.findMostFrequentOctetWithArray(ips));


        ips = new String[]{
                "10.0.0.1",
                "10.0.0.2"
        };
        expectedOctet = "10";
        Assertions.assertEquals(expectedOctet, MostFrequentOctet.findMostFrequentOctetWithArray(ips));

        ips = new String[]{};
        expectedOctet = "";
        Assertions.assertEquals(expectedOctet, MostFrequentOctet.findMostFrequentOctetWithArray(ips));
    }
}