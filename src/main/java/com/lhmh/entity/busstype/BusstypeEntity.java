package com.lhmh.entity.busstype;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;

/**   
 * @Title: Entity
 * @Description: 业务类型
 * @author zhangdaihao
 * @date 2015-06-08 19:42:15
 * @version V1.0   
 *
 */
@Entity
@Table(name = "busstype", schema = "")
@DynamicUpdate(true)
@DynamicInsert(true)
@SuppressWarnings("serial")
public class BusstypeEntity implements java.io.Serializable {
	private BusstypeEntity busstypeEntity;//父菜单
	private List<BusstypeEntity> busstypeEntitys = new ArrayList<BusstypeEntity>();

	/**id*/
	private java.lang.String id;
	/**类型编号*/
	private java.lang.String busstypeId;
	/**类型名称*/
	private java.lang.String busstypeName;
	/**类型级别*/
	private java.lang.Integer busstypeLevel;
	/**保存时间(月)*/
	private java.lang.Integer month;
	/**备注*/
	private java.lang.String note;
	/**父级类型编号*/
	//private java.lang.String parentfunctionid;
	
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
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parentfunctionid")
	public BusstypeEntity getBusstypeEntity() {
		return this.busstypeEntity;
	}

	public void setBusstypeEntity(BusstypeEntity busstypeEntity) {
		this.busstypeEntity = busstypeEntity;
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
	 *@return: java.lang.String  类型编号
	 */
	@Column(name ="BUSSTYPE_ID",nullable=false,length=32)
	public java.lang.String getBusstypeId(){
		return this.id;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  类型编号
	 */
	public void setBusstypeId(java.lang.String id){
		this.busstypeId = id;
	}
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  类型名称
	 */
	@Column(name ="BUSSTYPE_NAME",nullable=false,length=100)
	public java.lang.String getBusstypeName(){
		return this.busstypeName;
	}

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  类型名称
	 */
	public void setBusstypeName(java.lang.String busstypeName){
		this.busstypeName = busstypeName;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  类型级别
	 */
	@Column(name ="BUSSTYPE_LEVEL",nullable=true,precision=5,scale=0)
	public java.lang.Integer getBusstypeLevel(){
		return this.busstypeLevel;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  类型级别
	 */
	public void setBusstypeLevel(java.lang.Integer busstypeLevel){
		this.busstypeLevel = busstypeLevel;
	}
	/**
	 *方法: 取得java.lang.Integer
	 *@return: java.lang.Integer  保存时间(月)
	 */
	@Column(name ="MONTH",nullable=true,precision=10,scale=0)
	public java.lang.Integer getMonth(){
		return this.month;
	}

	/**
	 *方法: 设置java.lang.Integer
	 *@param: java.lang.Integer  保存时间(月)
	 */
	public void setMonth(java.lang.Integer month){
		this.month = month;
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
	/**
	 *方法: 取得java.lang.String
	 *@return: java.lang.String  父级类型编号
	 */
	/*@Column(name ="PARENTFUNCTIONID",nullable=true,length=32)
	public java.lang.String getParentfunctionid(){
		return this.parentfunctionid;
	}*/

	/**
	 *方法: 设置java.lang.String
	 *@param: java.lang.String  父级类型编号
	 */
	/*public void setParentfunctionid(java.lang.String parentfunctionid){
		this.parentfunctionid = parentfunctionid;
	}*/
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "busstypeEntity")
	public List<BusstypeEntity> getBusstypeEntitys() {
		return busstypeEntitys;
	}
	public void setBusstypeEntitys(List<BusstypeEntity> busstypeEntitys) {
		this.busstypeEntitys = busstypeEntitys;
	}
}
