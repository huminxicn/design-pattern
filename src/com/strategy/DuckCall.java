package com.strategy;

import com.strategy.framework.QuackBehavior;

/**
 * 鸭鸣器
 *
 * @author huminxi https://github.com/huminxicn
 * @version on 2019/2/11 15:07
 */
public class DuckCall implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("This is a DuckCall");
    }
}
