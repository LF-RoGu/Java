class ComputerCase extends Product {
    private String l_strPowerSupply;

    public ComputerCase(String l_strModel, String l_strManufacturer) {
        super(l_strModel, l_strManufacturer);
    }

    public ComputerCase(String l_strModel, String l_strManufacturer, String l_strPowerSupply) {
        super(l_strModel, l_strManufacturer);
        this.l_strPowerSupply = l_strPowerSupply;
    }

    public void pressPowerSupply() {
        System.out.println("Power button pressed...");
    }
}
