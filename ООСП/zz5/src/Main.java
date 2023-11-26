import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner userInputScanner = new java.util.Scanner(System.in);
        PrintingDevice device;

        Printer printer = new Printer();
        DocumentScanner scanDevice = new DocumentScanner();

        PrinterAdapter printerAdapter = new PrinterAdapter(printer);
        ScannerAdapter scannerAdapter = new ScannerAdapter(scanDevice);

        System.out.println("Выберите девайс:");
        System.out.println("1. Принтер");
        System.out.println("2. Сканер");
        System.out.print("Выбор: ");
        int choice = userInputScanner.nextInt();
        userInputScanner.nextLine(); // Consume newline

        if (choice == 1) {
            device = printerAdapter;
        } else if (choice == 2) {
            device = scannerAdapter;
        } else {
            System.out.println("Неверный выбор.");
            return;
        }

        System.out.print("Укажите название документа: ");
        String document = userInputScanner.nextLine();
        device.print(document);
    }
}