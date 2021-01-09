package day05;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 创建一个栈，存入Integer类型元素1,2,3,4,5
 * 然后遍历队列并输出每个元素
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        deque.offer(4);
        deque.offer(5);
        for (Integer i:deque
             ) {
            System.out.println(i);
        }
    }

}
