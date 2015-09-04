package com.lhmh.entity.cust;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

/**   
 * @Title: Entity
 * @Description: 客户信息管理
 * @author zhangdaihao
 * @date 2015-06-03 11:03:53
 * @version V1.0   
 *
 */
@Entity
@Table(name = "cust", schema = "")
@DynamicUpdate(true)
@DynamicInsert(true)
@SuppressWarnings("serial")
public class CustEntity implements java.io.Serializable {
	/**id*/
	private java.lang.String id;
	/**custId*/
	private java.lang.String custId;
	/**custName*/
	private java.lang.String custName;
	/**证件类型*/
	private java.lang.String passType;
	/**passId*/
	private java.lang.String passId;
	/**age*/
	private java.lang.String age;
	/**sex*/
	private java.lang.String sex;
	/**tel*/
	private java.lang.String tel;
	/**note*/
	private java.lang.String note;
	/**userName*/
	private java.lang.String userName;


	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  id
	 */
	
	@Id
	@GeneratedValue(generator = "paymentableGenerator")
	@GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
	@Column(name ="ID",nullable=true,length=32)
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
	 *@return: java.lang.String  custId
	 */
	@Column(name ="CUST_ID",nullable=false,length=32)
	public java.lang.String getCustId(){
		return this.custId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  custId
	 */
	public void setCustId(java.lang.String custId){
		this.custId = custId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  custName
	 */
	@Column(name ="CUST_NAME",nullable=false,length=50)
	public java.lang.String getCustName(){
		return this.custName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  custName
	 */
	public void setCustName(java.lang.String custName){
		this.custName = custName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  证件类型
	 */
	@Column(name ="PASS_TYPE",nullable=true,length=18)
	public java.lang.String getPassType(){
		return this.passType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  证件类型
	 */
	public void setPassType(java.lang.String passType){
		this.passType = passType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  passId
	 */
	@Column(name ="PASS_ID",nullable=true,length=18)
	public java.lang.String getPassId(){
		return this.passId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  passId
	 */
	public void setPassId(java.lang.String passId){
		this.passId = passId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  age
	 */
	@Column(name ="AGE",nullable=true,length=25)
	public java.lang.String getAge(){
		return this.age;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  age
	 */
	public void setAge(java.lang.String age){
		this.age = age;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  sex
	 */
	@Column(name ="SEX",nullable=true,length=2)
	public java.lang.String getSex(){
		return this.sex;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  sex
	 */
	public void setSex(java.lang.String sex){
		this.sex = sex;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  tel
	 */
	@Column(name ="TEL",nullable=true,length=50)
	public java.lang.String getTel(){
		return this.tel;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  tel
	 */
	public void setTel(java.lang.String tel){
		this.tel = tel;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  note
	 */
	@Column(name ="NOTE",nullable=true,length=50)
	public java.lang.String getNote(){
		return this.note;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  note
	 */
	public void setNote(java.lang.String note){
		this.note = note;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  note
	 */
	@Column(name ="USER_NAME",nullable=true,length=50)
	public java.lang.String getUserName() {
		return userName;
	}

	public void setUserName(java.lang.String userName) {
		this.userName = userName;
	}
}
