package Animals;

public class Dog extends Animal implements SpeakAble{

    public Dog(String name, String breed, String colour, Integer age) {
        super("Собаки",name, breed, colour, 4, age);
    }

    @Override
    public String speak() {
        return "Baw-wow!";
    }
}
