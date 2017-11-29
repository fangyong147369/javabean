package com.zc.sys.core.common.executer;

/**
 * 任务抽象类
 * @author zp
 * @version 2.0.0.0
 * @since 2017年11月09日
 */
public abstract class AbstractExecuter implements Executer {

	//处理实体
	protected Object obj;
	
	@Override
	public void execute(Object obj) {
		this.obj = obj;
		//初始化
		init();
		//更新账户
		handleAccount();
		//添加资金记录
		addAccountLog();
		//积分处理
		handleIntegral();
		//信用分处理
		handleCredit();
		//处理通知
		handleNotice();
		//新增操作记录
		addOperateLog();
		//处理推广活动
		handlePromotion();
		//队列发送
		queueSend();
	}

	@Override
	public abstract void init();

	@Override
	public abstract void handleCredit();

	@Override
	public abstract void handleIntegral();

	@Override
	public abstract void addAccountLog();

	@Override
	public abstract void handleAccount();

	@Override
	public abstract void handleNotice();

	@Override
	public abstract void sendAppPush();

	@Override
	public abstract void sendMessage();

	@Override
	public abstract void sendEmail();

	@Override
	public abstract void sendSMS();

	@Override
	public abstract void addOperateLog();

	@Override
	public abstract void queueSend();
	
	@Override
	public abstract void handlePromotion();
}
