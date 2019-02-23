package com.huminxi.chain;

/**
 * 什么问题都不处理。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2019/1/11 09:43
 */
public class NoSupport extends Support {

    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
