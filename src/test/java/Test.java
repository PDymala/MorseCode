import org.junit.Assert;

public class Test {
    @org.junit.Test
    public void testSetValue() {


        main.java.Letter symbol = new main.java.Letter('s');
        Assert.assertEquals(symbol.getMorseSimple(), "...");
        Assert.assertEquals(symbol.getMorseSimpleWithGaps(), ".0.0.");


        main.java.Word word = new main.java.Word("sos");
        Assert.assertEquals(word.getWordTranslatedWithoutGaps(), "...---...");
        Assert.assertEquals(word.getWordTranslatedWithGaps(), ".0.0.000-0-0-000.0.0.");


        main.java.Sentence sentence = new main.java.Sentence("sos sos");
        Assert.assertEquals(sentence.getSentenceWithoutGaps(), "...---......---...");
        Assert.assertEquals(sentence.getSentenceWithGaps(), ".0.0.000-0-0-000.0.0.0000000.0.0.000-0-0-000.0.0.");

    }

}
