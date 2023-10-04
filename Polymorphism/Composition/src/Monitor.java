class Monitor extends Product {
    private int l_intSize;
    private String l_strResolution;

    public Monitor(String l_strModel, String l_strManufacturer) {
        super(l_strModel, l_strManufacturer);
    }

    public Monitor(String l_strModel, String l_strManufacturer, int l_intSize, String l_strResolution) {
        super(l_strModel, l_strManufacturer);
        this.l_intSize = l_intSize;
        this.l_strResolution = l_strResolution;
    }

    public void drawPixel(int varX, int varY, String varColor) {
        System.out.println(String.format("Drawing pixel at (%d, %d)[X,Y] in %s", varX, varY, varColor));
    }
}
