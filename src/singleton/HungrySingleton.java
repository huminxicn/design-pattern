package singleton;

/**
 * 饿汉模式
 * <p>
 * 顾名思义，单例对象一开始就被 new HungrySingleton() 主动构建，不再需要判空操作，这种写法属于饿汉模式。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/7 14:46
 */
public class HungrySingleton {
    private static HungrySingleton SINGLETON = new HungrySingleton();

    // 定义一个私有的构造器来限制外部使用 new 关键字，进而避免构造出多个实例。
    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return SINGLETON;
    }
}
