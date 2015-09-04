<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>

 <body style="overflow-y: hidden" scroll="no" onunload="stopPlay()" >
 
<div>
	<button id="dispaly" onclick="display()" value="预览">开始</button>
</div>   
   <!-- 播放区域 -->
 <div id="playzone" width="550px" height="500" >
<object classid="clsid:E39BA3CC-FC92-4446-939A-922EF80D5389" id="prew" width='100%' height="550" VIEWASTEXT>
  <param name="BorderStyle" value="1" />
  <param name="MousePointer" value="0" />
  <param name="Enabled" value="1" />
  <param name="Min" value="0" />
  <param name="Max" value="10" />
</object>
 </div>

   
 </body>
 
 <script type="text/javascript">

 //关闭预览
 function stopPlay(){
  alert("关闭预览");
	 prew.ClosePrew();//关闭视频预览 
 }
function display(){
	//alert("这是预览");
		//prew.CreatePrew("192.168.199.103",0);
		 prew.CreatePrew("${ip}",0);
	}
//display();
 </script>
 
<script for="prew" language="JavaScript" event="ErrorEvent(nFlag)">
	alert(nFlag);
</script>

<SCRIPT language=javascript event=TimeEvent(type,time) for=nvrclient>
	alert(time);
	if ( type == 0 ){
	   parent.document.getElementById("begin").value=time;
	}else{
	   parent.document.getElementById("end").value=time;
	}
</SCRIPT>