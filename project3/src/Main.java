public class Main {
    public static void main(String[] args)
    {
        String[] texts = {"Hello", "OpenBootCam", "how", "are", "you", "doing?"};
        printingText(texts);
    }
    public static void printingText(String[] texts)
    {
        for (String outputText: texts)
        {
            System.out.println(outputText);
        }
    }
}