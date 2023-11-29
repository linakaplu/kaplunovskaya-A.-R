import java.util.ArrayList;
import java.util.List;

class Project implements ProjectItem {
    private String name;
    private List<ProjectItem> projectItems;

    public Project(String name) {
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
        System.out.println("Проект: " + name);
        for (int i = 0; i < projectItems.size(); i++) {
            System.out.println((i + 1) + ". " + projectItems.get(i));
        }
    }
}