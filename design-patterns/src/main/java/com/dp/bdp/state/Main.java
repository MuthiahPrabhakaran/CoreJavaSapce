package com.dp.bdp.state;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();

        // In future, we have to inject different object here depends on the requirement
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
