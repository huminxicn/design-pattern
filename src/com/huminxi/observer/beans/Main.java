package com.huminxi.observer.beans;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * client
 *
 * @author huminxi https://github.com/huminxicn
 * @version on 2019/2/12 14:14
 */
public class Main {
    public static void main(String[] args) {
        Observable observable = new Observable();
        observable.addObservers(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                System.out.println("Here we comes a change event!");
                System.out.println(evt.toString());
            }
        });
        observable.addObservers("visitCount", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                System.out.println("Change event with property name");
            }
        });
        observable.visit();
    }
}
