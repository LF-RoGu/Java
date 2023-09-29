public class Main
{
    public static void main(String[] args)
    {
        ComputerCase l_classComputerCase = new ComputerCase("2208", "ASUS", "1000W");
        Monitor l_classMonitor = new Monitor("850C", "Scepter", 32, "2080x1080");
        Motherboard l_classMotherboard = new Motherboard("860m", "ASUS", 4, 2, "v4.2");
        GPU l_classGPU = new GPU("6800xt", "AMD", "12Gb");

        PersonalComputer l_classPersonalComputer = new PersonalComputer("2208", "ASUS", l_classMonitor, l_classMotherboard, l_classComputerCase, l_classGPU);

        l_classPersonalComputer.powerUp();
    }
}