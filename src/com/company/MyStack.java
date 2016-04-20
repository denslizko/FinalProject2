package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;


public class MyStack {
    public static void main(String[] args) {
        try {
            Scanner scannerStart = new Scanner(System.in);
            System.out.println("Enter '1' if you want to make a List of numbers or enter another number if you don't want to make a List: ");
            int EnteringNumbers = scannerStart.nextInt();

            if (EnteringNumbers == 1) {
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
    }else {
                System.out.println("Thank you for your attention");

            }}catch (InputMismatchException inputException){
            System.out.println("Error! Please enter an integer number");
        }
    }}
