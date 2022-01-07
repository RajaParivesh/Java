public class Patterns {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Pattern Number: 1");
        pattern1(n);
        System.out.println("\nPattern Number: 2");
        pattern2(n);
        System.out.println("\nPattern Number: 3");
        pattern3(n);
        System.out.println("\nPattern Number: 4");
        pattern4(n);
        System.out.println("\nPattern Number: 5");
        pattern5(n);
        System.out.println("\nPattern Number: 6");
        pattern6(n);
        System.out.println("\nPattern Number: 7");
        pattern7(n);
        System.out.println("\nPattern Number: 8");
        pattern8(n);
        System.out.println("\nPattern Number: 9");
        pattern9(n);
        System.out.println("\nPattern Number: 10");
        pattern10(n);
        System.out.println("\nPattern Number: 11");
        pattern11(n);
        System.out.println("\nPattern Number: 12");
        // pattern12(n);
        System.out.println("\nPattern Number: 13");
        // pattern13(n);
        System.out.println("\nPattern Number: 14");
        // pattern14(n);
        System.out.println("\nPattern Number: 15");
        // pattern15(n);
        System.out.println("\nPattern Number: 16");
        // pattern16(n);
        System.out.println("\nPattern Number: 17");
        // pattern17(n);
    }

    /**
     * Algorithm: Generic trick
     * Step 1: Outer loop with go upto no. of rows
     * for(int row = 1; row <= n; row++){ // outer loop
     * Step 2: Inner loop with go upto no. of columns
     * condition col = x*row + y;
     * for(int col = 1; col <= condition; col++){ // inner loop
     */
    private static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // condition col = n
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // condition col = row
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            // condition col= n-row+1
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            // condition col = row
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    private static void pattern5(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            // condition col = row <= n ? row : 2*n-row
            int condition = row <= n ? row : 2 * n - row;
            for (int col = 1; col <= condition; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {

            int spaceCondition = n - row;
            for (int col = 1; col <= spaceCondition; col++) {
                System.out.print(" ");
            }

            int starCondition = row;
            for (int col = 1; col <= starCondition; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern7(int n){
        for(int row= 1; row <= n; row++){
            int spaceCondition = row-1;
            for(int col= 1; col <= spaceCondition; col++){
                System.out.print(" ");
            }
            int starCondition = n-row+1;
            for(int col= 1; col <= starCondition; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern8(int n){
        for(int row=1; row <= n; row++){
            int spaceCondition = n - row;
            for(int col=1; col <= spaceCondition; col++){
                System.out.print(" ");
            }
            int starCondition = 2*row-1;
            for(int col=1; col <= starCondition; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern9(int n){
        for(int row=1; row <= n; row++){
            int spaceCondition = row-1;
            for(int col=1; col <= spaceCondition; col++){
                System.out.print(" ");
            }
            int starCondition = 2*n-(2*row-1);
            for(int col=1; col <= starCondition; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern10(int n) {
        for(int row=1; row <=n; row++){
            int spaceCondition = n-row;
            for(int col=1; col <= spaceCondition; col++){
                System.out.print(" ");
            }
            int starCondition = row;
            for(int col=1; col <= starCondition; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern11(int n){
        for(int row = 1; row<=n; row++){
            int spaceCondition = row-1;
            for(int col=1; col<=spaceCondition; col++){
                System.out.print(" ");
            }
            int starCondition = n-row+1;
            for(int col=1; col<=starCondition; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // private static void pattern12(int n){
    //     for(int row=1; row<=2*n; row++){
    //         int spaceCondition = 2*n-row-1;

    //     }
    // }

}
