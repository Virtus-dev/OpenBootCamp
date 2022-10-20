public class Main {
    public static void main(String[] args) {

        System.out.println(ivaOnPrice(14));

    }

    public static float ivaOnPrice(float price)
    {
        return (float) (price + (price * 0.21));
    }
}