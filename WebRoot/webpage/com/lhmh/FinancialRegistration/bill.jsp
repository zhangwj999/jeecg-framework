<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>asdadfa</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
 <script type="text/javascript">
  //初始化下标
	function resetTrNum(tableId) {
		$tbody = $("#"+tableId+"");
		$tbody.find('>tr').each(function(i){
			$(':input, select', this).each(function(){
				var $this = $(this), name = $this.attr('name'), val = $this.val();
				if(name!=null){
					if (name.indexOf("#index#") >= 0){
						$this.attr("name",name.replace('#index#',i));
					}else{
						var s = name.indexOf("[");
						var e = name.indexOf("]");
						var new_name = name.substring(s+1,e);
						$this.attr("name",name.replace(new_name,i));
					}
				}
			});
		});
	}
 </script>
 <body style="overflow-y: hidden" scroll="no">

  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" tiptype="1" action="billController.do?save">
	<input id="id" name="id" type="hidden" value="${billPage.id }">
	<table cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right"><label class="Validform_label"> 业务流水号: </label></td>
			<td class="value"><input class="inputxt" id="billId" name="billId" 
					   value="${billPage.billId}" datatype="*"></td>
			<td align="right"><label class="Validform_label"> 理财室: </label></td>
			<td class="value"> <input class="inputxt" id="officeId" name="officeId" 
					   value="${billPage.officeId}" datatype="*"></td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label">用户编号: </label></td>
			<td class="value"><%--						<input class="inputxt" id="usertype" name="usertype" --%> <%--							   value="${jeecgOrderMainPage.usertype}">--%> <t:dictSelect field="usertype"
				typeGroupCode="custom" hasLabel="false" defaultVal="${jeecgOrderMainPage.usertype}"></t:dictSelect></td>
			<td align="right"><label class="Validform_label"> 员工姓名:  </label></td>
			<td class="value"><input nullmsg="联系人不能为空" errormsg="联系人格式不对" class="inputxt" id="goContactName" name="goContactName" value="${jeecgOrderMainPage.goContactName}" datatype="*"></td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> 理财日期:</label></td>
			<td class="value"> <input class="inputxt" id="crtDate" name="crtDate" 
					   value="${billPage.crtDate}" datatype="*"></td>
			<td align="right"><label class="Validform_label"> 客户编号: </label></td>
			<td class="value"> <input class="inputxt" id="custId" name="custId" 
					   value="${billPage.custId}" datatype="*"></td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> 业务类型: </label></td>
			<td class="value">
					<input name="billType"  type="hidden" value="${billType}" id="billType"> 
		<input name="busstypeName" class="inputxt" value="${busstypeName }" id="busstypeName"
				readonly="readonly" datatype="*" />
		 <t:choose hiddenName="billType" hiddenid="busstypeId" url="busstypeController.do?busstypeHelp" name="functionList" icon="icon-search" title="业务类型列表" textname="busstypeName" isclear="true"></t:choose>
		      <span class="Validform_checktip"></span>	
			</td>
			<td align="right"><label class="Validform_label"> 银行编号: </label></td>
			<td class="value"> <input class="inputxt" id="bankId" name="bankId" 
					   value="${billPage.bankId}" datatype="*"></td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> 存储设备编号: </label></td>
			<td class="value"><input class="inputxt" id="storageId" name="storageId" 
					   value="${billPage.storageId}" datatype="*"></td>
			<td align="right"><label class="Validform_label"> 采集终端编号: </label></td>
			<td class="value"> <input class="inputxt" id="terminalId" name="terminalId" 
					   value="${billPage.terminalId}" datatype="*"></td>
		</tr>
		<tr>
			<td align="right"><label class="Validform_label"> 开始时间: </label></td>
			<td class="value"><input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="beginTime" name="beginTime" ignore="ignore"
					     value="<fmt:formatDate value='${billPage.beginTime}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>"></td>
			<td align="right"><label class="Validform_label"> 结束时间: </label></td>
			<td class="value">		      <input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="endTime" name="endTime" ignore="ignore"
					     value="<fmt:formatDate value='${billPage.endTime}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>"></td>
		</tr>
		<tr>
		<td align="right"><label class="Validform_label"> 签约状态: </label></td>
			<td class="value"> <t:dictSelect field="signStatus" typeGroupCode="signstatus"
		defaultVal="default" hasLabel="false" title="性别(没有label)"></t:dictSelect></td>
			<td align="right"><label class="Validform_label"> 备注: </label></td>
			<td class="value" colspan="3"><input class="inputxt" id="note" name="note" ignore="ignore"
					   value="${billPage.note}"></td>
		</tr>
	</table>
 	<div style="width: auto; height: 200px;">
	<div style="width: 690px; height: 1px;"></div>
	<t:tabs id="tt" iframe="false" tabPosition="top" fit="false">
		<t:tab href="bussproductController.do?finBussproductList&goOrderCode=${billPage.billId}" icon="icon-search" title="产品明细" id="Product"></t:tab>
		
	</t:tabs></div> 
</t:formvalid>
  <!-- 添加 产品明细 模版 -->
<!-- 添加 产品明细 模版 -->
<table style="display: none">
	<tbody id="add_bussProduct_table_template">
		<tr>
			<td align="center"><input style="width: 20px;" type="checkbox" name="ck" /></td>
			<td align="left"><input nullmsg="请输入订单产品明细的产品名称！" datatype="s6-10" errormsg="订单产品明细的产品名称应该为6到10位" name="bussproductEntityList[#index#].busstypeName" maxlength="100" type="text"
				style="width: 220px;"></td>
			<td align="left"><input nullmsg="请输入订单产品明细的产品个数！" datatype="n" errormsg="订单产品明细的产品个数必须为数字" name="bussproductEntityList[#index#].gopCount" maxlength="10" type="text" style="width: 120px;"></td>
			<td align="left"><%--			 <input name="bussproductEntityList[#index#].gopProductType" maxlength="3" type="text" style="width:120px;">--%> <t:dictSelect
				field="bussproductEntityList[#index#].gopProductType" typeGroupCode="service" hasLabel="false"></t:dictSelect></td>
			<td align="left"><input nullmsg="请输入订单产品明细的产品单价！" datatype="d" errormsg="订单产品明细的产品单价填写不正确" name="bussproductEntityList[#index#].gopOnePrice" maxlength="10" type="text" style="width: 120px;"></td>
			<td align="left"><input nullmsg="请输入订单产品明细的产品小计！" datatype="d" errormsg="订单产品明细的产品小计填写不正确" name="bussproductEntityList[#index#].gopSumPrice" maxlength="10" type="text" style="width: 120px;"></td>
			<td align="left"><input name="bussproductEntityList[#index#].gopContent" maxlength="200" type="text" style="width: 120px;"></td>
			<td align="left"><input name="bussproductEntityList[#index#].gopContent" maxlength="200" type="text" style="width: 120px;"></td>
		</tr>
	</tbody>
</table>
 </body>