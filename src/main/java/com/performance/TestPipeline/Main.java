package com.performance.TestPipeline;

public class Main {
	public static void main(String[] args) {
		TPipeline pipeline = new TPipeline();
		pipeline.addFirst(new TestHandler2());
		pipeline.addFirst(new TestHandler1());
		for(int i=1;i<=10;i++){
			pipeline.Request("Hello"+i);
		}
		
	}
}
