package Io;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IoTest {
    @Test
    public void inPutTest(){
        FileInputStream is = null;
        byte[] bs = new byte[10];
        try {
            is = new FileInputStream("a.txt");
            is.read(bs);
            System.out.println(Arrays.toString(bs));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    @Test
    public void outPutTest(){
        FileOutputStream os = null;
        try {
            os = new FileOutputStream("a.txt");
            String s = "汉皇色重思倾国";
            byte[] bs = s.getBytes("GBK");
            os.write(bs,4,2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
