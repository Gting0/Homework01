package Io;

import org.junit.Test;

import java.io.*;

public class ReaderWriter {
    @Test
    public void read01(){
        try {
            InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
