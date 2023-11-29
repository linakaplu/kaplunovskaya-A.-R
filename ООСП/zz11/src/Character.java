abstract class Character implements Cloneable {
    protected String name;
    protected int level;

    public abstract void displayInfo();

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public Character clone() throws CloneNotSupportedException {
        return (Character) super.clone();
    }
}
