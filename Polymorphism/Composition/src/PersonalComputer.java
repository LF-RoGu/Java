public class PersonalComputer extends Product {
    private Monitor l_classMonitor;
    private Motherboard l_classMotherboard;
    private ComputerCase l_classComputerCase;
    private GPU l_classGPU;

    public PersonalComputer(String l_strModel, String l_strManufacturer, Monitor l_classMonitor, Motherboard l_classMotherboard, ComputerCase l_classComputerCase, GPU l_classGPU) {
        super(l_strModel, l_strManufacturer);
        this.l_classMonitor = l_classMonitor;
        this.l_classMotherboard = l_classMotherboard;
        this.l_classComputerCase = l_classComputerCase;
        this.l_classGPU = l_classGPU;
    }

    private void drawPersonalLogo()
    {
        l_classMonitor.drawPixel(100,100, "RED");
    }

    public void powerUp()
    {
        l_classComputerCase.pressPowerSupply();
        drawPersonalLogo();
    }

    public Monitor get_classMonitor() {
        return this.l_classMonitor;
    }

    public Motherboard get_classMotherboard() {
        return this.l_classMotherboard;
    }

    public ComputerCase get_classComputerCase() {
        return this.l_classComputerCase;
    }

    public GPU get_classGPU() {
        return this.l_classGPU;
    }
}
