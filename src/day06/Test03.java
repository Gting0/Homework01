package day06;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个目录名:");
        String str = s.next();
        File file = new File(str);
        int i = 1;
        if (file.exists()){
            str = str + "_副本0";
        }
        while (file.exists()) {
            str = str.substring(0,str.length()-1) + i;
            file = new File(str);
            i++;
        }
        file.mkdir();
    }
}
