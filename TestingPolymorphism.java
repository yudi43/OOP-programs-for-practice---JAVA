abstract class Animal {
    abstract public void greeting();
}

class Cat extends Animal {
    @Override
    public void greeting() {
        System.out.println("Meow!");
    }
}

class Dog extends Animal {
    @Override
    public void greeting() {
        System.out.println("Woof!");
    }

    // method overLoading
    public void greeting(Dog another) {
        System.out.println("Woooooooof!");
    }
}

class BigDog extends Dog {
    @Override
    public void greeting() {
        System.out.println("Wooff Big");
    }

    // Method overLoading
    public void greeting(Dog another) {
        System.out.println("Wooooooffff biiggg");
    }
}

public class TestingPolymorphism {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.greeting();
        Dog d1 = new Dog();
        d1.greeting();
        BigDog bd1 = new BigDog();
        bd1.greeting();
        System.out.println();
        System.out.println("Using Polymorphism");

        Animal a1 = new Cat();
        a1.greeting();
        Animal a2 = new Dog();
        a2.greeting();
        Animal a3 = new BigDog();
        a3.greeting();
        // Animal a4 = new Animal();
        System.out.println();
        System.out.println("Downcast");

        Dog dog2 = (Dog) a2;
        BigDog bigDog2 = (BigDog) a3;
        Dog dog3 = (Dog) a3;
        // Cat cat2 = (Cat) a2;
        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigDog2);
        bigDog2.greeting(dog2);
        bigDog2.greeting(bd1);
    }
}