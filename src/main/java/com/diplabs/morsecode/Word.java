package com.diplabs.morsecode;

public class Word {

    private String englishWord;
    private Letter[] morseLetters;

    /**
     * All the character will be converted to lower case
     * @param englishWord english word without special character.
     */
    public Word(String englishWord){
        this.englishWord = englishWord.toLowerCase();
        morseLetters = new Letter[englishWord.toCharArray().length];

        for (int i = 0; i < englishWord.toCharArray().length; i++) {
            morseLetters[i] = new Letter(englishWord.toCharArray()[i]);
        }

    }

    /**
     *
     * @return translated word into morse without gaps between symbols. E.g. "sos" as ...---...
     */
    public String getWordTranslatedWithoutGaps(){


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < morseLetters.length; i++) {
            if (i == 0 ){
            sb.append(morseLetters[i].getMorseSimple());

            }else {

                sb.append(morseLetters[i].getMorseSimple());

            }
        }
        

        return sb.toString();
    }

    /**
     *
     * @return translated word into morse with gaps between symbols as 000. E.g. "sos" as .0.0.000-0-0-000.0.0.
     */
    public String getWordTranslatedWithGaps(){


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < morseLetters.length; i++) {
            if (i == 0 ){
                sb.append(morseLetters[i].getMorseSimpleWithGaps());

            }else {
                sb.append("000");
                sb.append(morseLetters[i].getMorseSimpleWithGaps());

            }
        }


        return sb.toString();
    }
}
