package module_11;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CheckWord {

    /*Task 11.4*/

    /*Try*/
    public static int checkWord1(String word){

        int wordCount = 0;
        String resStr;
        BufferedReader bufReader = null;
        StringBuilder sb = new StringBuilder();
        try{
            FileReader in = new FileReader("checkWord.txt");
            bufReader = new BufferedReader(in);
        }
        catch (FileNotFoundException e){
            System.err.println("File not found");
        }
        try {
            String line = bufReader.readLine();
            while(line!=null) {
                sb.append(line);
                sb.append(" ");
                line = bufReader.readLine();
            }
            bufReader.close();
            resStr = sb.toString();
            wordCount=(int)Arrays.asList(resStr.split(" ")).stream().filter(s->s.equals(word)).count();
        }

        catch (IOException e){
            System.err.println("IOException");
        }

        return wordCount;
    }

    /*Try with resources*/

    public static int checkWord2(String word){
        int wordCount = 0;
        String resStr;
        StringBuilder sb = new StringBuilder();

        try {
            try (BufferedReader bufReader =new BufferedReader(new FileReader("checkWord.txt"))){
                String line = bufReader.readLine();

                while (line != null) {
                    sb.append(line);
                    sb.append(" ");
                    line = bufReader.readLine();
                }

                bufReader.close();
                resStr = sb.toString();
                wordCount = (int) Arrays.asList(resStr.split(" ")).stream().filter(s -> s.equals(word)).count();
            }
        }

        catch (IOException e){
            System.err.println("IOException");
        }

        return wordCount;
    }

    public static void main(String[] args) {
        System.out.println(checkWord1("Iterators"));
        System.out.println(checkWord2("Iterators"));
    }
}
