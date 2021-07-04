package com.proxy.cglib;

import com.proxy.RealSubject;
import com.proxy.Subject;

/**
 * 一句话概括功能。
 *
 * @author huminxi huminxi@shein.com
 * @since 2021/07/04 18:22
 */
public class Client {
    public static void main(String[] args) {
        //1.创建目标对象
        RealSubject target = new RealSubject();

        //2.获取到代理对象，并且将目标对象传递给代理对象
        RealSubject proxyInstance = (RealSubject) new CglibProxy(target).getProxyInstance();

        //3.打印内存中动态生的代理对象
        System.out.println(proxyInstance.getClass());

        //4.执行代理对象的方法，触发 intercept 方法，从而实现对目标对象的调用
        proxyInstance.action();
    }
}
