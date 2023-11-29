import java.util.HashMap;
import java.util.Map;

class CharacterManager {
    private Map<String, Character> characters = new HashMap<>();

    public CharacterManager() {
        characters.put("воин", new Warrior());
        characters.put("маг", new Mage());
    }

    public void addCharacter(String key, Character character) {
        characters.put(key, character);
    }

    public Character getCharacter(String key) {
        try {
            return characters.get(key).clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void displayAllClonedCharacters() {
        for (Character character : characters.values()) {
            if (character instanceof Warrior) {
                ((Warrior) character).displayClonedCharacters();
            } else if (character instanceof Mage) {
                ((Mage) character).displayClonedCharacters();
            }
        }
    }
}
