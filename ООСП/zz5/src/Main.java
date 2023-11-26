import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NewsPortal newsPortal = new NewsPortal();
        SubscriptionManager subscriptionManager = new SubscriptionManager(newsPortal);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Меню:");
            System.out.println("1. подписаться на тему");
            System.out.println("2. отписаться от темы");
            System.out.println("3. просмотреть темы, на которые я подписан");
            System.out.println("4. посмотреть уведомления");
            System.out.println("5. выход");
            System.out.print("выбрать действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("введите тему для подписки: ");
                    String subscribeTopic = scanner.nextLine();
                    subscriptionManager.subscribe(subscribeTopic);
                    break;
                case 2:
                    System.out.print("Введите тему для отписки: ");
                    String unsubscribeTopic = scanner.nextLine();
                    subscriptionManager.unsubscribe(unsubscribeTopic);
                    break;
                case 3:
                    subscriptionManager.viewSubscribedTopics();
                    break;
                case 4:
                    System.out.println("уведомления:");        // просто выводим сообщение для демонстрации уведомлений

                    break;
                case 5:
                    System.out.println("выход из программы.");
                    return;
                default:
                    System.out.println("неверный выбор.");
            }
        }
    }
}