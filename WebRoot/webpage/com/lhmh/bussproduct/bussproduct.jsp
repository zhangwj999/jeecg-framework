<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>产品类型</title>
  <t:base type="jquery,easyui,tools,DatePicker"></t:base>
 </head>
 <body style="overflow-y: hidden" scroll="no">
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" action="bussproductController.do?save">
			<input id="id" name="id" type="hidden" value="${bussproductPage.id }">
			<table style="width: 600px;" cellpadding="0" cellspacing="1" class="formtable">
				<tr>
					<td align="right">
						<label class="Validform_label">
							产品编号:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="productId" name="productId" 
					  	 value="${bussproductPage.productId}" datatype="s2-16" onchange="checkProductId(this)" >
		     			 <span class="Validform_checktip">编号范围在2~16位字符</span>		    
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							产品名称:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="productName" name="productName"
					  	 value="${bussproductPage.productName}" datatype="s2-50" onchange="checkProductName(this)" >
		     			 <span class="Validform_checktip">请填写产品名称</span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							业务类型:
						</label>
					</td>
					<td class="value">

					<select id="busstypeId" name="busstypeId" datatype="*">
						<c:forEach items="${busstypeList}" var="busstype">
							<option value="${busstype.id }" <c:if test="${busstype.id==bussproductPage.busstypeId}">selected="selected"</c:if>>${busstype.busstypeName}</option>
						</c:forEach>
					</select> <span class="Validform_checktip">请选择业务类型</span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							风险级别:
						</label>
					</td>
					<td class="value">
						<t:dictSelect field="riskName" typeGroupCode="risk"
               				defaultVal="default" hasLabel="false" title="(没有label)"></t:dictSelect>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							所属单位:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="comName" name="comName"  datatype="s1-50"
							   value="${bussproductPage.comName}">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							产品到期日:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="dueData" name="dueData" ignore="ignore" datatype="*"
							   value="${bussproductPage.dueData}" onchange="checkDate(this)">
						<span class="Validform_checktip">格式:'19900101'</span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							价格(元):
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="price" name="price"  datatype="s1-18"
							   value="${bussproductPage.price}" onchange="checkPrice(this)">
						<span class="Validform_checktip">请输入价格</span>
					</td>
				</tr>
				<tr>
					<td align="right">
						<label class="Validform_label">
							备注:
						</label>
					</td>
					<td class="value">
						<input class="inputxt" id="note" name="note" ignore="ignore"
							   value="${bussproductPage.note}">
						<span class="Validform_checktip"></span>
					</td>
				</tr>
			</table>
		</t:formvalid>
 </body>
   <script type="text/javascript">
 	var id = $("#id").val();
 	function checkProductName(obj){
 		var val = $(obj).val();
		$("#productName").attr("ajaxurl","bussproductController.do?checkProductName&productName="+encodeURI(encodeURI(val))+"&id="+id);
 	}
 	function checkProductId(obj){
 		var val = $(obj).val();
		$("#productId").attr("ajaxurl","bussproductController.do?checkProductId&productId="+val+"&id="+id);
 	}
 	function checkDate(obj){
 		var val = $(obj).val();
 		var reg = /[\d]{8}/g;
 		var rlt = reg.exec(val);
		if(rlt!=null && rlt.length>0){
			$(obj).val(rlt[0]);
		}else{
			$(obj).val('');
		}
 	}
 	function checkPrice(obj){
		var reg = /(([\d]{1,12})(\.[\d]{1,3})?)/g;
		var val = $(obj).val();
		var rlt = reg.exec(val);
		if(rlt!=null && rlt.length>0){
			val = rlt[0];
			val = parseFloat(val);
			val = val.toFixed(2);
			$(obj).val(val);
		}else{
			$(obj).val('');
		}
 	}
 </script>