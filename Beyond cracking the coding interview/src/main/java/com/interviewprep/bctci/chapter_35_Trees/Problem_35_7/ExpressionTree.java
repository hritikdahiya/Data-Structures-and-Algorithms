package com.interviewprep.bctci.chapter_35_Trees.Problem_35_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExpressionTree {
    public static Integer evaluate(ExpressionTreeNode root) {
        if (root.kind == NodeType.NUM) {
            return root.num;
        }

        // children has at least one value inside
        List<Integer> childResults = new ArrayList<>();
        for (ExpressionTreeNode child : root.children) {
            childResults.add(evaluate(child));
        }

        switch (root.kind) {
            case SUM -> {
                return childResults.stream().mapToInt(Integer::intValue).sum();
            }
            case PRODUCT -> {
                return childResults.stream().reduce(1, (a, b) -> a * b);
            }
            case MAX -> {
                return Collections.max(childResults);
            }
            case MIN -> {
                return Collections.min(childResults);
            }
            default -> throw new RuntimeException("Unsupported root type");
        }
    }
}
