package inheritance;

public class Dog extends Animal {
    @Override
    public void makeSounds() {
        System.out.println("Woof!");
    }

    public void fetch() {
        System.out.println("Fetch is fun!");
    }
}
