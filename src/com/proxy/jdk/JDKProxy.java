package com.proxy.jdk;


import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
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
                        //生成的代理类已经继承了 java.lang.reflect.Proxy 类。
                        System.out.println("proxy instanceof Proxy: " + (proxy instanceof Proxy));
                        //将生成的代理类输入到 JDKProxy.class 文件中，再通过 IDEA 反编译 JDKProxy.class 文件。
                        byte[] bytes = ProxyGenerator.generateProxyClass("proxy", target.getClass().getInterfaces());
                        File file = new File("./JDKProxy.class");
                        try {
                            OutputStream outputStream = new FileOutputStream(file);
                            outputStream.write(bytes);
                            outputStream.flush();
                            outputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        System.out.println("JDK 动态代理开始");
                        Object returnVal = method.invoke(target, args);
                        System.out.println("JDK 动态代理结束");
                        return returnVal;
                    }
                });
    }
}
