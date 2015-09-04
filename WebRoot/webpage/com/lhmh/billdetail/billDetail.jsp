<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>账单明细</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
 <body style="overflow-y: hidden" scroll="no">
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="billDetailController.do?save">
			<input id="id" name="id" type="hidden" value="${billDetailPage.id }">
			<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							billId:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="billId" name="billId" 
							   value="${billDetailPage.billId}" datatype="*">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							channelId:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="channelId" name="channelId" 
							   value="${billDetailPage.channelId}" datatype="*">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							fileUrl:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="fileUrl" name="fileUrl" ignore="ignore"
							   value="${billDetailPage.fileUrl}">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							fileName:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="fileName" name="fileName" ignore="ignore"
							   value="${billDetailPage.fileName}">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							beginTime:
						</label>
					</td>
					<td class="value">
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="beginTime" name="beginTime" ignore="ignore"
							     value="<fmt:formatDate value='${billDetailPage.beginTime}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							endTime:
						</label>
					</td>
					<td class="value">
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="endTime" name="endTime" ignore="ignore"
							     value="<fmt:formatDate value='${billDetailPage.endTime}' type="date" pattern="yyyy-MM-dd hh:mm:ss"/>">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							status:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="status" name="status" ignore="ignore"
							   value="${billDetailPage.status}">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							文件上传百分比%:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="fileRate" name="fileRate" ignore="ignore"
							   value="${billDetailPage.fileRate}" datatype="n">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
			</table>
		</t:formvalid>
 </body>