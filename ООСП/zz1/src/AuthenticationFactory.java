class AuthenticationFactory {
    Authentication createAuthentication(String type) {
        switch (type) {
            case "пароль":
                return new PasswordAuthentication();
            case "отпечаток пальца":
                return new FingerprintAuthentication();
            case "соц. сети":
                return new SocialMediaAuthentication();
            default:
                throw new IllegalArgumentException("неправильный тип авторизации");
        }
    }
}
