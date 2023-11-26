import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Questionnaire questionnaire = null;

        while (true) {
            System.out.println("Меню:");
            System.out.println("1.сформировать опрос");
            System.out.println("2.сформировать тест");
            System.out.println("3.сформировать анкету");
            System.out.println("4.сформировать пользовательский вопрос");
            System.out.println("5.просмотреть созданные вопросы");
            System.out.println("6.выход");

            System.out.print("Выберите тип действия: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    questionnaire = new Survey();
                    break;
                case 2:
                    questionnaire = new Test();
                    break;
                case 3:
                    questionnaire = new Form();
                    break;
                case 4:
                    System.out.print("введите ваш вопрос: ");
                    String customQuestion = scanner.nextLine();
                    if (questionnaire != null) {
                        questionnaire.addCustomQuestion(customQuestion);
                        System.out.println("вопрос создан.");
                    } else {
                        System.out.println("сначала выберите тип анкеты.");
                    }
                    continue;
                case 5:
                    if (questionnaire != null) {
                        questionnaire.viewAllQuestions();
                    } else {
                        System.out.println("сначала создайте анкету.");
                    }
                    continue;
                case 6:
                    System.out.println("Выход.");
                    return;
                default:
                    System.out.println("Нет такого выбора.");
                    continue;
            }

            System.out.println("оздать анкету:");
            if (questionnaire != null) {
                questionnaire.createQuestionnaire();
                System.out.println();
            } else {
                System.out.println("сначала выберите тип анкеты.");
            }
        }
    }
}