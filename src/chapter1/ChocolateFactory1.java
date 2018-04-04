package chapter1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 通过控制实例个数来实现多进程运行，用队列来保存有限个实例，实现循环使用
 */
public class ChocolateFactory1 {
    //有限个实例
    private static int instnum = 5;
    private boolean empty;
    private boolean boiled;
    //队列保存有限个实例
    private volatile static Queue<ChocolateFactory1> queue = new LinkedList<ChocolateFactory1>();
    public static ChocolateFactory1 uniqueInstance = null;

    private ChocolateFactory1() {
        empty = true;
        boiled = false;
    }

    public static ChocolateFactory1 getInstance() {

        if (instnum > 0) {
            System.out.println("即将进入synchronized");
            synchronized (ChocolateFactory.class) {
                if (instnum > 0) {
                    uniqueInstance = new ChocolateFactory1();
                    queue.offer(uniqueInstance);
                    //System.out.println(queue.size());
                    System.out.println("生成实例"+uniqueInstance);
                    instnum--;
                }
            }
            synchronized (ChocolateFactory1.class){
                queue.offer(queue.peek());
                //System.out.println("返回实例"+queue.peek());
                return queue.poll();
            }
        }else{
            synchronized (ChocolateFactory1.class){
                queue.offer(queue.peek());
                System.out.println("返回队列中的实例"+queue.peek());
                return queue.poll();
            }
        }

    }

    public void fill() {
        if (empty) {
            // 添加原料巧克力动作
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if ((!empty) && boiled) {
            // 排出巧克力动作
            empty = true;
        }
    }

    public void boil() {
        if ((!empty) && (!boiled)) {
            // 煮沸
            boiled = true;
        }
    }
}
