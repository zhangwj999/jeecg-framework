<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>通道管理</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
 <body style="overflow-y: hidden" scroll="no">
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="div" action="channelController.do?save">
		<input id="id" name="id" type="hidden" value="${channelPage.id }">
		<fieldset class="step">
			<div class="form">
		      <label class="Validform_label">银行:</label>
		      <td class="value"  style="width:150px;">
		      	<input style="width:150px;" id="cc" name="bankId" value="${departname}">
		      </td>
		    </div>
			<div class="form">
		      <label class="Validform_label">编号:</label>
		      <input class="inputxt" id="channelId" name="channelId" onchange="checkChannelId()"
					ajaxurl=""   value="${channelPage.channelId}" datatype="s2-16">
		      <span class="Validform_checktip">编号范围在2~16位字符</span>
		    </div>
			<div class="form">
		      <label class="Validform_label">名称:</label>
		      <input class="inputxt" id="channelName" name="channelName" 
		      ajaxurl=""  value="${channelPage.channelName}" datatype="s2-25" onchange="checkChannelName(this)">
		      <span class="Validform_checktip">请填通道名称</span>
		    </div>
			<div class="form">
		      <label class="Validform_label">是否启用:</label>
		      <t:dictSelect field="status" typeGroupCode="status"
                defaultVal="default" hasLabel="false" title="(没有label)"></t:dictSelect>
		    </div>
			<div class="form">
		      <label class="Validform_label">备注:</label>
		      <input class="inputxt" id="note" name="note" ignore="ignore"
					   value="${channelPage.note}">
		      <span class="Validform_checktip"></span>
		    </div>
	    </fieldset>
  </t:formvalid>
 </body>
 <script type="text/javascript">
	var id = $("#id").val();
 	function checkChannelId(){
 		var channelId = $("#channelId").val();
 		var bankId = $("#bankId").val();
 		$("#channelId").attr("ajaxurl","channelController.do?checkId&code="+encodeURI(encodeURI(channelId))+"&bank="+bankId+"&id="+id);
 	}
 	function checkChannelName(obj){
 		var val = $(obj).val();
		$("#checkChannelName").attr("ajaxurl","channelController.do?checkChannelName&channelName="+encodeURI(encodeURI(val))+"&bank="+bankId+"&id="+id);
 	}
	$(function() {
		$('#cc').combotree({
			url : 'departController.do?setPFunction&selfId=${channelPage.bankId}',
		});
	});
 </script>