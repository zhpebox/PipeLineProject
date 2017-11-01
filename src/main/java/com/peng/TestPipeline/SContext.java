package com.peng.TestPipeline;


public class SContext {
	
	private SContext next;
	private SHandlerInter handler;
	
	public SContext(SHandlerInter handler){
		this.handler = handler;
	}
	public void setNext(SContext next){
		this.next = next;
	}
	
	public void doHandlerWork(SContext next,Object data){
		if(next!=null){
			handler.doWork(next,data);
		}
	}
	
	public void sendDataNext(String data){
		doHandlerWork(next, data);
	}
	
}
