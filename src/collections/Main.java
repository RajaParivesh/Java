package collections;

public class Main {
    /**
     * fib using recursion
     * @param n
     * @return
     */
    /*private int fib(int n){
        //Base case
        if(n==1) {
            System.out.println(0);
            return 0;
        }
        if(n==2) {
            System.out.println(1);
            return 1;
        }
        // Recursive case
        int x;
        x = fib(n-1);      // + fib(n-2);
        System.out.println(x);
        return x;
    }*/

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


    public static void main(String args[]){
        Main obj = new Main();
//        obj.fib(3);
        System.out.println(obj.factorial(5));
    }
}
