package com.performance.TestPipeline;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 链表的一部分，需要指向下一个context的指针；然后它负责调用handler，而我们要实现
 * 一个并发的处理程序，那么HanderContext就需要维护一个线程池来供handler处理
 * @author Administrator
 */
public class THandlerContext {
	//线程池
	private ExecutorService executorService = Executors.newCachedThreadPool();
	private THandlerInter handler;
	//下一个context的引用
	private THandlerContext next;
	
	public THandlerContext(THandlerInter handler){
		this.handler = handler;
	}
	public void setNext(THandlerContext ctx){
		this.next = ctx;
	}
	
	//执行任务的时候向线程池提交一个runnable的任务，任务中调用handler
	public void doWork(Object msg){
		if(next == null){
			return ;
		}else{
			executorService.submit(new Runnable() {
				@Override
				public void run() {
					//把下一个handler的context穿个hander来实现回调
					handler.channelRead(next, msg);
				}
			});
		}
	}
	
	//这里wirte操作是给handler调用的，实际上是一个回调方法，当handler处理完数据之后，调用一下
	//nextcontext.write,此时就吧任务传递给下一个handler了
	public void write(Object msg){
		doWork(msg);
	}
	
}
