package day01;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random random = new Random();
		String str1 = "";
		for (int i = 0; i < 5; i++) {
			str1 += str.charAt(random.nextInt(52));
		}
		System.out.println(str1);
		Scanner s = new Scanner(System.in);
		System.out.println("请输入验证码：");
		System.out.println(str1.equalsIgnoreCase(s.next())?"输入正确":"输入错误");

	}
	
}
