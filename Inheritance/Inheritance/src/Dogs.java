public class Dogs extends Animals
{
    private String l_strDogBreed;
    private String l_strEarShape;
    private String l_strTailShape;
    public Dogs()
    {
        super();
    }

    public Dogs(String varAnimalsType, double varAnimalSize, float varAnimalWeight, String l_strDogBreed, String l_strEarShape, String l_strTailShape) {
        super(varAnimalsType, ( (varAnimalSize  < 15) ? ("Small") : ( (varAnimalSize < 35) ? "Medium" : "Large" ) ), varAnimalWeight);
        this.l_strDogBreed = l_strDogBreed;
        this.l_strEarShape = l_strEarShape;
        this.l_strTailShape = l_strTailShape;
    }

    @Override
    public String toString() {
        return "Dogs{" +
                "l_strDogBreed='" + l_strDogBreed + '\'' +
                ", l_strEarShape='" + l_strEarShape + '\'' +
                ", l_strTailShape='" + l_strTailShape + '\'' +
                '}';
    }
}
