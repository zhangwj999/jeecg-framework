<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div id="lhmh_busstypeList"  class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="busstypeList" title="业务类型" actionUrl="busstypeController.do?busstypeGrid" idField="id"  treegrid="true">
   <t:dgCol title="编号" field="id"  treefield="id" hidden="false"></t:dgCol>
   <t:dgCol title="类型名称" field="busstypeName"  treefield="text"></t:dgCol>
   <t:dgCol title="保存时间(月)" field="month"  treefield="order"></t:dgCol>
   <t:dgCol title="备注" field="note" treefield="src"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="busstypeController.do?del&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="busstypeController.do?addorupdate" funname="addFun"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="busstypeController.do?addorupdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="busstypeController.do?addorupdate" funname="detail"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 
 <div data-options="region:'east',
	title:'操作按钮',
	collapsed:true,
	split:true,
	border:false,
	onExpand : function(){
		li_east = 1;
	},
	onCollapse : function() {
	    li_east = 0;
	}"
	style="width: 400px; overflow: hidden;">
<div class="easyui-panel" style="padding: 1px;" fit="true" border="false" id="operationDetailpanel"></div>
</div>
<script type="text/javascript">
<%--   update-start--Author:anchao  Date:20130415 for：按钮权限控制--%>
$(function() {
	var li_east = 0;
});

<%--   update-start--Author:jueyue  Date:20130622 for：菜单录入代入父菜单--%>
function addFun(title,url, id) {
	var rowData = $('#'+id).datagrid('getSelected');
	if (rowData) {
		url += '&busstypeEntity.id='+rowData.id;
	}
	add(title,url,'busstypeList');
}
<%--   update-end--Author:jueyue  Date:20130622 for：菜单录入代入父菜单--%>
</script>
