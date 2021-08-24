package com.proxy.cglib;

import com.proxy.RealSubject;
import net.sf.cglib.core.DebuggingClassWriter;

/**
 * 一句话概括功能。
 *
 * @since 2021/07/04 18:22
 */
public class Client {
    public static void main(String[] args) {
        //0.将生成的代理类输入到 cglib 目录中。
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "./cglib");

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
