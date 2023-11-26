import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Document currentDocument = new Document("");
        DocumentHistory history = new DocumentHistory();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1.Создание/изменение документа");
            System.out.println("2.Сохранение документа");
            System.out.println("3.Отмена последнего действия изменения");
            System.out.println("4.Восстановить документ");
            System.out.println("5.Показать текущий документ");
            System.out.println("6.Выход");

            System.out.print("Выберать действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите текст документа: ");
                    String text = scanner.nextLine();
                    currentDocument.setContent(text);
                    continue;
                case 2:
                    history.save(currentDocument);
                    System.out.println("Сохранено.");
                    continue;
                case 3:
                    history.undo(currentDocument);
                    System.out.println("Изменение отменено.");
                    continue;
                case 4:
                    history.redo(currentDocument);
                    System.out.println("Документ восстановлен.");
                    continue;
                case 5:
                    System.out.println("Документ: " + currentDocument.getContent());
                    continue;
                case 6:
                    System.out.println("Выйти");
                    return;
                default:
                    System.out.println("Неверно.");
                    continue;
            }
        }
    }
}