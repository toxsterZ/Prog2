package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class read {
    public static void main(String[] args) {
        InputStream is = null;
        try {
            String filename = "src/io/testFile.txt";
            is = new FileInputStream(filename);
        } catch(FileNotFoundException ex) {
                System.err.println("couldn’t open file - fatal");
                System.exit(0);
        }

        byte[] readBuffer = new byte[100];
        try {
            is.read(readBuffer);
        } catch (IOException ex) {
            System.err.println("couldn’t read data (fatal)");
            System.exit(0);
        }
        String readString = new String(readBuffer);
        System.out.println("read something: " + readString);
    }
}
