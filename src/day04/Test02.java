package day04;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * 创建一个集合，存放元素"1","$","2","$","3","$","4"
 *   使用迭代器遍历集合，并在过程中删除所有的"$"，
 *   最后再将删除元素后的集合使用新循环遍历，并输出每一个元素。
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add("1");
        arr.add("$");
        arr.add("2");
        arr.add("$");
        arr.add("3");
        arr.add("$");
        arr.add("4");
        Iterator it = arr.iterator();
        while (it.hasNext()){
            Object o = it.next();
            System.out.println(o);
            if ("$".equals(o)){
                it.remove();
            }
        }
        for (Object o:arr) {
            System.out.println(o);
        }
    }
}
