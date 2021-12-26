package main.java;

public interface MorseTranslator {

    void startOfTranslation();

    void doForSingleDot();

    void doForSingleDash();

    void doForSingleBreak();

    void endOfTranslation();

    default void translate(String textToTranslate) {
        Sentence sentence = new Sentence(textToTranslate);
        startOfTranslation();
        for (char c : sentence.getSentenceWithGaps().toCharArray()) {
            switch (c) {
                case '.': {
                    doForSingleDot();
                }
                break;
                case '-': {
                    doForSingleDash();
                }
                break;
                case '0': {
                    doForSingleBreak();
                }
                break;
            }

        }
        endOfTranslation();
    }
}
