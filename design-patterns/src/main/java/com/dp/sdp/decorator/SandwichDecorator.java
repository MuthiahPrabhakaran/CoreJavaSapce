package com.dp.sdp.decorator;


//Decorator
public abstract class SandwichDecorator implements Sandwich{

    protected Sandwich sandwich;

    public SandwichDecorator(Sandwich sandwich){
        this.sandwich = sandwich;
    }

    public String make(){
        return sandwich.make();
    }
}
