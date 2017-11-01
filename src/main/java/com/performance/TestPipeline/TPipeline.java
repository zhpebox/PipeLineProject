package com.performance.TestPipeline;


public class TPipeline {
	private THandlerContext head;
	private THandlerContext tail; //双向链表会用到
	
	//在链表头插入一个handler
	public void addFirst(THandlerInter handler){
		THandlerContext ctx = new THandlerContext(handler);
		THandlerContext oldHead = head;
		head  = ctx;
		ctx.setNext(oldHead);
	}
	
	public TPipeline(){
		head = tail = new THandlerContext(new THeadHandler());
	}
	
	//封装外部调用接口
	public void Request(Object msg){
		head.doWork(msg);
	}
	
	/*配置链表尾部*/
	
	//这是一个内部类，为默认handler的context
	final class THeadContext extends THandlerContext{
		public THeadContext(THandlerInter handler) {
			super(handler);
			// TODO Auto-generated constructor stub
		}
	}
	//这是一个内部类，是pipeline的默认处理handler
	final class THeadHandler implements THandlerInter{

		@Override
		public void channelRead(THandlerContext ctx, Object msg) {
			String result = (String)msg+"end";
			System.out.println(result);
			
		}
		
	}
}
