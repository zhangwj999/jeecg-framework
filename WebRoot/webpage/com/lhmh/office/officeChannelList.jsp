<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<script type="text/javascript">
	$('#addOfficeChannelBtn').linkbutton({   
	    iconCls: 'icon-add'  
	});  
	$('#delOfficeChannelBtn').linkbutton({   
	    iconCls: 'icon-remove'  
	}); 
	$('#addOfficeChannelBtn').bind('click', function(){   
 		 var tr =  $("#add_officeChannel_table_template tr").clone();
	 	 $("#add_officeChannel_table").append(tr);
	 	 resetTrNum('add_officeChannel_table');
    });  
	$('#delOfficeChannelBtn').bind('click', function(){   
      	$("#add_officeChannel_table").find("input:checked").parent().parent().remove();   
        resetTrNum('add_officeChannel_table'); 
    }); 
    $(document).ready(function(){
    	$(".datagrid-toolbar").parent().css("width","auto");
    	//将表格的表头固定
	    $("#officeChannel_table").createhftable({
	    	height:'200px',
			width:'auto',
			fixFooter:false
			});
    });
 
    function checkOnlyOne(obj){
    	var val = $(obj).val();
    	if(val != null && val == '0'){
    		$("select[name*='isMain']").not(obj).html('<option value="0">是</option><option value="1"  selected="selected">否</option>');
    	}
    }
    
</script>
<div style="padding: 3px; height: 25px;width:auto;" class="datagrid-toolbar">
	<a id="addOfficeChannelBtn" href="#">添加</a> <a id="delOfficeChannelBtn" href="#">删除</a> 
</div>
<div style="width: auto;height: 300px;overflow-y:auto;overflow-x:scroll;">
<table border="0" cellpadding="2" cellspacing="0" id="officeChannel_table">
	<tr bgcolor="#E6E6E6">
		<td align="center" bgcolor="#EEEEEE">序号</td>
		<td align="center" bgcolor="#EEEEEE">操作</td>
				  <td align="left" bgcolor="#EEEEEE">通道</td>
				  <td align="left" bgcolor="#EEEEEE">是否主通道</td>
				  <td align="left" bgcolor="#EEEEEE">是否启用</td>
				  <td align="left" bgcolor="#EEEEEE">备注</td>
	</tr>
	<tbody id="add_officeChannel_table">	
	<c:if test="${fn:length(officeChannelList)  <= 0 }">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">1</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck"/></td>
				 <td align="left">				 
				 <select id="officeChannelList[0].channelId" name="officeChannelList[0].channelId" datatype="*">
				<c:forEach items="${channelList}" var="channel">
					<option value="${channel.channelId }" <c:if test="${channel.channelId==officeChannelList[0].channelId}">selected="selected"</c:if>>${channel.channelName}</option>
				</c:forEach></select>
				</td>
			
				<td align="left">
					<select name="officeChannelList[0].isMain" datatype="*" onchange="checkOnlyOne(this)">
						<option value="0" selected="selected">是</option>
						<option value="1">否</option>
					</select>
				</td>	
				
				  <td align="left"><t:dictSelect
					field="officeChannelList[0].status" typeGroupCode="status" hasLabel="false" ></t:dictSelect></td>
				<td align="left"><input name="officeChannelList[0].note" maxlength="25" type="text" style="width:120px;" ></td>
					
   			</tr>
	</c:if>
	<c:if test="${fn:length(officeChannelList)  > 0 }">
		<c:forEach items="${officeChannelList}" var="poVal" varStatus="stuts">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">${stuts.index+1 }</div></td>
				<td align="center">
					<input style="width:20px;"  type="checkbox" name="ck" />
					<input name="officeChannelList[${stuts.index }].id"  value="${poVal.id }" type="hidden" >
				</td>
				   <td align="left">
				    <select id="officeChannelList[${stuts.index }].channelId" defaultVal="${poVal.channelId }"  name="officeChannelList[${stuts.index }].channelId" datatype="*">
						<c:forEach items="${channelList}" var="channel">
							<option value="${channel.channelId }" 
							<c:if test="${channel.channelId==poVal.channelId }">selected="selected"</c:if>
							>${channel.channelName}</option>
						</c:forEach>
					</select>
				  </td>
				  
				<td align="left">
					<select name="officeChannelList[${stuts.index }].isMain" datatype="*" onchange="checkOnlyOne(this)">
						<c:if test="${poVal.isMain eq '0'}">
							<option value="0" selected="selected">是</option>
							<option value="1">否</option>						
						</c:if>
						<c:if test="${poVal.isMain eq '1'}">
							<option value="0">是</option>
							<option value="1" selected="selected">否</option>						
						</c:if>
					</select>
				</td>	
				
				   <td align="left"><t:dictSelect field="officeChannelList[${stuts.index }].status" typeGroupCode="status" hasLabel="false" defaultVal="${poVal.status }" ></t:dictSelect></td>
				   <td align="left"><input name="officeChannelList[${stuts.index }].note" maxlength="25" value="${poVal.note }" type="text" style="width:120px;"></td>
   			</tr>
		</c:forEach>
	</c:if>	
	</tbody>
</table>
</div>