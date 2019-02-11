package com.strategy;

import com.strategy.framework.FlyBehavior;

/**
 * 能像火箭一样飞
 *
 * @author huminxi https://github.com/huminxicn
 * @version on 2019/2/11 15:03
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
