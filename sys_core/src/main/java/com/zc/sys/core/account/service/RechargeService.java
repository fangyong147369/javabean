package com.zc.sys.core.account.service;
import com.zc.sys.core.account.model.RechargeModel;
import com.zc.sys.common.form.Result;
/**
 * 充值
 * @author zp
 * @version 2.0.0.0
 * @since 2017年11月09日
 */
public interface RechargeService{

	/**
 	 * 列表
 	 * @param model
 	 * @return
 	 */
	public Result list(RechargeModel model);

	/**
 	 * 添加
 	 * @param model
 	 * @return
 	 */
	public Result add(RechargeModel model);

	/**
 	 * 修改
 	 * @param model
 	 * @return
 	 */
	public Result update(RechargeModel model);

	/**
 	 * 获取
 	 * @param model
 	 * @return
 	 */
	public Result getById(RechargeModel model);

}