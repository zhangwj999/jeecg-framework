<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>采集终端管理</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
 <body style="overflow-y: hidden" scroll="no">
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="terminalController.do?save">
			<input id="id" name="id" type="hidden" value="${terminalPage.id }">
			<table style="width: 800px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							终端编号:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="terminalId" name="terminalId" errormsg="编号范围在2~16位字符"
					  	 	value="${terminalPage.terminalId}" datatype="s2-16" onchange="checkTerminalId(this)"/>
		     			 <span class="Validform_checktip"></span>
					</td>
				
					<td align="right">
						<label class="Validform_label">
							终端名称:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="terminalName" name="terminalName"  nullmsg="请填写采集终端名称"  errormsg="请填写采集终端名称"
					  	 value="${terminalPage.terminalName}" datatype="s2-25"  onchange="checkTerminalName(this)">
		     			 <span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							终端IP:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="terminalIp" name="terminalIp"   errormsg="请填写采集终端IP地址"
					  	 value="${terminalPage.terminalIp}" datatype="s1-25" onchange="checkTerminalIp(this)">
		     			 <span class="Validform_checktip"></span>
					</td>

					<td align="right">
						<label class="Validform_label">
							终端端口:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="terminalPort" name="terminalPort" datatype="n1-14"   nullmsg="请填写采集终端端口"    errormsg="请填写采集终端端口"
							   value="${terminalPage.terminalPort}">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							银行:
						</label>
					</td>
				      <td class="value"  style="width:150px;">
				      	<input style="width:150px;" id="cc" name="bankId" value="${departname}">
				      	<span class="Validform_checktip"></span>
				      </td>

					<td align="right">
						<label class="Validform_label">
							存储设备:
						</label>
					</td>
					<td class="value">
					<select id=""storageId"" name="storageId" datatype="*">
						<c:forEach items="${storageList}" var="storage">
							<option value="${storage.storageId }" <c:if test="${storage.storageId==terminalPage.storageId}">selected="selected"</c:if>>${storage.storageName}</option>
						</c:forEach>
					</select> <span class="Validform_checktip"></span>
					</td>
				</tr>

				<tr>
					<td align="right">
						<label class="Validform_label">
							上传开始时间:
						</label>
					</td>
					<td class="value">
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="uploadTime" name="uploadTime" 
							      value="<fmt:formatDate value='${terminalPage.uploadTime}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>" datatype="*" onchange="checkDate(this)">
						<span class="Validform_checktip"></span>
					</td>
					<td align="right">
						<label class="Validform_label">
							上传结束时间:
						</label>
					</td>
					<td class="value">
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="timeEnd" name="timeEnd"   nullmsg="请输入上传结束时间"
							     value="<fmt:formatDate value='${terminalPage.timeEnd}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>" datatype="*"  onchange="checkDate(this)">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							预录像时间:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="preTime" name="preTime"  errormsg="请输入预录像时间（分钟）"
							   value="${terminalPage.preTime}" datatype="n1-10">
						<span class="Validform_checktip"></span>
					</td>
		
					<td align="right">
						<label class="Validform_label">
							录像延迟时间:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="delayTime" name="delayTime" nullmsg="请输入录像延迟时间（分钟）"  errormsg="请输入录像延迟时间（分钟）"
							   value="${terminalPage.delayTime}" datatype="n1-10">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>		
					<td align="right">
						<label class="Validform_label">
							是否启用:
						</label>
					</td>
					<td class="value">
				      <t:dictSelect field="status" typeGroupCode="status"
		                defaultVal="default" hasLabel="false" title="(没有label)"></t:dictSelect>
					</td>
					
					<td align="right"><label class="Validform_label">联系人:</label></td>
					<td class="value" colspan="3">
						<input name="empId"  type="hidden" value="${terminalPage.empId}" id="empId" > 
						<input name="empName" class="inputxt"  id="empName" value="${terminalPage.empName}"  errormsg="请选择联系人" nullmsg="请选择联系人"
							readonly="readonly" datatype="*" />
				 		<t:choose hiddenName="empId" hiddenid="empId" url="employeeController.do?employeeHelp" name="functionList" icon="icon-search" title="员工列表" textname="empName" isclear="true"></t:choose>
				      	<span class="Validform_checktip"></span>	
					</td>					
				</tr>
				
			</table>
		</t:formvalid>
 </body>
   <script type="text/javascript">
 	var id = $("#id").val();
	//校验只是用数字
 	function checkTerminalId(obj){
 		var val = $(obj).val();
		$("#terminalId").attr("ajaxurl","terminalController.do?checkTerminalId&terminalId="+val+"&id="+id);
	}
	//校验汉字(需要编码)
	function checkTerminalName(obj){
 		var val = $(obj).val();
		$("#terminalName").attr("ajaxurl","terminalController.do?checkTerminalName&terminalName="+encodeURI(encodeURI(val))+"&id="+id);
 	}
	function checkTerminalIp(obj){
 		var val = $(obj).val();
 		var ipv4 = /^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})\.){3}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})$/;
 		var ipv6 = /^\s*((([0-9A-Fa-f]{1,4}:){7}([0-9A-Fa-f]{1,4}|:))|(([0-9A-Fa-f]{1,4}:){6}(:[0-9A-Fa-f]{1,4}|((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){5}(((:[0-9A-Fa-f]{1,4}){1,2})|:((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){4}(((:[0-9A-Fa-f]{1,4}){1,3})|((:[0-9A-Fa-f]{1,4})?:((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){3}(((:[0-9A-Fa-f]{1,4}){1,4})|((:[0-9A-Fa-f]{1,4}){0,2}:((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){2}(((:[0-9A-Fa-f]{1,4}){1,5})|((:[0-9A-Fa-f]{1,4}){0,3}:((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){1}(((:[0-9A-Fa-f]{1,4}){1,6})|((:[0-9A-Fa-f]{1,4}){0,4}:((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3}))|:))|(:(((:[0-9A-Fa-f]{1,4}){1,7})|((:[0-9A-Fa-f]{1,4}){0,5}:((25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)(\.(25[0-5]|2[0-4]\d|1\d\d|[1-9]?\d)){3}))|:)))(%.+)?\s*$/;
 		if(ipv4.test(val) || ipv6.test(val)){
			$("#terminalIp").attr("ajaxurl","terminalController.do?checkTerminalIp&terminalIp="+val+"&id="+id);
 		}else{
 			$(obj).val('');
 			$(obj).next(".Validform_checktip").html("IP地址格式不正确！");
 		}
 	}
	function checkDate(obj){
		var begin = $("#uploadTime").val();
		var end = $("#timeEnd").val();
		if(begin != null && begin != '' && end != null && end != ''){
			begin = getDateFromString(begin);
			end = getDateFromString(end);
			if(begin.getTime()>end.getTime()){
				$(obj).val("");
				$(obj).next(".Validform_checktip").html("上传开始时间不能大于上传结束时间！");
			}else{
				$(obj).next(".Validform_checktip").html("");
			}
		}
	}
	
	function getDateFromString(datestr){
		
		var datearr = datestr.split(" ");
		var date = datearr[0];
		var time = datearr[1];
		date = date.split("-");
		time = time.split(":");
		
		year = date[0];
		month = date[1];
		day = date[2];
		hour = time[0];
		min = time[1];
		sec = time[2];
		
		return new Date(parseInt(year)+"",( parseInt(month) )-1+"",parseInt(day)+"",parseInt(hour)+"",parseInt(min)+"",parseInt(sec)+"");
	}
	$(function() {
		$('#cc').combotree({
			url : 'departController.do?setPFunction&selfId=${channelPage.bankId}',
		});
	});	
	</script>