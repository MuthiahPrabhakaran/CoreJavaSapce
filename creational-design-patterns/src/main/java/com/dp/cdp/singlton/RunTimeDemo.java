package com.dp.cdp.singlton;

public class RunTimeDemo {
    public static void main(String[] args) {
        Runtime runTime = Runtime.getRuntime();
        runTime.gc();

        System.out.println(runTime);

        Runtime anotherRunTime = Runtime.getRuntime();
        System.out.println(anotherRunTime);

        if(runTime == anotherRunTime)
            System.out.println("Both run times are same");
    }
}
