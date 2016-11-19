package module_11;


import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Replacer {

     /*Task 11.1 */

   public static String replacer(Map<String,String> map){
       String resultStr="";
       BufferedReader bufReader=null;
       StringBuilder sb = new StringBuilder();
      try {
          FileReader in = new FileReader("replacer.txt");
           bufReader = new BufferedReader(in);

      }
      catch (FileNotFoundException e){
          System.out.println("File not found");
      }

        try {
            String line = bufReader.readLine();
            while (line!=null){
                if(map.containsKey(line)) line = map.get(line);
                sb.append(line);
                sb.append(System.lineSeparator());
                line = bufReader.readLine();

            }
            bufReader.close();
            resultStr = sb.toString();
        }
        catch (IOException e){
            System.err.println("IO exception");
            }

        return resultStr;
    }


    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
         map.put("bird","dog");
         map.put("ring","call");
         map.put("ship","plane");

        System.out.println(replacer(map));

    }

    }

