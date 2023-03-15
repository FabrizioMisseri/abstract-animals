package learning.java.animals;

public class Eagle extends Animal implements CanFly {
    @Override
    public void eat() {
        System.out.println(super.eatString + "i topi");

    }

    @Override
    public void noise() {
        System.out.println("muuuuuuuu!!!!");
    }

    @Override
    public void fly() {
        System.out.println("provo a volare ma nn sò se mi riesce...");
    }
}
