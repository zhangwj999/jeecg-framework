<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="billFileList" title="文件上传查询" 
  actionUrl="billFileMainController.do?datagrid&status=1,2&flag=002"  autoLoadData="true"  fitColumns="true" fit="true" queryMode="group" checkbox="true" idField="id" >

<t:dgCol title="编号" field="id" hidden="false"></t:dgCol>
   <t:dgCol title="业务流水号" field="billId" query="true"></t:dgCol>
   <t:dgCol title="理财室" field="officeId" query="true" replace="${departsReplace}"></t:dgCol> 
   <t:dgCol title="理财日期" field="crtDate" ></t:dgCol>
     <t:dgCol title="客户" field="custId" query="true" replace="${custReplace}"></t:dgCol> 
   <t:dgCol title="业务类型" field="billType" query="true" replace="${typeReplace}"></t:dgCol> 
  <t:dgCol title="银行" field="bankId" query="true" replace="${depaReplace}"></t:dgCol> 
   <t:dgCol title="签约状态" field="signStatus" dictionary="signstatus"></t:dgCol>
   <t:dgCol title="开始时间" field="beginTime" formatter="yyyy-MM-dd hh:mm:ss"></t:dgCol>
   <t:dgCol title="结束时间" field="endTime" formatter="yyyy-MM-dd hh:mm:ss"></t:dgCol>
   <t:dgCol title="理财业务状态" field="bStatus" dictionary="bStatus"></t:dgCol>
   <t:dgCol title="文件上传状态" field="status" dictionary="filestatus"></t:dgCol>
   <t:dgCol title="备注" field="note" ></t:dgCol>
    <t:dgCol title="用户编号" field="userId" ></t:dgCol>
   <t:dgCol title="员工姓名" field="userName" ></t:dgCol>
   <t:dgCol title="操作" field="opt" width="200"></t:dgCol>
   <t:dgConfOpt title="文件上传"  url="billFileMainController.do?filechange&id={id}"  message="文件上传" />
   <t:dgToolBar title="视频预览"  icon="icon-search" url="billFileMainController.do?review" funname="detail" height="400"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>