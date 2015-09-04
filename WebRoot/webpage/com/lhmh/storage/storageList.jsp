<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="storageList" title="存储设备管理" actionUrl="storageController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="编号" field="id" hidden="false"></t:dgCol>
   <t:dgCol title="编号" field="storageId" query="true"></t:dgCol>
   <t:dgCol title="名称" field="storageName" query="true"></t:dgCol>
   <t:dgCol title="IP" field="storageIp" query="true" width="40"></t:dgCol>
   <t:dgCol title="存储PORT" field="storagePort" ></t:dgCol>
   <t:dgCol title="控制PORT" field="dataPort" ></t:dgCol>
   <t:dgCol title="银行" field="bankId" query="true" replace="${departsReplace}"></t:dgCol>   
   <t:dgCol title="存储空间(G)" field="space" ></t:dgCol>
   <t:dgCol title="预警空间(G)" field="spaceMin" ></t:dgCol>
   <t:dgCol title="联系人" field="empName"></t:dgCol>
   <t:dgCol title="是否启用" field="status" dictionary="status" query="true"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="storageController.do?del&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="storageController.do?addorupdate" funname="add" height="520"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="storageController.do?addorupdate" funname="update"  height="520" ></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="storageController.do?addorupdate" funname="detail"  height="520" ></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>