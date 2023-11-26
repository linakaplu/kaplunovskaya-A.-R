import java.util.Random;


class PasswordAuthentication implements Authentication {
    @Override
    public boolean authenticate(String input) {
        System.out.println("авторизация по паролю");
        return new Random().nextBoolean();
    }
}