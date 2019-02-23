package com.huminxi.strategy;

import com.huminxi.strategy.framework.Duck;

/**
 * 野鸭
 *
 * @author huminxi https://github.com/huminxicn
 * @version on 2019/2/11 14:50
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
