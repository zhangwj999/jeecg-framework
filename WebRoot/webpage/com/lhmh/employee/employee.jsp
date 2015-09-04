<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>员工管理</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
 <body style="overflow-y: hidden" scroll="no">
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="employeeController.do?save">
			<input id="id" name="id" type="hidden" value="${employeePage.id }">
			<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							银行:
						</label>
					</td>
				    <td class="value">
				      	<input style="width:150px;" id="cc" name="bankId" value="${departname}">
				      	<span class="Validform_checktip"></span>
				    </td>					
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							员工编号:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="empId" name="empId" 
							   value="${employeePage.empId}" datatype="s2-16"  onchange="checkEmpId(this)">
						<span class="Validform_checktip">编号范围在2~16位字符</span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							员工姓名:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="empName" name="empName" 
							   value="${employeePage.empName}" datatype="s2-50" onchange="checkEmpName(this)">
						<span class="Validform_checktip">请输入员工姓名</span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							岗位编码:
						</label>
					</td>
					<td class="value">
					 <t:dictSelect field="posId" typeGroupCode="posstatus"
                defaultVal="default" hasLabel="false" title="(没有label)"></t:dictSelect>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							联系方式:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="tel" name="tel" datatype="s2-50"
							   value="${employeePage.tel}">
						<span class="Validform_checktip">请输入联系方式</span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							备注:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="note" name="note" datatype="s2-50" ignore="ignore"
							   value="${employeePage.note}">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
			</table>
		</t:formvalid>
 </body>
   <script type="text/javascript">
 	var id = $("#id").val();
 	function checkEmpName(obj){
 		var reg = /([\u4e00-\u9fa5]{2,8}.*)/g;
 		var val = $(obj).val();
 		var rlt = reg.exec(val);
		if(rlt!=null && rlt.length>0){
			$(obj).val(rlt[0]);
		}else{
			$(obj).val('');
		}
		$("#empName").attr("ajaxurl","employeeController.do?checkEmpName&empName="+encodeURI(encodeURI(rlt))+"&id="+id);
 	}
 	
 	function checkEmpId(obj){
 		var val = $(obj).val();
		$("#empId").attr("ajaxurl","employeeController.do?checkEmpId&empId="+val+"&id="+id);
 	}
	$(function() {
		$('#cc').combotree({
			url : 'departController.do?setPFunction&selfId=${channelPage.bankId}',
		});
	});	
 	</script>