package com.interviewprep.bctci.chapter_35_Trees.Problem_35_11;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NodeStats {
    public int ancestorCount;
    public int descendantCount;
    public int leftPadding;
    public int rightPadding;
    public NodeStats left;
    public NodeStats right;
}
