//   1 2 3 4 5 6 7  
// 1       1 
// 2     2 3 2
// 3   3 4 5 4 3
// 4 4 5 6 7 6 5 4


import java.util.Scanner;

public class A5 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("\nPlease enter a number: ");
        int n = s.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = n-i; j > 0; j--) {
                System.out.print("  ");
            }

            int temp = i;
            for (int j = 1; j<=i; j++) {
                System.out.print(temp + " ");
                temp++;
            }
            temp-=2;
            while(temp != i-1){
                System.out.print(temp-- + " ");
            }

            System.out.println();
        }
    }
}
