package chapter4.observer;

public class c_observer extends Observer {
    @Override
    public void update(String msg) {
        System.out.println("c表示收到任务："+msg);
    }
}
