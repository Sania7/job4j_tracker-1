package job4j.test3;

public class VehicleInTransit {
    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle plane = new Plane();
        Vehicle bus = new Bus();

        Vehicle[] vehicles = new Vehicle[] {train, plane, bus};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            vehicle.deliver();
        }
    }
}
