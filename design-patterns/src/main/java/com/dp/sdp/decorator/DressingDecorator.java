package com.dp.sdp.decorator;

public class DressingDecorator extends SandwichDecorator {



    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make(){
        return sandwich.make()+addDressing();
    }

    public String addDressing(){
        return "+ mustard ";
    }
}
