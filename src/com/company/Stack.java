package com.company;

import java.util.Scanner;


public class Stack {
    private int mSize;
    private int[] stackArray;
    private int top;

    public Stack(int m) {
        this.mSize = m;
        stackArray = new int[mSize];
        top = -1;
    }

    public void addElement() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer numbers to Stack");
        int element = scanner.nextInt();
        stackArray[++top] = element;
    }

    public int deleteElement() {
        if (top == -1)
            return -1;
        else
            return stackArray[top--];
        }

    public int readTop() {
        if ( top == -1 )
            return -1;
        else
            return stackArray[top];
        }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == mSize - 1);
    }

    public int[] getStackArray() {
        return stackArray;
    }

    public int getTop() {
        return top;
    }
}
