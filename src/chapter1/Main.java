package chapter1;

import chapter1.ChocolateFactory1;
import chapter1.ThreadDemo;

public class Main {

    public static void main(String[] args) {
        /*ThreadDemo T1 = new ThreadDemo( "进程-1");
        T1.start();

        ThreadDemo T2 = new ThreadDemo( "进程-2");
        T2.start();

        ThreadDemo T3 = new ThreadDemo( "进程-3");
        T3.start();*/

        //开启进程数
        int threadnum = 100;
        for (int i=0;i<threadnum;i++){
            new ThreadDemo("进程"+i).start();
        }
    }
}


