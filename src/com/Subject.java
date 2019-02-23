package com;

import com.observer.Observer;

/**
 * 被观察的主题
 *
 * 还可以参考 JDK 在 java.util 包下内置的 Observable 类
 *
 * @author huminxi https://github.com/huminxicn
 * @version on 2019/2/11 17:15
 */
public interface Subject {

    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
