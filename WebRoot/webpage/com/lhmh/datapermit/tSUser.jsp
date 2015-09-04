<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>数据权限</title>
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
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" tiptype="1" action="tSUserController.do?save">
			<input id="id" name="id" type="hidden" value="${tSUserPage.id }">
			<table cellpadding="0" cellspacing="1" class="formtable">
			<tr>
			<td align="right"><label class="Validform_label">activit:</label></td>
			<td class="value">
				<input nullmsg="请填写activit" errormsg="activit格式不对" class="inputxt" id="activitisync" name="activitisync" ignore="ignore"
									   value="${tSUserPage.activitisync}" datatype="n">
								<span class="Validform_checktip"></span>
			</td>
			<td align="right"><label class="Validform_label">browser:</label></td>
			<td class="value">
				<input nullmsg="请填写browser" errormsg="browser格式不对" class="inputxt" id="browser" name="browser" ignore="ignore"
									   value="${tSUserPage.browser}">
								<span class="Validform_checktip"></span>
			</td>
			</tr>
			<tr>
			<td align="right"><label class="Validform_label">passwor:</label></td>
			<td class="value">
				<input nullmsg="请填写passwor" errormsg="passwor格式不对" class="inputxt" id="password" name="password" ignore="ignore"
									   value="${tSUserPage.password}">
								<span class="Validform_checktip"></span>
			</td>
			<td align="right"><label class="Validform_label">realnam:</label></td>
			<td class="value">
				<input nullmsg="请填写realnam" errormsg="realnam格式不对" class="inputxt" id="realname" name="realname" ignore="ignore"
									   value="${tSUserPage.realname}">
								<span class="Validform_checktip"></span>
			</td>
			</tr>
			<tr>
			<td align="right"><label class="Validform_label">signatu:</label></td>
			<td class="value">
				<input nullmsg="请填写signatu" errormsg="signatu格式不对" class="inputxt" id="signature" name="signature" ignore="ignore"
									   value="${tSUserPage.signature}">
								<span class="Validform_checktip"></span>
			</td>
			<td align="right"><label class="Validform_label">status:</label></td>
			<td class="value">
				<input nullmsg="请填写status" errormsg="status格式不对" class="inputxt" id="status" name="status" ignore="ignore"
									   value="${tSUserPage.status}" datatype="n">
								<span class="Validform_checktip"></span>
			</td>
			</tr>
			<tr>
			<td align="right"><label class="Validform_label">userkey:</label></td>
			<td class="value">
				<input nullmsg="请填写userkey" errormsg="userkey格式不对" class="inputxt" id="userkey" name="userkey" ignore="ignore"
									   value="${tSUserPage.userkey}">
								<span class="Validform_checktip"></span>
			</td>
			<td align="right"><label class="Validform_label">usernam:</label></td>
			<td class="value">
				<input nullmsg="请填写usernam" errormsg="usernam格式不对" class="inputxt" id="username" name="username" 
									   value="${tSUserPage.username}" datatype="*">
								<span class="Validform_checktip"></span>
			</td>
			</tr>
			<tr>
			<td align="right"><label class="Validform_label">departi:</label></td>
			<td class="value">
				<input nullmsg="请填写departi" errormsg="departi格式不对" class="inputxt" id="departid" name="departid" ignore="ignore"
									   value="${tSUserPage.departid}">
								<span class="Validform_checktip"></span>
			</td>
			</tr>
			</table>
			<div style="width: auto;height: 200px;">
				<%-- 增加一个div，用于调节页面大小，否则默认太小 --%>
				<div style="width:690px;height:1px;"></div>
				<t:tabs id="tt" iframe="false" tabPosition="top" fit="false">
				 <t:tab href="tSUserController.do?userDataPermitEntityList&id=${tSUserPage.id}&id=${tSUserPage.id}" icon="icon-search" title="数据权限明细" id="userDataPermitEntity"></t:tab>
				</t:tabs>
			</div>
			</t:formvalid>
			<!-- 添加 明细 模版 -->
		<table style="display:none">
		<tbody id="add_userDataPermitEntity_table_template">
			<tr>
			 <td align="center"><div style="width: 25px;" name="xh"></div></td>
			 <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
				  <td align="left"><input name="userDataPermitEntityList[#index#].datapermitType" maxlength="1" type="text" style="width:120px;"></td>
				  <td align="left"><input name="userDataPermitEntityList[#index#].dataOrgId" maxlength="32" type="text" style="width:120px;"></td>
				  <td align="left"><input name="userDataPermitEntityList[#index#].dataUserId" maxlength="32" type="text" style="width:120px;"></td>
			</tr>
		 </tbody>
		</table>
 </body>