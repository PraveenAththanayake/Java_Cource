package inheritance;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
//        rocky.fetch();
//        rocky.makeSounds();

        Animal sasha = new Dog();
//        sasha.makeSounds();

        sasha = new Cat();
        sasha.makeSounds();
    }
}
