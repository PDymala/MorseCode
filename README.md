# MorseCode
Very simple Morse API text translator. Mainly to test github dependency for Android


Create your own class to handle Morse events
E.g.

```
public class CustomMorseEventHandler implements MorseTranslator{
   
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
    
      System.out.println("0");
    }
 }
 
```

And use it in your main class like so

```
CustomMorseEventHandler morsetranslator = new CustomMorseEventHandler();

morsetranslator.translate("sos");
```
Will produce following result in terminal:
> .0.0.000-0-0-000.0.0.
