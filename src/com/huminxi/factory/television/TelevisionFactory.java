package com.huminxi.factory.television;

import com.huminxi.factory.framework.Factory;
import com.huminxi.factory.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * TelevisionFactory 实现了 createProduct 方法和 registerProduct 方法。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/11 15:08
 */
public class TelevisionFactory extends Factory {
    private List<String> televisions = new ArrayList<>(16);

    @Override
    protected Product createProduct(String owner) {
        return new Television(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        televisions.add(((Television) product).getBrand());
    }

    public List<String> getTelevisions() {
        return televisions;
    }
}
