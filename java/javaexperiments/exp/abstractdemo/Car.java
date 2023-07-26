package exp.abstractdemo;

public class Car extends Vehicle{

    public Car(String vehicleNumber){
        super(vehicleNumber);
    }
    @Override
    public void move() {
        System.out.println( getVehicleNumber()+" moves like a car");
    }
}
