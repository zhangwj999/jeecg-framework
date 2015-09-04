<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="storageQueryList" title="存储设备监控查询" actionUrl="storageController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="编号" field="id" hidden="false"></t:dgCol>
   <t:dgCol title="编号" field="storageId" query="true"></t:dgCol>
   <t:dgCol title="名称" field="storageName" query="true"></t:dgCol>
   <t:dgCol title="IP" field="storageIp" query="true"></t:dgCol>
   <t:dgCol title="存储PORT" field="storagePort" ></t:dgCol>
   <t:dgCol title="控制PORT" field="dataPort" ></t:dgCol>
   <t:dgCol title="银行" field="bankId" query="true" replace="${departsReplace}"></t:dgCol>   
   <t:dgCol title="存储空间" field="space" ></t:dgCol>
   <t:dgCol title="已使用空间" field="spaceUsed" ></t:dgCol>
   <t:dgCol title="未使用空间" field="spaceUn" ></t:dgCol>
   <t:dgCol title="预警空间" field="spaceMin" ></t:dgCol>
   <t:dgCol title="联系人" field="empId" replace="${employeeReplace}"></t:dgCol>
   <t:dgCol title="是否启用" field="status" dictionary="status" query="true"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="storageController.do?del&id={id}" />
   <t:dgToolBar title="查看" icon="icon-search" url="storageController.do?addorupdate" funname="detail"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
 <script type="text/javascript">
	var trrs = $($("table.datagrid-btable")[1]).find("tbody").find("tr");
	for(var i=0;i<trrs.length;i++){
		var tr = $(trrs[i]);
		console.log(i+",i,"+$(trrs[i]).html);
		var unuse = tr.find("div[class*='datagrid-cell-c2-spaceUn']").html();
		console.log(i+",i,"+unuse);
		var min = tr.find("div[class*='datagrid-cell-c2-spaceMin']").html();
		if(unuse == null || unuse == ''){
			unuse = '0';
		}
		if(min == null || min == ''){
			min = '0';
		}
		if(parseFloat(min)<=parseFloat(unuse)){
			tr.find("div[class*='datagrid-cell-c2-storageId']").css("color","red");
		}
	}
 </script>