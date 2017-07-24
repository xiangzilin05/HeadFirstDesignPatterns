package c02.superclass;

/**
 * Created by Administrator on 2017/7/22.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
