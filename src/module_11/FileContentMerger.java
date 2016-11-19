package module_11;


import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileContentMerger {

    /*Task 11.2*/

    public static File fileContentMerger(Map<String,String> map){

        String resString = "";
        StringBuilder sb = new StringBuilder();
        BufferedReader bufReader = null;
    try {
        FileReader in = new FileReader("fileContentMerger.txt");
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
        resString = sb.toString();

    }catch (IOException e){
        System.err.println("IO Exception");
    }
    try{
        FileWriter out = new FileWriter("fileContentMerger.txt",true);
        BufferedWriter bufWriter = new BufferedWriter(out);

        bufWriter.write(resString);
        bufWriter.close();
    }catch (IOException e){
        System.err.println("IO Exception");
    }
        return null;
    }

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("bird","dog");
        map.put("ring","call");
        map.put("ship","plane");

        fileContentMerger(map);
    }
}
