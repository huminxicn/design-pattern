package com.chain;

/**
 * 解决指定编号的问题。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2019/1/11 09:50
 */
public class SpecialSupport extends Support {
    private int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() == number) {
            return true;
        } else {
            return false;
        }
    }
}
