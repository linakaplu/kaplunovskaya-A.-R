class Zigbee implements WirelessNetwork {
    @Override
    public void turnOn() {
        System.out.println("Zigbee активен");
    }

    @Override
    public void turnOff() {
        System.out.println("Zigbee неактивен");
    }
}
