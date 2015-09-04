package com.lhmh.entity.billproduct;

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
 * @date 2015-06-22 22:34:49
 * @version V1.0   
 *
 */
@Entity
@Table(name = "bill_product", schema = "")
@DynamicUpdate(true)
@DynamicInsert(true)
@SuppressWarnings("serial")
public class BillproductEntity implements java.io.Serializable {
	/**id*/
	private java.lang.String id;
	/**billId*/
	private java.lang.String billId;
	/**productId*/
	private java.lang.String productId;
	/**billNum*/
	private java.lang.String billNum;
	/**puhCard*/
	private java.lang.String puhCard;
	/**qty*/
	private BigDecimal qty;
	/**price*/
	private BigDecimal price;
	/**amt*/
	private BigDecimal amt;
	/**status*/
	private java.lang.String status;
	/**note*/
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
	 *@return: java.lang.String  productId
	 */
	@Column(name ="PRODUCT_ID",nullable=false,length=32)
	public java.lang.String getProductId(){
		return this.productId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  productId
	 */
	public void setProductId(java.lang.String productId){
		this.productId = productId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  billNum
	 */
	@Column(name ="BILL_NUM",nullable=true,length=100)
	public java.lang.String getBillNum(){
		return this.billNum;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  billNum
	 */
	public void setBillNum(java.lang.String billNum){
		this.billNum = billNum;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  puhCard
	 */
	@Column(name ="PUH_CARD",nullable=true,length=50)
	public java.lang.String getPuhCard(){
		return this.puhCard;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  puhCard
	 */
	public void setPuhCard(java.lang.String puhCard){
		this.puhCard = puhCard;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  qty
	 */
	@Column(name ="QTY",nullable=true,precision=22,scale=0)
	public BigDecimal getQty(){
		return this.qty;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  qty
	 */
	public void setQty(BigDecimal qty){
		this.qty = qty;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  price
	 */
	@Column(name ="PRICE",nullable=true,precision=14,scale=2)
	public BigDecimal getPrice(){
		return this.price;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  price
	 */
	public void setPrice(BigDecimal price){
		this.price = price;
	}
	/**
	 *方法: 取得BigDecimal
	 *@return: BigDecimal  amt
	 */
	@Column(name ="AMT",nullable=true,precision=22,scale=2)
	public BigDecimal getAmt(){
		return this.amt;
	}

	/**
	 *方法: 设置BigDecimal
	 *@param: BigDecimal  amt
	 */
	public void setAmt(BigDecimal amt){
		this.amt = amt;
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
	 *@return: java.lang.String  note
	 */
	@Column(name ="NOTE",nullable=true,length=200)
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
}
