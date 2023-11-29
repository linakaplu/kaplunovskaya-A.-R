import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CharacterManager characterManager = new CharacterManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("меню:");
            System.out.println("1.Создать воина");
            System.out.println("2.Создать мага");
            System.out.println("3.3аменить характеристики");
            System.out.println("4.Клонировать");
            System.out.println("5.Просмотреть клонов");
            System.out.println("6.Выход");

            System.out.print("Действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Warrior warrior = (Warrior) characterManager.getCharacter("воин");
                    if (warrior != null) {
                        warrior.displayInfo();
                    }
                    break;
                case 2:
                    Mage mage = (Mage) characterManager.getCharacter("маг");
                    if (mage != null) {
                        mage.displayInfo();
                    }
                    break;
                case 3:
                    System.out.print("Введите имя");
                    String characterName = scanner.nextLine();
                    System.out.print("Введите уровень");
                    int characterLevel = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Выберите тип персонажа (воин/маг): ");
                    String characterType = scanner.nextLine();

                    Character selectedCharacter = characterManager.getCharacter(characterType);
                    if (selectedCharacter != null) {
                        selectedCharacter.setName(characterName);
                        selectedCharacter.setLevel(characterLevel);
                        selectedCharacter.displayInfo();
                    } else {
                        System.out.println("Некорректный тип");
                    }
                    break;
                case 4:
                    System.out.print("Введите имя для клонирования: ");
                    String cloneCharacterName = scanner.nextLine();

                    Character cloneCharacter = characterManager.getCharacter(cloneCharacterName);
                    if (cloneCharacter != null) {
                        try {
                            Character cloned = cloneCharacter.clone();
                            if (cloned instanceof Warrior) {
                                ((Warrior) cloned).addClonedCharacter((Warrior) cloneCharacter);
                            } else if (cloned instanceof Mage) {
                                ((Mage) cloned).addClonedCharacter((Mage) cloneCharacter);
                            }
                            System.out.println("Клон");
                            cloned.displayInfo();
                        } catch (CloneNotSupportedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("Персонаж не найден");
                    }
                    break;
                case 5:
                    characterManager.displayAllClonedCharacters();
                    break;
                case 6:
                    System.out.println("Выход");
                    return;
                default:
                    System.out.println("Неправильный выбор");
                    break;
            }
        }
    }
}