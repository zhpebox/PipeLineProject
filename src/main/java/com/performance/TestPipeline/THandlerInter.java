package com.performance.TestPipeline;

public interface THandlerInter {
	/**
	 * 实现字符串处理
	 * @param ctx 下一hander的Context
	 * @param msg Object 为上一个handler处理之后传入的结果
	 */
	void channelRead(THandlerContext ctx,Object msg);
}
