package com.interviewprep.bctci.chapter_31_Sorting.Problem_31_2;

import java.util.Arrays;
import java.util.Comparator;

public class NestedCircles {
    public static boolean areNested(Circle[] circles) {
        if (circles.length == 1) {
            return true;
        }

        // sort the array in descending order of radius
        Arrays.sort(circles, Comparator.comparingInt(Circle::r).reversed());

        // for every circle at index i > 0, the preceding circle should encapsulate it
        for (int i = 1; i < circles.length; i++) {
            if (!contains(circles[i - 1], circles[i])) {
                return false;
            }
        }

        return true;
    }

    // farthest point of inner circle should be with outer circle.
    // Farthest point lies on the line that passes through their centers.
    // distBetweenCircleRadii + innerCircle's radius should be less than outerCircle's radius
    private static boolean contains(Circle outerCircle, Circle innerCircle) {
        int xDist = innerCircle.x() - outerCircle.x();
        int yDist = innerCircle.y() - outerCircle.y();
        double distBetweenCircleRadii = Math.sqrt((xDist * xDist) + (yDist * yDist));

        return distBetweenCircleRadii + innerCircle.r() < outerCircle.r();
    }
}
