<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="warncenterList" title="报警中心" actionUrl="warncenterController.do?datagrid" queryMode="group" idField="id" fit="true">
   <t:dgCol title="编号" field="id" hidden="false"></t:dgCol>
   <t:dgCol title="流水号" field="warnId" ></t:dgCol>
   <t:dgCol title="报警日期" field="warnDate" query="true" ></t:dgCol>
   <t:dgCol title="报警时间" field="warnTime" formatter="yyyy-MM-dd hh:mm:ss"></t:dgCol>
   <t:dgCol title="报警类型" field="warnType" dictionary="warntype" query="true"></t:dgCol>
   <t:dgCol title="报警内容" field="warnCon" ></t:dgCol>
   <t:dgCol title="备注" field="note" ></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="warncenterController.do?del&id={id}" />
   <t:dgToolBar title="查看" icon="icon-search" url="warncenterController.do?addorupdate" funname="detail"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>