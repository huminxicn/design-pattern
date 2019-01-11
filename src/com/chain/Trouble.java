package com.chain;

/**
 * Trouble 是表示发生的问题类。number 是问题编号。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2019/1/11 09:31
 */
public class Trouble {
    private int number;

    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "[Trouble " + number + "]";
    }
}
