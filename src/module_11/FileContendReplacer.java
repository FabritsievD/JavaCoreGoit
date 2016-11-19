package module_11;


import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileContendReplacer {

    /*Task 11.2*/

    public static File fileContendReplacer(Map<String,String> map){

        String resultStr = "";
        StringBuilder sb = new StringBuilder();
        BufferedReader bufReader = null;

        try {
            FileReader in = new FileReader("replacer.txt");
            bufReader = new BufferedReader(in);

        }catch (FileNotFoundException e){
            System.err.println("File not found");
        }

        try{
            String line = bufReader.readLine();
            while(line!=null){
                if(map.containsKey(line)) line = map.get(line);
                sb.append(line);
                sb.append(System.lineSeparator());
                line = bufReader.readLine();

            }
            bufReader.close();
            resultStr = sb.toString();
        }catch (IOException e){
            System.err.println("IO Exception");
        }
        try {
            FileWriter out = new FileWriter("fileContendReplacer.txt");
            BufferedWriter bufWriter = new BufferedWriter(out);
            bufWriter.write(resultStr);
            bufWriter.close();
        }catch (IOException e){
            System.err.println("File not found");
        }

        return null;
    }

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("bird","dog");
        map.put("ring","call");
        map.put("ship","plane");

        fileContendReplacer(map);
    }

}
