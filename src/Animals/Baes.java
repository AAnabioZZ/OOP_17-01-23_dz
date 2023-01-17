package Animals;

public abstract class Baes {
    protected String name;
    protected String type;

    public Baes(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }
}
