package ru.javlasov.easy;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        String tempString = s.replaceAll("[\\W_]", "").toLowerCase();
        System.out.println(tempString);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(tempString);
        stringBuilder.reverse();
        return tempString.equals(stringBuilder.toString());
    }

}
