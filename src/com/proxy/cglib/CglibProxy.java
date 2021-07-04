package com.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 一句话概括功能。
 *
 * @author huminxi huminxi@shein.com
 * @since 2021/07/04 18:20
 */
public class CglibProxy implements MethodInterceptor {
    //目标对象
    private Object target;

    public CglibProxy(Object target) {
        this.target = target;
    }

    //返回target对象的代理对象
    public Object getProxyInstance() {
        //创建一个工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类对象，即代理对象
        return enhancer.create();
    }

    //重写intercept方法，会调用目标对象的方法
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib 动态代理开始");
        Object returnVal = method.invoke(target, args);
        System.out.println("cglib 动态代理结束");
        return returnVal;
    }
}
