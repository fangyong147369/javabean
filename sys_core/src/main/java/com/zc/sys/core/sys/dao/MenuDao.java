package com.zc.sys.core.sys.dao;
import com.zc.sys.common.dao.BaseDao;
import com.zc.sys.common.model.jpa.PageDataList;
import com.zc.sys.core.sys.entity.Menu;
import com.zc.sys.core.sys.model.MenuModel;
/**
 * 菜单
 * @author zp
 * @version 2.0.0.0
 * @since 2017年11月09日
 */
public interface MenuDao extends BaseDao<Menu> {

	/**
	 * 列表
	 * @param model
	 * @return
	 */
	PageDataList<Menu> list(MenuModel model);
	
}