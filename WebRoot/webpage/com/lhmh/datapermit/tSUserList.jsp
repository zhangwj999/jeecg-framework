<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="tSUserList" fitColumns="true" title="数据权限" actionUrl="tSUserController.do?datagrid" idField="id" fit="true">
   <t:dgCol title="编号" field="id" hidden="false"></t:dgCol>
   <t:dgCol title="activitisync" field="activitisync" ></t:dgCol>
   <t:dgCol title="browser" field="browser" ></t:dgCol>
   <t:dgCol title="password" field="password" ></t:dgCol>
   <t:dgCol title="realname" field="realname" ></t:dgCol>
   <t:dgCol title="signature" field="signature" ></t:dgCol>
   <t:dgCol title="status" field="status" ></t:dgCol>
   <t:dgCol title="userkey" field="userkey" ></t:dgCol>
   <t:dgCol title="username" field="username" ></t:dgCol>
   <t:dgCol title="departid" field="departid" ></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="tSUserController.do?del&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="tSUserController.do?addorupdate" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="tSUserController.do?addorupdate" funname="update"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>