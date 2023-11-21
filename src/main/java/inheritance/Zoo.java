package inheritance;

public class Zoo {
    public static void main(String[] args) {
        Dog rocky = new Dog();
//        rocky.fetch();
//        rocky.makeSounds();
//        feed(rocky);

        Animal sasha = new Dog();
//        feed(sasha);
//        sasha.makeSounds();
//        Dog sashaTheDog = (Dog) sasha;
//        sashaTheDog.fetch();

        sasha = new Cat();
        feed(sasha);
//        sasha.makeSounds();
//        ((Cat)sasha).scratch();
    }

    public static void feed(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Here's your dog food.");
        } else if (animal instanceof Cat) {
            System.out.println("Here's your cat food.");
        }
    }
}
