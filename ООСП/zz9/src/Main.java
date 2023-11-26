import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GlobalRequestCounter requestCounter = GlobalRequestCounter.getInstance();

        while (true) {
            System.out.println("Меню:");
            System.out.println("1.Добавить HTTP-запрос");
            System.out.println("2.Получить кол-во запросов");
            System.out.println("3.Выход");

            System.out.print("Выбор действия: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    requestCounter.incrementRequestCount();
                    break;
                case 2:
                    int totalCount = requestCounter.getRequestCount();
                    System.out.println("Кол-во запросов: " + totalCount);
                    break;
                case 3:
                    System.out.println("Выход");
                    return;
                default:
                    System.out.println("Неверный.");
                    break;
            }
        }
    }
}