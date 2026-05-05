package ru.javlasov.easy;

public class RomanToInteger {

    public static int romanToInt(String s) {
        int result = 0;
        char[] charArray = s.toCharArray();

        for (int i = 0; i <= s.length() - 1; i++) {
            if (i == s.length() - 1 || getValueFromRoman(charArray[i]) >= getValueFromRoman(charArray[i + 1])) {
                result = result + getValueFromRoman(charArray[i]);
            } else {
                result = result - getValueFromRoman(charArray[i]);
            }
        }

        return result;
    }

    private static int getValueFromRoman(char romanChar) {
        return switch (romanChar) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException();
        };
    }

}
