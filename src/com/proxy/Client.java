package com.proxy;

/**
 * 静态代理。
 *
 * @author huminxi huminxi@shein.com
 * @since 2021/07/04 16:58
 */
public class Client {
    public static void main(String[] args) {
        //1.创建被代理对象
        Subject target = new RealSubject();
        //2.创建代理对象, 同时将被代理对象传递给代理对象
        Proxy proxy = new Proxy(target);
        //3.通过代理对象，调用到被代理对象的方法
        proxy.action();
    }
}
