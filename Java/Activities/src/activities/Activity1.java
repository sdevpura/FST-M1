package activities;

public class Activity1 {

       public static void main(String[] args){
        Car Kia = new Car();

        Kia.make = 2014;
        Kia.color = "Black";
        Kia.transmission = "Manual";
        Kia.displayCharacteristics();
        Kia.accelerate();
        Kia.brake();
    }
}
