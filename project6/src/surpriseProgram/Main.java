
package surpriseProgram;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main (String[] args)
    {

        List<Integer> lista = new ArrayList<>();
        for (int i = 0;i < 20;i++)
            lista.add(i);
        try {
            saveList(lista);
        }catch (FileNotFoundException e){
            e.getMessage();
        }
    }

    //Function for save a Map Values into a txt file
    public static <k,v> void saveMapValue(Map<k,v> map) throws FileNotFoundException
    {
        PrintStream outputMap = new PrintStream("List.txt");
        for (Map.Entry outM : map.entrySet())
        {
            outputMap.print((String)outM.getValue());
        }
    }

    //Function for save a List Values into a txt file
    public static <T> void saveList(List<T> list) throws FileNotFoundException
    {
        PrintStream outputList = new PrintStream("List.txt");
        for (T out : list)
        {
            outputList.print(out);
        }

    }

    public static void readFilePrint(InputStream file) throws FileNotFoundException
    {
        try {
            byte[] data = file.readAllBytes();
            PrintStream output = new PrintStream(System.out);
            output.write(data);
        }catch(IOException e){
            e.getMessage();
        }
    }

}
