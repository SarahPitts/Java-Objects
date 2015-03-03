//when defining a new class you will need an access level modifier
public class PezDispenser {
	//adds some state with a field or member variable
	// public ensures that everyone who creates this object can see it
	// member variables commonly begin with the letter m
	// changed access level to private for more clear useage from end user
	private String mCharacterName = "Yoda";

	//methods have an access level modifier before they are defined
	//no parameters were needed yet
	// the prefix get is part of a very common pattern called a getter
	// the naming with prefixes such as get or set are so common that they have a name which is Properties
	public String getCharacterName() {
		// used the keyword return to return the value to whoever called the function
		return mCharacterName;
	}
}