# MorseCode
Very simple Morse code API text translator. Mainly to do some testing with jitpack, API development etc.


## Add to your project
Add in your project with jitpack (Gradle). In your gradle file:

```

allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }

}
```
and dependency:

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

## Samples

- Samples of custom event classes can be found in project directory [here](https://github.com/PDymala/MorseCode/tree/master/src/main/java/examples)
- A sample Android project with use of this API can be found [here](https://github.com/PDymala/MorseApp)

## License
Free to use by anyone for anything
