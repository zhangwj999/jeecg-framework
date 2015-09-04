package com.lhmh.financialbusinessmanagement.financialregistration.entity;

import java.util.ArrayList;
import java.util.List;

/**   
 * @Title: Entity
 * @Description: 业务登记
 * @author zhangdaihao
 * @date 2015-06-26 08:19:30
 * @version V1.0   
 *
 */
@SuppressWarnings("serial")
public class BillMainPage implements java.io.Serializable {
	/**保存-产品明细*/
	private List<BillProductEntity> billProductList = new ArrayList<BillProductEntity>();
	public List<BillProductEntity> getBillProductList() {
		return billProductList;
	}
	public void setBillProductList(List<BillProductEntity> billProductList) {
		this.billProductList = billProductList;
	}



}
