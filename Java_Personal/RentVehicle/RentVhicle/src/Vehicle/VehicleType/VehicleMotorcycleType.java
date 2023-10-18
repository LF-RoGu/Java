package Vehicle.VehicleType;

import Vehicle.VehicleType.MotorcycleType.FourWheeler;
import Vehicle.VehicleType.MotorcycleType.ThreeWheeler;
import Vehicle.VehicleType.MotorcycleType.TwoWheeler;

public class VehicleMotorcycleType extends VehicleMotorcycle {
}

class TwoWheelerVehicle extends VehicleMotorcycleType implements TwoWheeler
{

}

class ThreeWheelerVehicle extends VehicleMotorcycleType implements ThreeWheeler
{

}

class FourWheelerVehicle extends VehicleMotorcycleType implements FourWheeler
{

}