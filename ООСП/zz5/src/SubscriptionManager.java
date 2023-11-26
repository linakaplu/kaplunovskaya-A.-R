import java.util.ArrayList;
import java.util.List;
class SubscriptionManager {
    private NewsPortal newsPortal;
    private List<NewsSubscriber> subscribers;

    public SubscriptionManager(NewsPortal newsPortal) {
        this.newsPortal = newsPortal;
        this.subscribers = new ArrayList<>();
    }

    public void subscribe(String topic) {
        NewsSubscriber subscriber = new NewsSubscriber(topic);
        newsPortal.attach(subscriber);
        subscribers.add(subscriber);
        System.out.println("вы подписались на тему: " + topic);
    }

    public void unsubscribe(String topic) {
        for (NewsSubscriber subscriber : subscribers) {
            if (subscriber.getTopic().equalsIgnoreCase(topic)) {
                newsPortal.detach(subscriber);
                subscribers.remove(subscriber);
                System.out.println("вы отписались от темы: " + topic);
                return;
            }
        }
        System.out.println("вы не подписаны тему: " + topic);
    }

    public void viewSubscribedTopics() {
        List<String> subscribedTopics = newsPortal.getSubscribedTopics();
        if (subscribedTopics.isEmpty()) {
            System.out.println("вы не подписаны ни на одну тему");
        } else {
            System.out.println("иемы, на которые у вас есть подписка:");
            for (String topic : subscribedTopics) {
                System.out.println("- " + topic);
            }
        }
    }
}