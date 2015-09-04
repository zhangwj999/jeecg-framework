<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<script type="text/javascript">
	$('#addUserDataPermitEntityBtn').linkbutton({   
	    iconCls: 'icon-add'  
	});
	$('#delUserDataPermitEntityBtn').linkbutton({
	    iconCls: 'icon-remove'  
	}); 
	$('#addUserDataPermitEntityBtn').bind('click', function(){   
		 var tr =  $("#add_userDataPermitEntity_table_template tr").clone();
	 	 $("#add_userDataPermitEntity_table").append(tr);
	 	 resetTrNum('add_userDataPermitEntity_table');
	});  
	$('#delUserDataPermitEntityBtn').bind('click', function(){   
	  	$("#add_userDataPermitEntity_table").find("input:checked").parent().parent().remove();   
	    resetTrNum('add_userDataPermitEntity_table'); 
	}); 
	$(document).ready(function(){
		$(".datagrid-toolbar").parent().css("width","auto");
	});
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
	         	$("#dataUserId1").append(html1);
	         	
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
		      	$("#dataDepartId1").append(html1);   
	         	
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
	
	//保证数据权限没有重复
	function checkOnlyOne(obj){
		var $type = $(obj).parents("tr").find("select[name*='datapermitType']"); //当前行类型
		var objVal = $(obj).val();
		
		var $datapermittypes = $("select[name*='datapermitType']").not($type);
		//第一个循环判断本行是否重复行，如果是将类型设置为空
		//第二个循环判断是否已经有类型为空的行，如果已有，删除本行
		if($datapermittypes != null && $datapermittypes.length>0){
			for(var i= 0;i<$datapermittypes.length;i++){
				var $tr = $($datapermittypes[i]).parents("tr");
				var $datatype = $tr.find("select[name*='datapermitType']");
				if($type.val() == $datatype.val()){
					if('1' == $type.val() || "1" == $type.val() ){
						var dataOrgId = $tr.find("select[name*='dataOrgId']").val();
						if(dataOrgId == objVal){
							alert("不允许选择相同的权限，请重新选择！");
							$(obj).val("");
							$type.val("");
						}
					}else{
						var dataUserId = $tr.find("select[name*='dataUserId']").val();
						if(dataUserId == objVal){
							alert("不允许选择相同的权限，请重新选择！");
							$(obj).val("");
							$type.val("");
						}
					}
				}
			}
			
			if($type.val() == ''){
				for(var i= 0;i<$datapermittypes.length;i++){
					var $tr = $($datapermittypes[i]).parents("tr");
					var $datatype = $tr.find("select[name*='datapermitType']");
					if($datatype.val() == ''){
						$(obj).parents("tr").remove();
					}
				}	
			}
		}
	}
	
</script>
<div style="padding: 3px; height: 25px;width:auto;" class="datagrid-toolbar">
	<a id="addUserDataPermitEntityBtn" href="#">添加</a> <a id="delUserDataPermitEntityBtn" href="#">删除</a> 
</div>
<div style="width: auto;height: 300px;overflow-y:auto;overflow-x:scroll;">
	<table border="0" cellpadding="2" cellspacing="0" id="userDataPermitEntity_table" width="65%">
		<tr bgcolor="#E6E6E6">
			<td align="center" bgcolor="#EEEEEE">序号</td>
			<td align="center" bgcolor="#EEEEEE">操作</td>
					  <td align="left" bgcolor="#EEEEEE">权限类型</td>
					  <td align="left" bgcolor="#EEEEEE">部门权限</td>
					  <td align="left" bgcolor="#EEEEEE">人员权限</td>
		</tr>
		<tbody id="add_userDataPermitEntity_table">	
		<c:if test="${fn:length(userDataPermitEntityList)  <= 0 }">
				<tr>
					<td align="center"><div style="width: 25px;" name="xh">1</div></td>
					<td align="center"><input style="width:20px;"  type="checkbox" name="ck"/></td>
					  <td align="left">
					  	<select name="userDataPermitEntityList[0].datapermitType" style="width:120px;" onchange="setInvalidOpt(this)">
					  		<option></option>
					  		<option value="1">部门权限</option>
					  		<option value="2">人员权限</option>
					  	</select>
					  </td>
					  <td align="left"><select name="userDataPermitEntityList[0].dataOrgId" onchange="checkOnlyOne(this)" id="dataDepartId1"  style="width:120px;"></select></td>
					  <td align="left"><select name="userDataPermitEntityList[0].dataUserId" onchange="checkOnlyOne(this)"  id="dataUserId1"  style="width:120px;"></select></td>
	   			</tr>
		</c:if>
		<c:if test="${fn:length(userDataPermitEntityList)  > 0 }">
			<c:forEach items="${userDataPermitEntityList}" var="poVal" varStatus="stuts">
				<tr>
					<td align="center"><div style="width: 25px;" name="xh">${stuts.index+1 }</div></td>
					<td align="center"><input style="width:20px;"  type="checkbox" name="ck" /></td>
					<td align="left">
						<input name="userDataPermitEntityList[${stuts.index }].id"  value="${poVal.id }" type="hidden" >
					  	<select name="userDataPermitEntityList[${stuts.index }].datapermitType" datapermitType="${poVal.datapermitType}"  style="width:120px;" ></select>
				   	</td>
					<td align="left">
						<select  name="userDataPermitEntityList[${stuts.index}].dataOrgId"  dataOrgId="${poVal.dataOrgId}" onchange="checkOnlyOne(this)"  style="width:120px;" ></select>
					</td>
					<td align="left">
						<select  name="userDataPermitEntityList[${stuts.index }].dataUserId"  dataUserId="${poVal.dataUserId}"  onchange="checkOnlyOne(this)"   style="width:120px;" ></select>
					</td>
	   			</tr>
			</c:forEach>
		</c:if>	
		</tbody>
	</table>
</div>