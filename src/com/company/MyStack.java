package com.company;

/**
 * Created by User on 19.04.2016.
 */
public class MyStack {
    public static void main(String[] args) {
        Stack mStack = new Stack(10);

        mStack.addElement();
        mStack.addElement();
        mStack.addElement();
        mStack.addElement();

        mStack.deleteElement();

        System.out.print("Stack: ");
        while (!mStack.isEmpty()) {
            int value = mStack.deleteElement();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}

