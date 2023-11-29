import java.util.HashMap;
import java.util.Map;

class Events {
    private Map<String, Integer> eventSeats;

    public Events() {
        eventSeats = new HashMap<>();

        eventSeats.put("Музыкальный концерт", 500);
        eventSeats.put("Театральное выступление", 800);
        eventSeats.put("Кинопоказ", 300);
    }

    public void displayEvents() {
        System.out.println("Мероприятия:");
        for (String eventName : eventSeats.keySet()) {
            System.out.println("- " + eventName);
        }
    }

    public boolean hasEvent(String eventName) {
        return eventSeats.containsKey(eventName);
    }

    public int getAvailableSeats(String eventName) {
        return eventSeats.getOrDefault(eventName, 0);
    }

    public void bookSeat(String eventName) {
        if (eventSeats.containsKey(eventName)) {
            int availableSeats = eventSeats.get(eventName);
            if (availableSeats > 0) {
                eventSeats.put(eventName, availableSeats - 1);
                System.out.println("Билет успешно забронирован на" + eventName );
            } else {
                System.out.println("Места на мероприятие '" + eventName + "' закончились");
            }
        } else {
            System.out.println("Мероприятие '" + eventName + "' не существует");
        }
    }
}