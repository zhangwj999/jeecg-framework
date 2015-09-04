<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="channelList" title="通道管理" actionUrl="channelController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="编号" field="id" hidden="false" ></t:dgCol>
   <t:dgCol title="银行" field="bankId" query="true" replace="${departsReplace}"></t:dgCol>   
   <t:dgCol title="编号" field="channelId" query="true"></t:dgCol>
   <t:dgCol title="名称" field="channelName" query="true"></t:dgCol>
   <t:dgCol title="是否启用" field="status" dictionary="status" query="true"></t:dgCol>
<%--    <t:dgCol title="联系人" field="empId" replace="${employeeReplace}"></t:dgCol>    --%>
   <t:dgCol title="备注" field="note" ></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="channelController.do?del&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="channelController.do?addorupdate" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="channelController.do?addorupdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="channelController.do?addorupdate" funname="detail"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>