package com.lhmh.financialbusinessmanagement.financialregistration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.jeecgframework.core.common.entity.IdEntity;

/**   
 * @Title: Entity
 * @Description: asdadfa
 * @author zhangdaihao
 * @date 2015-06-02 11:16:35
 * @version V1.0   
 *
 */
@Entity
@Table(name = "bill", schema = "")
@DynamicUpdate(true)
@DynamicInsert(true)
@SuppressWarnings("serial")
public class BillEntity extends IdEntity implements java.io.Serializable {
	/**billId*/
	private java.lang.String billId;
	/**officeId*/
	private java.lang.String officeId;
	/**userId*/
	private java.lang.String userId;
	/**userName*/
	private java.lang.String userName;
	/**crtDate*/
	private java.lang.String crtDate;
	/**custId*/
	private java.lang.String custId;
	/**custName*/
	private java.lang.String custName;
	/**billType*/
	private java.lang.String billType;
	/**bankId*/
	private java.lang.String bankId;
	/**storageId*/
	private java.lang.String storageId;
	/**terminalId*/
	private java.lang.String terminalId;
	/**signStatus*/
	private java.lang.String signStatus;
	/**beginTime*/
	private java.lang.String beginTime;
	/**endTime*/
	private java.lang.String endTime;
	/**status*/
	private java.lang.String status;
	/**bStatus*/
	private java.lang.String bStatus;
	/**fileCount*/
	private java.lang.Integer fileCount;
	/**note*/
	private java.lang.String note;
	/**isDel*/
	private java.lang.String isDel;
	

	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  billId
	 */
	@Column(name ="BILL_ID",nullable=false,length=32)
	public java.lang.String getBillId(){
		return this.billId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  billId
	 */
	public void setBillId(java.lang.String billId){
		this.billId = billId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  officeId
	 */
	@Column(name ="OFFICE_ID",nullable=false,length=32)
	public java.lang.String getOfficeId(){
		return this.officeId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  officeId
	 */
	public void setOfficeId(java.lang.String officeId){
		this.officeId = officeId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  userId
	 */
	@Column(name ="USER_ID",nullable=false,length=32)
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
	 *@return: java.lang.String  userName
	 */
	@Column(name ="USER_NAME",nullable=true,length=32)
	public java.lang.String getUserName(){
		return this.userName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  userName
	 */
	public void setUserName(java.lang.String userName){
		this.userName = userName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  crtDate
	 */
	@Column(name ="CRT_DATE",nullable=false,length=50)
	public java.lang.String getCrtDate(){
		return this.crtDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  crtDate
	 */
	public void setCrtDate(java.lang.String crtDate){
		this.crtDate = crtDate;
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
	 *@return: java.lang.String  billType
	 */
	@Column(name ="BILL_TYPE",nullable=false,length=8)
	public java.lang.String getBillType(){
		return this.billType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  billType
	 */
	public void setBillType(java.lang.String billType){
		this.billType = billType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  bankId
	 */
	@Column(name ="BANK_ID",nullable=false,length=32)
	public java.lang.String getBankId(){
		return this.bankId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  bankId
	 */
	public void setBankId(java.lang.String bankId){
		this.bankId = bankId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  storageId
	 */
	@Column(name ="STORAGE_ID",nullable=false,length=32)
	public java.lang.String getStorageId(){
		return this.storageId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  storageId
	 */
	public void setStorageId(java.lang.String storageId){
		this.storageId = storageId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  terminalId
	 */
	@Column(name ="TERMINAL_ID",nullable=false,length=32)
	public java.lang.String getTerminalId(){
		return this.terminalId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  terminalId
	 */
	public void setTerminalId(java.lang.String terminalId){
		this.terminalId = terminalId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  signStatus
	 */
	@Column(name ="SIGN_STATUS",nullable=false,length=8)
	public java.lang.String getSignStatus(){
		return this.signStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  signStatus
	 */
	public void setSignStatus(java.lang.String signStatus){
		this.signStatus = signStatus;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  beginTime
	 */
	@Column(name ="BEGIN_TIME",nullable=true)
	public java.lang.String getBeginTime(){
		return this.beginTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  beginTime
	 */
	public void setBeginTime(String beginTime){
		this.beginTime = beginTime;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  endTime
	 */
	@Column(name ="END_TIME",nullable=true)
	public java.lang.String getEndTime(){
		return this.endTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  endTime
	 */
	public void setEndTime(String endTime){
		this.endTime = endTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  status
	 */
	@Column(name ="STATUS",nullable=true,length=1)
	public java.lang.String getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  status
	 */
	public void setStatus(java.lang.String status){
		this.status = status;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  bStatus
	 */
	@Column(name ="B_STATUS",nullable=true,length=1)
	public java.lang.String getBStatus(){
		return this.bStatus;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  bStatus
	 */
	public void setBStatus(java.lang.String bStatus){
		this.bStatus = bStatus;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  fileCount
	 */
	@Column(name ="FILE_COUNT",nullable=true,precision=10,scale=0)
	public java.lang.Integer getFileCount(){
		return this.fileCount;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  fileCount
	 */
	public void setFileCount(java.lang.Integer fileCount){
		this.fileCount = fileCount;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  note
	 */
	@Column(name ="NOTE",nullable=true,length=100)
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
	 *@return: java.lang.String  isDel
	 */
	@Column(name ="IS_DEL",nullable=true,length=1)
	public java.lang.String getIsDel(){
		return this.isDel;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  isDel
	 */
	public void setIsDel(java.lang.String isDel){
		this.isDel = isDel;
	}
	
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  custName
	 */
	@Column(name ="CUST_NAME",nullable=false,length=50)
	public java.lang.String getCustName() {
		return custName;
	}

	public void setCustName(java.lang.String custName) {
		this.custName = custName;
	}
}
