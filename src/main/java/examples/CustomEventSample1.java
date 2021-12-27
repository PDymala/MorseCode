package examples;

import com.diplabs.morsecode.MorseTranslator;

/**
 * Prints Morse code translation in console
 */
public class CustomEventSample1 implements MorseTranslator {
    @Override
    public void startOfTranslation() {

    }

    @Override
    public void doForSingleDot() {
        System.out.println(".");
    }

    @Override
    public void doForSingleDash() {
        System.out.println("-");
    }

    @Override
    public void doForSingleBreak() {

    }

    @Override
    public void endOfTranslation() {

    }
}
