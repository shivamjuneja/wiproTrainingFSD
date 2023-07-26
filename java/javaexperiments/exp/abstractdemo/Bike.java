package exp.abstractdemo;

public class Bike extends Vehicle {

    private String vehicleNumber;

    public Bike(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public void move() {
        System.out.println(getVehicleNumber() + " moves like a bike");
    }
}
