package com.peng.TestPipeline;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Handler2 implements SHandlerInter {

	ExecutorService execute = Executors.newCachedThreadPool();
	
	
	@Override
	public void doWork(SContext next, Object data) {
		execute.submit(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				String s = (String)data + "_handler2";
				next.sendDataNext(s);
				System.out.println(s);
			}
		});
	}

}
