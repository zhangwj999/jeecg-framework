<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.Map"%>
<%@include file="/context/mytags.jsp"%>
<!doctype html>
<html lang="zh_cn">
<head>
<meta charset="utf-8" />
<title>视频播放</title>
<meta name="description"
	content="A simple HTML5 media player with custom controls and WebVTT captions.">
<meta name="author" content="Sam Potts">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="<%=path%>/webpage/com/lhmh/FinancialRegistration/tablecloth/tablecloth.css"
	rel="stylesheet" type="text/css" media="screen" />
<script type="text/javascript"
	src="<%=path%>/webpage/com/lhmh/FinancialRegistration/tablecloth/tablecloth.js"></script>

<style>
body {
	margin: 0;
	padding: 0;
	background: #f1f1f1;
	font: 70% Arial, Helvetica, sans-serif;
	color: #555;
	line-height: 150%;
	text-align: left;
}

a {
	text-decoration: none;
	color: #057fac;
}

a:hover {
	text-decoration: none;
	color: #999;
}

h1 {
	font-size: 140%;
	margin: 0 20px;
	line-height: 80px;
}

h2 {
	font-size: 120%;
}

#container {
	margin: 0 auto;
	width: 720px;
	background: #fff;
	padding-bottom: 20px;
}

#content {
	margin: 0 20px;
}

p.sig {
	margin: 0 auto;
	width: 680px;
	padding: 1em 0;
}

form {
	margin: 1em 0;
	padding: .2em 20px;
	background: #eee;
}
</style>
</head>
<%
	List list = (List) request.getAttribute("billList");
	// System.out.print(list.size());
	String url1="";
%>
<body onunload="startstop()">

	<div id="content" height="200px">
		<table cellspacing="0" cellpadding="0">
			<tr height="25px">
				<td align=center>视频名称</td>
				<!--  <td align=center> 视频地址</td>-->
				<td colspan="2" align=center>操作</td>

			</tr>

			<%
				String[] playurl = new String[list.size()];
				for (int i = 0; i < list.size(); i++) {

					Object[] temp = (Object[]) list.get(i);
					String url = (String) temp[0];
					String playName = (String) temp[1];
					if (i==0) url1 =url ;
				
			%>
			<tr height="25px">
				<td><%=playName%></td>
				<!-- <td><%=url%></td>-->
				<td><a title="<%=url%>" href="#" onclick="doGo(this.title);return false;">播放</a> 
        <span style="margin: 20px;" /> </td>
				<td><div onclick="startstop()">停止</div></td>
			
				</tr>
			<%
				}
				//顺序播放文件
			%>


		</table>
	</div>
	<div> 
        <object classid="clsid:9be31822-fdad-461b-ad51-be1d1c159921" 
                width="640" 
                height="480" 
                id="vlc" 
                events="true"> 
        <param name="mrl" value="" /> 
        <param name="showdisplay" value="true" /> 
        <param name="autoloop" value="false" /> 
        <param name="autoplay" value="true" /> 
        <param name="volume" value="50" /> 
        <param name="starttime" value="0" /> 
        <embed pluginspage="http://www.videolan.org" 
                     type="application/x-vlc-plugin" 
                     version="videolan.vlcplugin.2" 
                     width="640" 
                     height="480" 
                     name="vlc"> 
        </embed> 
        </object> 
</div> 


</body>

<script type="text/javascript">
	//wmp.controls.stop() ;
	var itemId = 0; 
	//点击播放
	function startplay(url) {
		alert(url);
		 itemId=vlc.playlist.add(url); 
		alert("sss");
		vlc.playlist.playItem(itemId); 
		alert("aa");
		//wmp.controls.stop() ;
		//wmp.URL=url ;
		//wmp.controls.play(); 
	}
	function startstop() {
		    getVLC("vlc").playlist.stop(); 
		//wmp.controls.stop() ;
	}
	function getVLC(name) 
{ 
        if (window.document[name])    
        { 
                return window.document[name]; 
        } 
        if (navigator.appName.indexOf("Microsoft Internet")==-1) 
        { 
                if (document.embeds && document.embeds[name]) 
                        return document.embeds[name];    
        } 
        else 
        { 
                return document.getElementById(name); 
        } 
} 

function doGo(mrl) 
{ 
        var vlc = getVLC("vlc"); 
        //alert(vlc);
        itemId=vlc.playlist.add(mrl); 
       //   alert(itemId);
        vlc.playlist.playItem(itemId); 
       // document.getElementById("btn_stop").disabled = false; 
} 
</script>
 <script for="vlc" language="JavaScript" event="ErrorEvent(nFlag)">
	alert(nFlag);
</script>