package com.proxy.jdk;

import com.proxy.RealSubject;
import com.proxy.Subject;

/**
 * 一句话概括功能。
 *
 * @author huminxi huminxi@shein.com
 * @since 2021/07/04 17:25
 */
public class Client {
    public static void main(String[] args) {
        //1.创建目标对象
        RealSubject target = new RealSubject();
        //2.创建代理对象
        Subject proxyInstance = (Subject) new JDKProxy(target).getProxyInstance();
        //3.打印内存中动态生的代理对象
        System.out.println(proxyInstance.getClass());
        //4.通过代理对象，调用目标对象的方法
        proxyInstance.action();
    }
}
