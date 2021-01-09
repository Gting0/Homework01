package day09;
/**
 * 使用线程方式二创建两个线程:分别输出1000次，你好和再见
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable1());
        Thread t2 = new Thread(new Runnable2());
        t1.start();
        t2.start();
    }

}
class Runnable1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i+1);
        }
    }
}
class Runnable2 implements Runnable{

    @Override
    public void run() {
        System.out.println("你好");
        System.out.println("再见");
    }
}