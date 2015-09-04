package org.jeecgframework.web.system.pojo.base;

import java.util.ArrayList;
import java.util.List;

import com.lhmh.entity.userdatapermit.UserDataPermitEntity;

/**   
 * @Title: Entity
 * @Description: 用户权限修改
 * @author zhangdaihao
 * @date 2015-06-26 08:19:30
 * @version V1.0   
 *
 */
@SuppressWarnings("serial")
public class UserMainPage implements java.io.Serializable {
	/**保存-产品明细*/
	private List<UserDataPermitEntity> userDataPermitList = new ArrayList<UserDataPermitEntity>();
	public List<UserDataPermitEntity> getUserDataPermitList() {
		return userDataPermitList;
	}
	public void setUserDataPermitList(List<UserDataPermitEntity> userDataPermitList) {
		this.userDataPermitList = userDataPermitList;
	}



}
