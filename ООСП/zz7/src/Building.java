class Building {
    private String type;
    private int floors;
    private int entrances;

    public Building(String type, int floors, int entrances) {
        this.type = type;
        this.floors = floors;
        this.entrances = entrances;
    }

    public void showInfo() {
        System.out.println("тип дома: " + type);
        System.out.println("кол-во этажей: " + floors);
        System.out.println("кол-во подъездов: " + entrances);
    }
}