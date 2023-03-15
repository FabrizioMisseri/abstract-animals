package learning.java.animals;

public class Chicken extends Animal{
    @Override
    public void eat() {
        System.out.println(super.eatString + "la robaccia per terra");

    }

    @Override
    public void noise() {
        System.out.println("RRROOOaAAARR!!!!");
    }
}
