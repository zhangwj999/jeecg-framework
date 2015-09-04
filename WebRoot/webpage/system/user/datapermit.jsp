<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>用户权限控制</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">
  //初始化下标
	function resetTrNum(tableId) {
		$tbody = $("#"+tableId+"");
		$tbody.find('>tr').each(function(i){
			$(':input, select', this).each(function(){
				var $this = $(this), name = $this.attr('name'), val = $this.val();
				if(name!=null){
					if (name.indexOf("#index#") >= 0){
						$this.attr("name",name.replace('#index#',i));
					}else{
						var s = name.indexOf("[");
						var e = name.indexOf("]");
						var new_name = name.substring(s+1,e);
						$this.attr("name",name.replace(new_name,i));
					}
				}
			});
			$(this).find('div[name=\'xh\']').html(i+1);
		});
	}
	//人员
	$(function() {
		$.ajax({ //一个Ajax过程 
           type : "get", //以post方式与后台沟通
           async : false,
           url : 'userController.do?getUserList',
           success : function(json) {
        	   	json = eval( '('+json+')' );
	         	var html1="<option ></option>";
	         	var userList = json;
				for(var i=0;i<userList.length;i++){
					var user = eval(userList[i]);
					html1+="<option value='"+user.id+"'>"+user.userName+"</option>"; 
				}
	         	$("#dataUserId0").append(html1);
	         	
	   	   	 	$("select[name*='dataUserId']").not("#dataUserId0").each(function(){
		 			var sel = $(this).attr("dataUserId");
				 	var html2 = "<option ></option>";
				 	for(var i=0;i<userList.length;i++){
						var user = eval(userList[i]);
		    		 	if(sel == user.id){
		    			 	html2+="<option selected='selected' value='"+user.id+"'>"+user.userName+"</option>"; 
		    		 	}else{
		    			 	html2+="<option value='"+user.id+"'>"+user.userName+"</option>"; 
		    		 	}
		    	 	}
				 	$(this).html(html2);
			 	});
           	}
		});
	});
	
	//部门
	$(function() {
		$.ajax({ //一个Ajax过程 
           type : "get", //以post方式与后台沟通
           async : false,
           url : 'userController.do?getOrgList',
           success : function(json) {
        	   
		      	var html1="<option ></option>";
				for(var i=0;i<json.length;i++){
					var user = json[i];
					html1+="<option value='"+user.id+"'>"+user.departname+"</option>"; 
				}
		      	$("#dataDepartId0").append(html1);   
	         	
	   	 		$("select[name*='dataOrgId']").not("#dataDepartId0").each(function(){
					var sel = $(this).attr("dataOrgId");
					var html2 = "<option ></option>";
					for(var i=0;i<json.length;i++){
						var user = json[i];
				 		if(sel == user.id){
				 			 html2+="<option selected='selected' value='"+user.id+"'>"+user.departname+"</option>"; 
				 		}else{
				 			 html2+="<option value='"+user.id+"'>"+user.departname+"</option>"; 
				 		}
				 	}
					$(this).html(html2);
				});
           }
           
		});
	});
	
	$(function(){
	  	 $("select[name*='datapermitType']").not("#datapermitType").each(function(){
			 var sel = $(this).attr("datapermitType");
			 var html3 = "<option ></option>";
			 if(sel == '1'){
				 html3 += '<option selected="selected" value="1">部门权限</option><option value="2">人员权限</option>';
			 }else if(sel == '2'){
				 html3 += '<option value="1">部门权限</option><option  selected="selected" value="2">人员权限</option>';
			 }else{
				 html3 += '<option value="1">部门权限</option><option value="2">人员权限</option>';
			 }
			 $(this).html(html3);   
			 
	   		 setInvalidOpt(this);
		 });
	});

	function setInvalidOpt(obj){
		var type = $(obj).val();
		var dataOrgId = $(obj).parents("tr").find("select[name*='dataOrgId']");
		var dataUserId = $(obj).parents("tr").find("select[name*='dataUserId']");
		if(type == null || type === undefined){
			dataOrgId.removeAttr("disabled");
			dataUserId.removeAttr("disabled");
		}else if('1'==type){
			dataOrgId.removeAttr("disabled");
			dataUserId.attr("disabled","true");
		}else if('2'==type){
			dataOrgId.attr("disabled","true");
			dataUserId.removeAttr("disabled");
		}
	}  
 </script>
 </head>
 <body style="overflow-y: hidden" scroll="no">
  <t:formvalid formid="formobj" dialog="true" layout="table" tiptype="1" action="userController.do?savedatapermit">
	<input id="id" name="id" type="hidden" value="${user.id}">
	<table cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right"><label class="Validform_label"> 用户名: </label></td>
			<td class="value">${user.userName }</td>
 
			<td align="right"><label class="Validform_label"> 姓名: </label></td>
			<td class="value">${user.realName}</td>
		</tr>
	</table>
	
			<div style="width: auto;height: 200px;">
				<%-- 增加一个div，用于调节页面大小，否则默认太小 --%>
				<div style="width:690px;height:1px;"></div>
				<t:tabs id="tt" iframe="false" tabPosition="top" fit="false">
				 <t:tab href="userController.do?dataPermitList&id=${user.id}" icon="icon-search" title="数据权限明细" id="userDataPermitEntity"></t:tab>
				</t:tabs>
			</div>
			</t:formvalid>
			<!-- 添加 明细 模版 -->
		<table style="display:none">
		<tbody id="add_userDataPermitEntity_table_template">
			<tr>
			 <td align="center"><div style="width: 25px;" name="xh"></div></td>
			 <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
				  <td align="left">
				  	<select name="userDataPermitEntityList[#index#].datapermitType" style="width:120px;"  onchange="setInvalidOpt(this)">
				  		<option></option>
				  		<option value="1">部门权限</option>
				  		<option value="2">人员权限</option>
				  	</select>
				  </td>
				  <td align="left"><select name="userDataPermitEntityList[#index#].dataOrgId"  id="dataDepartId0" onchange="checkOnlyOne(this)" style="width:120px;"></select></td>
				  <td align="left"><select name="userDataPermitEntityList[#index#].dataUserId" id="dataUserId0"  onchange="checkOnlyOne(this)" style="width:120px;"></select></td>
			</tr>
		 </tbody>
		</table>
 </body>