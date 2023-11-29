import java.util.ArrayList;
import java.util.List;

class Mage extends Character {
    private int intelligence;
    private List<Mage> clonedCharacters = new ArrayList<>();

    public Mage() {
        this.name = "Mage";
        this.level = 1;
        this.intelligence = 8;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void addClonedCharacter(Mage mage) {
        clonedCharacters.add(mage);
    }

    public void displayClonedCharacters() {
        if (clonedCharacters.isEmpty()) {
            System.out.println("Нет клонированных магов.");
        } else {
            System.out.println("Клонированные маги:");
            for (Mage mage : clonedCharacters) {
                mage.displayInfo();
            }
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("маг: " + name + ", уровень: " + level + ", интелект: " + intelligence);
    }
}