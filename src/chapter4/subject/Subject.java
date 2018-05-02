package chapter4.subject;

import chapter4.observer.Observer;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyAll(String msg);
}
