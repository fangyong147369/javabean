package com.zc.sys.queue.consumer.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zc.sys.cashloan.model.CashLoanModel;
import com.zc.sys.cashloan.model.CashLoanRepaymentModel;
import com.zc.sys.common.util.log.LogUtil;
import com.zc.sys.core.common.global.BeanUtil;
import com.zc.sys.core.common.queue.pojo.QueueModel;
import com.zc.sys.core.manage.dao.OrderTaskDao;
import com.zc.sys.core.manage.entity.OrderTask;
import com.zc.sys.core.manage.model.NoticeMessageModel;
import com.zc.sys.core.manage.service.NoticeMessageService;
import com.zc.sys.core.user.model.UserIdentifyModel;
import com.zc.sys.queue.consumer.QueueConsumerService;

/**
 * 消费者
 * @author zp
 * @version 2.0.0.0
 * @since 2017年11月15日
 */
@Service
public class QueueConsumerServiceImpl implements QueueConsumerService{

	@Resource
	private OrderTaskDao orderTaskDao;
	
	/**
	 * 消费者处理
	 * @param model
	 */
	@Override
	public void receive(QueueModel model) {
		OrderTask orderTask = (OrderTask) orderTaskDao.findObjByProperty("orderNo", model.getOrderTaskModel().getOrderNo());
		if(orderTask == null || orderTask.getState() != 2){
			LogUtil.info("订单号+" + orderTask.getOrderNo() + "不存在，或者处理状态有误");
			return;
		}
		//认证
		if(model.getObj() instanceof UserIdentifyModel){
//			((UserIdentifyModel)model.getObj()).doQueue();
		}
		//现金贷放款
		if(model.getObj() instanceof CashLoanModel){
//			((CashLoanModel)model.getObj()).doQueue();
		}
		//现金贷还款
		if(model.getObj() instanceof CashLoanRepaymentModel){
//			((CashLoanRepaymentModel)model.getObj()).doQueue();
		}
		if(model.getObj() instanceof NoticeMessageModel){
			NoticeMessageService noticeMessageService = (NoticeMessageService)BeanUtil.getBean(NoticeMessageService.class);
			noticeMessageService.send((NoticeMessageModel)model.getObj());
		}
		LogUtil.info("订单号+" + orderTask.getOrderNo() + "无处理配置项.....");
	}

}