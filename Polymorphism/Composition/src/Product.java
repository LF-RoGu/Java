public class Product
{
    private String l_strModel;
    private String l_strManufacturer;
    private int l_intWidth;
    private int l_intHeight;
    private int l_intDepth;

    public Product() {
    }

    public Product(String l_strModel, String l_strManufacturer) {
        this.l_strModel = l_strModel;
        this.l_strManufacturer = l_strManufacturer;
    }
}