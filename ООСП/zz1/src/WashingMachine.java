class WashingMachine implements Appliance {
    @Override
    public void start() {
        System.out.println("стиральная машина включена");
    }

    @Override
    public void stop() {
        System.out.println("стиральная машина выключена");
    }
}
