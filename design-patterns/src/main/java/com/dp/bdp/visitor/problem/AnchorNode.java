package com.dp.bdp.visitor.problem;

public class AnchorNode implements HtmlNode{
    @Override
    public void highlight() {
        System.out.println("highlighting anchor node");
    }
}
