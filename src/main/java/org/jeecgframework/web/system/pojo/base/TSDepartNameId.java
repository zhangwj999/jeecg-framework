package org.jeecgframework.web.system.pojo.base;

/**
 * 部门机构表
 * @author  张代浩
 */
public class TSDepartNameId{
	private String departname;//部门名称
	private String id;//部门ID
	TSDepartNameId(String id,String departname){
		this.id=id;
		this.departname=departname;
	}
	public String getDepartname() {
		return departname;
	}
	public void setDepartname(String departname) {
		this.departname = departname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}