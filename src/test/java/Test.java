import com.diplabs.morsecode.CustomEvent;
import com.diplabs.morsecode.Letter;
import com.diplabs.morsecode.Sentence;
import com.diplabs.morsecode.Word;
import org.junit.Assert;

public class Test {
    @org.junit.Test
    public void testSetValue() {


        Letter symbol = new Letter('s');
        Assert.assertEquals(symbol.getMorseSimple(), "...");
        Assert.assertEquals(symbol.getMorseSimpleWithGaps(), ".0.0.");


        Word word = new Word("sos");
        Assert.assertEquals(word.getWordTranslatedWithoutGaps(), "...---...");
        Assert.assertEquals(word.getWordTranslatedWithGaps(), ".0.0.000-0-0-000.0.0.");


        Sentence sentence = new Sentence("sos sos");
        Assert.assertEquals(sentence.getSentenceWithoutGaps(), "...---......---...");
        Assert.assertEquals(sentence.getSentenceWithGaps(), ".0.0.000-0-0-000.0.0.0000000.0.0.000-0-0-000.0.0.");

        CustomEvent customEvent = new CustomEvent();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    customEvent.translate("s");
                }
            }
        });
        thread.start();

    }

}
