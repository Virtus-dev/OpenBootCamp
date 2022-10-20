public class SmartPhone extends SmartDevice {
    private int tlfNumb;

    public SmartPhone() {
    }

    public SmartPhone(String model, String screen, String os, String connectivity, String chargerType, boolean camera, boolean fingerprint, int tlfNumb) {
        super(model, screen, os, connectivity, chargerType, camera, fingerprint);
        this.tlfNumb = tlfNumb;
    }

    public int getTlfNumb() {
        return (this.tlfNumb);
    }

    public void setTlfNumb(int tlfNumb) {
        this.tlfNumb = tlfNumb;
    }

    public void call(int tlfNumb) {
        System.out.println("calling: " + tlfNumb);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "tlfNumb=" + tlfNumb +
                ", screen='" + screen + '\'' +
                ", os='" + os + '\'' +
                ", connectivity='" + connectivity + '\'' +
                ", chargerType='" + chargerType + '\'' +
                ", model='" + model + '\'' +
                ", camera=" + camera +
                ", fingerprint=" + fingerprint +
                ", startSystem=" + startSystem +
                '}';
    }
}