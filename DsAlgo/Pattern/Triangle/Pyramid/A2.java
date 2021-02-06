//   1 2 3 4 5 6 7 8 9
// 1         *
// 2       *   *
// 3     *   *   * 
// 4   *   *   *   * 
// 5 *   *   *   *   *


import java.util.Scanner;

public class A2 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("\nPlease enter a number: ");
        int n = s.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>0; j--){
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*   ");                
            }
            System.out.println();
        }

      
    }
}
