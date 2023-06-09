import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String src = "/Users/Gunay/IdeaProjects/untitled9/src/a.txt";

        try(BufferedReader reader=new BufferedReader(new FileReader(src))){
            while(reader.ready()){
                String line= reader.readLine();
                System.out.println(line);
            }
        }



    }

}