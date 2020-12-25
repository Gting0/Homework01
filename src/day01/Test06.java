package day01;

import java.util.Scanner;

/**
 * 要求用户输入一个计算表达式，可以使用加减乘除。
 * 只处理一次运算的，不要有连续加减乘除的表达式,且不做小数计算。(例:1+2+3)
 * 例如:
 * 1+2
 * 然后经过处理计算结果并输出:1+2=3
 * @author Bonnie
 *
 */
public class Test06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个数学计算表达式:");
		String str = s.nextLine();
		if (str.contains("+")) {
			String[] num = str.split("\\+");
			int num1 = Integer.parseInt(num[0]);
			int num2 = Integer.parseInt(num[1]);
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		} else if (str.contains("-")) {
			String[] num = str.split("\\-");
			int num1 = Integer.parseInt(num[0]);
			int num2 = Integer.parseInt(num[1]);
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		} else if (str.contains("*")) {
			String[] num = str.split("\\*");
			int num1 = Integer.parseInt(num[0]);
			int num2 = Integer.parseInt(num[1]);
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		} else {
			String[] num = str.split("\\/");
			int num1 = Integer.parseInt(num[0]);
			int num2 = Integer.parseInt(num[1]);
			System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
		}
	}
}








