package ReverseString;

// https://leetcode.com/problems/reverse-linked-list/?envType=list&envId=ribypp1e

public class Main {

    public static void main(String[] args) {
        char[] array = new char[] {'h', 'e', 'l', 'l', 'o'};
        reverseString(array);
    }

    public static void reverseString(char[] s) {
        String s1 = new StringBuilder(new String(s)).reverse().toString();
        for (int i = 0; i < s1.length(); i++) {
            s[i] = s1.charAt(i);
        }
        System.out.println(s);
    }

}
