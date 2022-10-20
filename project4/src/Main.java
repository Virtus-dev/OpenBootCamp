public class Main {

    public static void main(String[] args) {

        SmartDevice iphone = new SmartPhone("iphone", "QHD", "IOS", "5G", "lighting", true, true, 653187342);
        SmartDevice watch = new Smartwatch("smart watch", "HD", "IOS", "bluetooth", "micro-usb", false, false, "sport");

        System.out.println("Device specs -> " + iphone);
        System.out.println("Device specs -> " + watch);
    }
}