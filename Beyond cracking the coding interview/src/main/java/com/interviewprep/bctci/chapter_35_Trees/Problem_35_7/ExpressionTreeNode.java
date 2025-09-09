package com.interviewprep.bctci.chapter_35_Trees.Problem_35_7;

public class ExpressionTreeNode {
    public NodeType kind;
    public Integer num;
    public ExpressionTreeNode[] children;

    ExpressionTreeNode(NodeType kind, Integer num) {
        this.kind = kind;
        this.num = num;
    }

    ExpressionTreeNode(NodeType kind, ExpressionTreeNode[] children) {
        this.kind = kind;
        this.children = children;
    }
}
