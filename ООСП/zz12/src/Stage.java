import java.util.ArrayList;
import java.util.List;
class Stage implements ProjectItem {
    private String name;
    private List<ProjectItem> projectItems;

    public Stage(String name) {
        this.name = name;
        projectItems = new ArrayList<>();
    }

    public void addProjectItem(ProjectItem item) {
        projectItems.add(item);
    }

    public List<ProjectItem> getProjectItems() {
        return projectItems;
    }

    public void display() {
        System.out.println("  Этап: " + name);
        for (int i = 0; i < projectItems.size(); i++) {
            System.out.println("    " + (i + 1) + ". " + projectItems.get(i));
        }
    }

    @Override
    public String toString() {
        return "Этап: " + name;
    }
}