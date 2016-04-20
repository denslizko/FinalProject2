package com.company;


import sun.plugin.services.PlatformService;

import java.util.Scanner;

public class MyQueue {


    public static void main(String[] args) {

        Queue myQueue = new Queue();

        boolean forStart = false;
        boolean rateapp = false;

        System.out.println("Hi! You now in Groups #2 Fina Project, and it`s FIFO realization");
        System.out.println("NOTICE: In the end pls rate this small but created with many love project :)");

        while (forStart == false) {

            System.out.println("Please, insert number for choose u need: ");
            System.out.println("Enter '1' for push new item (we use ony numbers)");
            System.out.println("Enter '2' for push many items in Queue");
            System.out.println("Enter '3' for pop last item");
            System.out.println("Enter '4' if u want 2 see what items in Queue");
            System.out.println("Enter '5' to stop this madness");

            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();

            if (choose == 1){
                myQueue.insert();
            }

            if (choose == 2){
                System.out.println("------------------------");
                System.out.println("SORRY: We haven`t realization for this function now, still working on it");
                System.out.println("------------------------");
            }

            if (choose == 3){
                myQueue.remove();
            }
            if (choose == 4) {
                System.out.println("------------------------");
                System.out.println("SORRY: We have realization for this function but it need some rework");
                System.out.println("------------------------");
            }

            if (choose == 5) {
                forStart = true;
            }
            }

        System.out.println("Please rate our work, where 0 - the Worstest number and 10 - Bestest number");
        Scanner rated = new Scanner(System.in);
        int rate = rated.nextInt();
        System.out.println("Your rate is: " + rate);
        while(rateapp == false){

            if (rate == 10){
                System.out.println("Thanks! It`s very big pleasure to have time with you! :)");
            }

            if (rate <10){
                System.out.println("Pls leave a comment for u rate");
                Scanner comment = new Scanner(System.in);
                String comments = comment.nextLine();
                System.out.println("Pls save the screenshot with your comment and send us in skype. GL! ");
                System.out.println("Comment: " + comments);
                rateapp = true;
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