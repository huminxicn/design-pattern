package com.observer.beans;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * Observable PropertyChangeSupport
 * Observer   PropertyChangeListener
 *
 * @author huminxi https://github.com/huminxicn
 * @version on 2019/2/12 14:05
 */
public class Observable {
    private int visitCount;
    private PropertyChangeSupport observable = new PropertyChangeSupport(this);

    public void addObservers(PropertyChangeListener observer) {
        observable.addPropertyChangeListener(observer);
    }

    public void addObservers(String propertyName, PropertyChangeListener observer) {
        observable.addPropertyChangeListener(propertyName, observer);
    }

    public void visit() {
        visitCount++;
        observable.firePropertyChange("visitCount", visitCount - 1, visitCount);
    }
}
