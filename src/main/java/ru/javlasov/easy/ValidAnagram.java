package ru.javlasov.easy;

import java.util.Arrays;
import java.util.List;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] arrayFirstString = s.toCharArray();
        char[] arraySecondString = t.toCharArray();

        Arrays.sort(arrayFirstString);
        Arrays.sort(arraySecondString);

        return Arrays.equals(arrayFirstString, arraySecondString);

    }

}
