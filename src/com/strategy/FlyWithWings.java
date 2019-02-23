package com.strategy;

import com.strategy.framework.FlyBehavior;

/**
 * 能用翅膀飞
 *
 * @author huminxi https://github.com/huminxicn
 * @version on 2019/2/11 14:51
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
