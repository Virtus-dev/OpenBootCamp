public abstract class SmartDevice
{
    String screen, os, connectivity, chargerType ,model;
    boolean camera, fingerprint, startSystem;

    public SmartDevice(){}

    public SmartDevice(String model, String screen, String os, String connectivity, String chargerType, boolean camera, boolean fingerprint) {
        this.model = model;
        this.screen = screen;
        this.os = os;
        this.connectivity = connectivity;
        this.chargerType = chargerType;
        this.camera = camera;
        this.fingerprint = fingerprint;
        this.startSystem = false;
    }

    public void setStartSystem(boolean start)
    {
        this.startSystem = start;
    }

}
