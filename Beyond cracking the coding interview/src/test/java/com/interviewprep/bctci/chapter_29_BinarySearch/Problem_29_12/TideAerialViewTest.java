package com.interviewprep.bctci.chapter_29_BinarySearch.Problem_29_12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TideAerialViewTest {

    @Test
    public void findBalancedPictureTest() {
        // -------------------------------------------
        List<Integer[][]> pictures = new ArrayList<>();
        pictures.add(new Integer[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        });
        pictures.add(new Integer[][]{
                {1, 0, 0},
                {0, 0, 0},
                {1, 0, 0}
        });
        pictures.add(new Integer[][]{
                {1, 1, 0},
                {0, 0, 0},
                {1, 0, 0}
        });
        pictures.add(new Integer[][]{
                {1, 1, 0},
                {1, 1, 1},
                {1, 0, 0}
        });
        pictures.add(new Integer[][]{
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 0}
        });
        int expectedIndex = 2;
        Assertions.assertEquals(expectedIndex, TideAerialView.findBalancedPicture(pictures));

        // -------------------------------------------
        pictures.clear();
        pictures.add(new Integer[][]{
                {1, 0, 0},
                {1, 0, 0},
                {1, 0, 0}
        });
        pictures.add(new Integer[][]{
                {1, 1, 0},
                {1, 1, 0},
                {1, 0, 0}
        });
        pictures.add(new Integer[][]{
                {1, 1, 1},
                {1, 1, 1},
                {1, 0, 0}
        });
        expectedIndex = 1;
        Assertions.assertEquals(expectedIndex, TideAerialView.findBalancedPicture(pictures));


        // -------------------------------------------
        pictures.clear();
        pictures.add(new Integer[][]{
                {1, 0}, {0, 0}
        });
        pictures.add(new Integer[][]{
                {1, 1}, {1, 0}
        });
        expectedIndex = 0;
        Assertions.assertEquals(expectedIndex, TideAerialView.findBalancedPicture(pictures));

        // -------------------------------------------
        // single picture
        pictures.clear();
        pictures.add(new Integer[][]{
                {1, 0}, {0, 0}
        });
        pictures.add(new Integer[][]{
                {1, 1}, {1, 0}
        });
        Assertions.assertEquals(expectedIndex, TideAerialView.findBalancedPicture(pictures));

        // -------------------------------------------
        // all water
        pictures.clear();
        pictures.add(new Integer[][]{
                {1, 1}, {1, 1}
        });
        Assertions.assertEquals(expectedIndex, TideAerialView.findBalancedPicture(pictures));

        // -------------------------------------------
        // all land
        pictures.clear();
        pictures.add(new Integer[][]{
                {0, 0}, {0, 0}
        });
        Assertions.assertEquals(expectedIndex, TideAerialView.findBalancedPicture(pictures));


        // -------------------------------------------
        // incremental progression
        pictures.clear();
        pictures.add(new Integer[][]{
                {1, 0, 0}, {0, 0, 0}, {0, 0, 0}
        });
        pictures.add(new Integer[][]{
                {1, 0, 0}, {0, 0, 0}, {0, 0, 0}
        });
        pictures.add(new Integer[][]{
                {1, 0, 0}, {1, 0, 0}, {0, 0, 0}
        });
        pictures.add(new Integer[][]{
                {1, 1, 0}, {1, 0, 0}, {0, 0, 0}
        });
        pictures.add(new Integer[][]{
                {1, 1, 1}, {1, 0, 0}, {0, 0, 0}
        });
        pictures.add(new Integer[][]{
                {1, 1, 1}, {1, 1, 0}, {0, 0, 0}
        });
        pictures.add(new Integer[][]{
                {1, 1, 1}, {1, 1, 1}, {0, 0, 0}
        });
        pictures.add(new Integer[][]{
                {1, 1, 1}, {1, 1, 1}, {1, 0, 0}
        });
        pictures.add(new Integer[][]{
                {1, 1, 1}, {1, 1, 1}, {1, 1, 0}
        });
        pictures.add(new Integer[][]{
                {1, 1, 1}, {1, 1, 1}, {1, 1, 1}
        });
        expectedIndex = 4;
        Assertions.assertEquals(expectedIndex, TideAerialView.findBalancedPicture(pictures));
    }
}