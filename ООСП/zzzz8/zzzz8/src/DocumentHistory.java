import java.util.Deque;
import java.util.ArrayDeque;
class DocumentHistory {
    private Deque<DocumentSnapshot> history;
    private Deque<DocumentSnapshot> deleted;

    public DocumentHistory() {
        history = new ArrayDeque<>();
        deleted = new ArrayDeque<>();
    }

    public void save(Document document) {
        history.push(document.createSnapshot());
    }

    public void undo(Document document) {
        DocumentSnapshot snapshot = history.poll();
        if (snapshot != null) {
            deleted.push(document.createSnapshot());
            document.restoreFromSnapshot(snapshot);
        }
    }

    public void redo(Document document) {
        DocumentSnapshot snapshot = deleted.poll();
        if (snapshot != null) {
            history.push(document.createSnapshot());
            document.restoreFromSnapshot(snapshot);
        }
    }
}