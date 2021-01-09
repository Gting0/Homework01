package day09;
/**
 * 使用线程方式一创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test01{
    public static void main(String[] args) {
        Thread thread1 = new Thread1();
        Thread thread2 = new Thread2();
        thread1.start();
        thread2.start();
    }

}
class Thread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i+1);
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run() {
        System.out.println("你好");
        System.out.println("再见");
    }
}