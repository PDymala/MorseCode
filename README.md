# MorseCode
Very simple Morse API text translator. Mainly to do some testing with jitpack, API development etc.


## Add to your project
Add dependency e.g. with gradle:

```

allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }

}
```
and add dependency:

```
dependencies {
   implementation 'com.github.pdymala:morsecode:master-SNAPSHOT'
}
```

## Usage
Create your own class to handle Morse events
E.g.

```
public class CustomMorseEventHandler implements MorseTranslator{
   
   
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
    
      System.out.println("0");
    }
    
    @Override
    public void endOfTranslation() {

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

Exchenge print "0" in doForSingleBreak for 'nothing' and the result will be:
> ...---...

## License
Free to use by anyone for anything
