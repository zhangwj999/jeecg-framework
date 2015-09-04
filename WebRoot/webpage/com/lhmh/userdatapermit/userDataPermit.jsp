<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>用户数据权限</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
 <body style="overflow-y: hidden" scroll="no">
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="userDataPermitController.do?save">
			<input id="id" name="id" type="hidden" value="${userDataPermitPage.id }">
			<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							userId:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="userId" name="userId" ignore="ignore"
							   value="${userDataPermitPage.userId}">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							datapermitType:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="datapermitType" name="datapermitType" ignore="ignore"
							   value="${userDataPermitPage.datapermitType}">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							dataOrgId:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="dataOrgId" name="dataOrgId" ignore="ignore"
							   value="${userDataPermitPage.dataOrgId}">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							dataUserId:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="dataUserId" name="dataUserId" ignore="ignore"
							   value="${userDataPermitPage.dataUserId}">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
			</table>
		</t:formvalid>
 </body>