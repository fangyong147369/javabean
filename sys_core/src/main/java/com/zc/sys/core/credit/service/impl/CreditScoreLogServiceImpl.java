package com.zc.sys.core.credit.service.impl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import com.zc.sys.common.form.Result;
import com.zc.sys.core.credit.dao.CreditScoreLogDao;
import com.zc.sys.core.credit.model.CreditScoreLogModel;
import com.zc.sys.core.credit.service.CreditScoreLogService;
/**
 * 信用分账户
 * @author zp
 * @version 2.0.0.0
 * @since 2017年11月09日
 */
@Service
public class CreditScoreLogServiceImpl implements CreditScoreLogService {

	@Resource
	private CreditScoreLogDao creditScoreLogDao;
	/**
 	 * 列表
 	 * @param model
 	 * @return
 	 */
	@Override
	public Result list(CreditScoreLogModel model){

		return null;
	}

	/**
 	 * 添加
 	 * @param model
 	 * @return
 	 */
	@Override
	@Transactional
	public Result add(CreditScoreLogModel model){

		return null;
	}

	/**
 	 * 修改
 	 * @param model
 	 * @return
 	 */
	@Override
	@Transactional
	public Result update(CreditScoreLogModel model){

		return null;
	}

	/**
 	 * 获取
 	 * @param model
 	 * @return
 	 */
	@Override
	public Result getById(CreditScoreLogModel model){

		return null;
	}

}