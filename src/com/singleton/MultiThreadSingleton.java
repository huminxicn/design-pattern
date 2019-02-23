package com.singleton;

/**
 * 多线程环境下的单例模式
 * <p>
 * 如果上面『懒汉模式』的代码是运行在多线程环境中，就会出现许多问题。最明显的一个，将有可能 new 出多个 Singleton 对象实例。最简单的修复方式是在 getInstance() 方法上加 synchronize 关键字。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/7 14:52
 */
public class MultiThreadSingleton {
    private static MultiThreadSingleton SINGLETON = null;

    private MultiThreadSingleton() {
    }

    public synchronized static MultiThreadSingleton getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new MultiThreadSingleton();
        }
        return SINGLETON;
    }
}
