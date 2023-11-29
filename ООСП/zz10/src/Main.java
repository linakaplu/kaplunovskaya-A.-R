import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicketBookingFacade bookingFacade = new TicketBookingFacade();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Показать доступные мероприятия");
            System.out.println("2. Выбрать мероприятие и забронировать билет");
            System.out.println("3. Оплатить билет");
            System.out.println("4. Выход");

            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    bookingFacade.displayAvailableEvents();
                    break;
                case 2:
                    System.out.print("Введите название мероприятия: ");
                    String eventName = scanner.nextLine();
                    bookingFacade.selectEvent(eventName);
                    break;
                case 3:
                    System.out.println("Выберите способ оплаты: 1 - Наличными, 2 - Картой");
                    int paymentOption = scanner.nextInt();
                    scanner.nextLine();
                    bookingFacade.payForTicket(paymentOption);
                    break;
                case 4:
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Неправильный выбор.");
                    break;
            }
        }
    }
}