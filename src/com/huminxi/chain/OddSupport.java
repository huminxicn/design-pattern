package com.huminxi.chain;

/**
 * 解决编号为奇数的问题。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2019/1/11 09:48
 */
public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
