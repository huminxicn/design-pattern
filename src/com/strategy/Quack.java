package com.strategy;

import com.strategy.framework.QuackBehavior;

/**
 * 嘎嘎叫
 *
 * @author huminxi https://github.com/huminxicn
 * @version on 2019/2/11 14:52
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
