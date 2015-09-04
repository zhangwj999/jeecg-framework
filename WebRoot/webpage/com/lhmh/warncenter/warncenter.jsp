<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>报警中心</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
 <body style="overflow-y: hidden" scroll="no">
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="div" action="warncenterController.do?save">
		<input id="id" name="id" type="hidden" value="${warncenterPage.id }">
		<fieldset class="step">
			<div class="form">
		      <label class="Validform_label">流水号:</label>
		      <input class="inputxt" id="warnId" name="warnId" 
					   value="${warncenterPage.warnId}" datatype="*">
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">报警日期:</label>
		      <input class="inputxt" id="warnDate" name="warnDate" ignore="ignore"
					   value="${warncenterPage.warnDate}">
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">报警时间:</label>
		      <input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="warnTime" name="warnTime" ignore="ignore"
					     value="<fmt:formatDate value='${warncenterPage.warnTime}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>">
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">报警类型:</label>
		      <input class="inputxt" id="warnType" name="warnType" 
					   value="${warncenterPage.warnType}" datatype="*">
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">报警内容:</label>
		      <input class="inputxt" id="warnCon" name="warnCon" 
					   value="${warncenterPage.warnCon}" datatype="*">
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">备注:</label>
		      <input class="inputxt" id="note" name="note" ignore="ignore"
					   value="${warncenterPage.note}">
		      <span class="Validform_checktip"></span>
		    </div>
	    </fieldset>
  </t:formvalid>
 </body>