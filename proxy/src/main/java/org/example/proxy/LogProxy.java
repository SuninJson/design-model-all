package org.example.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class LogProxy implements MethodInterceptor {

	public Object getInstance(Class<?> clazz){
		final Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		before();
		final Object result = methodProxy.invokeSuper(o, objects);
		after();
		return result;
	}

	private void after() {
		System.out.println("执行结束后的处理");
	}

	private void before() {
		System.out.println("执行前的准备");
	}
}
