package io;

import java.io.*;

public class io {
    public static void main(String[] args) {
        OutputStream os = null;
        try {
            String filename = "src/io/testFile.txt";
            os = new FileOutputStream(filename);
        }catch (FileNotFoundException ex){
            System.err.println("couldn't open file - fatal");
            System.exit(0);
        }
        String someText = "Hallo";
        byte[] textAsByte = someText.getBytes();
        try {
            os.write(textAsByte);
        }catch(IOException ex){
            System.err.println("couldn't write data (fatal)");
            System.exit(0);
        }


    }
}
