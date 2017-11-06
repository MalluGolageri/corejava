package com.mallu.filehandling;

import javax.jws.soap.SOAPBinding;
import java.io.*;

/**
 * Created by golagem on 10/30/17.
 */
public class FileHandling {

    public static void main(String[] args) throws IOException {
        File f = new File("/Users/golagem/github/html-parsing/src/main/java/com/mallu/filehandling/test.txt");
        if (!f.exists()) f.createNewFile();
        String line = "";

        //System.out.println(Files.readAllLines(Paths.get("/Users/golagem/github/html-parsing/src/main/java/com/mallu/filehandling/test.txt")));
//        BufferedReader reader=new BufferedReader(new FileReader(f));
        Process p = Runtime.getRuntime().exec("cat " + f.getAbsolutePath() + " | tail -20");
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        User a=new User();
    }
}


final class User {

    private final int a;
    public User(){
        a=10;
    }


}