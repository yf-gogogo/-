package chapter1;

public class Singleton {
    /**
     * 原始代码
     */
    /*private static Singleton uniqueInstance;
    private Singleton() {}
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            System.out.println("创建单例");
            uniqueInstance = new Singleton();
        }
        System.out.println("返回单例");
        return uniqueInstance;
    }*/
    /**
     * 优化方法1
     * 加同步锁synchronized
     */
   /* private static Singleton uniqueInstance;
    private Singleton() {}
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            System.out.println("创建单例");
            uniqueInstance = new Singleton();
        }
        System.out.println("返回单例");
        return uniqueInstance;
    }*/

    /**
     *优化方法2
     *  类装载时实现实例化，并声明为final,这样实例化的类就不会被重新赋值
     */
    private static final Singleton uniqueInstance = new Singleton();
    private Singleton() {}
    public static synchronized Singleton getInstance() {
        System.out.println("返回单例"+uniqueInstance);
        return uniqueInstance;
    }
    /**
     * 优化方法3
     * 双重检验锁，减少同步次数
     */
   /* private volatile static Singleton uniqueInstance;
    private Singleton() {}
    public static synchronized Singleton getInstance() {
        //先检查实例是否存在，如果不存在才进入下面的同步块
        if (uniqueInstance == null) {
            System.out.println("测试");
            //同步块，线程安全的创建实例
            synchronized (Singleton.class) {
                //再次检查实例是否存在，如果不存在才真的创建实例
                if (uniqueInstance == null) {
                    System.out.println("创建单例");
                    uniqueInstance = new Singleton();
                }
            }
        }
        System.out.println("返回单例");
        System.out.println(uniqueInstance);
        return uniqueInstance;
    }*/
}
