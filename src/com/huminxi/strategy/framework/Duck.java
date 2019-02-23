package com.huminxi.strategy.framework;

/**
 * 所有的鸭子都要继承这个抽象类。
 *
 * @author huminxi https://github.com/huminxicn
 * @version on 2019/2/11 14:42
 */
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    public Duck() {

    }
    public abstract void display();

    public void performFly() {

        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
