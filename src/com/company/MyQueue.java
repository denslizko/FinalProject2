package com.company;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by User on 19.04.2016.
 */
public class MyQueue {

    public static void main(String[] args) {



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
    }

}
