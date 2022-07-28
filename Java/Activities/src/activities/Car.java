package activities;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    Car() {
        tyres = 4;
        doors = 4;
    }

    public void displayCharacteristics(){
        System.out.println("The color is: " +color);
        System.out.println("The transmission is: " +transmission);
        System.out.println("The make is: " +make);
        System.out.println("The number of tyres are: " +tyres);
        System.out.println("The number of doors are: " +doors);
    }

    public void accelerate(){
        System.out.println("Car is moving forward.");
    }

    public void brake(){
        System.out.println("Car has stopped.");
    }
}
