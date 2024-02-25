public class Main {
    public static void main ( String[] args ){
        Bike bike = new Bike ("Cuba", 2);
        Car car = new Car ("BMW", 4);
        Truck truck = new Truck ("Ford", 6);

        ServiceStation serviceStation = new ServiceStation ();
        serviceStation.check ( bike );
        serviceStation.check ( car );
        serviceStation.check ( truck );


    }

}