public class Smartwatch extends SmartDevice
{
    String sphereTheme;
    public Smartwatch(){}

    public Smartwatch(String model, String screen, String os, String connectivity, String chargerType, boolean camera, boolean fingerprint, String sphereTheme) {
        super(model, screen, os, connectivity, chargerType, camera, fingerprint);
        this.sphereTheme = sphereTheme;
    }

    @Override
    public String toString() {
        return "Smartwatch{" +
                "model='" + model + '\'' +
                "sphereTheme='" + sphereTheme + '\'' +
                ", screen='" + screen + '\'' +
                ", os='" + os + '\'' +
                ", connectivity='" + connectivity + '\'' +
                ", chargerType='" + chargerType + '\'' +

                ", camera=" + camera +
                ", fingerprint=" + fingerprint +
                ", startSystem=" + startSystem +
                '}';
    }
}
