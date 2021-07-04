package com.proxy;

/**
 * 一句话概括功能。
 *
 * @author huminxi huminxi@shein.com
 * @since 2021/07/04 16:55
 */
public class RealSubject implements Subject{
    @Override
    public void action() {
        System.out.println("RealSubject do action.");
    }
}
