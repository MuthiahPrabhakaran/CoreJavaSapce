package com.dp.cdp.builder.v2;


// https://www.geeksforgeeks.org/builder-pattern-in-java/
// This way makes problem with multi threading. We can use it for filter cases
public class NewBuilderLunchOrder {
    public static void main(String[] args) {
        NewLunchOrder order = new NewLunchOrder().setBread("bread").setCondiments("some condiments");
        System.out.println(order);
    }
}
