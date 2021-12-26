package main.java;

public class Sentence {


    private String englishSentence;
    private main.java.Word[] morseWords;

    public Sentence(String englishSentence){
        this.englishSentence = englishSentence;
        morseWords = new main.java.Word[englishSentence.split("\\W+").length];

        for (int i = 0; i < englishSentence.split("\\W+").length; i++) {
            morseWords[i] = new main.java.Word(englishSentence.split("\\W+")[i]);
        }

    }


    /**
     *
     * @return sentence translated without gaps between words and symbols. E.g. "sos sos" as ...---......---...
     */
    public String getSentenceWithoutGaps(){


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < morseWords.length; i++) {
            if (i == 0 ){
                sb.append(morseWords[i].getWordTranslatedWithoutGaps());

            }else {

                sb.append(morseWords[i].getWordTranslatedWithoutGaps());

            }
        }


        return sb.toString();
    }
    /**
     *
     * @return translated with  gaps between words  as 0000000 and symbols. according to other methods
     * E.g. "sos sos" as .0.0.000-0-0-000.0.0.0000000.0.0.000-0-0-000.0.0.
     */
    public String getSentenceWithGaps(){


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < morseWords.length; i++) {
            if (i == 0 ){
                sb.append(morseWords[i].getWordTranslatedWithGaps());

            }else {
                sb.append("0000000");
                sb.append(morseWords[i].getWordTranslatedWithGaps());

            }
        }


        return sb.toString();
    }
}
