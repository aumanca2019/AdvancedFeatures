package Polymorfism;

public class Main {
    public static void main(String[] args) {
        Pet papagal = new Parrot();
        Pet doggy = new Dog();
        Pet tom = new Cat();
        Pet hammy = new Hamster();

        Pet [] pets = {papagal,doggy,tom,hammy };
        for (Pet p : pets){
            p.sing();
        }
    }
}
