package day05;

import day05.Emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个List集合中。
 * 并对集合排序，然后输出每个员工信息。
 * 
 * 再根据员工的入职时间排序，入职晚的在前，早的在后并
 * 输出每个员工的信息。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name;
        int age;
        String s1;
        boolean gender = false;
        int salary;
        String s2 ;
        Date hireDate = null;
        List<Emp> list = new ArrayList<>();
        do {
            System.out.println("请输入员工姓名：");
            name = s.next();
            System.out.println("请输入员工年龄：");
            age = s.nextInt();
            System.out.println("请输入员工性别：");
            s1 = s.next();
            if ("男".equals(s1)){
                gender = true;
            }
            System.out.println("请输入员工月薪：");
            salary = s.nextInt();
            System.out.println("请输入入职时间：");
            try {
                hireDate = new SimpleDateFormat("yyyy-MM-dd").parse(s.next());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            list.add(new Emp(name,age,gender,salary,hireDate));
            System.out.println("是否还有下一个？");
            s2 = s.next();
        }while(s2.equals("是"));
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                return (int)(o1.getHireDate().getTime() - o2.getHireDate().getTime());
            }
        });
        System.out.println(list);
    }
}
