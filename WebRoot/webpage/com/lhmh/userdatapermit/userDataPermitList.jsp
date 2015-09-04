<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="userDataPermitList" title="用户数据权限" actionUrl="userDataPermitController.do?datagrid" idField="id" fit="true">
   <t:dgCol title="编号" field="id" hidden="false"></t:dgCol>
   <t:dgCol title="用户名称" field="userId" ></t:dgCol>
   <t:dgCol title="权限类型" field="datapermitType" ></t:dgCol>
   <t:dgCol title="dataOrgId" field="dataOrgId" ></t:dgCol>
   <t:dgCol title="dataUserId" field="dataUserId" ></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="userDataPermitController.do?del&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="userDataPermitController.do?addorupdate" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="userDataPermitController.do?addorupdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="userDataPermitController.do?addorupdate" funname="detail"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>