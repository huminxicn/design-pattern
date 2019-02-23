package com.huminxi.factory.idcard;

import com.huminxi.factory.framework.Factory;
import com.huminxi.factory.framework.Product;

import java.util.HashMap;

/**
 * IDCardFactory 实现了 createProduct 方法和 registerProduct 方法。
 * <p>
 * createProduct 方法通过生成 IDCard 的实例来生产产品。
 * registerProduct 方法则通过将 IDCard 的 owner 保存到 owners 字段中来实现注册产品。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/11 14:43
 */
public class IDCardFactory extends Factory {
    private HashMap<Integer, String> database = new HashMap<>(16);
    private int serial = 100;

    @Override
    public synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    public void registerProduct(Product product) {
        IDCard idCard = (IDCard) product;
        database.put(serial, idCard.getOwner());
    }

    public HashMap getOwners() {
        return database;
    }
}
