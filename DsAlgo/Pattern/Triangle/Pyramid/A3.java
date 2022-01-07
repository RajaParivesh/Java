//   1 2 3 4 5 6 7 8 9
// 1 * * * * * * * * *
// 2 * * * *   * * * *
// 3 * * *       * * * 
// 4 * *           * * 
// 5 *               *


import java.util.Scanner;

public class A3 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("\nPlease enter a number: ");
        int n = s.nextInt();

        for (int i = 1; i <= 2*n-1; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i <= n-1; i++) {
            for (int j = n-i; j > 0; j--) {
               System.out.print("* "); 
            }
            for (int j = i; j <= 2*i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = n-i; j > 0; j--) {
                System.out.print("* "); 
            }           
            System.out.println();
        }
    }
}
