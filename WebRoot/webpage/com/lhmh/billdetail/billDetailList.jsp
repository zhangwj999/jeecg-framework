<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="billDetailList" title="文件明细" actionUrl="billDetailController.do?datagrid" idField="id" fit="true" queryMode="group">
   <t:dgCol title="编号" field="id" hidden="false"></t:dgCol>
   <t:dgCol title="业务流水号" field="billId" query="true"></t:dgCol>
   <t:dgCol title="通道" field="channelId" replace="${channelReplace}"></t:dgCol>
   <t:dgCol title="URL" field="fileUrl" ></t:dgCol>
   <t:dgCol title="文件名称" field="fileName" query="true" ></t:dgCol>
   <t:dgCol title="开始时间" field="beginTime" formatter="yyyy-MM-dd hh:mm:ss"></t:dgCol>
   <t:dgCol title="结束时间" field="endTime" formatter="yyyy-MM-dd hh:mm:ss"></t:dgCol>
   <t:dgCol title="上传状态" field="status" dictionary="filestatus"  query="true"></t:dgCol>
   <t:dgCol title="删除状态" field="isDel" dictionary="isdel"  query="true"></t:dgCol>
   <t:dgCol title="文件上传百分比%" field="fileRate" ></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
  </t:datagrid>
  </div>
 </div>