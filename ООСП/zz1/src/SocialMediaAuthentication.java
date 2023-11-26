import java.util.Random;

class SocialMediaAuthentication implements Authentication {
    @Override
    public boolean authenticate(String input) {
        System.out.println("авторизация через соц. сети");
        return new Random().nextBoolean();
    }
}