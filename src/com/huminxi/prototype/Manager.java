package com.huminxi.prototype;

import java.util.HashMap;

/**
 * Manager 类使用 Product 接口来复制实例。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/12 16:37
 */
public class Manager {
    private HashMap showcase = new HashMap(16);

    public void register(String name, Product product) {
        showcase.put(name, product);
    }
    public Product create(String protoName) {
        Product p = (Product) showcase.get(protoName);
        return p.createClone();
    }
}
