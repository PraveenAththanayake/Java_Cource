package inheritance;

public class Cat extends Animal {
    @Override
    public void makeSounds() {
        System.out.println("Meow!");
    }

    public void scratch() {
        System.out.println("I'm a cat. I scratch things.");
    }
}
