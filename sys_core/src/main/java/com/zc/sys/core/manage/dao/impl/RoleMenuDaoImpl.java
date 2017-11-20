package com.zc.sys.core.manage.dao.impl;
import javax.persistence.Query;

import com.zc.sys.common.model.jpa.OrderFilter;
import com.zc.sys.common.model.jpa.PageDataList;
import com.zc.sys.common.model.jpa.QueryParam;
import com.zc.sys.common.model.jpa.SearchFilter;
import com.zc.sys.common.util.validate.StringUtil;
import com.zc.sys.core.manage.model.RoleMenuModel;
import org.springframework.stereotype.Repository;

import com.zc.sys.common.dao.jpa.BaseDaoImpl;
import com.zc.sys.core.manage.entity.RoleMenu;
import com.zc.sys.core.manage.dao.RoleMenuDao;
/**
 * 角色-菜单
 * @author zp
 * @version 2.0.0.0
 * @since 2017年11月09日
 */
@Repository
public class RoleMenuDaoImpl extends BaseDaoImpl<RoleMenu> implements RoleMenuDao {

	/**
	 * 删除角色菜单关联表信息（物理删除）
	 * 
	 * @param roleId 角色ID
	 */
	@Override
	public void deleteByRoleId(long roleId) {
		Query query = em.createNativeQuery("delete from zc_m_role_menu where role_id=?1").setParameter(1, roleId);
		query.executeUpdate();
	}

	/**
	 * 列表
	 * @param model
	 * @return
	 */
	@Override
	public PageDataList<RoleMenu> list(RoleMenuModel model) {
		QueryParam param = QueryParam.getInstance();
//		if(StringUtil.isNotBlank(model.getSearchName())){
//			SearchFilter orFilter2 = new SearchFilter("name", SearchFilter.Operators.LIKE, model.getSearchName().trim());
//			param.addOrFilter(orFilter2);
//		}else {
			if (model.getRole() != null) {
				param.addParam("role.id", model.getRole().getId());
			}
		//}
		param.addOrder(OrderFilter.OrderType.ASC, "id");
		//param.addPage(model.getPageNo(), model.getPageSize());
		return super.findPageList(param);
	}
}