<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>视频回放</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
 <link
	href="<%=path%>/webpage/com/lhmh/FinancialRegistration/tablecloth/tablecloth.css"
	rel="stylesheet" type="text/css" media="screen" />
<script type="text/javascript"
	src="<%=path%>/webpage/com/lhmh/FinancialRegistration/tablecloth/tablecloth.js"></script>
<style>


</style>
 <body style="overflow-y: hidden" scroll="no" onunload="stop()">
   <!-- 播放区域 -->
 <div id="playzone" width="550px" height="400px" >
 <object classid="clsid:65F0C054-AF04-4DCA-A3F5-0B86A91E02FB" id="prew" width='100%' height="398px" VIEWASTEXT>
  <param name="BorderStyle" value="1" />
  <param name="MousePointer" value="0" />
  <param name="Enabled" value="1" />
  <param name="Min" value="0" />
  <param name="Max" value="10" />
 </object>			
 </div>
	 		<input type="hidden" id="ip" name="ip" value="${ip}"/>	
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" tiptype="1" action="billBackMainController.do?reviewsave">
 		<input type="hidden" name="id" value="${id}"/>		
	
	    <div id="playzone" width="350px" >
		   	<table cellspacing="0" cellpadding="0">
				<tr height="25px">
					<td align="center">
						<div style="cursor:pointer;width:50px;text-align: center;" onclick="repaly()">播放</div>	
					</td>
					<td align="center">
					
						<div style="cursor:pointer;width:50px;text-align: center;" onclick="stop()">停止</div>
					</td>
					<td align="right">
						<label class="Validform_label">
							开始时间:
						</label>
					</td>
					<td class="value">
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="beginTime" name="beginTime" 
							     value="${beginTime}" datatype="*">
						<span class="Validform_checktip"></span>
					</td>
					<td align="right">
						<label class="Validform_label">
							结束时间:
						</label>
					</td>
					<td class="value">
						<input class="Wdate" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"  style="width: 150px" id="endTime" name="endTime" 
							     value="${endTime}" datatype="*">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
			</table>
	   </div>
   </t:formvalid>   
   
 </body>
 
 <script type="text/javascript">
 function repaly(){
		//alert("这是视频回放");
	 var ip=document.getElementById("ip").value;
	 var begintime=document.getElementById("beginTime").value;
	//	alert("这是视频回放"+begintime);
 		//prew.ConnectA("${ip}", 6002, 0, 0, "system", "system");
 		//ConnectA(“192.168.0.10”, 6002, 0, 0, “system”, “system”);
 	  prew.CreatePlay("${ip}",0,begintime);
 	   //alert("aaa");
 }

 //终止回放
 function stop(){
    	alert("终止回放");
	 prew.ClosePlay();//终止回放
 }

 </script>
 <script for="prew" language="JavaScript" event="ErrorEvent(nFlag)">
	alert(nFlag);
</script> 