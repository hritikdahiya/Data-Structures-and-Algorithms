package com.interviewprep.bctci.chapter_30_SetsAndMaps.Problem_30_8;

import java.util.*;

public class CheaterDetection {
    // BRUTE FORCE
    // T - O(n * log n + n * k)
    public static List<int[]> cheaterDetectionBruteForce(char[] answers, int desksPerRow, List<StudentResult> studentResults) {
        int n = studentResults.size();
        List<int[]> suspects = new ArrayList<>();

        // O(n * log n)
        // sort the students according to their desk number
        studentResults.sort(Comparator.comparingInt(StudentResult::desk));

        // O(k * n)
        for (int i = 1; i < n; i++) {
            StudentResult currStudent = studentResults.get(i);
            StudentResult lastStudent = studentResults.get(i - 1);

            boolean areStudentsAdjacent = currStudent.desk() == lastStudent.desk() + 1;

            // only is students are adjacent, check for cheating
            if (isSameRow(currStudent.desk(), lastStudent.desk(), desksPerRow) && areStudentsAdjacent) {
                // check if both the students have the same answers AND is not equal the correct answer key
                // O(k)
                if (Arrays.compare(currStudent.answers(), lastStudent.answers()) == 0 &&
                        Arrays.compare(currStudent.answers(), answers) != 0) {
                    suspects.add(new int[]{lastStudent.id(), currStudent.id()});
                }
            }
        }

        return suspects;
    }

    // T - O(n * k)
    // S - O(n)
    public static List<int[]> cheaterDetection(char[] answers, int desksPerRow, List<StudentResult> studentResults) {
        int n = studentResults.size();
        List<int[]> suspects = new ArrayList<>();

        Map<Integer, Integer> deskToStudentIndexMapping = new HashMap<>();
        for (int i = 0; i < n; i++) {
            StudentResult studentResult = studentResults.get(i);
            // add students to the map who got incorrect answers (ignore the student with perfect store)
            if (Arrays.compare(answers, studentResult.answers()) != 0) {
                deskToStudentIndexMapping.put(studentResult.desk(), i);
            }
        }

        // for every student, get it's neighboring desk student from map
        // see if they're on the same row and made the same mistakes
        for (int i = 0; i < n; i++) {
            StudentResult studentResult = studentResults.get(i);
            int neighborDesk = studentResult.desk() + 1;
            // find the neighbor desk student
            if (deskToStudentIndexMapping.containsKey(neighborDesk)) {
                StudentResult neighborStudentResult = studentResults.get(
                        deskToStudentIndexMapping.get(neighborDesk)
                );

                // check if they're in the same row and cheated
                if (isSameRow(studentResult.desk(), neighborStudentResult.desk(), desksPerRow) &&
                        Arrays.compare(studentResult.answers(), neighborStudentResult.answers()) == 0) {
                    suspects.add((new int[]{studentResult.id(), neighborStudentResult.id()}));
                }
            }

        }

        return suspects;
    }


    private static boolean isSameRow(int desk1, int desk2, int desksPerRow) {
        return Math.floorDiv(desk1 - 1, desksPerRow) == Math.floorDiv(desk2 - 1, desksPerRow);
    }
}
