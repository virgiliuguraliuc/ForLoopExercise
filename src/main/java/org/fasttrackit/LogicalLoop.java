package org.fasttrackit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LogicalLoop {

    //iau user input si il verific ca scrie bine int
    public int UserInput(){
        System.out.println(" Enter your number:");
        Scanner input = new Scanner(System.in);
        int a = 0;
        try {
           a = input.nextInt();

        } catch (InputMismatchException e) {

            System.out.println("Integers only, please.");
            UserInput();
        }return a;

    }

//punctul 1.
        public void numberCountPlus100() {
            System.out.println(" \n //////////////////" + " tema 1 ");
            System.out.println(" I will count your number +100 aranjat pe coloane de 10 numere ");
            int n = UserInput();
            System.out.println("Counting " + n + " plus 100 \n --------------------------------");
            for(int number = n; number <= (n + 100); number++) {
                if (number % 10 == 0 && number > 0) {
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }
        }
//punctul 2.
        public void numberCountMinus100() {
            System.out.println(" \n ///////////////////" + " tema 2 ");
            System.out.println(" Number count -100 aranjat pe coloane de 10 numere ");
            System.out.println(" I will count your number -100");
        int n = UserInput();
        System.out.println("Counting " + n + " minus 100 \n --------------------------------");
        for(int number = n; number >= (n - 100); number--) {
            if (number % 10 == 0 && number < 0) {
                System.out.println(number);
            } else {
                System.out.print(number + " ");
            }
        }
    }
// punctul 3 si 4. numaratoare intre 2 numere.

    public void CountBetween(){
        int a, b = 0;
        System.out.println(" \n ///////////////////////" + " tema 3 + tema 4");
        System.out.println(" Count between any int numbers ");
        System.out.print("Enter the beginning number of the interval \n");
        a = UserInput();
        System.out.print("Enter the ending number of the interval \n");
        b = UserInput();
        System.out.println("Countdown has been started ... \n");
        if(a<b){
            //Rising
            do{
                System.out.println(a);
                a++; }
            while(a<=b);
        }
        else if (b<a){
            //Reduction
            do{
                System.out.println(a);
                a--; }
            while(b<=a);
        }
        System.out.println("\nEnd");


    }

    //punctul 5.
public void ShowEvens() {
    System.out.println(" \n ///////////////////////" + " tema 5");
    System.out.println(" Show EVEN numbers 1 to 100 ");
    for (int i = 1; i <= 100; i++) {
        if (i % 2 == 0) {
            System.out.print(i + " "); }
          }
}
    //punctul 6.
    public void ShowOdd() {
        System.out.println(" \n ///////////////////////" + " tema 6");
        System.out.println(" Show ODD numbers 1 to 100 ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " "); }
        }
    }

  //  /punctul 7.
    public void numberGivenAddAllUpto100() {
        System.out.println(" \n ///////////////////" + " tema 7 ");
        System.out.println(" User selected number counts to 100 and adds the numbers up ");
        System.out.println(" Give me a number so i can count their sum");
        int n = UserInput();
        int Sum = 0;
        System.out.println("Counting " + n + " to 100 and give you the Sum of those numbers \n --------------------------------");

        for (int nr = n; nr <=(100); nr++){
            Sum = Sum + nr;
        }
        System.out.println( " The sum of all numbers is: " + Sum );
    }

    //punctul 8

    public void numberGivenMedianTo100() {
        System.out.println(" \n ///////////////////" + " tema 8 ");
        System.out.println(" User selected number counts to 100 and adds the numbers up then gives their sum ");
        System.out.println(" Give me a number so i can do the thing above: beep boop");
        int n = UserInput();
        double Med = 0;
        double Sum = 0;
        int DivisionFactor = 0;
        System.out.println("Counting " + n + " to 100 and give you the median of the numbers \n --------------------------------");

        for (int nr = n; nr <=(100); nr++){
           Sum = (Sum + nr);
           Med = Sum/(100-(n-1));
           DivisionFactor = 100-(n-1);
        }
        System.out.println( " The Median of all numbers is: " + Med );
        System.out.println( " The Sum of all numbers is: " + Sum );
        System.out.println( " DivisionFactor is " + DivisionFactor );
    }


    public void Tipar() {
        System.out.println("\n ///////////////////" + " tema 9 ");
        System.out.println(" Display pattern ");
        int rows = 7;
        for(int i = rows; i >= 1; --i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }




    }





