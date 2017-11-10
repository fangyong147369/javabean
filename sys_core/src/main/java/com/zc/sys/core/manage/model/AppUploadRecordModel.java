package com.zc.sys.core.manage.model;
import org.springframework.beans.BeanUtils;

import com.zc.sys.common.model.jpa.Page;
import com.zc.sys.core.manage.entity.AppUploadRecord;
/**
 * 安卓包上传记录
 * @author zp
 * @version 2.0.0.0
 * @since 2017年11月09日
 */
public class AppUploadRecordModel extends AppUploadRecord {
	/** 序列号 **/
	private static final long serialVersionUID = 1L;

	/** 当前页码 **/
	private int pageNo;
	/** 每页数据条数 **/
	private int pageSize = Page.ROWS;
	/** 条件查询 **/
	private String searchName;

	/**
	 * 实体转换model
	 */
	public static AppUploadRecordModel instance(AppUploadRecord appUploadRecord) {
		AppUploadRecordModel appUploadRecordModel = new AppUploadRecordModel();
		BeanUtils.copyProperties(appUploadRecord, appUploadRecordModel);
		return appUploadRecordModel;
	}

	/**
	 * model转换实体
	 */
	public AppUploadRecord prototype() {
		AppUploadRecord appUploadRecord = new AppUploadRecord();
		BeanUtils.copyProperties(this, appUploadRecord);
		return appUploadRecord;
	}

	/** 获取【当前页码】 **/
	public int getPageNo() {
		return pageNo;
	}

	/** 设置【当前页码】 **/
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	/** 获取【每页数据条数】 **/
	public int getPageSize() {
		return pageSize;
	}

	/** 设置【每页数据条数】 **/
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/** 获取【条件查询】 **/
	public String getSearchName() {
		return searchName;
	}

	/** 设置【条件查询】 **/
	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}

}