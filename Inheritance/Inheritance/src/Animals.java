public class Animals {
    private String l_strAnimalType;
    private String l_strAnimalSize;
    private float l_floatAnimalWeight;

    public Animals()
    {

    }

    public Animals(String varAnimalsType, String varAnimalSize, float varAnimalWeight)
    {
        this.l_strAnimalType = varAnimalsType;
        this.l_strAnimalSize = varAnimalSize;
        this.l_floatAnimalWeight = varAnimalWeight;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "l_strAnimalType='" + l_strAnimalType + '\'' +
                ", l_strAnimalSize='" + l_strAnimalSize + '\'' +
                ", l_floatAnimalWeight=" + l_floatAnimalWeight +
                '}';
    }

    public void animalMove(String varAnimalSpeed)
    {
        System.out.println("Animal type " + this.l_strAnimalType + "moves at a speed of: " + varAnimalSpeed);
    }
    public void animalNoise(String varAnimalNoise)
    {
        System.out.println("Animal type " + this.l_strAnimalType + "makes the following noise: " + varAnimalNoise);
    }
}
