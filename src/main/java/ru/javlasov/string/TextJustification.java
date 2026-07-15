package ru.javlasov.string;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {

    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<StringBuilder> resultList = new ArrayList<>();

        distributeWords(resultList, words, maxWidth);
        System.out.println(resultList);
        distributeSpaces(resultList, maxWidth);
        processLastString(resultList, maxWidth);

        return resultList
                .stream()
                .map(StringBuilder::toString)
                .toList();
    }

    private static void distributeWords(List<StringBuilder> resultList, String[] words, int maxWidth) {
        for (String word : words) {
            if (resultList.isEmpty()) {
                resultList.add(new StringBuilder(word));
            } else {
                StringBuilder last = resultList.get(resultList.size() - 1);

                int needLength = last.length() + word.length();
                if (!last.isEmpty()) {
                    needLength++;
                }

                if (needLength <= maxWidth) {
                    if (!last.isEmpty()) {
                        last.append(' ');
                    }
                    last.append(word);
                } else {
                    resultList.add(new StringBuilder(word));
                }

            }
        }
    }

    private static void distributeSpaces(List<StringBuilder> resultList, int maxWidth) {
        for (int i = 0; i < resultList.size() - 1; i++) {
            StringBuilder currentRow = resultList.get(i);
            String rowStr = currentRow.toString();
            String[] words = rowStr.split("\\s+");

            int totalLetters = 0;
            for (String w : words) {
                totalLetters += w.length();
            }

            int totalSpaces = maxWidth - totalLetters;

            if (words.length == 1) {
                currentRow.append(" ".repeat(totalSpaces));
                continue;
            }

            int gaps = words.length - 1;
            int spacePerGap = totalSpaces / gaps;
            int extraSpaces = totalSpaces % gaps;

            StringBuilder newRow = new StringBuilder();
            for (int j = 0; j < words.length; j++) {
                newRow.append(words[j]);
                if (j < words.length - 1) {
                    newRow.append(" ".repeat(spacePerGap));
                    if (extraSpaces > 0) {
                        newRow.append(' ');
                        extraSpaces--;
                    }
                }
            }
            resultList.set(i, newRow);
        }
    }

    private static void processLastString(List<StringBuilder> resultList, int maxWidth) {
        StringBuilder lastRow = resultList.get(resultList.size() - 1);
        lastRow.append(" ".repeat(maxWidth - lastRow.length()));
    }

}
