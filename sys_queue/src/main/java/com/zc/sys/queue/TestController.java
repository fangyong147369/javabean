package com.zc.sys.queue;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zc.sys.common.exception.BusinessException;
import com.zc.sys.core.common.queue.pojo.QueueModel;
import com.zc.sys.core.common.queue.service.QueueProducerService;
import com.zc.sys.core.common.web.BaseController;
import com.zc.sys.core.manage.model.NoticeMessageModel;
import com.zc.sys.core.manage.model.OperatorModel;
import com.zc.sys.core.manage.model.OrderTaskModel;

/**
 * 测试
 * @author zp
 * @since Nov 8, 2017
 */
@RestController
public class TestController  extends BaseController<OperatorModel> {

	@Resource
	private QueueProducerService queueService;
	
	/**
 	 * 列表
 	 * @param model
 	 * @return
 	 */
	@RequestMapping(value = "/")
	public Object list() throws BusinessException {
		queueService.send(new QueueModel("sendMessage", new OrderTaskModel(), new NoticeMessageModel()));
//		queueService.send(new QueueModel("cashLoan", "2222222222222", ""));
//		queueService.send(new QueueModel("realNameIdentify", "3333333333333", ""));
		return "测试";
	}
}
