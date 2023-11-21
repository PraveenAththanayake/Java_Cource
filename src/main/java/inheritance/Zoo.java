package inheritance;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
//        rocky.fetch();
//        rocky.makeSounds();

        Animal sasha = new Dog();
//        sasha.makeSounds();
        Dog sashaTheDog = (Dog) sasha;
        sashaTheDog.fetch();

        sasha = new Cat();
        sasha.makeSounds();
        ((Cat)sasha).scratch();
    }
}
