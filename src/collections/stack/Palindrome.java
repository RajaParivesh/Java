package collections.stack;

import java.util.Stack;

public class Palindrome {
    Stack s;

    public Palindrome() {
        s = new Stack();
    }

    public boolean checkPalindromeUsingStack(String str) {
        String finalString = "";
        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            s.push(str.charAt(i));
        }
        for (int i = 0; i < length / 2; i++) {
            finalString = finalString + s.pop();
        }
        if (length % 2 == 0) {
//          if(str.substring(length/2,length) == finalString) {              //why this statement is wrong
            if (str.substring(length / 2, length).equals(finalString)) return true;
            else return false;
        } else {
            if (str.substring(length / 2 + 1, length).equals(finalString)) return true;
            else return false;
        }
    }
}