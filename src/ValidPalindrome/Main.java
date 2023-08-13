package ValidPalindrome;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().strip();
        String sReverse = new StringBuilder(s).reverse().toString();
        return s.equals(sReverse);
    }

}
