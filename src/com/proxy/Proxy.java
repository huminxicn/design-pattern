package com.proxy;

/**
 * 一句话概括功能。
 *
 * @author huminxi huminxi@shein.com
 * @since 2021/07/04 16:56
 */
public class Proxy implements Subject {
    private Subject target;

    public Proxy(Subject target) {
        this.target = target;
    }

    @Override
    public void action() {
        System.out.println("do something before.");
        target.action();
        System.out.println("do something after.");
    }
}
