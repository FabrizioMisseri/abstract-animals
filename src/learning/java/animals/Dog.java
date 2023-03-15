package learning.java.animals;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println(super.eatString + "la carne");
    }


    @Override
    public void noise() {
        System.out.println("bau bau");
    }
}
