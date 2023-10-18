package Vehicle.VehicleType;

import Vehicle.VehicleType.CarType.Convertible;
import Vehicle.VehicleType.CarType.Hatchback;
import Vehicle.VehicleType.CarType.Sedan;
import Vehicle.VehicleType.MotorcycleType.FourWheeler;
import Vehicle.VehicleType.MotorcycleType.ThreeWheeler;
import Vehicle.VehicleType.MotorcycleType.TwoWheeler;
import Vehicle.VehicleType.TruckType.Pickup;
import Vehicle.VehicleType.TruckType.Van;

public class VehicleType
{
    private boolean l_boolSunRoof;
    private int l_intNumDoors;
    private int l_intNumPassengers;
    private int l_intOdometer;

    public VehicleType(boolean l_boolSunRoof, int l_intNumDoors, int l_intNumPassengers, int l_intOdometer) {
        this.l_boolSunRoof = l_boolSunRoof;
        this.l_intNumDoors = ( (l_intNumDoors > 4) ? (4) : (l_intNumDoors) );
        this.l_intNumPassengers = ( (l_intNumPassengers > 5) ? (5) : (l_intNumPassengers) );
        this.l_intOdometer = l_intOdometer;
    }

    public void set_boolSunRoof(boolean l_boolSunRoof) {
        this.l_boolSunRoof = l_boolSunRoof;
    }

    public void set_intNumDoors(int l_intNumDoors) {
        this.l_intNumDoors = ( (l_intNumDoors > 4) ? (4) : (l_intNumDoors) );
    }

    public void set_intNumPassengers(int l_intNumPassengers) {
        this.l_intNumPassengers = ( (l_intNumPassengers > 5) ? (5) : (l_intNumPassengers) );
    }

    public void set_intOdometer(int l_intOdometer) {
        this.l_intOdometer = l_intOdometer;
    }

    public boolean get_boolSunRoof() {
        return l_boolSunRoof;
    }

    public int get_intNumDoors() {
        return l_intNumDoors;
    }

    public int get_intNumPassengers() {
        return l_intNumPassengers;
    }

    public int get_intOdometer() {
        return l_intOdometer;
    }
}

class VehicleCar extends VehicleType implements Convertible, Hatchback, Sedan
{
    private enumCarType l_enumCarType;

    public VehicleCar(boolean l_boolSunRoof, int l_intNumDoors, int l_intNumPassengers, int l_intOdometer, enumCarType l_enumCarType) {
        super(l_boolSunRoof, l_intNumDoors, l_intNumPassengers, l_intOdometer);
        this.l_enumCarType = l_enumCarType;
    }

    public enumCarType get_enumCarType() {
        return l_enumCarType;
    }

    public void set_enumCarType(enumCarType l_enumCarType) {
        this.l_enumCarType = l_enumCarType;
    }

    @Override
    public void l_methodConvertible()
    {

    }

    @Override
    public void l_methodHatchback() {

    }

    @Override
    public void l_methodSedan() {

    }
}

class VehicleTruck extends VehicleType implements Pickup, Van
{
    private int l_intTrunkSize;
    private enumTruckType l_enumTruckType;

    public VehicleTruck(boolean l_boolSunRoof, int l_intNumDoors, int l_intNumPassengers, int l_intOdometer, int l_intTrunkSize, enumTruckType l_enumTruckType) {
        super(l_boolSunRoof, l_intNumDoors, l_intNumPassengers, l_intOdometer);
        this.l_intTrunkSize = l_intTrunkSize;
        this.l_enumTruckType = l_enumTruckType;
    }

    public int get_intTrunkSize() {
        return l_intTrunkSize;
    }

    public void set_intTrunkSize(int l_intTrunkSize) {
        this.l_intTrunkSize = l_intTrunkSize;
    }

    @Override
    public void l_methodVan()
    {

    }

    @Override
    public void l_methodPickup()
    {

    }
}

class VehicleMotorcycle extends VehicleType implements TwoWheeler, ThreeWheeler, FourWheeler
{
    private double l_doubleLenght;
    private boolean l_boolRack;

    public VehicleMotorcycle(boolean l_boolSunRoof, int l_intNumDoors, int l_intNumPassengers, int l_intOdometer, double l_doubleLenght, boolean l_boolRack) {
        super(false, 0, 2, l_intOdometer);
        this.l_doubleLenght = l_doubleLenght;
        this.l_boolRack = l_boolRack;
    }

    public double get_doubleLenght() {
        return l_doubleLenght;
    }

    public boolean get_boolRack() {
        return l_boolRack;
    }

    public void set_doubleLenght(double l_doubleLenght) {
        this.l_doubleLenght = l_doubleLenght;
    }

    public void set_boolRack(boolean l_boolRack) {
        this.l_boolRack = l_boolRack;
    }

    @Override
    public void l_methodTwoWheeler() {

    }

    @Override
    public void l_methodThreeWheeler() {

    }

    @Override
    public void l_methodFourWheeler() {

    }
}