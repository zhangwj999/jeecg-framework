<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<t:datagrid name="departUserList" title="文件明细" actionUrl="billStatusQueryController.do?billDatagrid&billId=${billId}" fit="true" fitColumns="true" idField="id" queryMode="group">
	<t:dgCol title="账单标号" sortable="false" field="billId"></t:dgCol>
	<t:dgCol title="通道号" field="channelId" query="true"></t:dgCol>
	<t:dgCol title="文件名称" field="fileName" ></t:dgCol>
	<t:dgCol title="开始时间" field="beginTime" query="true"></t:dgCol>
	<t:dgCol title="结束时间" field="endTime" query="true"></t:dgCol>
	<t:dgCol title="状态" field="status" dictionary="billstatus" query="true" replace="完成_0,未上传_1,上传中_2"></t:dgCol>
	<t:dgCol title="文件上传百分比%" field="fileRate" ></t:dgCol>
</t:datagrid>
