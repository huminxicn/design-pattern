package singleton;

/**
 * 懒汉模式
 * <p>
 * 对象引用一开始为 null，具体使用的时候才 new 一个对象出来，这种写法属于懒汉模式。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/7 14:40
 */
public class LazySingleton {
    private static LazySingleton SINGLETON = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new LazySingleton();
        }
        return SINGLETON;
    }
}
