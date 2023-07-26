abstract class Vehicle{
    constructor(public vehicleNumber:string){}
  abstract moves():void;
}
class Car extends Vehicle{
    moves(): void {
        console.log(this.vehicleNumber+" car moves");
    }

}

let vehicle:Vehicle=new Car('MUMhehjj');
vehicle.moves();
