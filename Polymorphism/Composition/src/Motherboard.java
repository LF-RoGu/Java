class Motherboard extends Product {
    private int l_intRamSlots;
    private int l_intGPUSlots;
    private String l_strBios;

    public Motherboard(String l_strModel, String l_strManufacturer) {
        super(l_strModel, l_strManufacturer);
    }

    public Motherboard(String l_strModel, String l_strManufacturer, int l_intRamSlots, int l_intGPUSlots, String l_strBios) {
        super(l_strModel, l_strManufacturer);
        this.l_intRamSlots = l_intRamSlots;
        this.l_intGPUSlots = l_intGPUSlots;
        this.l_strBios = l_strBios;
    }

    public void loadProgram(String varProgramName) {
        System.out.println("Program " + varProgramName + " is now loading...");
    }
}
