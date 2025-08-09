package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchInHugeArrayTest {
    @Test
    public void searchInHugeArrayTest() {
        // test array - size - 100 * Integer.MAX_VALUE
        // Every element is repeated 5 times
        // 1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,....

        API fetchApi = new API() {
            @Override
            public long fetch(long index) {
                if (index > 100L * Integer.MAX_VALUE) {
                    return -1L;
                }
                return (index % 5 == 0) ? Math.ceilDiv(index, 5) + 1 : Math.ceilDiv(index, 5);
            }
        };
        long target = 229836L;

        Assertions.assertEquals((target - 1) * 5, SearchInHugeArray.findElementInArray(fetchApi, target));
    }
}

