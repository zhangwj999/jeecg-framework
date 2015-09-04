<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/context/mytags.jsp"%>
<div class="easyui-layout" fit="true">
  <div region="center" style="padding:1px;">
  <t:datagrid name="bussproductList" title="产品类型" actionUrl="bussproductController.do?datagrid" idField="id" queryMode="group" fit="true" >
   <t:dgCol title="编号" field="id" hidden="false"></t:dgCol>
   <t:dgCol title="产品编号" field="productId" query="true" ></t:dgCol>
   <t:dgCol title="产品名称" field="productName" query="true" ></t:dgCol>
   <t:dgCol title="业务类型" field="busstypeId" query="true" replace="${busstypesReplace}"></t:dgCol>    
   <t:dgCol title="风险级别" field="riskName" dictionary="risk" query="true" ></t:dgCol>
   <t:dgCol title="所属单位" field="comName" ></t:dgCol>
   <t:dgCol title="产品到期日" field="dueData" ></t:dgCol>
   <t:dgCol title="价格" field="price" ></t:dgCol>
   <t:dgCol title="备注" field="note" ></t:dgCol>
   <t:dgCol title="操作" field="opt" width="100"></t:dgCol>
   <t:dgDelOpt title="删除" url="bussproductController.do?del&id={id}" />
   <t:dgToolBar title="录入" icon="icon-add" url="bussproductController.do?addorupdate" funname="add"></t:dgToolBar>
   <t:dgToolBar title="编辑" icon="icon-edit" url="bussproductController.do?addorupdate" funname="update"></t:dgToolBar>
   <t:dgToolBar title="查看" icon="icon-search" url="bussproductController.do?addorupdate" funname="detail"></t:dgToolBar>
  </t:datagrid>
  </div>
 </div>