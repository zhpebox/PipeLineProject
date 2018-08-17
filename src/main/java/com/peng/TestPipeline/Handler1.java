package com.peng.TestPipeline;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Handler1 implements SHandlerInter {

	ExecutorService execute = Executors.newCachedThreadPool();
	
	@Override
	public void doWork(SContext next, Object data) {
//		execute.submit(new Runnable() {
//			@Override
//			public void run() {
//				String s = (String)data + "_handler1";
//				next.sendDataNext(s);
//				System.out.println(s);
//			}
//		});
		execute.submit(() -> {
            String s = (String)data + "_handler1";
            next.sendDataNext(s);
            System.out.println(s);
        });
	}

}
