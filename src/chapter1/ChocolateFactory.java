package chapter1;

/**
 * 通过改变empty的数量来实现单例模式同时运行多个进程
 */
public class ChocolateFactory {
    //空容器数量
    private static int empty;
    //需要煮沸
    private static int boiling;
    //已煮沸
    private static int boiled;
    public volatile static ChocolateFactory uniqueInstance = new ChocolateFactory()/*null*/;

    private ChocolateFactory() {
        empty = 3;
        boiling = 0;
        boiled = 0;
        System.out.println("初始资源数"+empty+' '+boiling+' '+boiled);

    }

    public static ChocolateFactory getInstance() {
        /*if (uniqueInstance == null) {
            System.out.println("判断");
            synchronized (ChocolateFactory.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateFactory();

                    System.out.println("生成单例"+uniqueInstance);
                }
            }
        }*/
        System.out.println("返回单例" + uniqueInstance);
        return uniqueInstance;

    }

    public synchronized void fill() {
        if (empty > 0) {
            // 添加原料巧克力动作

            empty --;
            boiling ++;
            System.out.println("添加原料"+empty+' '+boiling+' '+boiled);
        }
    }

    public synchronized void drain() {
        if (boiled > 0) {
            // 排出巧克力动作

            boiled --;
            empty ++;
            System.out.println("排出巧克力"+empty+' '+boiling+' '+boiled);
        }
    }

    public synchronized void boil() {
        if (boiling > 0) {
            // 煮沸

            boiling --;
            boiled ++;
            System.out.println("煮沸巧克力"+empty+' '+boiling+' '+boiled);
        }
    }
}
