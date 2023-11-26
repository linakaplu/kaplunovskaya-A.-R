class Refrigerator implements Appliance {
    @Override
    public void start() {
        System.out.println("холодильник включен");
    }

    @Override
    public void stop() {
        System.out.println("холодильник выключен");
    }
}