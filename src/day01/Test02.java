package day01;
/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 * @author Bonnie
 * 使用StringBuilder完成
 */
public class Test02 {
	public static void main(String[] args) {
		String str = "大家好！";
		System.out.println(str);
		String str1 = str.concat("我是程序员！");
		System.out.println(str1);
		String str2 = str1.replace("程序员","优秀的程序员");
		System.out.println(str2);
		String str3 = str2.replace("优秀","牛牛");
		System.out.println(str3);
		String str4 = str3.substring(4);
		System.out.println(str4);

	}
}
