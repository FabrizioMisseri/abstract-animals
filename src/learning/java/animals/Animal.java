package learning.java.animals;

public abstract class Animal {
    public abstract void eat();
    public final String eatString = "sto mangiando ";

    public void sleep(){
        System.out.println("ZzzZZZzzzzZ");
    };

    public abstract void noise();

}
