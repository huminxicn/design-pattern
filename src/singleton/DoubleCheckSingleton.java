package singleton;

/**
 * Double-check lock 实现的单例模式
 * <p>
 * 直接在 getInstance() 方法上加锁固然可以解决多线程环境下可能构建出多个单例对象的问题。但是这样也存在着问题，就是每次调用 getInstance() 方法的时候都会加上锁。
 * 使用 Double-check lock(双检锁) 可以避免在 new 出单例对象之后还对 getInstance() 方法进行加锁，这是对锁粒度细化的一种体现。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/7 15:00
 */
public class DoubleCheckSingleton {

    private static DoubleCheckSingleton SINGLETON = null;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        // 第一次检查
        if (SINGLETON == null) {

            // 只有 SINGLETON 为 null 时，才对 new Singleton() 代码块进行加锁。
            synchronized (DoubleCheckSingleton.class) {
                // 第二次检查
                if (SINGLETON == null) {
                    SINGLETON = new DoubleCheckSingleton();
                }
            }

        }
        return SINGLETON;
    }
}
