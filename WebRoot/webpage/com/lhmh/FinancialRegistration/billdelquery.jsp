<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="billDelQueryList" title="文件删除查询" 
  actionUrl="billDelController.do?datagrid&flag=006"  autoLoadData="true"  fitColumns="true" fit="true" queryMode="group" checkbox="true" idField="id" >

   <t:dgCol title="编号" field="id" hidden="false"></t:dgCol>
   <t:dgCol title="业务流水号" field="billId" query="true"></t:dgCol>
 
   <t:dgCol title="理财室" field="officeId" query="true" replace="${departsReplace}"></t:dgCol> 
   <t:dgCol title="理财日期" field="crtDate" ></t:dgCol>
   <t:dgCol title="到期日期" field="dueDate" query="true" ></t:dgCol>
  
   <t:dgCol title="客户姓名" field="custName" query="true" ></t:dgCol>
   <t:dgCol title="业务类型" field="billType" query="true" replace="${typeReplace}"></t:dgCol> 

   <t:dgCol title="银行" field="bankId" query="true" replace="${depaReplace}"></t:dgCol> 
   <t:dgCol title="签约状态" field="signStatus" dictionary="signstatus"></t:dgCol>
   <t:dgCol title="开始时间" field="beginTime" formatter="yyyy-MM-dd hh:mm:ss"></t:dgCol>
   <t:dgCol title="结束时间" field="endTime" formatter="yyyy-MM-dd hh:mm:ss"></t:dgCol>
   
   <t:dgCol title="删除状态" field="isDel" dictionary="isdel"></t:dgCol>
  
   <t:dgCol title="用户编号" field="userId" ></t:dgCol>
   <t:dgCol title="员工姓名" field="userName" ></t:dgCol>
   <t:dgCol title="操作" field="opt" width="200"></t:dgCol>
   <t:dgConfOpt title="删除"  url="billMainController.do?delBill&id={id}"  message="确认删除" />
   <t:dgToolBar title="视频回放" icon="icon-search"  url="billQueryMainController.do?playViedo" height="550" funname="update" > </t:dgToolBar>
  </t:datagrid>
  </div>
 </div>
  <script type="text/javascript">
	setTimeout(function(){
	     $("input[name='dueDate']").val('${tody}');
	},100);
 </script>
