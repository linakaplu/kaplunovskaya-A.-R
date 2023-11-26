import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class NewsPortal implements Subject {
    private Map<String, List<Observer>> subscribers;
    private Map<String, String> newsByTopic;

    public NewsPortal() {
        this.subscribers = new HashMap<>();
        this.newsByTopic = new HashMap<>();
    }

    @Override
    public void attach(Observer observer) {
        String topic = ((NewsSubscriber) observer).getTopic();
        subscribers.computeIfAbsent(topic, k -> new ArrayList<>());
        subscribers.get(topic).add(observer);
    }

    @Override
    public void detach(Observer observer) {
        String topic = ((NewsSubscriber) observer).getTopic();
        if (subscribers.containsKey(topic)) {
            subscribers.get(topic).remove(observer);
        }
    }

    @Override
    public void notifyObservers(String topic, String news) {
        if (subscribers.containsKey(topic)) {
            for (Observer observer : subscribers.get(topic)) {
                observer.update(news);
            }
        }
    }

    public List<String> getSubscribedTopics() {
        return new ArrayList<>(subscribers.keySet());
    }
}