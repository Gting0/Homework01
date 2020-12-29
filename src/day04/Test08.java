package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入三个日期(格式为yyyy-MM-dd)");
        System.out.println("请输入第1个日期：");
        String s1 = s.next();
        System.out.println("请输入第2个日期：");
        String s2 = s.next();
        System.out.println("请输入第3个日期：");
        String s3 = s.next();
        List list = new ArrayList();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            list.add(sdf.parse(s1));
            list.add(sdf.parse(s2));
            list.add(sdf.parse(s3));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Collections.sort(list);
        System.out.println(list);

    }
}
