package com.observer;

/**
 * 被观察的主题
 *
 * @author huminxi https://github.com/huminxicn
 * @version on 2019/2/11 17:15
 */
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
