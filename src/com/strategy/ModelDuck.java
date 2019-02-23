package com.strategy;

import com.strategy.framework.Duck;

/**
 * 模型鸭
 *
 * @author huminxi https://github.com/huminxicn
 * @version on 2019/2/11 15:02
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {

    }
}
