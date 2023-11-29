import java.util.ArrayList;
import java.util.List;

class Warrior extends Character {
    private int strength;
    private List<Warrior> clonedCharacters = new ArrayList<>();

    public Warrior() {
        this.name = "Воин";
        this.level = 1;
        this.strength = 10;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void addClonedCharacter(Warrior warrior) {
        clonedCharacters.add(warrior);
    }

    public void displayClonedCharacters() {
        if (clonedCharacters.isEmpty()) {
            System.out.println("Нет клонированных воинов");
        } else {
            System.out.println("Клонированные воины:");
            for (Warrior warrior : clonedCharacters) {
                warrior.displayInfo();
            }
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Воин: " + name + ", Уровень: " + level + ", Сила: " + strength);
    }
}