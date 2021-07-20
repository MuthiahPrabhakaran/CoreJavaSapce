package com.dp.bdp.visitor.implementation;

public class Highlight implements Operation{
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("highlight - heading node");
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("highlight - anchor node");
    }
}
