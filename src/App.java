public class App {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car();
        vehicles[1] = new Bike();
        vehicles[2] = new Bus();
        vehicles[3] = new Train();

        for(Vehicle vehicle : vehicles) {
            vehicle.accelerate();
        }

        for(Vehicle vehicle : vehicles) {
            vehicle.brake();
        }

        for(Vehicle vehicle : vehicles) {
            vehicle.refuel();

        }



    }
}
/*
public class App {
    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate();

        Bike bike = new Bike();
        bike.start();

        Bus bus = new Bus();
        bus.brake();

        Train train = new Train();
        train.depart();
    }
}
*/