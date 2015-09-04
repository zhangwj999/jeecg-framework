package com.lhmh.entity.warncenter;

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
 * @Description: 报警中心
 * @author zhangdaihao
 * @date 2015-06-09 21:45:23
 * @version V1.0   
 *
 */
@Entity
@Table(name = "warn_center", schema = "")
@DynamicUpdate(true)
@DynamicInsert(true)
@SuppressWarnings("serial")
public class WarncenterEntity implements java.io.Serializable {
	/**id*/
	private java.lang.String id;
	/**流水号*/
	private java.lang.String warnId;
	/**报警日期*/
	private java.lang.String warnDate;
	/**报警时间*/
	private java.util.Date warnTime;
	/**报警类型*/
	private java.lang.String warnType;
	/**报警内容*/
	private java.lang.String warnCon;
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
	 *@return: java.lang.String  流水号
	 */
	@Column(name ="WARN_ID",nullable=false,length=32)
	public java.lang.String getWarnId(){
		return this.warnId;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  流水号
	 */
	public void setWarnId(java.lang.String warnId){
		this.warnId = warnId;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  报警日期
	 */
	@Column(name ="WARN_DATE",nullable=true,length=255)
	public java.lang.String getWarnDate(){
		return this.warnDate;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  报警日期
	 */
	public void setWarnDate(java.lang.String warnDate){
		this.warnDate = warnDate;
	}
	/**
	 *方法: 取得java.util.Date
	 *@return: java.util.Date  报警时间
	 */
	@Column(name ="WARN_TIME",nullable=true)
	public java.util.Date getWarnTime(){
		return this.warnTime;
	}

	/**
	 *方法: 设置java.util.Date
	 *@param: java.util.Date  报警时间
	 */
	public void setWarnTime(java.util.Date warnTime){
		this.warnTime = warnTime;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  报警类型
	 */
	@Column(name ="WARN_TYPE",nullable=false,length=50)
	public java.lang.String getWarnType(){
		return this.warnType;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  报警类型
	 */
	public void setWarnType(java.lang.String warnType){
		this.warnType = warnType;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  报警内容
	 */
	@Column(name ="WARN_CON",nullable=false,length=200)
	public java.lang.String getWarnCon(){
		return this.warnCon;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  报警内容
	 */
	public void setWarnCon(java.lang.String warnCon){
		this.warnCon = warnCon;
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
