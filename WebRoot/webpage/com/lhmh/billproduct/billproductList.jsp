<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="billproductList" title="产品类型" actionUrl="billproductController.do?datagrid" idField="id" fit="true">
   <t:dgCol title="编号" field="id" hidden="false"></t:dgCol>
   <t:dgCol title="billId" hidden="false"field="billId" ></t:dgCol>
   <t:dgCol title="产品类型" field="productId" ></t:dgCol>
   <t:dgCol title="业务类型" field="billNum" ></t:dgCol>
   <t:dgCol title="购买卡号" field="puhCard" ></t:dgCol>
   <t:dgCol title="数量" field="qty" ></t:dgCol>
   <t:dgCol title="单价" field="price" ></t:dgCol>
   <t:dgCol title="金额" field="amt" ></t:dgCol>
   <t:dgCol title="状态" field="status" ></t:dgCol>
   <t:dgCol title="备注" field="note" ></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="billproductController.do?del&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="billproductController.do?addorupdate" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="billproductController.do?addorupdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="billproductController.do?addorupdate" funname="detail"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>