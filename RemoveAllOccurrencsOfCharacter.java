public class RemoveAllOccurrencsOfCharacter {
    
    public static void main(String args[]){
        String str =  "geeksforgeeks";
        char c = 'e';
        String result = removeAllOccurrences(str, c);
        System.out.println("String after removing all occurrences of character: " + result);  // Output: "gksforgeks"
    }

    private static String removeAllOccurrences(String str, char c) {
       
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == c){
                str = str.substring(0, i) + str.substring(i+1);
                i--;
            }
        }
        return str;
    }
}
