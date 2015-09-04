<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="channelQueryList" title="通道查询" actionUrl="channelQueryController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="编号" field="id" hidden="false" ></t:dgCol>
   <t:dgCol title="银行" field="bankId" query="true" replace="${departsReplace}"></t:dgCol>   
   <t:dgCol title="编号" field="channelId" query="true"></t:dgCol>
   <t:dgCol title="名称" field="channelName" query="true"></t:dgCol>
   <t:dgCol title="是否启用" field="status" dictionary="status" query="true"></t:dgCol>
   <t:dgCol title="是否在线" field="isWork" dictionary="isWork" query="true"></t:dgCol>
<%--    <t:dgCol title="联系人" field="empId" replace="${employeeReplace}"></t:dgCol>    --%>
   <t:dgCol title="备注" field="note" ></t:dgCol>
   <t:dgToolBar title="查看" icon="icon-search" url="channelController.do?addorupdate" funname="detail"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>