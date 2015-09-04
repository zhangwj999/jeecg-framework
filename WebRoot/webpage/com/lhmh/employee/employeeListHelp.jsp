<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html >
<html>
<head>
<title>业务类型</title>
<t:base type="jquery,easyui,tools"></t:base>
</head>
<body style="overflow-y: hidden" scroll="no">

<t:datagrid name="functionList" title="按员工选择" actionUrl="employeeController.do?datagrid" idField="empId" checkbox="true" showRefresh="false">
	<t:dgCol title="员工编号" field="empId"  treefield="text" hidden="false"></t:dgCol>
   <t:dgCol title="员工名称" field="empName"  treefield="text"></t:dgCol>
   <t:dgCol title="联系方式" field="tel"  treefield="order"></t:dgCol>
   <t:dgCol title="备注" field="note" treefield="src"></t:dgCol>
</t:datagrid>
</body>
</html>
