<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>理财室</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
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
			$(this).find('div[name=\'xh\']').html(i+1);
		});

	}
 </script>
 </head>
 <body style="overflow-y: hidden" scroll="no">
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" tiptype="1" action="officeController.do?save">
			<input id="id" name="id" type="hidden" value="${officePage.id }">
			<table cellpadding="0" cellspacing="1" class="formtable">
			<tr>
			<td align="right"><label class="Validform_label">理财室编号:</label></td>
			<td class="value">
				<input nullmsg="请填写理财室编号" errormsg="请输入2-16个字符" class="inputxt" id="officeId" name="officeId" 
				   value="${officePage.officeId}" datatype="s2-16" onchange="checkOfficeId(this)">
				<span class="Validform_checktip">编号范围在2~16位字符</span>
			</td>
			<td align="right"><label class="Validform_label">理财室名称:</label></td>
			<td class="value">
				<input nullmsg="请填写理财室名称" errormsg="请输入2-25个字符" class="inputxt" id="officeeName" name="officeeName" 
				   value="${officePage.officeeName}" datatype="s2-25" onchange="checkOfficeeName(this)">
				<span class="Validform_checktip"></span>
			</td>
			</tr>
			<tr>
			<td align="right"><label class="Validform_label">银行:</label></td>		
		    <td class="value">
		      	<input style="width:150px;" id="cc" name="bankId" value="${departname}">
		      	<span class="Validform_checktip"></span>
		    </td>	
			
			<td align="right"><label class="Validform_label">采集终端:</label></td>
			<td class="value">
			<select id="terminalId" nullmsg="请填写采集终端" name="terminalId" datatype="*">
				<c:forEach items="${terminalList}" var="terminal">
					<option value="${terminal.terminalId }" <c:if test="${terminal.terminalId==officePage.terminalId}">selected="selected"</c:if>>${terminal.terminalName}</option>
				</c:forEach>
			</select> 
			</td>
			</tr>
			<tr>
			<td align="right"><label class="Validform_label">联系人:</label></td>
			<td class="value">
				<input nullmsg="请填写联系人" errormsg="请输入2-25个字符" class="inputxt" id="contacts" name="contacts" ignore="ignore"
					value="${officePage.contacts}"  datatype="s2-25">
				<span class="Validform_checktip"></span>
			</td>
			
			<td align="right"><label class="Validform_label">是否启用:</label></td>
			<td class="value">
			<t:dictSelect field="status" typeGroupCode="status"
                defaultVal="default" hasLabel="false" title="(没有label)"></t:dictSelect>
			</td>			
			</tr>
			<tr>
				<td align="right"><label class="Validform_label">联系电话:</label></td>
				<td class="value" colspan="3">
					<input nullmsg="请填写联系电话" errormsg="联系电话格式不对" class="inputxt" id="tel" name="tel" onchange="checkLxdh(this)"
							value="${officePage.tel}" datatype="*">
					<span class="Validform_checktip"></span>
				</td>
			</tr>
			</table>
			<div style="width: auto;height: 200px;">
				<%-- 增加一个div，用于调节页面大小，否则默认太小 --%>
				<div style="width:690px;height:1px;"></div>
				<t:tabs id="tt" iframe="false" tabPosition="top" fit="false">
				 <t:tab href="officeController.do?officeChannelList&id=${officePage.id}&officeId=${officePage.officeId}" icon="icon-search" title="通道" id="officeChannel"></t:tab>
				</t:tabs>
			</div>
			</t:formvalid>
			<!-- 添加 明细 模版 -->
		<table style="display:none">
		<tbody id="add_officeChannel_table_template">
			<tr>
			 <td align="center"><div style="width: 25px;" name="xh"></div></td>
			 <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
			 
			 <td align="left">				 
				 <select id="officeChannelList[#index#].channelId" name="officeChannelList[#index#].channelId" datatype="*">
				<c:forEach items="${channelList}" var="channel">
					<option value="${channel.channelId }">${channel.channelName}</option>
				</c:forEach></select>
				</td>
			
				<td align="left">
					<select name="officeChannelList[#index#].isMain" datatype="*" onchange="checkOnlyOne(this)">
						<option value="0">是</option>
						<option value="1" selected="selected">否</option>						
					</select>
				</td>	
				
				  <td align="left"><t:dictSelect
					field="officeChannelList[#index#].status" typeGroupCode="status" hasLabel="false" ></t:dictSelect></td>
					
				  <td align="left"><input name="officeChannelList[#index#].note" maxlength="25" type="text" style="width:120px;"></td>
			</tr>
		 </tbody>
		</table>
 </body>
   <script type="text/javascript">
	 	var id = $("#id").val();
		//校验只是用数字
	 	function checkOfficeId(obj){
	 		var val = $(obj).val();
			$("#officeId").attr("ajaxurl","officeController.do?checkOfficeId&officeId="+val+"&id="+id);
		}
		//校验汉字(需要编码)
		function checkOfficeName(obj){
	 		var val = $(obj).val();
			$("#officeName").attr("ajaxurl","officeController.do?checkOfficeName&officeName="+encodeURI(encodeURI(val))+"&id="+id);
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
		$(function() {
			$('#cc').combotree({
				url : 'departController.do?setPFunction&selfId=${channelPage.bankId}',
			});
		});			
	</script>