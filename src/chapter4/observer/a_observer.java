package chapter4.observer;

public class a_observer extends Observer {
    @Override
    public void update(String msg) {
        System.out.println("a表示收到任务："+msg);
    }
}
