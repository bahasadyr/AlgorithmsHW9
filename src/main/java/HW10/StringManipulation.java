package HW10;

import java.util.Arrays;
import java.util.Locale;

public class StringManipulation {
    public int[] stringToNumbers15(String sentence) {
        if (!sentence.isEmpty()) {
            int count = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (Character.isDigit(sentence.charAt(i))) {
                    count++;
                }
            }
            int[] arrInt = new int[count];
            count = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (Character.isDigit(sentence.charAt(i))) {
                    arrInt[count] = Integer.parseInt(Character.toString(sentence.charAt(i)));
                    count++;
                }
            }
            return arrInt;
        }
        return new int[]{};
    }

    public int countWords17(String str, String contai) {
        if (!str.isEmpty()) {

            str = str.toLowerCase();
            String[] arr = str.split(" ");
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].contains(contai.toLowerCase())) {
                    count++;
                }
            }
            return count;
        }
        return -1;
        /**
         * Напишите алгоритм CountWords, который принимает на вход текст и слово,
         * и считает все вариации этого слова в тексте:
         * “As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current
         * long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January 2019 for commercial java use, although it will otherwise still support Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.”, “Java” → 5
         *
         * “As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January 2019 for commercial java use, although it will otherwise still support Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.”, “version” → 2
         */
    }

    public String startsWithLetter18(String str) {
        /**
         * Написать алгоритм StartsWithLetter, который принимает на вход текст,
         * и возвращает в виде строки все слова, которые начинаются с буквы l.
         * “As a decrepit father takes delight
         * To see his active child do deeds of youth,
         * So I, made lame by fortune’s dearest spite,
         * Take all my comfort of thy worth and truth.
         * For whether beauty, birth, or wealth, or wit,
         * Or any of these all, or all, or more,
         * Entitled in thy parts do crownèd sit,
         * I make my love engrafted to this store.
         * So then I am not lame, poor, nor despised,
         * Whilst that this shadow doth such substance give
         * That I in thy abundance am sufficed,
         * And by a part of all thy glory live.
         * Look what is best, that best I wish in thee.
         * This wish I have; then ten times happy me.”  → “lame, love, lame, live, Look”
         */
        if (!str.isEmpty() || str != null) {
            str = str.toLowerCase();
            String[] arr = str.split("\\s");
            String res = "";
            for(int i = 0; i < arr.length; i++){
                arr[i] = arr[i].replace(",","");
                arr[i] = arr[i].replace(".","");
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].charAt(0) == 'l') {
                    res += arr[i] + ", ";
                }
            }
            res = res.substring(0,res.length()-2);
            return res.trim();

        }
        return "";
    }
    public String nineteen(String str){
        return "";
    }
    public static void main(String[] args) {
        StringManipulation sObj = new StringManipulation();
        String str = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January 2019 for commercial java use, although it will otherwise still support Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        String contai = "Java";
        System.out.println(sObj.countWords17(str, contai));
        String str2 = "As a decrepit father takes delight To see his active child do deeds of youth,So I, made lame by fortune’s dearest spite, Take all my comfort of thy worth and truth. For whether beauty, birth, or wealth, or wit, Or any of these all, or all, or more, Entitled in thy parts do crownèd sit, I make my love engrafted to this store. So then I am not lame, poor, nor despised, Whilst that this shadow doth such substance give That I in thy abundance am sufficed, And by a part of all thy glory live. Look what is best, that best I wish in thee. This wish I have; then ten times happy me.";

        System.out.println(sObj.startsWithLetter18(str2));
    }


}
