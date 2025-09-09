package com.interviewprep.bctci.chapter_35_Trees.Problem_35_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExpressionTreeTest {

    @Test
    public void evaluateExpressionTreeTest() {
        ExpressionTreeNode root = new ExpressionTreeNode(NodeType.MIN,
                new ExpressionTreeNode[]{
                        new ExpressionTreeNode(NodeType.MAX,
                                new ExpressionTreeNode[]{
                                        new ExpressionTreeNode(NodeType.NUM, 4),
                                        new ExpressionTreeNode(NodeType.NUM, 6),
                                        new ExpressionTreeNode(NodeType.SUM,
                                                new ExpressionTreeNode[]{
                                                        new ExpressionTreeNode(NodeType.NUM, 5),
                                                        new ExpressionTreeNode(NodeType.NUM, 7),
                                                })
                                }),
                        new ExpressionTreeNode(NodeType.SUM,
                                new ExpressionTreeNode[]{
                                        new ExpressionTreeNode(NodeType.PRODUCT,
                                                new ExpressionTreeNode[]{
                                                        new ExpressionTreeNode(NodeType.NUM, 6),
                                                        new ExpressionTreeNode(NodeType.NUM, 8)
                                                })
                                })
                });

        Integer expectedEvaluatedResult = 12;
        Assertions.assertEquals(expectedEvaluatedResult, ExpressionTree.evaluate(root));
    }
}