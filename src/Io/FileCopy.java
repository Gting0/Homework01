package Io;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    @Test
    public void copy(){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        byte[] bs = new byte[1024];
        int len;
        try {
            fis = new FileInputStream("队列和栈的原理图.png");
            fos = new FileOutputStream("b.png");
            while((len = fis.read(bs)) != -1) {
                fos.write(bs,0,len);
            }
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
