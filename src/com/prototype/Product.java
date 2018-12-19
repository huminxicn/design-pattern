package com.prototype;

/**
 * Product 接口是复制功能的接口。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/12 16:33
 */
public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createClone();
}
