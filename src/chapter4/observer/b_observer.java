package chapter4.observer;

public class b_observer extends Observer {
    @Override
    public void update(String msg) {
        System.out.println("b表示收到任务："+msg);
    }
}
