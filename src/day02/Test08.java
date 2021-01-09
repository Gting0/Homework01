package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name;
        int age;
        String s1;
        boolean gender = false;
        int salary;
        String s2 ;
        ArrayList<Person> arr = new ArrayList<>();
        do {
            System.out.println("请输入员工姓名：");
            name = s.next();
            System.out.println("请输入员工年龄：");
            age = s.nextInt();
            System.out.println("请输入员工性别：");
            s1 = s.next();
            if ("男" == s1){
                gender = true;
            }
            System.out.println("请输入员工月薪：");
            salary = s.nextInt();
            arr.add(new Person(name,age,gender,salary));
            System.out.println("是否还有下一个？");
            s2 = s.next();
        }while(s2.equals("是"));
        for (Person p:arr) {
            System.out.println(p);
        }
    }
}
