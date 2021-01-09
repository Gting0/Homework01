package day09;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 创建一个线程，每秒输出一次当前系统时间:yyyy-MM-dd HH:mm:ss
 * @author Bonnie
 *
 */
public class Test04 {
    public static void main(String[] args) {
        Thread t1 = new T1();
        t1.start();
        while (true){
            try {
                Thread.sleep(1000);
                t1.run();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
class T1 extends Thread{
    public void run(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()));
    }
}