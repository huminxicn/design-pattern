package com.factory;

import com.factory.framework.Factory;
import com.factory.framework.Product;
import com.factory.idcard.IDCardFactory;

/**
 * 在 PracticeMain 类中，我们将使用 framework 包和 idcard/television 包类制作和使用 Product 的子类产品。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/11 14:55
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product product1 = factory.create("小红");
        Product product2 = factory.create("小明");
        Product product3 = factory.create("小刚");
        product1.use();
        product2.use();
        product3.use();

//        Factory factory = new TelevisionFactory();
//        Product product1 = factory.create("海尔");
//        Product product2 = factory.create("TCL");
//        Product product3 = factory.create("格力");
//        product1.use();
//        product2.use();
//        product3.use();
    }
}
