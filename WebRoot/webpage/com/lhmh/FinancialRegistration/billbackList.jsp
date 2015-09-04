<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="billBackMainList" title="业务补录" 
  actionUrl="billBackMainController.do?datagrid&bStatus=1,2,3&flag=001"  autoLoadData="true"  fitColumns="true" fit="true" queryMode="group" checkbox="true" idField="id" >

 <t:dgCol title="编号" field="id" hidden="false"></t:dgCol>
   <t:dgCol title="业务流水号" field="billId" query="true"></t:dgCol>
   <t:dgCol title="理财室" field="officeId" query="true" replace="${departsReplace}"></t:dgCol> 
   <t:dgCol title="理财日期" field="crtDate" query="true" ></t:dgCol>
   <t:dgCol title="客户姓名" field="custName" query="true" ></t:dgCol>
   <t:dgCol title="业务类型" field="billType" query="true" replace="${typeReplace}"></t:dgCol> 
   <t:dgCol title="签约状态" field="signStatus" dictionary="signstatus"></t:dgCol>
   <t:dgCol title="开始时间" field="beginTime" formatter="yyyy-MM-dd hh:mm:ss"></t:dgCol>
   <t:dgCol title="结束时间" field="endTime" formatter="yyyy-MM-dd hh:mm:ss"></t:dgCol>
   <t:dgCol title="理财业务状态" field="bStatus" dictionary="bStatus"></t:dgCol>
   <t:dgCol title="备注" field="note" ></t:dgCol>
   <t:dgCol title="操作" field="opt" width="200"></t:dgCol>
   <t:dgConfOpt title="确认"  url="billBackMainController.do?accpet&id={id}"   message="确认完成" />
   <t:dgDelOpt title="删除" url="billBackMainController.do?del&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="billBackMainController.do?addorupdate" funname="add" width="800"></t:dgToolBar>
   <t:dgToolBar title="视频回放"  icon="icon-search" url="billBackMainController.do?review" funname="update" height="500"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="billBackMainController.do?addorupdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="billBackMainController.do?addorupdate" funname="detail"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
<script type="text/javascript">
	setTimeout(function(){
	     $("input[name='crtDate']").val('${tody}');
	},100);
</script>