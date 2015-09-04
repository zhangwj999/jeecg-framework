package com.lhmh.entity.storage;

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
 * @Description: 存储设备管理
 * @author zhangdaihao
 * @date 2015-06-01 21:02:23
 * @version V1.0   
 *
 */
@Entity
@Table(name = "storage", schema = "")
@DynamicUpdate(true)
@DynamicInsert(true)
@SuppressWarnings("serial")
public class StorageEntity implements java.io.Serializable {
	/**id*/
	private java.lang.String id;
	/**storageId*/
	private java.lang.String storageId;
	/**storageName*/
	private java.lang.String storageName;
	/**storageIp*/
	private java.lang.String storageIp;
	/**storagePort*/
	private java.lang.String storagePort;
	/**dataPort*/
	private java.lang.String dataPort;
	/**bankId*/
	private java.lang.String bankId;
	/**space*/
	private BigDecimal space;
	/**spaceMin*/
	private BigDecimal spaceMin;
	private BigDecimal spaceUsed;
	private BigDecimal spaceUn;
	/**status*/
	private java.lang.String status;
	private java.lang.String empId;
	private java.lang.String empName;
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
	 *@return: java.lang.String  storageName
	 */
	@Column(name ="STORAGE_NAME",nullable=false,length=50)
	public java.lang.String getStorageName(){
		return this.storageName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  storageName
	 */
	public void setStorageName(java.lang.String storageName){
		this.storageName = storageName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  storageIp
	 */
	@Column(name ="STORAGE_IP",nullable=false,length=25)
	public java.lang.String getStorageIp(){
		return this.storageIp;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  storageIp
	 */
	public void setStorageIp(java.lang.String storageIp){
		this.storageIp = storageIp;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  storagePort
	 */
	@Column(name ="STORAGE_PORT",nullable=true,length=10)
	public java.lang.String getStoragePort(){
		return this.storagePort;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  storagePort
	 */
	public void setStoragePort(java.lang.String storagePort){
		this.storagePort = storagePort;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  dataPort
	 */
	@Column(name ="DATA_PORT",nullable=true,length=10)
	public java.lang.String getDataPort(){
		return this.dataPort;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  dataPort
	 */
	public void setDataPort(java.lang.String dataPort){
		this.dataPort = dataPort;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  bankId
	 */
	@Column(name ="BANK_ID",nullable=true,length=32)
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
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  space
	 */
	@Column(name ="SPACE",nullable=false,precision=14,scale=0)
	public BigDecimal getSpace(){
		return this.space;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  space
	 */
	public void setSpace(BigDecimal space){
		this.space = space;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  spaceMin
	 */
	@Column(name ="SPACE_MIN",nullable=true,precision=14,scale=0)
	public BigDecimal getSpaceMin(){
		return this.spaceMin;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  spaceMin
	 */
	public void setSpaceMin(BigDecimal spaceMin){
		this.spaceMin = spaceMin;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  status
	 */
	@Column(name ="STATUS",nullable=false,length=2)
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
	
	
	@Column(name ="SPACE_USED",nullable=true,precision=14,scale=0)
	public BigDecimal getSpaceUsed(){
		return this.spaceUsed;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  spaceMin
	 */
	public void setSpaceUsed(BigDecimal spaceUsed){
		this.spaceUsed = spaceUsed;
	}
	@Column(name ="SPACE_UN",nullable=true,precision=14,scale=0)
	public BigDecimal getSpaceUn(){
		return this.spaceUn;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  spaceMin
	 */
	public void setSpaceUn(BigDecimal spaceUn){
		this.spaceUn = spaceUn;
	}
	
	@Column(name ="EMP_ID",nullable=false,length=255)
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
