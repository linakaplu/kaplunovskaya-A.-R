class NewsSubscriber implements Observer {
    private String topic;

    public NewsSubscriber(String topic) {
        this.topic = topic;
    }

    @Override
    public void update(String news) {
        System.out.println("уведомление: новые новости в теме '" + topic + "': " + news);
    }

    public String getTopic() {
        return topic;
    }
}