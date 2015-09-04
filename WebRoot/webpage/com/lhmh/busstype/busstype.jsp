<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>业务类型</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
  <script type="text/javascript">		
	$(function() {
		$('#cc').combotree({
			url : 'busstypeController.do?setPFunction&selfId=${busstypePage.id}',
			panelHeight:'auto',
			onClick: function(node){
				$("#functionId").val(node.id);
			}
		});
		
		if($('#busstypeLevel').val()=='1'){
			$('#pfun').show();
		}else{
			$('#pfun').hide();
		}
		
		
		$('#busstypeLevel').change(function(){
			if($(this).val()=='1'){
				$('#pfun').show();
				var t = $('#cc').combotree('tree');
				var nodes = t.tree('getRoots');
				if(nodes.length>0){
					$('#cc').combotree('setValue', nodes[0].id);
					$("#functionId").val(nodes[0].id);
				}
			}else{
				var t = $('#cc').combotree('tree');
				var node = t.tree('getSelected');
				if(node){
					$('#cc').combotree('setValue', null);
				}
				$('#pfun').hide();
			}
		});
	});
</script>
 </head>
 <body style="overflow-y: hidden" scroll="no">
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="div" action="busstypeController.do?saveBusstype">
		<input id="id" name="id" type="hidden" value="${busstypePage.id }">
		<input id="busstypeId" name="busstypeId" type="hidden" value="${busstypePage.id }">
		<fieldset class="step">
		
			<div class="form">
		      <label class="Validform_label">类型名称:</label>
		      <input class="inputxt" id="busstypeName" name="busstypeName" 
					   value="${busstypePage.busstypeName}"  datatype="s2-50" onchange="checkBussTypeName(this)" />
		      <span class="Validform_checktip">请输入类型名称</span>
		    </div>
	    
		    <div class="form">
		    	<label class="Validform_label"> 业务类型等级: </label> 
		    	<select name="busstypeLevel" id="busstypeLevel" datatype="*">
					<option value="0" <c:if test="${busstypePage.busstypeLevel eq 0}">selected="selected"</c:if>>一级业务类型</option>
					<option value="1" <c:if test="${busstypePage.busstypeLevel>0}"> selected="selected"</c:if>>下级业务类型</option>
				</select> 
				<span class="Validform_checktip">请选择业务类型等级</span>
			</div>
			<div class="form" id="pfun">
				<label class="Validform_label"> 父级业务类型: </label> 
				<input id="cc" <c:if test="${busstypePage.busstypeEntity.busstypeLevel eq 0}"> value="${busstypePage.busstypeEntity.id}"</c:if>
					<c:if test="${busstypePage.busstypeEntity.busstypeLevel > 0}"> value="${busstypePage.busstypeEntity.busstypeName}"</c:if>> 
					
					<input id="functionId" name="busstypeEntity.id" style="display: none;" value="${busstypePage.busstypeEntity.id}"></div>
		    
			<div class="form">
		      <label class="Validform_label">保存时间(月):</label>
		      <input class="inputxt" id="month" name="month"
					   value="${busstypePage.month}" datatype="n1-8">
		      <span class="Validform_checktip">请输入整数</span>
		    </div>
			<div class="form">
		      <label class="Validform_label">备注:</label>
		      <input class="inputxt" id="note" name="note" ignore="ignore"
					   value="${busstypePage.note}">
		      <span class="Validform_checktip">请输入备注</span>
		    </div>			
	    </fieldset>
  </t:formvalid>
 </body>
  <script type="text/javascript">
 	var id = $("#id").val();
 	function checkBussTypeName(obj){
 		var val = $(obj).val();
		$("#busstypeName").attr("ajaxurl","busstypeController.do?checkBussTypeName&busstypeName="+encodeURI(encodeURI(val))+"&id="+id);
 	}
 </script>