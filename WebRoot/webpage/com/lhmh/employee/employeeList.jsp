<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="employeeList" title="员工管理" actionUrl="employeeController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="编号" field="id" hidden="false"></t:dgCol>
   <t:dgCol title="银行" field="bankId" query="true" replace="${departsReplace}"></t:dgCol>
   <t:dgCol title="员工编号" field="empId" ></t:dgCol>
   <t:dgCol title="员工姓名" field="empName" ></t:dgCol>
   <t:dgCol title="岗位" field="posId" dictionary="posstatus" query="true"></t:dgCol>
   <t:dgCol title="联系方式" field="tel" ></t:dgCol>
   <t:dgCol title="备注" field="note" ></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="employeeController.do?del&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="employeeController.do?addorupdate" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="employeeController.do?addorupdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="employeeController.do?addorupdate" funname="detail"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>