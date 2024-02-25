public class Truck extends MotorTransport{
    public Truck ( String modelName, int wellsCount ) {
        super ( modelName, wellsCount );
    }

    public void checkTrailer() {
        System.out.println ( "Проверьте прицеп" );
    }

    @Override
    public void check () {
        super.check ( );
        checkTrailer ();
    }
}
