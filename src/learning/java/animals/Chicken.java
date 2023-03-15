package learning.java.animals;

public class Chicken extends Animal implements CanFly {
    @Override
    public void eat() {
        System.out.println(super.eatString + "la robaccia per terra");

    }

    @Override
    public void noise() {
        System.out.println("RRROOOaAAARR!!!!");
    }

    @Override
    public void fly() {
        System.out.println("provo a volare ma nn sò se mi riesce...");
    }
}
