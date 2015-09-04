<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div id="main_depart_list" class="easyui-layout" fit="true">
	<div region="center" style="padding: 1px;">
		 <t:datagrid name="billStatusQueryList" title="上传状态查询" 
		  actionUrl="billStatusQueryController.do?datagrid&flag=005"  autoLoadData="true"  fitColumns="true" fit="true" queryMode="group" checkbox="false" idField="id" >
		
		 <t:dgCol title="编号" field="id" hidden="false"></t:dgCol>
		   <t:dgCol title="业务流水号" field="billId" query="true"></t:dgCol>
		   <t:dgCol title="理财室" field="officeId" query="true" replace="${departsReplace}"></t:dgCol> 
		<%--    <t:dgCol title="理财日期" field="crtDate" ></t:dgCol> --%>
			<t:dgCol title="客户姓名" field="custName" query="true" ></t:dgCol>
		<%--    <t:dgCol title="业务类型" field="billType" query="true" replace="${typeReplace}"></t:dgCol>  --%>
		   <t:dgCol title="银行" field="bankId" query="true" replace="${depaReplace}"></t:dgCol> 
		<%--    <t:dgCol title="签约状态" field="signStatus" dictionary="signstatus"></t:dgCol> --%>
		   <t:dgCol title="开始时间" field="beginTime" formatter="yyyy-MM-dd hh:mm:ss"></t:dgCol>
		   <t:dgCol title="结束时间" field="endTime" formatter="yyyy-MM-dd hh:mm:ss"></t:dgCol>
		<%--    <t:dgCol title="理财业务状态" field="bStatus" dictionary="bStatus"></t:dgCol> --%>
		<%--    <t:dgCol title="备注" field="note" ></t:dgCol> --%>
		<%--     <t:dgCol title="用户编号" field="userId" ></t:dgCol> --%>
		   <t:dgCol title="员工姓名" field="userName" ></t:dgCol>
		   <t:dgCol title="操作" field="opt" width="200"></t:dgCol>
		   <t:dgFunOpt funname="queryUsersByDepart(id)" title="查看明细"></t:dgFunOpt>
		  </t:datagrid>
<!-- 		<div id="departListtb" style="padding: 3px; height: 25px"> -->
<!-- 			<div style="float: left;"></div> -->
<!-- 		</div> -->
	</div>
</div>
<div data-options="region:'east',
	title:'明细列表',
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
<div class="easyui-panel" style="padding: 1px;" fit="true" border="false" id="userListpanel"></div>
</div>

<script type="text/javascript">
<!--
$(function() {
	var li_east = 0;
});

function queryUsersByRowData(rowData){
	if(li_east == 0){
	   $('#main_depart_list').layout('expand','east'); 
	}
	$('#userListpanel').panel("refresh", "billStatusQueryController.do?detailList&billId=" + rowData.billId);
}

function queryUsersByDepart(billId){
	if(li_east == 0){
	   $('#main_depart_list').layout('expand','east'); 
	}
	$('#userListpanel').panel("refresh", "billStatusQueryController.do?detailList&billId=" + billId);
}
//-->
</script>
 