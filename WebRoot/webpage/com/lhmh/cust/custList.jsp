<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="custList" title="客户信息管理" actionUrl="custController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="编号" field="id" hidden="false"></t:dgCol>
   <t:dgCol title="客户编号" field="custId" query="true" ></t:dgCol>
   <t:dgCol title="客户名称" field="custName" query="true" ></t:dgCol>
   <t:dgCol title="证件类型" field="passType" sortable="true" dictionary="passtype" query="true"></t:dgCol>
   <t:dgCol title="证件号码" field="passId" query="true"></t:dgCol>
   <t:dgCol title="年龄" field="age" ></t:dgCol>
   <t:dgCol title="性别" field="sex" sortable="true" dictionary="sex" query="true"></t:dgCol>
   <t:dgCol title="联系电话" field="tel" ></t:dgCol>
   <t:dgCol title="备注" field="note" ></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="custController.do?del&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="custController.do?addorupdate" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="custController.do?addorupdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="custController.do?addorupdate" funname="detail"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>