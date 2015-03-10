//java -jar java-repl-master/build/artifacts/javarepl-dev.build.jar
// will start the read evaluate print loop
// :cls will clear the screen
//.contains is case sensitive, must use .toLowerCase with it

public class Example {
    
    public static void main(String[] args) {
        // Your amazing code goes here...
        // System is a class that exposes a static public field named out
        // out is a print string which exposes methods
        // we can write to screen using println which automatically prints a new line making /n unnecessary
        System.out.println("We are making a new Pez dispenser");
        //just like every other variable this one will have a type.  it's type will be PezDispenser
        // the name of the variable is dispenser
        // when a constructor is defined a default response is required.
        PezDispenser dispenser = new PezDispenser ("Hello Kitty");
        //we can access the fields that we exposed publicly such as mCharacterName
        //swapped to use getter method now that mCharacterName has been set to private
        System.out.printf("The dispenser character name is %s \n", dispenser.getCharacterName());
    }
}
