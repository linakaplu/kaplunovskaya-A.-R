class WiFi implements WirelessNetwork {
    @Override
    public void turnOn() {
        System.out.println("Wi-Fi активен");
    }

    @Override
    public void turnOff() {
        System.out.println("Wi-Fi неактивен");
    }
}