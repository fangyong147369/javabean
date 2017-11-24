package com.zc.sys.core.credit.entity;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.zc.sys.common.entity.LongPKEntity;
import com.zc.sys.core.common.constant.BaseConstant;
import com.zc.sys.core.user.entity.User;
/**
 * 信用分账户
 * @author zp
 * @version 2.0.0.0
 * @since 2017年11月09日
 */
@Entity
@Table(name=BaseConstant.DB_PREFIX + BaseConstant.DB_MODEL_Cs + "_credit_score")
public class CreditScore extends LongPKEntity {
	/** 序列号 **/
	private static final long serialVersionUID = 1L;
	
	/** 用户 */
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name = "user_id")
	private User user;
	/** 信用评分 **/
	private double balanceScore;
	/** 系统评分 **/
	private double sysScore;
	/** 芝麻信用分-1-未授权 **/
	private double zmxyScore;
	/** 版本控制 **/
	private int version;
	/** 获取【用户】 **/
	public User getUser() {
		return user;
	}
	/** 设置【用户】 **/
	public void setUser(User user) {
		this.user = user;
	}
	/** 获取【信用评分】 **/
	public double getBalanceScore() {
		return balanceScore;
	}
	/** 设置【信用评分】 **/
	public void setBalanceScore(double balanceScore) {
		this.balanceScore = balanceScore;
	}
	/** 获取【系统评分】 **/
	public double getSysScore() {
		return sysScore;
	}
	/** 设置【系统评分】 **/
	public void setSysScore(double sysScore) {
		this.sysScore = sysScore;
	}
	/** 获取【芝麻信用分-1-未授权】 **/
	public double getZmxyScore() {
		return zmxyScore;
	}
	/** 设置【芝麻信用分-1-未授权】 **/
	public void setZmxyScore(double zmxyScore) {
		this.zmxyScore = zmxyScore;
	}
	/** 获取【版本控制】 **/
	public int getVersion() {
		return version;
	}
	/** 设置【版本控制】 **/
	public void setVersion(int version) {
		this.version = version;
	}
}