package com.proxy.jdk;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 一句话概括功能。
 *
 * @author huminxi huminxi@shein.com
 * @since 2021/07/04 17:20
 */
public class JDKProxy {
    //被代理对象。
    private Object target;

    public JDKProxy(Object target) {
        this.target = target;
    }

    //利用 JDK api 动态生成一个代理对象。
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK 动态代理开始");
                        //反射机制调用目标对象的方法
                        Object returnVal = method.invoke(target, args);
                        System.out.println("JDK 动态代理结束");
                        return returnVal;
                    }
                });
    }
}
