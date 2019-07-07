package collections;

import java.util.Scanner;

public class Main {
    /**
     * fib using recursion
     * @param n
     * @return
     */
    private int fib(int n){
        //Base case
        if(n==1) {
//            System.out.println(0);
            return 0;
        }
        if(n==2) {
//            System.out.println(1);
            return 1;
        }
        // Recursive case
        int x;
        x = fib(n-1);     // + fib(n-2);
        System.out.println(x);
        return x;
    }

    /**
     * Factorial Using recursion
     * @param n
     * @return
     */
    private int factorial(int n){
        // Base case
        if(n==0) return 1;

        // Recursive case
        int x = n*factorial(n-1);
        return x;
    }

//    private int permutation(String s, String remaining){
//        return
//    }
//
    //A method for reverse
    public static void reverseMethod(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        }
        else {
            System.out.print(number % 10);
            //Recursion
            reverseMethod(number/10);
        }
    }

    public static void main(String args[]){
        Main obj = new Main();
        //fib not working
//        System.out.println(obj.fib(4));
//        System.out.println(obj.factorial(5));
//        obj.reverse(124);

        // For Reverse integer function
        int num=0;
        System.out.println("Input your number and press enter: ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        System.out.print("Reverse of the input number is:");
        reverseMethod(num);

    }

}