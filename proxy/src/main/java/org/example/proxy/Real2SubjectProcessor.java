package org.example.proxy;

public class Real2SubjectProcessor implements SubjectProcessor{

	@Override
	public void process() {
		System.out.println("执行当前主题2的流程");
	}
}
