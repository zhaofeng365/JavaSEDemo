package com.designMode.Flyweight;
import java.util.HashMap;
import java.util.Map;


public class MyCharacterFactory {
	private Map<Character,MyCharacter> pool;
	
	public MyCharacterFactory() {
		pool = new HashMap<Character,MyCharacter>();
	}
	
	public MyCharacter getMyCharacter(Character character) {
		MyCharacter myChar = pool.get(character);
		if(myChar == null) {
			myChar = new MyCharacter(character);
			pool.put(character, myChar);
		}
		return myChar;
	}
}
