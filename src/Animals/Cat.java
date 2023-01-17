
package Animals;

public class Cat  extends Animal implements SpeakAble {


    public Cat(String name, String breed, String colour, Integer age) {

        super("Кошачии",name, breed, colour, 4, age);
    }

    @Override
    public String speak() {
        return "mau";
    }
}
