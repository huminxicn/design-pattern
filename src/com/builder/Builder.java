package com.builder;

/**
 * Builder 类是一个声明了编写文档的方法的抽象类。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/17 13:56
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
