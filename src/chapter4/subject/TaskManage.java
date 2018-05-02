package chapter4.subject;

import chapter4.observer.Observer;
import chapter4.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class TaskManage implements Subject {
    private List<Observer> observers = new ArrayList<>();

    //注册观察者
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    //移除观察者
    @Override
    public void removeObserver(Observer observer) {
        if (!observers.isEmpty()){
            observers.remove(observer);
        }
    }

    //通知所有订阅的观察者
    @Override
    public void notifyAll(String msg) {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }
}
