package com.lhmh.page.office;

import java.util.ArrayList;
import java.util.List;

import com.lhmh.entity.office.OfficeChannelEntity;

/**   
 * @Title: Entity
 * @Description: 订单信息 VO
 * @author 张代浩
 * @date 2013-03-19 22:01:34
 * @version V1.0   
 *
 */
@SuppressWarnings("serial")
public class OfficePage implements java.io.Serializable {
	/**订单客户明细*/
	private List<OfficeChannelEntity> officeChannelList = new ArrayList<OfficeChannelEntity>();
	public List<OfficeChannelEntity> getOfficeChannelList() {
		return officeChannelList;
	}
	public void setOfficeChannelList(List<OfficeChannelEntity> officeChannelList) {
		this.officeChannelList = officeChannelList;
	}

}
