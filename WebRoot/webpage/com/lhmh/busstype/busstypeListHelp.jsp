<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html >
<html>
<head>
<title>业务类型</title>
<t:base type="jquery,easyui,tools"></t:base>
</head>
<body style="overflow-y: hidden" scroll="no">

<t:datagrid name="functionList" title="按业务类型选择" actionUrl="busstypeController.do?datagrid" idField="busstypeId" checkbox="true" showRefresh="false">
	<t:dgCol title="编号" field="busstypeId"  treefield="text" hidden="false"></t:dgCol>
   <t:dgCol title="类型名称" field="busstypeName"  treefield="text"></t:dgCol>
   <t:dgCol title="保存时间(月)" field="month"  treefield="order"></t:dgCol>
   <t:dgCol title="备注" field="note" treefield="src"></t:dgCol>
</t:datagrid>
</body>
</html>
