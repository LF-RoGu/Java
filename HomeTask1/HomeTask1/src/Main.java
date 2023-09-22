import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Volume l_classVolume = new Volume();

        System.out.println("Volume of the Sun... " + l_classVolume.get_varVolumeSun() + " cubic miles");
        System.out.println("Volume of the Earth... " + l_classVolume.get_varVolumeEarth() + " cubic miles");

        System.out.println("Ratio between Sun & Earth... " + l_classVolume.get_varRatioVolumeSunEarth() + " cubic miles");

    }
}