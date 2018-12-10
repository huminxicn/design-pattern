package com.design.pattern.adapter.delegate;

import com.design.pattern.adapter.AlternateCurrent;

/**
 * 使用代理的适配器。
 * <p>
 * 由于在 Java 中无法同时继承两个类，因此我们无法将 AlternateToDirect 类分别定义为 DirectCurrent 类和 AlternateCurrent 类的子类。
 * <p>
 * AlternateToDirect 类中的 banner 字段中保存了 AlternateCurrent 类的实例。该实例是在 AlternateToDirect 类的构造函数中生成的。
 * <p>
 * 然后，use12V 方法和 printStrong 方法会通过 banner 字段调用 AlternateCurrent 类的 showWithParen 和 showWithAster 方法。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/10 14:41
 */
public class AlternateToDirect extends DirectCurrent {
    private AlternateCurrent ac;

    public AlternateToDirect(int v) {
        this.ac = new AlternateCurrent(v);
    }

    @Override
    public void use12V() {
        ac.use220V();
    }

}
