<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<script type="text/javascript">
	$('#addBillProductBtn').linkbutton({   
	    iconCls: 'icon-add'  
	});  
	$('#delBillProductBtn').linkbutton({   
	    iconCls: 'icon-remove'  
	}); 
	$('#addBillProductBtn').bind('click', function(){   
 		 var tr =  $("#add_billProduct_table_template tr").clone();
	 	 $("#add_billProduct_table").append(tr);
	 	 resetTrNum('add_billProduct_table');
    });  
	$('#delBillProductBtn').bind('click', function(){   
      	$("#add_billProduct_table").find("input:checked").parent().parent().remove();   
        resetTrNum('add_billProduct_table'); 
    }); 
    $(document).ready(function(){
    	$(".datagrid-toolbar").parent().css("width","auto");
    });
    //加载产品
	$(function() {
 		/* $('#productId').combotree({
			url : 'billMainController.do?getChildren'
		});  */
		  $.ajax({ //一个Ajax过程 
	              type : "post", //以post方式与后台沟通
	              async : false,
	              data: {info:encodeURIComponent(JSON.stringify(obj))}, 
	              url : 'billMainController.do?getPrdouct',
	              dataType : 'text',//
	              success : function(json) {
	            	 var html="";
	            	 json=eval( "( "+json+" )" );
	            	 html="<option ></option>";
	            	 for(var i=0;i<json.length;i++){
	            		html+="<option value='"+json[i].productId+"'>"+json[i].productName+"</option>"; 
	            	 }
	            	 $("#productId").append(html);
	            	 
	            	 $("select[name*='productId']").not("#productId").each(function(){
	            		 var sel = $(this).attr("productId");
	            		 var html1 = "<option ></option>";
		            	 for(var i=0;i<json.length;i++){
		            		 if(sel == json[i].productId){
		            			 html1+="<option selected='selected' value='"+json[i].productId+"'>"+json[i].productName+"</option>"; 		            			 
		            		 }else{
		            			 html1+="<option value='"+json[i].productId+"'>"+json[i].productName+"</option>"; 
		            		 }
		            	 }
	            		 $(this).html(html1);
	            	 });
	              }
	            });
	});
	function setPrice(val){
		 var name = $(val).attr("name");
		 name=name.substr(0,name.indexOf("."))+".price"
		 var p1=$(val).children('option:selected').val();//这就是selected的值 
		 $.ajax({ //一个Ajax过程 
	             type : "post", //以post方式与后台沟通
	             async : false,
	             data: {info:encodeURIComponent(JSON.stringify(obj))}, 
	             url : 'billMainController.do?getPrdouct',
	             dataType : 'text',//
	             success : function(json) {
	           	  var html="";
	           	  
	           	  json=eval( "( "+json+" )" )
	           	 
	           	 for(var i=0;i<json.length;i++){
	           		if(p1==json[i].productId){
	           			//设置price的值
	           			$("input[name='"+name+"']").val(json[i].price);
	           		} 
	           	 }
	             }
	           });
		 
	}
	function setAmt(obj){
		 var name = $(obj).attr("name");
		 var qty = $(obj).val();
		 var price = name.substr(0,name.indexOf("."))+".price";
		 var amt = name.substr(0,name.indexOf("."))+".amt";
		 var priceVal = $("input[name='"+price+"']").val();
		 if(qty == null || qty == ''){
			 $("input[name='"+amt+"']").val("0.00");
		 }else if(priceVal == null || priceVal==''){
			 $("input[name='"+amt+"']").val("0.00");
		 }else{
			 var amtVal = parseFloat(qty)*parseFloat(priceVal);
			 amtVal = amtVal+"";
			 var pointInx = amtVal.indexOf(".");
			 if( pointInx !=-1 && amtVal.length>(pointInx+3) ){
				 amtVal = amtVal.substring(0,pointInx+3);
			 }
			 $("input[name='"+amt+"']").attr("value",amtVal);
		 }			 
	}
	
	function setAmtPrice(obj){
		 var name = $(obj).attr("name");
		 var price = $(obj).val();
		 var qty = name.substr(0,name.indexOf("."))+".qty";
		 var amt = name.substr(0,name.indexOf("."))+".amt";
		 var qtyVal = $("input[name='"+qty+"']").val();
		 if(price == null || price == ''){
			 $("input[name='"+amt+"']").val("0.00");
		 }else if(qtyVal == null || qtyVal==''){
			 $("input[name='"+amt+"']").val("0.00");
		 }else{
			 var amtVal = parseFloat(price)*parseFloat(qtyVal);
			 amtVal = amtVal+"";
			 var pointInx = amtVal.indexOf(".");
			 if( pointInx !=-1 && amtVal.length>(pointInx+3) ){
				 amtVal = amtVal.substring(0,pointInx+3);
			 }
			 $("input[name='"+amt+"']").attr("value",amtVal);
		 }			 
	}	
	
	
 	function checkDitOnly(obj){
 		var val = $(obj).val();
 		var reg = /[\d]{1,22}/g;
 		var rlt = reg.exec(val);
		if(rlt!=null && rlt.length>0){
			$(obj).val(rlt[0]);
		}else{
			$(obj).val('');
		}
 	}
 	
 	function checkFloatOnly(obj){
		var reg = /(([\d]{1,12})(\.[\d]{1,2})?)/g;
		var val = $(obj).val();
		var rlt = reg.exec(val);
		if(rlt!=null && rlt.length>0){
			$(obj).val(rlt[0]);
		}else{
			$(obj).val('');
		}
 	}
