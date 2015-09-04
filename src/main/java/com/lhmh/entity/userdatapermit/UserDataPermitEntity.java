package com.lhmh.entity.userdatapermit;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.SequenceGenerator;

/**   
 * @Title: Entity
 * @Description: 用户数据权限
 * @author zhangdaihao
 * @date 2015-07-10 17:28:41
 * @version V1.0   
 *
 */
@Entity
@Table(name = "T_S_USER_DATAPERMIT", schema = "")
@DynamicUpdate(true)
@DynamicInsert(true)
@SuppressWarnings("serial")
public class UserDataPermitEntity implements java.io.Serializable {
	/**id*/
	private java.lang.String id;
	/**userId*/
	private java.lang.String userId;
	/**datapermitType*/
	private java.lang.String datapermitType;
	/**dataOrgId*/
	private java.lang.String dataOrgId;
	/**dataUserId*/
	private java.lang.String dataUserId;
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  id
	 */
	
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="ID",nullable=false,length=32)
	public java.lang.String getId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  id
	 */
	public void setId(java.lang.String id){
		this.id = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  userId
	 */
	@Column(name ="USER_ID",nullable=true,length=32)
	public java.lang.String getUserId(){
		return this.userId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  userId
	 */
	public void setUserId(java.lang.String userId){
		this.userId = userId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  datapermitType
	 */
	@Column(name ="DATAPERMIT_TYPE",nullable=true,length=1)
	public java.lang.String getDatapermitType(){
		return this.datapermitType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  datapermitType
	 */
	public void setDatapermitType(java.lang.String datapermitType){
		this.datapermitType = datapermitType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  dataOrgId
	 */
	@Column(name ="DATA_ORG_ID",nullable=true,length=32)
	public java.lang.String getDataOrgId(){
		return this.dataOrgId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  dataOrgId
	 */
	public void setDataOrgId(java.lang.String dataOrgId){
		this.dataOrgId = dataOrgId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  dataUserId
	 */
	@Column(name ="DATA_USER_ID",nullable=true,length=32)
	public java.lang.String getDataUserId(){
		return this.dataUserId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  dataUserId
	 */
	public void setDataUserId(java.lang.String dataUserId){
		this.dataUserId = dataUserId;
	}
}
