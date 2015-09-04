<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="officeList" fitColumns="true" title="理财室" actionUrl="officeController.do?datagrid" queryMode="group" idField="id" fit="true">
   <t:dgCol title="编号" field="id" hidden="false"></t:dgCol>
   <t:dgCol title="理财室编号" field="officeId" query="true"></t:dgCol>
   <t:dgCol title="理财室名称" field="officeeName" query="true"></t:dgCol>
   <t:dgCol title="银行" field="bankId" query="true" replace="${departsReplace}"></t:dgCol>
   <t:dgCol title="采集终端" field="terminalId" query="true" replace="${terminalsReplace}"></t:dgCol>
   <t:dgCol title="联系人" field="contacts" ></t:dgCol>
   <t:dgCol title="联系电话" field="tel" ></t:dgCol>
   <t:dgCol title="是否启用" field="status" dictionary="status" query="true"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="officeController.do?del&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="officeController.do?addorupdate" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="officeController.do?addorupdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="officeController.do?addorupdate" funname="detail"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>