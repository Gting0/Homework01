package day06;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。
 * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个文件名:");
        String str = s.next();
        File file = new File(str);
        int i = 1;
        String[] ss = null;
        if (file.exists()){
            ss = str.split("\\.");
            str = ss[0] + "_副本0" + "." + ss[1];
        }
        while (file.exists()) {
            ss = str.split("\\d\\.");
            str = ss[0]  + i + "."+ ss[1];
            file = new File(str);
            i++;
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
