<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="billList" title="理财登记" 
  actionUrl="billController.do?datagrid&flag=000"  autoLoadData="true"  fitColumns="true" fit="true" queryMode="group" checkbox="true" idField="id" >

   <t:dgCol title="编号" field="id" hidden="false"></t:dgCol>
   <t:dgCol title="业务流水号" field="billId" query="true"></t:dgCol>
   <t:dgCol title="理财室" field="officeId" query="true"></t:dgCol>
   <t:dgCol title="用户编号" field="userId" query="true"></t:dgCol>
   <t:dgCol title="员工姓名" field="userName" query="true"></t:dgCol>
   <t:dgCol title="理财日期" field="crtDate" ></t:dgCol>
   <t:dgCol title="客户编号" field="custId" ></t:dgCol>
   <t:dgCol title="客户姓名" field="custName" query="true" ></t:dgCol>
   <t:dgCol title="业务类型" field="billType" ></t:dgCol>
   <t:dgCol title="银行编号" field="bankId" ></t:dgCol>
   <t:dgCol title="存储设备编号" field="storageId" ></t:dgCol>
   <t:dgCol title="采集终端编号" field="terminalId" ></t:dgCol>
   <t:dgCol title="签约状态" field="signStatus" dictionary="signstatus"></t:dgCol>
   <t:dgCol title="开始时间" field="beginTime" formatter="yyyy-MM-dd hh:mm:ss"></t:dgCol>
   <t:dgCol title="结束时间" field="endTime" formatter="yyyy-MM-dd hh:mm:ss"></t:dgCol>
   <t:dgCol title="文件上传状态" field="status" dictionary="filestatus"></t:dgCol>
   <t:dgCol title="理财业务状态" field="bStatus" dictionary="bStatus"></t:dgCol>
   <t:dgCol title="文件上传次数" field="fileCount" ></t:dgCol>
   <t:dgCol title="备注" field="note" ></t:dgCol>
   <t:dgCol title="操作" field="opt" ></t:dgCol>
   <t:dgConfOpt title="开始"  url="billController.do?start&id={id}"  message="开始录入" />
   <t:dgConfOpt title="结束"  url="billController.do?end&id={id}"   message="结束录入" />
   <t:dgConfOpt title="确认"  url="billController.do?accpet&id={id}"   message="确认完成" />
   <t:dgDelOpt title="删除" url="billController.do?del&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="billController.do?addorupdate" funname="add" height="800" width="1000"></t:dgToolBar>
   <t:dgToolBar title="视频回放"  icon="icon-search" url="billController.do?review" funname="detail" height="400"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="billController.do?addorupdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="billController.do?addorupdate" funname="detail"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>