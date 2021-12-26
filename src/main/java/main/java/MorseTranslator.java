package main.java;

public interface MorseTranslator {

    void doForSingleDot();

    void doForSingleDash();

    void doForSingleBreak();

    default void translate(String textToTranslate) {
        Sentence sentence = new Sentence(textToTranslate);
        sentence.getSentenceWithGaps();

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
    }
}
