package Vehicle;

import Vehicle.EngineType.Engine;
import Vehicle.VehicleType.VehicleType;

public class Manufacturer
{
    /*
    All vehicles must have this type of information
    */

    private Vehicle.VehicleType.VehicleType l_enumVehicleType;
    private int l_intCarsId;
    private String l_strCarBrand;
    private String l_strCarModel;
    private int l_intCarRPM;
    private int l_intCarTorque;
    private int l_intCylinders;
    private Vehicle.EngineType.Engine l_enumCombustionVolume;
    private int l_intBatteryLife;   // Battery capability in years

    private int l_intCarYear;
    private String l_strCarColor;
    private int l_intCarPrice;
    private int l_intCarRegistrationNumber;
    private int l_intCarUseYears;

    public Manufacturer()
    {
    }

    /*
    Constructor
     */
    public Manufacturer(int l_intCarsId, String l_strCarBrand, String l_strCarModel, int l_intCarYear, String l_strCarColor, int l_intCarPrice, int l_intCarRegistrationNumber, int l_intCarUseYears) {
        this.l_intCarsId = l_intCarsId;
        this.l_strCarBrand = l_strCarBrand;
        this.l_strCarModel = l_strCarModel;
        this.l_intCarYear = l_intCarYear;
        this.l_strCarColor = l_strCarColor;
        this.l_intCarPrice = l_intCarPrice;
        this.l_intCarRegistrationNumber = l_intCarRegistrationNumber;
        this.l_intCarUseYears = l_intCarUseYears;
    }

    /*
    Setters
     */
    public void set_enumVehicleType(VehicleType l_enumVehicleType) {
        this.l_enumVehicleType = l_enumVehicleType;
    }

    public void set_intCarsId(int l_intCarsId) {
        this.l_intCarsId = l_intCarsId;
    }

    public void set_strCarBrand(String l_strCarBrand) {
        this.l_strCarBrand = l_strCarBrand;
    }

    public void set_strCarModel(String l_strCarModel) {
        this.l_strCarModel = l_strCarModel;
    }

    public void set_intCarRPM(int l_intCarRPM) {
        this.l_intCarRPM = l_intCarRPM;
    }

    public void set_intCarTorque(int l_intCarTorque) {
        this.l_intCarTorque = l_intCarTorque;
    }

    public void set_intCylinders(int l_intCylinders) {
        this.l_intCylinders = l_intCylinders;
    }

    public void set_enumCombustionVolume(Engine l_enumCombustionVolume) {
        this.l_enumCombustionVolume = l_enumCombustionVolume;
    }

    public void set_intBatteryLife(int l_intBatteryLife) {
        this.l_intBatteryLife = l_intBatteryLife;
    }

    public void set_intCarYear(int l_intCarYear) {
        this.l_intCarYear = l_intCarYear;
    }

    public void set_strCarColor(String l_strCarColor) {
        this.l_strCarColor = l_strCarColor;
    }

    public void set_intCarPrice(int l_intCarPrice) {
        this.l_intCarPrice = l_intCarPrice;
    }

    public void set_intCarRegistrationNumber(int l_intCarRegistrationNumber) {
        this.l_intCarRegistrationNumber = l_intCarRegistrationNumber;
    }

    public void set_intCarUseYears(int l_intCarUseYears) {
        this.l_intCarUseYears = l_intCarUseYears;
    }

    /*
    Getters
     */
    public VehicleType get_enumVehicleType() {
        return l_enumVehicleType;
    }

    public int get_intCarsId() {
        return l_intCarsId;
    }

    public String get_strCarBrand() {
        return l_strCarBrand;
    }

    public String get_strCarModel() {
        return l_strCarModel;
    }

    public int get_intCarRPM() {
        return l_intCarRPM;
    }

    public int get_intCarTorque() {
        return l_intCarTorque;
    }

    public int get_intCylinders() {
        return l_intCylinders;
    }

    public Engine get_enumCombustionVolume() {
        return l_enumCombustionVolume;
    }

    public int get_intBatteryLife() {
        return l_intBatteryLife;
    }

    public int get_intCarYear() {
        return l_intCarYear;
    }

    public String get_strCarColor() {
        return l_strCarColor;
    }

    public int get_intCarPrice() {
        return l_intCarPrice;
    }

    public int get_intCarRegistrationNumber() {
        return l_intCarRegistrationNumber;
    }

    public int get_intCarUseYears() {
        return l_intCarUseYears;
    }
}

