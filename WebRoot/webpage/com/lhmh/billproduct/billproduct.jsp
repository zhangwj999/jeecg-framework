<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>产品类型</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
 <body style="overflow-y: hidden" scroll="no">
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="div" action="billproductController.do?save">
		<input id="id" name="id" type="hidden" value="${billproductPage.id }">
		<fieldset class="step">
			<div class="form">
		      <label class="Validform_label">billId:</label>
		      <input class="inputxt" id="billId" name="billId" 
					   value="${billproductPage.billId}" datatype="*">
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">productId:</label>
		      <input class="inputxt" id="productId" name="productId" 
					   value="${billproductPage.productId}" datatype="*">
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">billNum:</label>
		      <input class="inputxt" id="billNum" name="billNum" ignore="ignore"
					   value="${billproductPage.billNum}">
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">puhCard:</label>
		      <input class="inputxt" id="puhCard" name="puhCard" ignore="ignore"
					   value="${billproductPage.puhCard}">
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">qty:</label>
		      <input class="inputxt" id="qty" name="qty" ignore="ignore"
					   value="${billproductPage.qty}" datatype="d">
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">price:</label>
		      <input class="inputxt" id="price" name="price" ignore="ignore"
					   value="${billproductPage.price}" datatype="d">
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">amt:</label>
		      <input class="inputxt" id="amt" name="amt" ignore="ignore"
					   value="${billproductPage.amt}" datatype="d">
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">status:</label>
		      <input class="inputxt" id="status" name="status" ignore="ignore"
					   value="${billproductPage.status}">
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">note:</label>
		      <input class="inputxt" id="note" name="note" ignore="ignore"
					   value="${billproductPage.note}">
		      <span class="Validform_checktip"></span>
		    </div>
	    </fieldset>
  </t:formvalid>
 </body>
