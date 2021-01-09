package day05;

import java.util.*;

/**
 *创建一个Map，保存某个学生的成绩:
 *在控制台输入该学生成绩，格式:
 *科目:成绩;科目:成绩;...
 *例如:  
 *语文:99;数学:98;英语:97;物理:96;化学:95
 *然后输出物理的成绩。
 *然后将化学的成绩设置为96
 *然后删除英语这一项。
 *然后遍历该Map分别按照遍历key，Entry，value
 *的形式输出该Map信息。
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        Map map = new HashMap();
        Scanner s = new Scanner(System.in);
        System.out.println("请输入学生成绩：");
        String str = s.next();
        String[] ss = str.split(";");
        System.out.println(Arrays.toString(ss));
        for (int i = 0; i < ss.length; i++) {
            String[] sss = ss[i].split(":");
            map.put(sss[0],sss[1]);
        }
        System.out.println(map.get("物理"));
        map.put("化学","96");
        map.remove("英语");
        Set set = map.keySet();
        System.out.println(set);
        Collection values = map.values();
        System.out.println(values);
        Set set1 = map.entrySet();
        System.out.println(set1);

    }
}
