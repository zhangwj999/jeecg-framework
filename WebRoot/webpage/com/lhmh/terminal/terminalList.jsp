<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="terminalList" title="采集终端管理" actionUrl="terminalController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="编号" field="id" hidden="false"></t:dgCol>
   <t:dgCol title="终端编号" field="terminalId" query="true"></t:dgCol>
   <t:dgCol title="终端名称" field="terminalName" query="true"></t:dgCol>
   <t:dgCol title="终端IP" field="terminalIp"  width="80"></t:dgCol>
   <t:dgCol title="终端端口" field="terminalPort" ></t:dgCol>
   <t:dgCol title="银行" field="bankId" query="true" replace="${departsReplace}"></t:dgCol> 
   <t:dgCol title="存储设备" field="storageId" query="true" replace="${storagesReplace}"></t:dgCol>        
   <t:dgCol title="上传开始时间" field="uploadTime" formatter="hh:mm:ss"></t:dgCol>
   <t:dgCol title="上传结束时间" field="timeEnd" formatter="hh:mm:ss"></t:dgCol>
   <t:dgCol title="预录像时间" field="preTime" ></t:dgCol>
   <t:dgCol title="录像延迟时间" field="delayTime" ></t:dgCol>
   <t:dgCol title="联系人"  field="empName"></t:dgCol>
   <t:dgCol title="是否启用" field="status" dictionary="status" query="true"></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="terminalController.do?del&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="terminalController.do?addorupdate" funname="add" width="800"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="terminalController.do?addorupdate" funname="update" width="800"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="terminalController.do?addorupdate" funname="detail" width="800"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>