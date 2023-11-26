class Bluetooth implements WirelessNetwork {
    @Override
    public void turnOn() {
        System.out.println("bluetooth активен");
    }

    @Override
    public void turnOff() {
        System.out.println("bluetooth неактивен");
    }
}
