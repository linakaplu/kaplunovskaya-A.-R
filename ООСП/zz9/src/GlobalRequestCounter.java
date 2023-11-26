class GlobalRequestCounter { //класс реализующий паттерн одиночка
    private static GlobalRequestCounter instance;
    private int requestCount;

    private GlobalRequestCounter() {
        requestCount = 0;
    }

    public static synchronized GlobalRequestCounter getInstance() {
        if (instance == null) {
            instance = new GlobalRequestCounter();
        }
        return instance;
    }

    public void incrementRequestCount() {
        requestCount++;
        System.out.println("Запрос создан. Текущее кол-во запросов: " + requestCount);
    }

    public int getRequestCount() {
        return requestCount;
    }
}
