<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>存储设备管理</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
 <body style="overflow-y: hidden" scroll="no">
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="div" action="storageController.do?save">
		<input id="id" name="id" type="hidden" value="${storagePage.id }">
		<fieldset class="step">
			<div class="form">
		      <label class="Validform_label">编号:</label>
		      <input class="inputxt" id="storageId" name="storageId"
					   value="${storagePage.storageId}" datatype="s2-16" onchange="checkStorageId(this)">
		      <span class="Validform_checktip">编号范围在2~16位字符</span>
		    </div>
			<div class="form">
		      <label class="Validform_label">名称:</label>
		      <input class="inputxt" id="storageName" name="storageName"
					   value="${storagePage.storageName}" datatype="s2-25" onchange="checkStorageName(this)">
		      <span class="Validform_checktip">请填写存储设备名称</span>
		    </div>
			<div class="form">
		      <label class="Validform_label">IP:</label>
		      <input class="inputxt" id="storageIp" name="storageIp"
					   value="${storagePage.storageIp}" datatype="s1-25"  onchange="checkStorageIp(this)">
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">存储PORT:</label>
		      <input class="inputxt" id="storagePort" name="storagePort" 
					   value="${storagePage.storagePort}" datatype="n1-14">
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">控制PORT:</label>
		      <input class="inputxt" id="dataPort" name="dataPort"
					   value="${storagePage.dataPort}" datatype="n1-14">
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">银行:</label>
		      <td class="value"  style="width:150px;">
		      	<input style="width:150px;" id="cc" name="bankId" value="${departname}">
		      	<span class="Validform_checktip"></span>
		      </td>
		    </div>
			<div class="form">
		      <label class="Validform_label">存储空间(G):</label>
		      <input class="inputxt" id="space" name="space" 
					   value="${storagePage.space}" datatype="n1-14"  onchange="checkSpaceMin(this)" />
		      <span class="Validform_checktip"></span>
		    </div>
			<div class="form">
		      <label class="Validform_label">预警空间(G):</label>
		      <input class="inputxt" id="spaceMin" name="spaceMin" 
					   value="${storagePage.spaceMin}" datatype="n1-14" onchange="checkSpaceMin(this)">
		      <span class="Validform_checktip"></span>
		    </div>
		    
			<div class="form">
		      	<label class="Validform_label">联系人:</label>
				<input name="empId"  type="hidden" value="${storagePage.empId}" id="empId"> 
				<input name="empName" class="inputxt"  id="empName" value="${storagePage.empName}"
					readonly="readonly" datatype="*"/>
		 		<t:choose hiddenName="empId" hiddenid="empId" url="employeeController.do?employeeHelp" name="functionList" icon="icon-search" title="员工列表" textname="empName" isclear="true"></t:choose>
		      	<span class="Validform_checktip"></span>	
		    </div>
		    
			<div class="form">
		      <label class="Validform_label">是否启用:</label>
		      <t:dictSelect field="status" typeGroupCode="status"
                defaultVal="default" hasLabel="false" title="(没有label)"></t:dictSelect>

		    </div>
	    </fieldset>
  </t:formvalid>
 </body>
  <script type="text/javascript">
 	var id = $("#id").val();
 	function checkStorageId(obj){
 		var val = $(obj).val();
		$("#storageId").attr("ajaxurl","storageController.do?checkStorageId&storageId="+val+"&id="+id);
 	}
 	
 	function checkStorageName(obj){
 		var val = $(obj).val();
 		$("#storageName").attr("ajaxurl","storageController.do?checkStorageName&storageName="+encodeURI(encodeURI(val))+"&id="+id);
 	}
 	
 	function checkStorageIp(obj){
 		var val = $(obj).val();
 		var ipv4 = /^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})\.){3}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})$/;
 		var ipv6 = /^\s*((([0-9A-Fa-f]{1,4}:){7}([0-9A-Fa-f]{1,4}|:))|(([0-9A-Fa-f]{1,4}:){6}(:[0-9A-Fa-f]{1,4}|((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){5}(((:[0-9A-Fa-f]{1,4}){1,2})|:((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){4}(((:[0-9A-Fa-f]{1,4}){1,3})|((:[0-9A-Fa-f]{1,4})?:((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){3}(((:[0-9A-Fa-f]{1,4}){1,4})|((:[0-9A-Fa-f]{1,4}){0,2}:((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){2}(((:[0-9A-Fa-f]{1,4}){1,5})|((:[0-9A-Fa-f]{1,4}){0,3}:((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){1}(((:[0-9A-Fa-f]{1,4}){1,6})|((:[0-9A-Fa-f]{1,4}){0,4}:((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3}))|:))|(:(((:[0-9A-Fa-f]{1,4}){1,7})|((:[0-9A-Fa-f]{1,4}){0,5}:((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3}))|:)))(%.+)?\s*$/;
 		if(ipv4.test(val) || ipv6.test(val)){
			$("#storageIp").attr("ajaxurl","storageController.do?checkStorageIp&storageIp="+val+"&id="+id);
 		}else{
 			$(obj).val('');
 			$(obj).next(".Validform_checktip").html("IP地址格式不正确！");
 		}
 	}
 	
 	function checkSpaceMin(obj){
 		var val = $("#spaceMin").val();
 		var space = $("#space").val();
 		val = parseFloat(val);
 		space = parseFloat(space);
 		if(val > space){
 			$(obj).val('');
 			$(obj).next(".Validform_checktip").html("预警空间不能大于存储空间！");
 		}
 	}
	$(function() {
		$('#cc').combotree({
			url : 'departController.do?setPFunction&selfId=${channelPage.bankId}',
		});
	});	
 </script>