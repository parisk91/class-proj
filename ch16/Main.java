package gr.aueb.cl.ch16;

public class Main {

    public static void main(String[] args) {
        //Cat alice = new Cat();
        ISpeakable alice = new Cat();
        ISpeakable bob = new Dog();

        alice.speak();
        bob.speak();
    }

    public static void doSpeak(ISpeakable iSpeakable) {
        iSpeakable.speak();
    }
}
