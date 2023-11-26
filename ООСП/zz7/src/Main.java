import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BuildingBuilder builder = new BuildingBuilder();
        Building building = null;

        while (true) {
            System.out.println("меню:");
            System.out.println("1.создание здания");
            System.out.println("2.просмотреть созданное здание");
            System.out.println("3.выход");

            System.out.print("выберать действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("введите тип дома: ");
                    String type = scanner.nextLine();
                    System.out.print("введите кол-во этажей: ");
                    int floors = scanner.nextInt();
                    System.out.print("введите кол-во подъездов: ");
                    int entrances = scanner.nextInt();
                    scanner.nextLine();
                    building = builder
                            .setType(type)
                            .setFloors(floors)
                            .setEntrances(entrances)
                            .build();
                    System.out.println("дом создан.");
                    continue;
                case 2:
                    if (building != null) {
                        building.showInfo();
                    } else {
                        System.out.println("для начала создайте дом.");
                    }
                    continue;
                case 3:
                    System.out.println("выход из программы.");
                    return;
                default:
                    System.out.println("неверный выбор.");
                    continue;
            }
        }
    }
}