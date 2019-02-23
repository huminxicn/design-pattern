package com.strategy;

import com.strategy.framework.Duck;

/**
 * 一句话概括功能
 *
 * @author huminxi https://github.com/huminxicn
 * @version on 2019/2/11 14:59
 */
public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        //切换 modelDuck 的飞行行为
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
