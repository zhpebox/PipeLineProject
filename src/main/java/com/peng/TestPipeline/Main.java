package com.peng.TestPipeline;

import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		SPipeline spipeline = new SPipeline();
		SContext context1 = new SContext(new Handler1());
		SContext context2 = new SContext(new Handler2());
		
		spipeline.putContext(context2);
		spipeline.putContext(context1);
		
		for(int i=1;i<=10;i++){
			spipeline.start("zhp"+i);

			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
