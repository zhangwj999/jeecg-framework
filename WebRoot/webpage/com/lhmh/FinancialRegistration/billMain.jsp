<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<!DOCTYPE html>
<html>
 <head>
  <title>业务登记</title>
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
    //加载产品
	$(function() {
	 	$.ajax({ //一个Ajax过程 
   	         type : "post", //以post方式与后台沟通
              async : false,
              data: {info:encodeURIComponent(JSON.stringify(obj))}, 
              url : 'billMainController.do?getPrdouct',
              dataType : 'text',//
              success : function(json) {
            	  var html="";
            	  
            	  json=eval( "( "+json+" )" )
            	 html="<option ></option>";
            	 for(var i=0;i<json.length;i++){
            		 
            		html+="<option value='"+json[i].productId+"'>"+json[i].productName+"</option>"; 
            		
            	 }
            	 $("#productId0").append(html);
              }
        });
	});
   
	function setPrice(val){
		 var name = $(val).attr("name");
		 name=name.substr(0,name.indexOf("."))+".price";
		 var p1=$(val).children('option:selected').val();//这就是selected的值 
		 $.ajax({ //一个Ajax过程 
	             type : "post", //以post方式与后台沟通
	             async : false,
	             data: {info:encodeURIComponent(JSON.stringify(obj))}, 
	             url : 'billMainController.do?getPrdouct',
	             dataType : 'text',//
	             success : function(json) {
	           	  	 json=eval( "( "+json+" )" );
		           	 for(var i=0;i<json.length;i++){
		           		if(p1==json[i].productId){
		           			//设置price的值
		           			$("input[name='"+name+"']").val(json[i].price);
		           		} 
		           	 }
	             }
	     });
	}
	
 	function checkDitOnly(obj){
 		var val = $(obj).val();
 		var reg = /[\d]*/g;
 		var rlt = reg.exec(val);
		if(rlt!=null && rlt.length>0){
			$(obj).val(rlt[0]);
		}else{
			$(obj).val('');
		}
 	}
 </script>
 </head>
 <body style="overflow-y: hidden" scroll="no">
  <t:formvalid formid="formobj" dialog="true" usePlugin="password" layout="table" tiptype="1" action="billMainController.do?save">
	<input id="id" name="id" type="hidden" value="${billMainPage.id }" />
	<input id="crtDate" name="crtDate" type="hidden" value="${billMainPage.crtDate }" />
	<table cellpadding="0" cellspacing="1" class="formtable">
		<tr>
			<td align="right"><label class="Validform_label"> 业务流水号: </label></td>
			<td class="value">
				<input type="hidden" class="inputxt" id="billId" name="billId" readonly="readonly" value="${billMainPage.billId}" datatype="s1-16">
				${billMainPage.billId}
			</td>
			
			<td align="right"><label class="Validform_label"> 理财室: </label></td>
			<td class="value">
			   <select id="officeId" name="officeId" datatype="*">
					<c:forEach items="${departList}" var="depart">
						<option value="${depart.officeId }" <c:if test="${depart.officeId==billMainPage.officeId}">selected="selected"</c:if>>${depart.officeeName}</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		
		<tr>
				<td align="right"><label class="Validform_label"> 客户名称: </label></td>
				<td class="value">
					<input name="custId"  type="hidden" value="${billMainPage.custId}" id="custId"> 
					<input name="custName" class="inputxt"  id="custName" value="${custName}"
						readonly="readonly" datatype="s1-32"  errormsg="请选择一个客户"/>
			 		<t:choose hiddenName="custId" hiddenid="custId" url="custController.do?custHelp" name="custfunctionList" icon="icon-search" title="客户列表" textname="custName" isclear="true"></t:choose>
			      	<span class="Validform_checktip"></span>
				</td>
				
				<td align="right"><label class="Validform_label"> 签约状态: </label></td>
				<td class="value"> 
					<t:dictSelect field="signStatus" typeGroupCode="signstatus"
						defaultVal="default" hasLabel="false" title="性别(没有label)"></t:dictSelect>
				</td>				
		</tr>
		<tr>		   
				<td align="right"><label class="Validform_label"> 业务类型: </label></td>
				<td class="value">
					<input name="billType"  type="hidden" value="${billMainPage.billType}" id="billType" > 
					<input name="busstypeName" class="inputxt"  id="busstypeName" value="${busiTypeName}"
						readonly="readonly" datatype="s1-32" errormsg="请选择一种业务类型"/>					
					 <t:choose hiddenName="billType" hiddenid="busstypeId" url="busstypeController.do?busstypeHelp" name="functionList" icon="icon-search" title="业务类型列表" textname="busstypeName" isclear="true"></t:choose>
			      	<span class="Validform_checktip"></span>
				</td>
				
				<td align="right"><label class="Validform_label"> 备注: </label></td>
				<td class="value">
					<input class="inputxt" id="note" name="note" ignore="ignore" value="${billMainPage.note}">
				</td>				
			</tr>
		<tr>
			<td align="right"><label class="Validform_label"> 到期日期: </label></td>
			<td class="value" colspan="3"><input class="inputxt" id="dueDate" name="dueDate" ignore="ignore"
					   value="${billMainPage.dueDate}" readonly="readonly"></td>
		</tr>
	</table>
	<div style="width: auto;height: 200px;">
		<%-- 增加一个div，用于调节页面大小，否则默认太小 --%>
		<div style="width:850px;height:1px;"></div>
		<t:tabs id="tt" iframe="false" tabPosition="top" fit="false">
		 <t:tab href="billMainController.do?billProductList&id=${billMainPage.id}" icon="icon-search" title="产品明细" id="billProduct"></t:tab>
		</t:tabs>
	</div>
 </t:formvalid>
	<!-- 添加 明细 模版 -->
	<table style="display:none">
	<tbody id="add_billProduct_table_template">
		<tr>
		 <td align="center"><div style="width: 25px;" name="xh"></div></td>
		 <td align="center"><input style="width:20px;" type="checkbox" name="ck"/></td>
			  <td align="left">
			   <select name="billProductList[#index#].productId" id="productId0" onchange="setPrice(this)"></select>
			  </td>
			  <td align="left"><input name="billProductList[#index#].billNum" maxlength="100" type="text" style="width:70px;" onchange="checkDitOnly(this)"></td>
			  <td align="left"><input name="billProductList[#index#].puhCard" maxlength="50" type="text" style="width:100px;" onchange="checkDitOnly(this)"></td>
			  <td align="left"><input name="billProductList[#index#].qty" maxlength="22" type="text" style="width:50px;" onblur="setAmt(this)" onchange="checkDitOnly(this)"></td>
			  <td align="left"><input name="billProductList[#index#].price" maxlength="14" type="text" style="width:50px;" onblur="setAmtPrice(this)" onchange="checkFloatOnly(this)"></td>
			  <td align="left"><input name="billProductList[#index#].amt" maxlength="22" type="text" style="width:50px;"  onchange="checkDitOnly(this)"></td>
			  <td align="left"><input name="billProductList[#index#].note" maxlength="200" type="text" style="width:100px;"></td>
		</tr>
	 </tbody>
	</table>
 </body>