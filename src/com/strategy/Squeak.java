package com.strategy;

import com.strategy.framework.QuackBehavior;

/**
 * 吱吱叫
 *
 * @author huminxi https://github.com/huminxicn
 * @version on 2019/2/11 14:54
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
