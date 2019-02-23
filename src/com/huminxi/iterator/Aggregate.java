package com.huminxi.iterator;

/**
 * 这是一个表示集合的接口
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/6 17:17
 */
public interface Aggregate {

    /**
     * 该方法会返回一个用于遍历集合 Aggregate 的迭代器。
     *
     * @return Iterator
     */
    public abstract Iterator iterator();
}
