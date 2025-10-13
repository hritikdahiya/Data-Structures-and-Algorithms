package com.interviewprep.bctci.chapter_UnionFind.Problem_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomUnionFindTest {
    @Test
    public void unionFindTest() {
        CustomUnionFind<Integer> unionFind = new CustomUnionFind<>();

        Assertions.assertEquals(0, unionFind.size());
        Assertions.assertEquals(0, unionFind.numGroups());

        unionFind.add(1);
        unionFind.add(2);
        unionFind.add(3);
        unionFind.add(4);

        Assertions.assertEquals(4, unionFind.size());
        Assertions.assertEquals(4, unionFind.numGroups());

        Assertions.assertEquals(3, unionFind.find(3));
        Assertions.assertEquals(1, unionFind.find(1));

        unionFind.union(1, 2);
        unionFind.union(2, 4);

        Assertions.assertEquals(4, unionFind.size());
        Assertions.assertEquals(2, unionFind.numGroups());

        Assertions.assertEquals(unionFind.find(1), unionFind.find(2));
        Assertions.assertEquals(unionFind.find(1), unionFind.find(4));
        Assertions.assertEquals(unionFind.find(2), unionFind.find(4));
        Assertions.assertNotEquals(unionFind.find(2), unionFind.find(3));
    }
}