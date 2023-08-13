package ValidAnagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        System.out.println(isAnagram(s1, s2));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        List<Character> list = new ArrayList<>();
        List<Character> list1 = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
            list1.add(t.charAt(i));
        }

        Collections.sort(list);
        Collections.sort(list1);
        return list.equals(list1);
    }

}
