class GPU extends Product {
    private String l_strGraphicsCard;

    public GPU(String l_strModel, String l_strManufacturer, String l_strGraphicsCard) {
        super(l_strModel, l_strManufacturer);
        this.l_strGraphicsCard = l_strGraphicsCard;
    }
}
