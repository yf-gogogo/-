package chapter4;

import chapter4.observer.Observer;
import chapter4.observer.a_observer;
import chapter4.observer.b_observer;
import chapter4.observer.c_observer;
import chapter4.subject.TaskManage;

public class SendTask {
    public static void main(String[] args){
        Observer a = new a_observer();
        Observer b = new b_observer();
        Observer c = new c_observer();
        TaskManage taskManage = new TaskManage();
        taskManage.registerObserver(a);
        taskManage.registerObserver(b);
        taskManage.registerObserver(c);
        taskManage.notifyAll("开始写代码了！！！");
        System.out.println("<--------------移除观察者c--------------->");
        taskManage.removeObserver(c);
        taskManage.notifyAll("重构代码！！！");
    }
}
