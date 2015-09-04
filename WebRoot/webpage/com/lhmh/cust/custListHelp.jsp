<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html >
<html>
<head>
<title>业务类型</title>
<t:base type="jquery,easyui,tools"></t:base>
</head>
<body style="overflow-y: hidden" scroll="no">

<t:datagrid name="custfunctionList" title="客户信息管理" actionUrl="custController.do?datagrid" idField="custId" checkbox="true" showRefresh="false">
   <t:dgCol title="客户编号" field="custId" sortable="true" query="true"></t:dgCol>
   <t:dgCol title="客户名称" field="custName" sortable="true" query="true"></t:dgCol>
   <t:dgCol title="证件类型" field="passType" sortable="true" dictionary="passtype" query="true"></t:dgCol>
   <t:dgCol title="证件号码" field="passId" ></t:dgCol>
   <t:dgCol title="性别" field="sex" sortable="true" dictionary="sex" query="true"></t:dgCol>
</t:datagrid>
</body>
</html>
