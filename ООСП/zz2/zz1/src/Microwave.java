class Microwave implements Appliance {
    @Override
    public void start() {
        System.out.println("микроволновка включена");
    }

    @Override
    public void stop() {
        System.out.println("микроволновка выключена");
    }
}
