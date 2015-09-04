package com.lhmh.entity.billdetail;

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
 * @Description: 账单明细
 * @author zhangdaihao
 * @date 2015-07-11 16:27:14
 * @version V1.0   
 *
 */
@Entity
@Table(name = "bill_detail", schema = "")
@DynamicUpdate(true)
@DynamicInsert(true)
@SuppressWarnings("serial")
public class BillDetailEntity implements java.io.Serializable {
	/**id*/
	private java.lang.String id;
	/**billId*/
	private java.lang.String billId;
	/**channelId*/
	private java.lang.String channelId;
	/**fileUrl*/
	private java.lang.String fileUrl;
	/**fileName*/
	private java.lang.String fileName;
	/**beginTime*/
	private java.util.Date beginTime;
	/**endTime*/
	private java.util.Date endTime;
	/**status*/
	private java.lang.String status;
	/**文件上传百分比%*/
	private java.lang.Integer fileRate;
	/**isDel*/
	private java.lang.String isDel;
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
	 *@return: java.lang.String  channelId
	 */
	@Column(name ="CHANNEL_ID",nullable=false,length=32)
	public java.lang.String getChannelId(){
		return this.channelId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  channelId
	 */
	public void setChannelId(java.lang.String channelId){
		this.channelId = channelId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  fileUrl
	 */
	@Column(name ="FILE_URL",nullable=true,length=250)
	public java.lang.String getFileUrl(){
		return this.fileUrl;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  fileUrl
	 */
	public void setFileUrl(java.lang.String fileUrl){
		this.fileUrl = fileUrl;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  fileName
	 */
	@Column(name ="FILE_NAME",nullable=true,length=100)
	public java.lang.String getFileName(){
		return this.fileName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  fileName
	 */
	public void setFileName(java.lang.String fileName){
		this.fileName = fileName;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  beginTime
	 */
	@Column(name ="BEGIN_TIME",nullable=true)
	public java.util.Date getBeginTime(){
		return this.beginTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  beginTime
	 */
	public void setBeginTime(java.util.Date beginTime){
		this.beginTime = beginTime;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  endTime
	 */
	@Column(name ="END_TIME",nullable=true)
	public java.util.Date getEndTime(){
		return this.endTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  endTime
	 */
	public void setEndTime(java.util.Date endTime){
		this.endTime = endTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  status
	 */
	@Column(name ="STATUS",nullable=true,length=100)
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
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  文件上传百分比%
	 */
	@Column(name ="FILE_RATE",nullable=true,precision=10,scale=0)
	public java.lang.Integer getFileRate(){
		return this.fileRate;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  文件上传百分比%
	 */
	public void setFileRate(java.lang.Integer fileRate){
		this.fileRate = fileRate;
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
}
