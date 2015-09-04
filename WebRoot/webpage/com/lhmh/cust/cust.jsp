<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>客户信息管理</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
 <body style="overflow-y: hidden" scroll="no">
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="div" action="custController.do?save">
		<input id="id" name="id" type="hidden" value="${custPage.id }">
		<fieldset class="step">
			<div class="form">
		      <label class="Validform_label">客户编号:</label>
		      <input class="inputxt" id="custId" name="custId" 
					ajaxurl=""   value="${custPage.custId}" datatype="s2-20" onchange="checkCustId(this)">
		      <span class="Validform_checktip">请输入客户编号</span>
		    </div>
			<div class="form">
		      <label class="Validform_label">客户名称:</label>
		      <input class="inputxt" id="custName" name="custName"
					   value="${custPage.custName}" datatype="s2-20" onchange="checkCustName(this)">
		      <span class="Validform_checktip">请输入客户名称</span>
		    </div>
			<div class="form">
		      <label class="Validform_label">证件类型:</label>
 							<t:dictSelect field="passType" typeGroupCode="passtype"
                defaultVal="default" hasLabel="false" title="证件类型(没有label)"></t:dictSelect>
		    </div>
			<div class="form">
		      <label class="Validform_label">证件号码:</label>
		      <input class="inputxt" id="passId" name="passId"
					   value="${custPage.passId}" datatype="s2-20" onchange="checkPassId(this)" />
		      <span class="Validform_checktip">请输入证件号码</span>
		    </div>
			<div class="form">
		      <label class="Validform_label">年龄:</label>
		      <input class="inputxt" id="age" name="age" datatype="n1-20"
					   value="${custPage.age}" onchange="checkDitOnly(this)"/>
		      <span class="Validform_checktip">请输入年龄</span>
		    </div>
			<div class="form"> 
	
		      <label class="Validform_label">性别:</label>
			    <t:dictSelect field="sex" typeGroupCode="sex"
                defaultVal="default" hasLabel="false" title="性别(没有label)"></t:dictSelect>
		    </div>
			<div class="form">
		      <label class="Validform_label">联系电话:</label>
		      <input class="inputxt" id="tel" name="tel" datatype="*"
					   value="${custPage.tel}" onchange="checkLxdh(this)"/>
		      <span class="Validform_checktip">请输入联系电话</span>
		    </div>
			<div class="form">
		      <label class="Validform_label">备注:</label>
		      <input class="inputxt" id="note" name="note" ignore="ignore" datatype="s0-25"
					   value="${custPage.note}">
		      <span class="Validform_checktip"></span>
		    </div>
	    </fieldset>
  </t:formvalid>
 </body>
 <script type="text/javascript">
 	var id = $("#id").val();
 	function checkCustId(obj){
 		var val = $(obj).val();
		$("#custId").attr("ajaxurl","custController.do?checkCustId&custId="+val+"&id="+id);
 	}
 	function checkCustName(obj){
 		var reg = /([\u4e00-\u9fa5]{2,8}.*)/g;
 		var val = $(obj).val();
 		var rlt = reg.exec(val);
		if(rlt!=null && rlt.length>0){
			$(obj).val(rlt[0]);
		}else{
			$(obj).val('');
		}
 	}
 	
 	function checkPassId(obj){
 		var val = $(obj).val();
		$("#passId").attr("ajaxurl","custController.do?checkPassId&passId="+val+"&id="+id);
 	}
 	
 	function checkDitOnly(obj){
 		var val = $(obj).val();
 		var reg = /[\d]*/g;
 		var rlt = reg.exec(val);
		if(rlt!=null && rlt.length>0){
			$(obj).val(rlt[0]);
		}else{
			$(obj).val('');
		}
 	}
	function checkLxdh(obj){
		var val = $(obj).val();
		var reg = /((0[0-9]{2,3}\-)?([2-9][0-9]{6,7})+(\-[0-9]{1,4})?)|^13[0-9]{9}$|14[0-9]{9}|15[0-9]{9}$|18[0-9]{9}$/;
		var rlt = reg.exec(val);
		if(rlt != null && rlt.length>0){
			$(obj).val(rlt[0]);
			$(obj).next(".Validform_checktip").html("");
		}else{
			$(obj).val("");
			$(obj).next(".Validform_checktip").html("请输入正确的联系电话！");
		}
	}
 </script>