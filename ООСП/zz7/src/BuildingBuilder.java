class BuildingBuilder {
    private String type;
    private int floors;
    private int entrances;


    public BuildingBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public BuildingBuilder setFloors(int floors) {
        this.floors = floors;
        return this;
    }

    public BuildingBuilder setEntrances(int entrances) {
        this.entrances = entrances;
        return this;
    }

    public Building build() {
        return new Building(type, floors, entrances);
    }
}