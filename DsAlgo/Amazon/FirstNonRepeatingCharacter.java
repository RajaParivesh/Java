package Amazon;

import java.util.*;
import java.lang.Error;

public class FirstNonRepeatingCharacter {

    //Method 1
    // public static void firstNonRepeatingCharacter(String str) {
    //     HashMap<Character, Integer> h = new HashMap<>();
    //     char key;
    //     for (int i = 0; i < str.length(); i++) {
    //         key = str.charAt(i);
    //         if (h.containsKey(key))
    //             h.put(key, h.get(key) + 1);
    //         else
    //             h.put(key, 1);
    //     }
    //     for (int i = 0; i < str.length(); i++) {
    //         key = str.charAt(i);
    //         if (h.get(key) == 1) {
    //             System.out.println(key);
    //             break;
    //         }
    //     }
    // }

    //Method 2
    private static void firstNonRepeatingCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if(str.lastIndexOf(key)== str.indexOf(key)){
                System.out.println(key);
                return;
            }
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        firstNonRepeatingCharacter(str);
    }
}