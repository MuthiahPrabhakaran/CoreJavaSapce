package com.dp.bdp.visitor.problem;

public class HeadingNode implements HtmlNode{
    @Override
    public void highlight() {
        System.out.println("highlighting heading node");
    }
}
