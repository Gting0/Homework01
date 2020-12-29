package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary,hiredate;name,age,gender,salary,hiredate;....
 * 例如:
 * 张三,25,男,5000,2006-02-15;李四,26,女,6000,2007-12-24;...
 * 然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 然后循环集合，输出每一个员工信息(输出使用toString返回的字符串)
 * 然后输出每个员工的转正仪式日期。
 * 转正仪式日期为:入职3个月的当周周五
 * 
 * @author Bonnie
 *
 */
public class Test09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入员工信息：");
        String str = s.next();
        String[] ss = str.split("，");
        Collection<Emp> col = new ArrayList<>();
        System.out.println(Arrays.toString(ss));
        int age = Integer.parseInt(ss[1]);
        int salary = Integer.parseInt(ss[3]);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date hireDate = null;
        try {
            hireDate = sdf.parse(ss[4]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        col.add(new Emp(ss[0],age,ss[2],salary,hireDate));
        System.out.println(col);
        Calendar c = Calendar.getInstance();
        c.setTime(hireDate);
        c.add(Calendar.MONTH,3);
        c.set(Calendar.DAY_OF_WEEK,6);
        System.out.println(sdf.format(c.getTime()));
    }
}
