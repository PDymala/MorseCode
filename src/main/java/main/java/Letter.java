package main.java;

import java.util.Arrays;
import java.util.List;

public class Letter {

    private char englishLetter;

    /**
     *
     * @param englishLetter single english letter (char).
     */
    public Letter(char englishLetter){
    this.englishLetter = englishLetter;
    }

    List<Character> english = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            ',', '.', '?');

    String[] morseSimple = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--.."};

    /**
     *
    * @return pure translated String. Dots and dashes. E.g. "s" as ...
     */
    public String getMorseSimple() {

        if (english.contains(englishLetter)) {
            return morseSimple[english.indexOf(englishLetter)];
        } else {
            return null;
        }

    }

    /**
     *
    * @return translated char with proper gaps marked as 0 between dots and dashes. E.g. "s" as .0.0.
     */
    public String getMorseSimpleWithGaps(){
        if (english.contains(englishLetter)) {

            char[] symbolIntoChars = morseSimple[english.indexOf(englishLetter)].toCharArray();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < symbolIntoChars.length; i++) {

                if (i == 0 ){
                    sb.append(symbolIntoChars[i]);
                } else{
                    sb.append("0");
                    sb.append(symbolIntoChars[i]);

                }

            }
            return sb.toString();


        } else {
            return null;
        }

    }


}
