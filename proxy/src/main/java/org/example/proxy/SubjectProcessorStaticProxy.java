package org.example.proxy;

public class SubjectProcessorStaticProxy implements SubjectProcessor{
	private final SubjectProcessor subjectProcessor;

	public SubjectProcessorStaticProxy(SubjectProcessor subjectProcessor) {
		this.subjectProcessor = subjectProcessor;
	}


	@Override
	public void process() {
		before();
		subjectProcessor.process();
		after();
	}

	private void after() {
		System.out.println("执行结束后的处理");
	}

	private void before() {
		System.out.println("执行前的准备");
	}
}
