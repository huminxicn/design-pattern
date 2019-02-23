package com.huminxi.chain;

/**
 * 解决编号小于 limit 的问题。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2019/1/11 09:44
 */
public class LimitSupport extends Support {
    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit) {
            return true;
        } else {
            return false;
        }
    }
}
