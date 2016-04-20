package com.company;

import java.util.Scanner;

public class MyQueue {

    public static void main(String[] args) {

        Queue myQueue = new Queue();

        boolean forStart = false;
        boolean rateApp = false;

        System.out.println("Hi! You now in Groups #2 Final Project, and it`s FIFO realization");
        System.out.println("NOTICE: In the end pls rate this small but created with many love project :)");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Here u see detailed instruction, later it will be short variant. Pls read all description...");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Insert number for choose u need: ");
        System.out.println("Enter '1' for push new item (we use ony numbers)");
        System.out.println("Enter '2' for push many items in Queue");
        System.out.println("Enter '3' for pop next item (in FIFO first item)");
        System.out.println("Enter '4' if u want 2 see front item in Queue");
        System.out.println("Enter '5' to stop this madness");

        while (!forStart) {

            System.out.println("Choose: ");
            System.out.print("| '1'  push |");
            System.out.print(" '2'  push many |");
            System.out.print(" '3'  pop |");
            System.out.print(" '4' front item |");
            System.out.println(" '5' stop |");

            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();

            if (choose == 1){ // Добавляем элемент в конец
                myQueue.insert();
                System.out.println("Size of Queue " + myQueue.getSize());
            }

            if (choose == 2){ // Добавляем много элементов в конец, нужно проверить логику
                System.out.println("------------------------");
                System.out.println("SORRY: We haven`t realization for this function now, still working on it");
                System.out.println("------------------------");
            }

            if (choose == 3){ // Удаляем первый элемент
                int e = myQueue.remove();
                System.out.println("Remove: " + e);
            }
            if (choose == 4) { // Показ первого элемента
                System.out.println("Front item is: " + myQueue.getFront());
            }

            if (choose == 5) { // Выходим из цикла
                forStart = true;
            }
            }

        System.out.println("Please rate our work, where 0 - the Worstest number and 10 - Bestest number");
        Scanner rated = new Scanner(System.in);
        int rate = rated.nextInt();
        System.out.println("Your rate is: " + rate);
        while(!rateApp){

            if (rate == 10){
                System.out.println("Thanks! It`s very big pleasure to have time with you! :)");
                rateApp = true;
            }

            if (rate <10){
                System.out.println("Pls leave a comment for u rate");
                Scanner comment = new Scanner(System.in);
                String comments = comment.nextLine();
                System.out.println("Pls save the screenshot with your comment and send us in skype. GL! ");
                System.out.println("Comment: " + comments);
                rateApp = true;
            }
        }
    }
}


/*try {

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
    System.out.println("Error! Please enter an integer number");
}
    }
    */