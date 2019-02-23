package com.observer;

/**
 * 观察者
 * <p>
 * 还可以参考 JDK 在 java.util 包下内置的 Observer 类。
 *
 * @author huminxi https://github.com/huminxicn
 * @version on 2019/2/11 17:15
 */
public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
