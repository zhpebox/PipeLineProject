package com.performance.TestPipeline;

public class TestHandler2 implements THandlerInter {

	@Override
	public void channelRead(THandlerContext ctx, Object msg) {
		try{
			//模拟阻塞
			Thread.currentThread().sleep(1000);
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		//处理过程
		String result = (String)msg+"-handler2";
		System.out.println(result);
		//写入操作，这个操作是必须的，相当于将结果传递给下一个handler
		ctx.write(result);

	}

}
