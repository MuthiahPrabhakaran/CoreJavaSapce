package com.dp.sdp.decorator;

public class MeatDecorator extends SandwichDecorator {



    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make(){
        return sandwich.make()+meat();
    }

    public String meat(){
        return "+ turkey ";
    }
}
