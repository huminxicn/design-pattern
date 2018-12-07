package com.design.pattern.iterator;

/**
 * 这是一个用来遍历集合的接口
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/6 17:17
 */
public interface Iterator {

    /**
     * 判断集合是否还有下一个元素。
     *
     * @return True or False
     */
    public abstract boolean hasNext();

    /**
     * 获取下一个元素。
     *
     * @return Object
     */
    public abstract Object next();
}
