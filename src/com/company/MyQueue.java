package com.company;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by User on 19.04.2016.
 */
public class MyQueue {


    public static void main(String[] args) {
try {

    Scanner scannerStart = new Scanner(System.in);
    System.out.println("Enter '1' if you want to make a List of numbers or enter another number if you don't want to make a List: ");
    int EnteringNumbers = scannerStart.nextInt();

    if (EnteringNumbers == 1) {


        Queue myQueue = new Queue();

        myQueue.insert();
        myQueue.insert();
        myQueue.insert();
        myQueue.insert();
        myQueue.insert();
        myQueue.insert();

        myQueue.remove();
        myQueue.remove();
        myQueue.remove();

        myQueue.insert();

        while (!myQueue.isEmpty()) {
            int n = myQueue.remove();
            System.out.println("Elem: " + n);
        }
    } else {
        System.out.println("Thank you for your attention");


    }

}catch (InputMismatchException inputException){
    System.out.println("Please enter an integer number");
}
    }}