package org.example.proxy;

public class RealSubjectProcessor implements SubjectProcessor{

	@Override
	public void process() {
		System.out.println("执行当前主题的流程");
	}
}
