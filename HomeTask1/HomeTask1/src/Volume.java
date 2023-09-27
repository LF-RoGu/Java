public class Volume
{
    private double l_varPiConstant = 3.1415; // Constant for pi
    private double l_varDiamenterSun = 865000 / 2; // Value is in miles
    private double l_varDiameterEarth = 7600 / 2; // Value is in miles
    private double l_varVolumeSun = 0;
    private double l_varVolumeEarth = 0;
    private double l_varRatioVolumeSunEarth = 0;

    public double get_varVolumeSun() {
        l_varVolumeSun = (4/3)*(l_varPiConstant)*(l_varDiamenterSun*l_varDiamenterSun*l_varDiamenterSun);
        return l_varVolumeSun;
    }

    public double get_varVolumeEarth() {
        l_varVolumeEarth = (4/3)*(l_varPiConstant)*(l_varDiameterEarth*l_varDiameterEarth*l_varDiameterEarth);
        return l_varVolumeEarth;
    }

    public double get_varRatioVolumeSunEarth() {
        l_varRatioVolumeSunEarth = (get_varVolumeSun() / get_varVolumeEarth()) * 100;
        return l_varRatioVolumeSunEarth;
    }
}
