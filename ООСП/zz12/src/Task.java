class Task implements ProjectItem {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("    Задача: " + name);
    }
}