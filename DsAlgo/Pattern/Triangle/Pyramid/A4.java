//   1 2 3 
// 1 A
// 2 B B
// 3 C C C


import java.util.Scanner;

public class A4 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("\nPlease enter a number: ");
        int n = s.nextInt();

        String arr[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        if(n <= 26){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <=i; j++) {
                    System.out.print(arr[i]+ " ");
                }
                System.out.println();
            }
        }
    }
}
