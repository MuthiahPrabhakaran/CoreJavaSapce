package com.dp.bdp.visitor.implementation;

public class Main {
    public static void main(String[] args) {
        HtmlDocument document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.execute(new Highlight());
    }
}
