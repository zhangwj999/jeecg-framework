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
</script>
<div style="padding: 3px; height: 25px;width:auto;" class="datagrid-toolbar">
	<a id="addUserDataPermitEntityBtn" href="#">添加</a> <a id="delUserDataPermitEntityBtn" href="#">删除</a> 
</div>
<div style="width: auto;height: 300px;overflow-y:auto;overflow-x:scroll;">
<table border="0" cellpadding="2" cellspacing="0" id="userDataPermitEntity_table">
	<tr bgcolor="#E6E6E6">
		<td align="center" bgcolor="#EEEEEE">序号</td>
		<td align="center" bgcolor="#EEEEEE">操作</td>
				  <td align="left" bgcolor="#EEEEEE">dataper</td>
				  <td align="left" bgcolor="#EEEEEE">dataOrg</td>
				  <td align="left" bgcolor="#EEEEEE">dataUse</td>
	</tr>
	<tbody id="add_userDataPermitEntity_table">	
	<c:if test="${fn:length(userDataPermitEntityList)  <= 0 }">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">1</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck"/></td>
				  <td align="left"><input name="userDataPermitEntityList[0].datapermitType" maxlength="1" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="userDataPermitEntityList[0].dataOrgId" maxlength="32" type="text" style="width:120px;" ></td>
				  <td align="left"><input name="userDataPermitEntityList[0].dataUserId" maxlength="32" type="text" style="width:120px;" ></td>
   			</tr>
	</c:if>
	<c:if test="${fn:length(userDataPermitEntityList)  > 0 }">
		<c:forEach items="${userDataPermitEntityList}" var="poVal" varStatus="stuts">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">${stuts.index+1 }</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck" /></td>
				<input name="userDataPermitEntityList[${stuts.index }].id"  value="${poVal.id }" type="hidden" >
				   <td align="left"><input name="userDataPermitEntityList[${stuts.index }].datapermitType" maxlength="1" value="${poVal.datapermitType }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="userDataPermitEntityList[${stuts.index }].dataOrgId" maxlength="32" value="${poVal.dataOrgId }" type="text" style="width:120px;"></td>
				   <td align="left"><input name="userDataPermitEntityList[${stuts.index }].dataUserId" maxlength="32" value="${poVal.dataUserId }" type="text" style="width:120px;"></td>
   			</tr>
		</c:forEach>
	</c:if>	
	</tbody>
</table>
</div>