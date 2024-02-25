public abstract class Transport implements Service {

    private String modelName;
    private int wellsCount;

    public Transport (String modelName, int wellsCount) {
        this.modelName = modelName;
        this.wellsCount = wellsCount;
    }

    public void updateTyre() {
        System.out.println ( "Меняем покрышку" );}


    @Override
    public void check () {
    for (int i = 0; i < wellsCount; i++)
        updateTyre ();
    }
}
