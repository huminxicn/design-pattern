package com.huminxi.strategy;

import com.huminxi.strategy.framework.FlyBehavior;

/**
 * 不能飞
 *
 * @author huminxi https://github.com/huminxicn
 * @version on 2019/2/11 14:52
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
