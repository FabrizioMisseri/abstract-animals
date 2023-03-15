package learning.java.animals;

public class Eagle extends Animal{
    @Override
    public void eat() {
        System.out.println(super.eatString + "i topi");

    }

    @Override
    public void noise() {
        System.out.println("muuuuuuuu!!!!");
    }
}
