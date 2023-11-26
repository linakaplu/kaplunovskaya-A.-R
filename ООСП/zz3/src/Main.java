import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        WirelessNetwork wiFi = new WiFi();
        WirelessNetwork bluetooth = new Bluetooth();
        WirelessNetwork zigbee = new Zigbee();

        while (true) {
            System.out.println("выберите сеть (1 - WiFi, 2 - Bluetooth, 3 - Zigbee, 4 - Выход):");
            int choice = scanner.nextInt();

            WirelessNetwork wirelessNetwork = null;

            switch (choice) {
                case 1:
                    wirelessNetwork = wiFi;
                    break;
                case 2:
                    wirelessNetwork = bluetooth;
                    break;
                case 3:
                    wirelessNetwork = zigbee;
                    break;
                case 4:
                    System.out.println("программа завершена.");
                    return;
                default:
                    System.out.println("выбор невозможен");
                    continue;
            }

            while (true) {
                System.out.println("Выберите действие (1 - включить сеть, 2 - выключить сеть, 3 - выйти):");
                int action = scanner.nextInt();

                switch (action) {
                    case 1:
                        wirelessNetwork.turnOn();
                        break;
                    case 2:
                        wirelessNetwork.turnOff();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("выбор невозможен");
                }

                if (action == 3) {
                    break;
                }
            }
        }
    }
}