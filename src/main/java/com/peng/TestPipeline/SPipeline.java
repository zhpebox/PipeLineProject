package com.peng.TestPipeline;

public class SPipeline {
	private SContext head;
	
	public void putContext(SContext one){
		SContext temp = head;
		head = one;
		one.setNext(temp);
	}
	
	public SPipeline(){
		head = new SContext(new FHandler());
	}
	
	public void start(String data){
		head.sendDataNext(data);
	}
	
	class FHandler implements SHandlerInter{
		@Override
		public void doWork(SContext next, Object data) {
			System.out.println(data+"end");
		}
		
	}
	
	
}
