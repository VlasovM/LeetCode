/**
 * Given an integer x, return true if x is a
 * palindrome, and false otherwise.
 */

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        String inputValue = String.valueOf(x);
        char[] test = inputValue.toCharArray();
        StringBuilder inputValueReverse = new StringBuilder();
        for (int y = inputValue.length(); y > 0; y--) {
            inputValueReverse.append(test[y - 1]);
        }
        return inputValue.equals(inputValueReverse.toString());
    }

}
