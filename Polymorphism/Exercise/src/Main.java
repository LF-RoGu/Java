public class Main
{
    public static void main(String[] args)
    {
        Vehicle l_classElectricFord = new HybridV("2023 Ford 4x4","FORD", "Raptor", 120, 8);

        l_classElectricFord.vehicleStartEngine();
        l_classElectricFord.vehicleRunEngine();
        l_classElectricFord.vehicleDrive();
    }
}