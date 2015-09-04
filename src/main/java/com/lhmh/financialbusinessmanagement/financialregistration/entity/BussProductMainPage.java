package com.lhmh.financialbusinessmanagement.financialregistration.entity;

import java.util.ArrayList;
import java.util.List;

import com.lhmh.entity.bussproduct.BussproductEntity;

/**   
 * @Title: Entity
 * @Description: 订单信息 VO
 * @author 张代浩
 * @date 2013-03-19 22:01:34
 * @version V1.0   
 *
 */
@SuppressWarnings("serial")
public class BussProductMainPage implements java.io.Serializable {
	/**订单客户明细*/
	private List<BussproductEntity> bussproductEntityList = new ArrayList<BussproductEntity>();

	public List<BussproductEntity> getBussproductEntityList() {
		return bussproductEntityList;
	}

	public void setBussproductEntityList(
			List<BussproductEntity> bussproductEntityList) {
		this.bussproductEntityList = bussproductEntityList;
	}


	
	
}
