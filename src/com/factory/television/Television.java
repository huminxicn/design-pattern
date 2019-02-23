package com.factory.television;

import com.factory.framework.Product;

/**
 * 表示电视的类。Television 类是产品 Product 类的子类。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/11 15:03
 */
public class Television extends Product {
    private String brand;

    Television(String brand) {
        System.out.println("生产 " + brand + " 的电视。");
        this.brand = brand;
    }

    @Override
    public void use() {
        System.out.println("播放 " + brand + " 的电视。");
    }

    public String getBrand() {
        return brand;
    }
}
