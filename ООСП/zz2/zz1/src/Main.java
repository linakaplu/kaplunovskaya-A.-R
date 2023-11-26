import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("выберать устройство (1 - холодильник, 2 - стиральная машина, 3 - микроволновка, 4 - Выход):");
            int choice = scanner.nextInt();

            Appliance appliance = null;

            switch (choice) {
                case 1:
                    appliance = new ApplianceFactory<>(Refrigerator.class).createAppliance();
                    break;
                case 2:
                    appliance = new ApplianceFactory<>(WashingMachine.class).createAppliance();
                    break;
                case 3:
                    appliance = new ApplianceFactory<>(Microwave.class).createAppliance();
                    break;
                case 4:
                    System.out.println("программа завершена.");
                    return;
                default:
                    System.out.println("неправильный выбор");
                    continue;
            }

            if (appliance == null) {
                System.out.println("нет такого устройства");
                continue;
            }

            System.out.println("выберите действие (1 - Включить, 2 - Выключить):");
            int action = scanner.nextInt();

            switch (action) {
                case 1:
                    appliance.start();
                    break;
                case 2:
                    appliance.stop();
                    break;
                default:
                    System.out.println("невозможно выполнить действие");
            }
        }
    }
}