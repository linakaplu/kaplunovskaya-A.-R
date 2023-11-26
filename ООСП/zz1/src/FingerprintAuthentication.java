import java.util.Random;

class FingerprintAuthentication implements Authentication {
    @Override
    public boolean authenticate(String input) {
        System.out.println("авторизация по отпечатку ");
        return new Random().nextBoolean();
    }
}