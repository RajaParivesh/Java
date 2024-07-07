public class countDigitUsingRecursion {
    public static int countDigit(int number, int count) {
        if (number == 0)
            return count;
        return countDigit(number / 10, ++count);
    }

    public static void main(String[] args) {
        int number = 1245;
        int count = 0;
        System.out.println(countDigit(number, count));
    }
}