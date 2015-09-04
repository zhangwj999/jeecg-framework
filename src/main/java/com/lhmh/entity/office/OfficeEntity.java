package com.lhmh.entity.office;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.SequenceGenerator;

/**   
 * @Title: Entity
 * @Description: 理财室
 * @author zhangdaihao
 * @date 2015-06-07 14:54:33
 * @version V1.0   
 *
 */
@Entity
@Table(name = "office", schema = "")
@SuppressWarnings("serial")
public class OfficeEntity implements java.io.Serializable {

	/**id*/
	private java.lang.String id;
	/**理财室编号*/
	private java.lang.String officeId;
	/**理财室名称*/
	private java.lang.String officeeName;
	/**银行编号*/
	private java.lang.String bankId;
	/**采集终端编号*/
	private java.lang.String terminalId;
	/**联系人*/
	private java.lang.String contacts;
	/**联系电话*/
	private java.lang.String tel;
	/**是否启用*/
	private java.lang.String status;
	
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
	 *@return: java.lang.String  理财室编号
	 */
	@Column(name ="OFFICE_ID",nullable=false,length=32)
	public java.lang.String getOfficeId(){
		return this.officeId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  理财室编号
	 */
	public void setOfficeId(java.lang.String officeId){
		this.officeId = officeId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  理财室名称
	 */
	@Column(name ="OFFICEE_NAME",nullable=false,length=50)
	public java.lang.String getOfficeeName(){
		return this.officeeName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  理财室名称
	 */
	public void setOfficeeName(java.lang.String officeeName){
		this.officeeName = officeeName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  银行编号
	 */
	@Column(name ="BANK_ID",nullable=true,length=32)
	public java.lang.String getBankId(){
		return this.bankId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  银行编号
	 */
	public void setBankId(java.lang.String bankId){
		this.bankId = bankId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  采集终端编号
	 */
	@Column(name ="TERMINAL_ID",nullable=false,length=32)
	public java.lang.String getTerminalId(){
		return this.terminalId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  采集终端编号
	 */
	public void setTerminalId(java.lang.String terminalId){
		this.terminalId = terminalId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  联系人
	 */
	@Column(name ="CONTACTS",nullable=true,length=50)
	public java.lang.String getContacts(){
		return this.contacts;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  联系人
	 */
	public void setContacts(java.lang.String contacts){
		this.contacts = contacts;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  联系电话
	 */
	@Column(name ="TEL",nullable=true,length=50)
	public java.lang.String getTel(){
		return this.tel;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  联系电话
	 */
	public void setTel(java.lang.String tel){
		this.tel = tel;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  是否启用
	 */
	@Column(name ="STATUS",nullable=false,length=2)
	public java.lang.String getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  是否启用
	 */
	public void setStatus(java.lang.String status){
		this.status = status;
	}
}
