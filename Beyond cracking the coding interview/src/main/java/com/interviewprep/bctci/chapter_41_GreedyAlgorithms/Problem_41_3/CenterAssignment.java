package com.interviewprep.bctci.chapter_41_GreedyAlgorithms.Problem_41_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CenterAssignment {
    public static float findMinSumOfDistancesFromCenter(float[][] points, float[] center1, float[] center2) {
        int n = points.length;
        // stores the point and the dist from its corresponding center
        // 1. 1st element - x of point,
        // 2. 2nd element - x of point
        // 3. 3rd element - distance of point from c1
        // 4. 4th element - distance of point from c2
        List<float[]> cluster1 = new ArrayList<>(), cluster2 = new ArrayList<>();

        for (float[] point : points) {
            float distFromC1 = distanceBetween(point, center1);
            float distFromC2 = distanceBetween(point, center2);

            float[] entry = new float[]{point[0], point[1], distFromC1, distFromC2};
            if (distFromC1 <= distFromC2) {
                cluster1.add(entry);
            } else {
                cluster2.add(entry);
            }
        }

        if (cluster1.size() > cluster2.size()) {
            // sort the cluster 1 in descending order of the value = distance from c2 - distance from c1
            cluster1.sort(Collections.reverseOrder(Comparator.comparingDouble(a -> a[3] - a[2])));

            // take the last elements from cluster 1 and move to cluster 2 to even the size
            cluster2.addAll(cluster1.subList(n / 2, cluster1.size()));
            cluster1.removeAll(cluster1.subList(n / 2, cluster1.size()));
        } else {
            // sort the cluster 2 in descending order of the value = distance from c1 - distance from c2
            cluster2.sort(Collections.reverseOrder(Comparator.comparingDouble(a -> a[2] - a[3])));

            // take the last elements from cluster 2 and move to cluster 1 to even the size
            cluster1.addAll(cluster2.subList(n / 2, cluster2.size()));
            cluster2.removeAll(cluster2.subList(n / 2, cluster2.size()));

        }

        // calculate the answer
        float distanceFromCenters = 0;
        distanceFromCenters += cluster1.stream().map(a -> a[2]).reduce(0f, Float::sum);
        distanceFromCenters += cluster2.stream().map(a -> a[3]).reduce(0f, Float::sum);


        return distanceFromCenters;
    }

    private static float distanceBetween(float[] point1, float[] point2) {
        double xDiff = point1[0] - point2[0], yDiff = point1[1] - point2[1];
        return (float) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
