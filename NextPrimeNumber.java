// Program to find the next prime number

// Given an integer N. The task is to find the next prime number i.e. the smallest prime number greater than N.

// Examples: 

// Input: N = 10 
// Output: 11 
// 11 is the smallest prime number greater than 10.

// Input: N = 0 
// Output: 2 

class NextPrimeNumber{
    
    private static boolean isPrimeNumber(int n){
        if(n<3) return true;
        int i = 2;
        while (i<n){
            if(n%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }

    private static int nextPrimeNumber(int n) {
        int nextPrimeNumber = 0;
        
        for(int i=n+1; i<=n*n; i++){
            if(isPrimeNumber(i)){
                nextPrimeNumber = i;
                break;
            }
        }
        return nextPrimeNumber;
    }

    public static void main(String args[]){
        int n = 1003;
        System.out.println(nextPrimeNumber(n));
    }
}