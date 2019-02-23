package com.huminxi.strategy;

import com.huminxi.strategy.framework.QuackBehavior;

/**
 * 不叫
 *
 * @author huminxi https://github.com/huminxicn
 * @version on 2019/2/11 14:53
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
