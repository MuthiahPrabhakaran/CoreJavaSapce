package com.dp.bdp.memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        history.push(editor.createState());

        System.out.println(editor.getContent());

        editor.restoreState(history.pop());
        System.out.println(editor.getContent());

        editor.restoreState(history.pop());
        System.out.println(editor.getContent());

        editor.restoreState(history.pop());
        System.out.println(editor.getContent());
    }
}
