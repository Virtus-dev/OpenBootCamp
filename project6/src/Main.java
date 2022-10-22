import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //unidimensional array creation and going through it
        String uniDimensional[] = {"I really", "like", "this project"};
        for (String loveIt : uniDimensional)
            System.out.println(loveIt);

        //bidimensional array creation and going through it
        int biDimensional[][] = {{1,2,3,4,5,6},{7,8,9,10}};
        for (int i = 0;i < biDimensional.length; i++)
        {
            for (int j = 0;j < biDimensional[1].length;j++)
                System.out.println(biDimensional[i][j]);
        }

        //Vector creation and printing his values
        Vector<String> vector = new Vector<String>();
        vector.add("hi");
        vector.add("how are you mate?");
        vector.add("im fine");
        vector.add("are you learning java as well?");
        vector.add("great!");
        vector.remove(1);
        vector.remove(2);
        System.out.println(vector);
        /*
        The problem having a default capacity for our vector in case of we have that much elements
        are that every time it resize it self, is creating a new "array" and copying all the data inside of it
        so we can have performance problems
        */

        /*
        * Creating an ArrayList and a LinkedList, copying one into the other and going through them
        */
        List<String> arrayList = new ArrayList<>();
        arrayList.add("ArrayLIst");
        arrayList.add("by");
        arrayList.add("the");
        arrayList.add("way");
        List<String> linkedList = new LinkedList<>();
        linkedList.addAll(arrayList);
        for (String element :  arrayList)
            System.out.println(element);
        for (String linkedEl : linkedList)
            System.out.println(linkedEl);

        // Creating an ArrayList, filling it and removing the par numbers,then, print them
        List<Integer> numList = new ArrayList<>();
        for (int i = 0;i <= 10;i++)
            numList.add(i);
        for (int j = 0;j < numList.size();j++)
        {
            if (numList.get(j) % 2 == 0)
                numList.remove(j);
        }
        for (int i = 0;i < numList.size();i++)
            System.out.println(numList.get(i));

        //catching exception from our function
        try {
            dividePorCero(12);
        }catch(ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }

        try {
            InputStream in = new FileInputStream("C:\\Users\\virtus-dev\\OneDrive\\Escritorio\\norminette command.txt");
            PrintStream out = new PrintStream("copy.txt");
            copyFd(in, out);
        }catch(IOException e){
            e.getMessage();
        }

    }

    public static void copyFd(InputStream fileIn, PrintStream fileOut)
    {
        try {
            byte[] data = fileIn.readAllBytes();
            fileOut.write(data);
        }catch(IOException e){
            e.getMessage();
        }
    }

    public static int dividePorCero(int div) throws ArithmeticException
    {
        return div / 0;
    }
}