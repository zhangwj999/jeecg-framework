package com.lhmh.entity.bussproduct;

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
 * @Description: 产品类型
 * @author zhangdaihao
 * @date 2015-06-05 21:27:24
 * @version V1.0   
 *
 */
@Entity
@Table(name = "bussproduct", schema = "")
@DynamicUpdate(true)
@DynamicInsert(true)
@SuppressWarnings("serial")
public class BussproductEntity implements java.io.Serializable {
	/**id*/
	private java.lang.String id;
	/**产品编号*/
	private java.lang.String productId;
	/**产品名称*/
	private java.lang.String productName;
	/**业务类型编号*/
	private java.lang.String busstypeId;
	/**风险级别*/
	private java.lang.String riskName;
	/**所属单位*/
	private java.lang.String comName;
	/**产品到期日*/
	private java.lang.String dueData;
	/**价格*/
	private BigDecimal price;
	/**备注*/
	private java.lang.String note;
	
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
	 *@return: java.lang.String  产品编号
	 */
	@Column(name ="PRODUCT_ID",nullable=false,length=32)
	public java.lang.String getProductId(){
		return this.productId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  产品编号
	 */
	public void setProductId(java.lang.String productId){
		this.productId = productId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  产品名称
	 */
	@Column(name ="PRODUCT_NAME",nullable=false,length=100)
	public java.lang.String getProductName(){
		return this.productName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  产品名称
	 */
	public void setProductName(java.lang.String productName){
		this.productName = productName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  业务类型编号
	 */
	@Column(name ="BUSSTYPE_ID",nullable=false,length=32)
	public java.lang.String getBusstypeId(){
		return this.busstypeId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  业务类型编号
	 */
	public void setBusstypeId(java.lang.String busstypeId){
		this.busstypeId = busstypeId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  风险级别
	 */
	@Column(name ="RISK_NAME",nullable=true,length=32)
	public java.lang.String getRiskName(){
		return this.riskName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  风险级别
	 */
	public void setRiskName(java.lang.String riskName){
		this.riskName = riskName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  所属单位
	 */
	@Column(name ="COM_NAME",nullable=true,length=100)
	public java.lang.String getComName(){
		return this.comName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  所属单位
	 */
	public void setComName(java.lang.String comName){
		this.comName = comName;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  产品到期日
	 */
	@Column(name ="DUE_DATA",nullable=true,length=8)
	public java.lang.String getDueData(){
		return this.dueData;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  产品到期日
	 */
	public void setDueData(java.lang.String dueData){
		this.dueData = dueData;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  价格
	 */
	@Column(name ="PRICE",nullable=true,precision=14,scale=2)
	public BigDecimal getPrice(){
		return this.price;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  价格
	 */
	public void setPrice(BigDecimal price){
		this.price = price;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  备注
	 */
	@Column(name ="NOTE",nullable=true,length=100)
	public java.lang.String getNote(){
		return this.note;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  备注
	 */
	public void setNote(java.lang.String note){
		this.note = note;
	}
}
