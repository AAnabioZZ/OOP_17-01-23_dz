package Animals;

public abstract class Fish extends Baes {

    protected String breed;
    protected String colour;
    protected Integer namberAquarium;

    public Fish(String name, String breed, String colour, Integer namberAquarium) {
        super("Рыбы", name);
        this.breed = breed;
        this.colour = colour;
        this.namberAquarium = namberAquarium;
    }
}
