package learning.java.animals;

public class Dolphin extends Animal{
    @Override
    public void eat() {
        System.out.println(super.eatString + "le caramelle dufur");

    }

    @Override
    public void noise() {
        System.out.println("miaooo...");
    }
}
