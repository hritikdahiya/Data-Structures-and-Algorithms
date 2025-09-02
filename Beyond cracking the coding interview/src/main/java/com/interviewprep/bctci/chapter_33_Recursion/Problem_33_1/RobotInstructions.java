package com.interviewprep.bctci.chapter_33_Recursion.Problem_33_1;

import java.util.ArrayList;
import java.util.List;

public class RobotInstructions {
    public static String performInstructions(String instructions) {
        List<Character> output = new ArrayList<>();

        performInstructions(instructions, 0, output);

        StringBuilder result = new StringBuilder();
        for (Character character : output) {
            result.append(character);
        }
        return result.toString();
    }

    private static void performInstructions(String instructions, int index, List<Character> output) {
        // base case
        if (index >= instructions.length()) {
            return;
        }

        char currInstruction = instructions.charAt(index);
        if (currInstruction == '2') {
            performInstructions(instructions, index + 1, output);
            performInstructions(instructions, index + 2, output);
        } else {
            output.add(currInstruction);
            performInstructions(instructions, index + 1, output);
        }
    }
}
