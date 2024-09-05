class Palindrome {
    public static void main(String[] args){
        int input =  121;
        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(int num) {
        int r = 0;
        int rev = 0;
        int x = num;
        if(num <0) return false;
        while(x !=0){
            r = x%10;
            x = x/10;
            rev = rev*10 + r;
        }
        if(rev == num) return true;
        return false;
    }
}