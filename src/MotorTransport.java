public abstract class MotorTransport extends Transport {

    public MotorTransport ( String modelName, int wellsCount ) {
        super ( modelName, wellsCount );
    }

        public void checkEngine () {
            System.out.println ( "Проверьте двигатель" );
        }

    @Override
    public void check () {
        super.check ( );
        checkEngine ();
    }
}
