public class Vehicle
{
    private String l_strVehicleDescription;
    private String l_strVehicleBrand;
    private String l_strVehicleModel;

    public Vehicle(String l_strVehicleDescription, String l_strVehicleBrand, String l_strVehicleModel) {
        this.l_strVehicleDescription = l_strVehicleDescription;
        this.l_strVehicleBrand = l_strVehicleBrand;
        this.l_strVehicleModel = l_strVehicleModel;
    }

    public void vehicleStartEngine()
    {
        System.out.println("Vehicle -> startEngine");
    }
    protected void vehicleRunEngine()
    {
        System.out.println("Vehicle -> runtEngine");

    }
    public void vehicleDrive()
    {
        /* getClass() obtaines currentl running instance */
        System.out.println("Vehicle -> Driving... " + getClass().getSimpleName());
        vehicleRunEngine();
    }
    public void vehicleInfo()
    {
    }

}

class BEV extends Vehicle
{
    private double l_doubleAvgKmPerLitter;
    private int l_intNumCylinders;

    public BEV(String l_strVehicleDescription, String l_strVehicleBrand, String l_strVehicleModel) {
        super(l_strVehicleDescription, l_strVehicleBrand, l_strVehicleModel);
    }

    public BEV(String l_strVehicleDescription, String l_strVehicleBrand, String l_strVehicleModel, double l_doubleAvgKmPerLitter, int l_intNumCylinders) {
        super(l_strVehicleDescription, l_strVehicleBrand, l_strVehicleModel);
        this.l_doubleAvgKmPerLitter = l_doubleAvgKmPerLitter;
        this.l_intNumCylinders = l_intNumCylinders;
    }
}
class ICEV extends Vehicle
{
    private double l_doubleAvgKmPerLitter;
    private int l_intNumCylinders;

    public ICEV(String l_strVehicleDescription, String l_strVehicleBrand, String l_strVehicleModel) {
        super(l_strVehicleDescription, l_strVehicleBrand, l_strVehicleModel);
    }

    public ICEV(String l_strVehicleDescription, String l_strVehicleBrand, String l_strVehicleModel, double l_doubleAvgKmPerLitter, int l_intNumCylinders) {
        super(l_strVehicleDescription, l_strVehicleBrand, l_strVehicleModel);
        this.l_doubleAvgKmPerLitter = l_doubleAvgKmPerLitter;
        this.l_intNumCylinders = l_intNumCylinders;
    }
}
class HybridV extends Vehicle
{
    private double l_doubleAvgKmPerLitter;
    private int l_intNumCylinders;

    public HybridV(String l_strVehicleDescription, String l_strVehicleBrand, String l_strVehicleModel) {
        super(l_strVehicleDescription, l_strVehicleBrand, l_strVehicleModel);
    }

    public HybridV(String l_strVehicleDescription, String l_strVehicleBrand, String l_strVehicleModel, double l_doubleAvgKmPerLitter, int l_intNumCylinders) {
        super(l_strVehicleDescription, l_strVehicleBrand, l_strVehicleModel);
        this.l_doubleAvgKmPerLitter = l_doubleAvgKmPerLitter;
        this.l_intNumCylinders = l_intNumCylinders;
    }
}