</script>
<div style="padding: 3px; height: 25px;width:auto;" class="datagrid-toolbar">
	<a id="addBillProductBtn" href="#">添加</a> <a id="delBillProductBtn" href="#">删除</a> 
</div>
<div style="width: auto;height: 300px;overflow-y:auto;overflow-x:scroll;">
<table border="0" cellpadding="2" cellspacing="0" id="billProduct_table">
	<tr bgcolor="#E6E6E6">
		<td align="center" bgcolor="#EEEEEE">序号</td>
		<td align="center" bgcolor="#EEEEEE">操作</td>
				  <td align="left" bgcolor="#EEEEEE">产品名称</td>
				  <td align="left" bgcolor="#EEEEEE">单据编号</td>
				  <td align="left" bgcolor="#EEEEEE">银行卡号</td>
				  <td align="left" bgcolor="#EEEEEE">份数</td>
				  <td align="left" bgcolor="#EEEEEE">单价</td>
				  <td align="left" bgcolor="#EEEEEE">金额</td>
				  <td align="left" bgcolor="#EEEEEE">备注</td>
	</tr>
	<tbody id="add_billProduct_table">	
	<c:if test="${fn:length(billProductList)  <= 0 }">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">1</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck"/></td>
				  <td align="left">
				  
				  <select name="billProductList[0].productId" id="productId" onchange="setPrice(this)"></select>
				  </td>
				  <td align="left"><input name="billProductList[0].billNum" maxlength="100" type="text" style="width:70px;"  onchange="checkDitOnly(this)"></td>
				  <td align="left"><input name="billProductList[0].puhCard" maxlength="50" type="text" style="width:100px;"  onchange="checkDitOnly(this)"></td>
				  <td align="left"><input name="billProductList[0].qty" maxlength="22" type="text" style="width:50px;"  onblur="setAmt(this)" onchange="checkDitOnly(this)"></td>
				  <td align="left"><input name="billProductList[0].price" maxlength="14" type="text" style="width:50px;" onblur="setAmtPrice(this)" id="price" onchange="checkFloatOnly(this)"></td>
				  <td align="left"><input name="billProductList[0].amt" maxlength="22" type="text" style="width:50px;"   onchange="checkFloatOnly(this)"></td>
				  <td align="left"><input name="billProductList[0].note" maxlength="200" type="text" style="width:100px;" ></td>
   			</tr>
	</c:if>
	<c:if test="${fn:length(billProductList)  > 0 }">
		<c:forEach items="${billProductList}" var="poVal" varStatus="stuts">
			<tr>
				<td align="center"><div style="width: 25px;" name="xh">${stuts.index+1 }</div></td>
				<td align="center"><input style="width:20px;"  type="checkbox" name="ck" /></td>
				
				   <td align="left">
				   	<input type="hidden" name="billProductList[${stuts.index }].id" value="${poVal.id }"/>
				   	<select name="billProductList[${stuts.index }].productId" maxlength="32" productId="${poVal.productId }" ></select>
				   </td>
				   <td align="left"><input name="billProductList[${stuts.index }].billNum" maxlength="100" value="${poVal.billNum }" type="text" style="width:70px;" onchange="checkDitOnly(this)"></td>
				   <td align="left"><input name="billProductList[${stuts.index }].puhCard" maxlength="50" value="${poVal.puhCard }" type="text" style="width:100px;" onchange="checkDitOnly(this)"></td>
				   <td align="left"><input name="billProductList[${stuts.index }].qty" maxlength="22" value="${poVal.qty }" type="text" style="width:50px;"  onblur="setAmt(this)" onchange="checkDitOnly(this)"></td>
				   <td align="left"><input name="billProductList[${stuts.index }].price" maxlength="14" value="${poVal.price }" type="text" style="width:50px;" onblur="setAmtPrice(this)" onchange="checkFloatOnly(this)"></td>
				   <td align="left"><input name="billProductList[${stuts.index }].amt" maxlength="22" value="${poVal.amt }" type="text" style="width:50px;"  onchange="checkFloatOnly(this)"></td>
				   <td align="left"><input name="billProductList[${stuts.index }].note" maxlength="200" value="${poVal.note }" type="text" style="width:100px;"></td>
   			</tr>
		</c:forEach>
	</c:if>	
	</tbody>
</table>
</div>