package learning.java.animals;

public class Zoo {
    public static void main(String[] args) {

        Chicken losPollosHermanos = new Chicken();

        losPollosHermanos.sleep();
        losPollosHermanos.noise();
        losPollosHermanos.eat();
        losPollosHermanos.fly();
        if (losPollosHermanos instanceof CanFly){
            fly(losPollosHermanos);
        }

        Dolphin flipper = new Dolphin();

        flipper.sleep();
        flipper.noise();
        flipper.eat();
        flipper.swim();
        if (flipper instanceof CanSwim){
            swim(flipper);
        }

    }

    public static void fly(CanFly flier){
        flier.fly();
    }
    public static void swim(CanSwim swimmer){
        swimmer.swim();
    }
}

