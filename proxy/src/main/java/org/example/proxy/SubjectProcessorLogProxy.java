package org.example.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SubjectProcessorLogProxy implements InvocationHandler {
	private SubjectProcessor processor;

	public SubjectProcessor getInstance(SubjectProcessor processor){
		this.processor = processor;
		final Class<? extends SubjectProcessor> processorClass = processor.getClass();
		return (SubjectProcessor) Proxy.newProxyInstance(
				processorClass.getClassLoader(),
				processorClass.getInterfaces(),
				this
		);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		final Object result = method.invoke(processor, args);
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
