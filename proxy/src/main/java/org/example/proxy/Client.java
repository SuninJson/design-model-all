package org.example.proxy;

public class Client {
	public static void main(String[] args) {
		System.out.println("--------------- 静态代理 ---------------");

		SubjectProcessor processor = new SubjectProcessorStaticProxy(new RealSubjectProcessor());
		processor.process();

		System.out.println("--------------- 动态代理 ---------------");

		final SubjectProcessorLogProxy logProxy = new SubjectProcessorLogProxy();
		SubjectProcessor processor1 = logProxy.getInstance(new RealSubjectProcessor());
		processor1.process();

		System.out.println("--------------- 动态代理2 ---------------");

		final SubjectProcessor processor2 = logProxy.getInstance(new Real2SubjectProcessor());
		processor2.process();

		System.out.println("--------------- CGLIB动态代理 ---------------");
		SubjectProcessor processor3 = (SubjectProcessor) new LogProxy().getInstance(RealSubjectProcessor.class);
		processor3.process();

		System.out.println("--------------- 查看JDK动态代理生成的Class ---------------");


	}
}
