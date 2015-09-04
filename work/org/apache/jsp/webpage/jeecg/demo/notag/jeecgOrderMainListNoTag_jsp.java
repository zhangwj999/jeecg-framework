package org.apache.jsp.webpage.jeecg.demo.notag;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jeecgOrderMainListNoTag_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$('#jeecgOrderMainListNoTag').datagrid({\r\n");
      out.write("\t\t\tidField : 'id',\r\n");
      out.write("\t\t\ttitle : '订单信息(页面未用自定义标签)',\r\n");
      out.write("\t\t\turl : 'jeecgOrderMainNoTagController.do?datagrid&field=id,goOrderCode,goderType,usertype,goContactName,goTelphone,goOrderCount,goAllPrice,goReturnPrice,goContent,',\r\n");
      out.write("\t\t\tfit : true,\r\n");
      out.write("\t\t\tloadMsg : '数据加载中...',\r\n");
      out.write("\t\t\tpageSize : 10,\r\n");
      out.write("\t\t\tpagination : true,\r\n");
      out.write("\t\t\tsortOrder : 'asc',\r\n");
      out.write("\t\t\trownumbers : true,\r\n");
      out.write("\t\t\tsingleSelect : true,\r\n");
      out.write("\t\t\tfitColumns : true,\r\n");
      out.write("\t\t\tshowFooter : true,\r\n");
      out.write("\t\t\tfrozenColumns : [[{\r\n");
      out.write("\t\t\t\tfield : 'goOrderCode',\r\n");
      out.write("\t\t\t\ttitle : '订单号',\r\n");
      out.write("\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t}]],\r\n");
      out.write("\t\t\tcolumns : [[\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tfield : 'id',\r\n");
      out.write("\t\t\t\t\ttitle : '编号',\r\n");
      out.write("\t\t\t\t\thidden : true,\r\n");
      out.write("\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tfield : 'goderType',\r\n");
      out.write("\t\t\t\t\ttitle : '订单类型',\r\n");
      out.write("\t\t\t\t\tsortable : true,\r\n");
      out.write("\t\t\t\t\tformatter : function(value, rec, index) {\r\n");
      out.write("\t\t\t\t\t\tif (value == '1') {\r\n");
      out.write("\t\t\t\t\t\t\treturn '优质订单';\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif (value == '2') {\r\n");
      out.write("\t\t\t\t\t\t\treturn '普通订单';\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\treturn value;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tfield : 'usertype',\r\n");
      out.write("\t\t\t\t\ttitle : '顾客类型 ',\r\n");
      out.write("\t\t\t\t\tsortable : true,\r\n");
      out.write("\t\t\t\t\tformatter : function(value, rec, index) {\r\n");
      out.write("\t\t\t\t\t\tif (value == '1') {\r\n");
      out.write("\t\t\t\t\t\t\treturn '签约客户';\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tif (value == '2') {\r\n");
      out.write("\t\t\t\t\t\t\treturn '普通客户';\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\treturn value;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tfield : 'goContactName',\r\n");
      out.write("\t\t\t\t\ttitle : '联系人',\r\n");
      out.write("\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tfield : 'goTelphone',\r\n");
      out.write("\t\t\t\t\ttitle : '手机',\r\n");
      out.write("\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tfield : 'goOrderCount',\r\n");
      out.write("\t\t\t\t\ttitle : '订单人数',\r\n");
      out.write("\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tfield : 'goAllPrice',\r\n");
      out.write("\t\t\t\t\ttitle : '总价(不含返款)',\r\n");
      out.write("\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tfield : 'goReturnPrice',\r\n");
      out.write("\t\t\t\t\ttitle : '返款',\r\n");
      out.write("\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tfield : 'goContent',\r\n");
      out.write("\t\t\t\t\ttitle : '备注',\r\n");
      out.write("\t\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tfield : 'opt',\r\n");
      out.write("\t\t\t\t\ttitle : '操作',\r\n");
      out.write("\t\t\t\t\twidth : 100,\r\n");
      out.write("\t\t\t\t\tformatter : function(value, rec, index) {\r\n");
      out.write("\t\t\t\t\t\tif (!rec.id) {\r\n");
      out.write("\t\t\t\t\t\t\treturn '';\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tvar href = '';\r\n");
      out.write("\t\t\t\t\t\thref += \"[<a href='#' onclick=delObj('jeecgOrderMainNoTagController.do?del&id=\"\r\n");
      out.write("\t\t\t\t\t\t\t\t+ rec.id\r\n");
      out.write("\t\t\t\t\t\t\t\t+ \"','jeecgOrderMainListNoTag')>\";\r\n");
      out.write("\t\t\t\t\t\thref += \"删除</a>]\";\r\n");
      out.write("\t\t\t\t\t\treturn href;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}]],\r\n");
      out.write("\t\t\tonLoadSuccess : function(data) {\r\n");
      out.write("\t\t\t\t$(\"#jeecgOrderMainListNoTag\").datagrid(\"clearSelections\");\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tonClickRow : function(rowIndex, rowData) {\r\n");
      out.write("\t\t\t\trowid = rowData.id;\r\n");
      out.write("\t\t\t\tgridname = 'jeecgOrderMainList';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#jeecgOrderMainListNoTag').datagrid('getPager').pagination({\r\n");
      out.write("\t\t\tbeforePageText : '',\r\n");
      out.write("\t\t\tafterPageText : '/{pages}',\r\n");
      out.write("\t\t\tdisplayMsg : '{from}-{to}共{total}条',\r\n");
      out.write("\t\t\tshowPageList : true,\r\n");
      out.write("\t\t\tpageList : [ 10, 20, 30 ],\r\n");
      out.write("\t\t\tshowRefresh : true\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#jeecgOrderMainListNoTag').datagrid('getPager').pagination({\r\n");
      out.write("\t\t\tonBeforeRefresh : function(pageNumber, pageSize) {\r\n");
      out.write("\t\t\t\t$(this).pagination('loading');\r\n");
      out.write("\t\t\t\t$(this).pagination('loaded');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction reloadTable() {\r\n");
      out.write("\t\t$('#' + gridname).datagrid('reload');\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction reloadjeecgOrderMainList() {\r\n");
      out.write("\t\t$('#jeecgOrderMainListNoTag').datagrid('reload');\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction getjeecgOrderMainListSelected(field) {\r\n");
      out.write("\t\treturn getSelected(field);\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction getSelected(field) {\r\n");
      out.write("\t\tvar row = $('#' + gridname).datagrid('getSelected');\r\n");
      out.write("\t\tif (row != null) {\r\n");
      out.write("\t\t\tvalue = row[field];\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tvalue = '';\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn value;\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction getjeecgOrderMainListSelections(field) {\r\n");
      out.write("\t\tvar ids = [];\r\n");
      out.write("\t\tvar rows = $('#jeecgOrderMainListNoTag').datagrid('getSelections');\r\n");
      out.write("\t\tfor ( var i = 0; i < rows.length; i++) {\r\n");
      out.write("\t\t\tids.push(rows[i][field]);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tids.join(',');\r\n");
      out.write("\t\treturn ids;\r\n");
      out.write("\t};\r\n");
      out.write("\tfunction jeecgOrderMainListsearch() {\r\n");
      out.write("\t\tvar queryParams = $('#jeecgOrderMainListNoTag').datagrid('options').queryParams;\r\n");
      out.write("\t\t$('#jeecgOrderMainListNoTagtb').find('*').each(function() {\r\n");
      out.write("\t\t\tqueryParams[$(this).attr('name')] = $(this).val();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$('#jeecgOrderMainListNoTag').datagrid({\r\n");
      out.write("\t\t\turl : 'jeecgOrderMainNoTagController.do?datagrid&field=id,goOrderCode,goderType,usertype,goContactName,goTelphone,goOrderCount,goAllPrice,goReturnPrice,goContent,'\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction dosearch(params) {\r\n");
      out.write("\t\tvar jsonparams = $.parseJSON(params);\r\n");
      out.write("\t\t$('#jeecgOrderMainListNoTag').datagrid({\r\n");
      out.write("\t\t\turl : 'jeecgOrderMainNoTagController.do?datagrid&field=id,goOrderCode,goderType,usertype,goContactName,goTelphone,goOrderCount,goAllPrice,goReturnPrice,goContent,',\r\n");
      out.write("\t\t\tqueryParams : jsonparams\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction jeecgOrderMainListsearchbox(value, name) {\r\n");
      out.write("\t\tvar queryParams = $('#jeecgOrderMainListNoTag').datagrid('options').queryParams;\r\n");
      out.write("\t\tqueryParams[name] = value;\r\n");
      out.write("\t\tqueryParams.searchfield = name;\r\n");
      out.write("\t\t$('#jeecgOrderMainList').datagrid('reload');\r\n");
      out.write("\t}\r\n");
      out.write("\t$('#jeecgOrderMainListsearchbox').searchbox({\r\n");
      out.write("\t\tsearcher : function(value, name) {jeecgOrderMainListsearchbox(value, name);},\r\n");
      out.write("\t\tmenu : '#jeecgOrderMainListmm',\r\n");
      out.write("\t\tprompt : '请输入查询关键字'\r\n");
      out.write("\t});\r\n");
      out.write("\tfunction searchReset(name) {\r\n");
      out.write("\t\t$(\"#\" + name + \"tb\").find(\":input\").val(\"\");\r\n");
      out.write("\t\tjeecgOrderMainListsearch();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<table width=\"100%\" id=\"jeecgOrderMainListNoTag\" toolbar=\"#jeecgOrderMainListNoTagtb\"></table>\r\n");
      out.write("<div id=\"jeecgOrderMainListNoTagtb\" style=\"padding: 3px; height: auto\">\r\n");
      out.write("<div style=\"height: 30px;\" class=\"datagrid-toolbar\"><span style=\"float: left;\"> <a href=\"#\" class=\"easyui-linkbutton\" plain=\"true\" icon=\"icon-add\"\r\n");
      out.write("\tonclick=\"add('录入(无标签)','jeecgOrderMainNoTagController.do?addorupdateNoTag','jeecgOrderMainListNoTag',1000,400)\">录入</a> <a href=\"#\" class=\"easyui-linkbutton\" plain=\"true\" icon=\"icon-edit\"\r\n");
      out.write("\tonclick=\"update('编辑(无标签)','jeecgOrderMainNoTagController.do?addorupdateNoTag','jeecgOrderMainListNoTag',1000,400)\">编辑</a> </span></div>\r\n");
      out.write("</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
