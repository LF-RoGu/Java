package Vehicle.EngineType;

public class Engine
{
    private int l_intEngineRPM;
    private int l_intEngineTorque;

    public Engine(int l_intEngineRPM, int l_intEngineTorque) {
        this.l_intEngineRPM = l_intEngineRPM;
        this.l_intEngineTorque = l_intEngineTorque;
    }
}

class CombustionEngine extends Engine
{
    private enumCombustion l_enumCombustionVolume;
    private int l_intCylinders;

    public CombustionEngine(int l_intEngineRPM, int l_intEngineTorque, enumCombustion l_enumCombustionVolume, int l_intCylinders) {
        super(l_intEngineRPM, l_intEngineTorque);
        this.l_enumCombustionVolume = l_enumCombustionVolume;
        this.l_intCylinders = l_intCylinders;
    }
}
class ElectricEngine extends Engine
{
    private int l_intBatteryLife;   // Battery capability in years
    private boolean l_boolGenerator;
    private boolean l_boolConverter;

    public ElectricEngine(int l_intEngineRPM, int l_intEngineTorque, enumCombustion l_enumCombustion, int l_intBatteryLife, boolean l_boolGenerator, boolean l_boolConverter) {
        super(l_intEngineRPM, l_intEngineTorque, l_enumCombustion);
        this.l_intBatteryLife = l_intBatteryLife;
        this.l_boolGenerator = l_boolGenerator;
        this.l_boolConverter = l_boolConverter;
    }
}

class HybridEngine extends Engine
{
    private enumCombustion l_enumCombustionVolume;
    private int l_intCylinders;
    private int l_intBatteryLife;   // Battery capability in years
    private boolean l_boolGenerator;
    private boolean l_boolConverter;

    public HybridEngine(int l_intEngineRPM, int l_intEngineTorque, enumCombustion l_enumCombustionVolume, int l_intCylinders, int l_intBatteryLife, boolean l_boolGenerator, boolean l_boolConverter) {
        super(l_intEngineRPM, l_intEngineTorque);
        this.l_enumCombustionVolume = l_enumCombustionVolume;
        this.l_intCylinders = l_intCylinders;
        this.l_intBatteryLife = l_intBatteryLife;
        this.l_boolGenerator = l_boolGenerator;
        this.l_boolConverter = l_boolConverter;
    }
}