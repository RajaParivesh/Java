// Program to find the Nth Prime Number

// Given an integer N. The task is to find the Nth prime number.

// Examples:  

// Input : 5 
// Output : 11

// Input : 16 
// Output : 53

// Input : 1049 
// Output : 8377 

// Psodo:
// What are prime number?
// 1 2 3 5 7 9 11 13 17



class NthPrimeNumber{
    
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

    private static int nthPrimeNumber(int n) {
        int primeNumber = 0;
        int countPrimeNumber = 0;
        for(int i=1; countPrimeNumber<=n; i++){
            if(isPrimeNumber(i)){
                primeNumber = i;
                countPrimeNumber++;
            }
        }
        return primeNumber;
    }

    public static void main(String args[]){
        int n = 1049;
        System.out.println(nthPrimeNumber(n));
    }
}