package learning.java.animals;

public class Dolphin extends Animal implements CanSwim {
    @Override
    public void eat() {
        System.out.println(super.eatString + "le caramelle dufur");

    }

    @Override
    public void noise() {
        System.out.println("miaooo...");
    }

    @Override
    public void swim() {
        System.out.println("nuotare è troppo faticoso...vado a piedi.");
    }
}
