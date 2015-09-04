package com.lhmh.entity.terminal;

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
 * @Description: 采集终端管理
 * @author zhangdaihao
 * @date 2015-06-05 20:45:44
 * @version V1.0   
 *
 */
@Entity
@Table(name = "terminal", schema = "")
@DynamicUpdate(true)
@DynamicInsert(true)
@SuppressWarnings("serial")
public class TerminalEntity implements java.io.Serializable {
	/**id*/
	private java.lang.String id;
	/**终端编号*/
	private java.lang.String terminalId;
	/**终端名称*/
	private java.lang.String terminalName;
	/**终端IP*/
	private java.lang.String terminalIp;
	/**终端端口*/
	private java.lang.String terminalPort;
	/**银行网点*/
	private java.lang.String bankId;
	/**存储设备编号*/
	private java.lang.String storageId;
	/**是否启用*/
	private java.lang.String status;
	/**上传开始时间*/
	private java.util.Date uploadTime;
	/**预录像时间*/
	private java.lang.Integer preTime;
	/**录像延迟时间*/
	private java.lang.Integer delayTime;
	/**上传结束时间*/
	private java.util.Date timeEnd;
	private java.lang.String empId;
	private java.lang.String empName;
	private java.lang.String isNormal;
	

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
	 *@return: java.lang.String  终端编号
	 */
	@Column(name ="TERMINAL_ID",nullable=false,length=32)
	public java.lang.String getTerminalId(){
		return this.terminalId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  终端编号
	 */
	public void setTerminalId(java.lang.String terminalId){
		this.terminalId = terminalId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  终端名称
	 */
	@Column(name ="TERMINAL_NAME",nullable=false,length=50)
	public java.lang.String getTerminalName(){
		return this.terminalName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  终端名称
	 */
	public void setTerminalName(java.lang.String terminalName){
		this.terminalName = terminalName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  终端IP
	 */
	@Column(name ="TERMINAL_IP",nullable=false,length=25)
	public java.lang.String getTerminalIp(){
		return this.terminalIp;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  终端IP
	 */
	public void setTerminalIp(java.lang.String terminalIp){
		this.terminalIp = terminalIp;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  终端端口
	 */
	@Column(name ="TERMINAL_PORT",nullable=true,length=10)
	public java.lang.String getTerminalPort(){
		return this.terminalPort;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  终端端口
	 */
	public void setTerminalPort(java.lang.String terminalPort){
		this.terminalPort = terminalPort;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  银行网点
	 */
	@Column(name ="BANK_ID",nullable=true,length=32)
	public java.lang.String getBankId(){
		return this.bankId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  银行网点
	 */
	public void setBankId(java.lang.String bankId){
		this.bankId = bankId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  存储设备编号
	 */
	@Column(name ="STORAGE_ID",nullable=true,length=32)
	public java.lang.String getStorageId(){
		return this.storageId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  存储设备编号
	 */
	public void setStorageId(java.lang.String storageId){
		this.storageId = storageId;
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
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  上传开始时间
	 */
	@Column(name ="UPLOAD_TIME",nullable=false)
	public java.util.Date getUploadTime(){
		return this.uploadTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  上传开始时间
	 */
	public void setUploadTime(java.util.Date uploadTime){
		this.uploadTime = uploadTime;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  预录像时间
	 */
	@Column(name ="PRE_TIME",nullable=false,precision=10,scale=0)
	public java.lang.Integer getPreTime(){
		return this.preTime;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  预录像时间
	 */
	public void setPreTime(java.lang.Integer preTime){
		this.preTime = preTime;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  录像延迟时间
	 */
	@Column(name ="DELAY_TIME",nullable=false,precision=10,scale=0)
	public java.lang.Integer getDelayTime(){
		return this.delayTime;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  录像延迟时间
	 */
	public void setDelayTime(java.lang.Integer delayTime){
		this.delayTime = delayTime;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  上传结束时间
	 */
	@Column(name ="TIME_END",nullable=false)
	public java.util.Date getTimeEnd(){
		return this.timeEnd;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  上传结束时间
	 */
	public void setTimeEnd(java.util.Date timeEnd){
		this.timeEnd = timeEnd;
	}
	
	@Column(name ="EMP_ID",nullable=false,length=2)
	public java.lang.String getEmpId(){
		return this.empId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  status
	 */
	public void setEmpId(java.lang.String empId){
		this.empId = empId;
	}
	
	@Column(name ="IS_NORMAL",nullable=false,length=1)
	public java.lang.String getIsNormal(){
		return this.isNormal;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  status
	 */
	public void setIsNormal(java.lang.String isNormal){
		this.isNormal = isNormal;
	}
	@Column(name ="EMP_NAME",nullable=false,length=255)
	public java.lang.String getEmpName(){
		return this.empName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  status
	 */
	public void setEmpName(java.lang.String empName){
		this.empName = empName;
	}
}
