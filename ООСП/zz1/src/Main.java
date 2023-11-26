import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AuthenticationFactory authenticationFactory = new AuthenticationFactory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("выберите вид авторизации (пароль/отпечаток/соц. сети):");
            String type = scanner.nextLine();

            Authentication authentication = authenticationFactory.createAuthentication(type);

            System.out.println("введите данные для входа:");
            String inputData = scanner.nextLine();

            boolean result = authentication.authenticate(inputData);

            if (result) {
                System.out.println("авторизация успешна");
            } else {
                System.out.println("авторизация неуспешна");
            }

            System.out.println("Продолжить авторизацию? (да/нет)");
            String continueOption = scanner.nextLine();
            if (!continueOption.equalsIgnoreCase("да")) {
                break;
            }
        }
    }
}