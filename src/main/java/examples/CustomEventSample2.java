package examples;

import com.diplabs.morsecode.MorseTranslator;

public class CustomEventSample2 implements MorseTranslator {
    private String morseTranslationString = "";

    @Override
    public void startOfTranslation() {

    }

    @Override
    public void doForSingleDot() {
      morseTranslationString+=".";
    }

    @Override
    public void doForSingleDash() {
        morseTranslationString+="-";
    }

    @Override
    public void doForSingleBreak() {

    }

    @Override
    public void endOfTranslation() {

    }

    /**
     *
     * @return translated text as String
     */
    public String getMorseTranslationString() {
        return morseTranslationString;
    }
}
