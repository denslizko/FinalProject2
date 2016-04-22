package com.company;

import java.util.Scanner;


public class Queue {
    private int[] queue;
    private int maxSize;
    private int nElem;
    private int front;
    private int rear;

    public Queue() {
        maxSize = 100;
        queue = new int[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }


    public void insert() {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Enter some number: ");
        int elem = scanner.nextInt();

        if (rear == maxSize - 1)
        {

            rear = -1;
        }

        queue[++rear] = elem;
        nElem++;

    }
    public int remove() {
        int temp = queue[front++];

        if (front == maxSize) {
            front = 0;
        }
        nElem--; //
        return temp;
    }

    public int getFront() {
        return queue[front];
    }

    public int getRear() {
        return queue[rear];
    }

    public boolean isFull() {
        return (nElem == maxSize - 1);
    }

    public boolean isEmpty() {
        return (nElem == 0);
    }

    public int getSize() {
        return nElem;
    }


    public void addElement(int i) {

    }

    public void removeElement(int i) {

    }

    public int getElement(int number) {
        return 0;
    }
}
