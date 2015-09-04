package org.apache.jsp.webpage.jeecg.demo.notag;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class jeecgEasyUIList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/context/mytags.jsp");
    _jspx_dependants.add("/WEB-INF/tld/easyui.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;

      out.write('\r');
      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /context/mytags.jsp(9,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("webRoot");
      // /context/mytags.jsp(9,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(basePath);
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write("\r\n");
      out.write("<div class=\"easyui-layout\" fit=\"true\">\r\n");
      out.write("<div region=\"center\" style=\"padding: 1px;\">\r\n");
      out.write("<table id=\"jeecgEasyUIList\" style=\"width: 700px; height: 300px\">\r\n");
      out.write("\t<thead>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th field=\"id\" hidden=\"hidden\">编号</th>\r\n");
      out.write("\t\t\t<th field=\"userName\" width=\"50\">姓名</th>\r\n");
      out.write("\t\t\t<th field=\"depId\" width=\"50\" replace=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${departsReplace}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">部门</th>\r\n");
      out.write("\t\t\t<th field=\"sex\" width=\"50\">性别</th>\r\n");
      out.write("\t\t\t<th field=\"age\" width=\"50\">年龄</th>\r\n");
      out.write("\t\t\t<th field=\"birthday\" width=\"50\">生日</th>\r\n");
      out.write("\t\t\t<th field=\"email\" width=\"50\">E-Mail</th>\r\n");
      out.write("\t\t\t<th field=\"mobilePhone\" width=\"50\">手机</th>\r\n");
      out.write("\t\t\t<th field=\"opt\" width=\"100\">操作</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</thead>\r\n");
      out.write("</table>\r\n");
      out.write("<div id=\"tb2\" style=\"height: 30px;\" class=\"datagrid-toolbar\"><span style=\"float: left;\"> \r\n");
      out.write("<a href=\"#\" id='add' class=\"easyui-linkbutton\" plain=\"true\" icon=\"icon-add\"\r\n");
      out.write("\tonclick=\"add('录入','jeecgEasyUIController.do?addorupdate','jeecgEasyUIList')\" id=\"\">录入</a> \r\n");
      out.write("\t<a href=\"#\" class=\"easyui-linkbutton\" plain=\"true\" icon=\"icon-edit\"\r\n");
      out.write("\tonclick=\"update('编辑','jeecgEasyUIController.do?addorupdate','jeecgEasyUIList')\" id=\"\">编辑</a> \r\n");
      out.write("\t<a href=\"#\" class=\"easyui-linkbutton\" plain=\"true\" icon=\"icon-search\"\r\n");
      out.write("\tonclick=\"detail('查看','jeecgEasyUIController.do?addorupdate','jeecgEasyUIList')\" id=\"\">查看</a> </span> \r\n");
      out.write("\t<span style=\"float: right\"> <input id=\"jeecgEasyUIListsearchbox\" class=\"easyui-searchbox\"\r\n");
      out.write("\tdata-options=\"searcher:jeecgEasyUIListsearchbox,prompt:'请输入关键字',menu:'#jeecgEasyUIListmm'\"></input>\r\n");
      out.write("<div id=\"jeecgEasyUIListmm\" style=\"width: 120px\">\r\n");
      out.write("<div data-options=\"name:'userName',iconCls:'icon-ok'\">姓名</div>\r\n");
      out.write("<div data-options=\"name:'mobilePhone',iconCls:'icon-ok'\">手机</div>\r\n");
      out.write("</div>\r\n");
      out.write("</span></div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t    // 编辑初始化数据\r\n");
      out.write("\t\tfunction getData(data){\r\n");
      out.write("\t\t\tvar rows = [];\t\t\t\r\n");
      out.write("\t\t\tvar total = data.total;\r\n");
      out.write("\t\t\tfor(var i=0; i<data.rows.length; i++){\r\n");
      out.write("\t\t\t\trows.push({\r\n");
      out.write("\t\t\t\t\tid: data.rows[i].id,\r\n");
      out.write("\t\t\t\t\tuserName: data.rows[i].userName,\r\n");
      out.write("\t\t\t\t\tdepId: data.rows[i].depId,\r\n");
      out.write("\t\t\t\t\tsex: data.rows[i].sex,\r\n");
      out.write("\t\t\t\t\tage: data.rows[i].age,\r\n");
      out.write("\t\t\t\t\tbirthday: data.rows[i].birthday,\r\n");
      out.write("\t\t\t\t\temail: data.rows[i].email,\r\n");
      out.write("\t\t\t\t\tmobilePhone: data.rows[i].mobilePhone,\r\n");
      out.write("\t\t\t\t\topt: \"[<a href=\\\"#\\\" onclick=\\\"delObj('jeecgEasyUIController.do?del&id=\"+data.rows[i].id+\"','jeecgEasyUIList')\\\">删除</a>]\"\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar newData={\"total\":total,\"rows\":rows};\r\n");
      out.write("\t\t\treturn newData;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t    // 筛选\r\n");
      out.write("\t\tfunction jeecgEasyUIListsearchbox(value,name){\r\n");
      out.write("    \t\tvar queryParams=$('#jeecgEasyUIList').datagrid('options').queryParams;\r\n");
      out.write("    \t\tqueryParams[name]=value;\r\n");
      out.write("    \t\tqueryParams.searchfield=name;\r\n");
      out.write("    \t\t$('#jeecgEasyUIList').datagrid('load');\r\n");
      out.write("    \t}\r\n");
      out.write("\t    // 刷新\r\n");
      out.write("\t    function reloadTable(){\r\n");
      out.write("\t    \t$('#jeecgEasyUIList').datagrid('reload');\r\n");
      out.write("\t    }\r\n");
      out.write("\t    \r\n");
      out.write("\t\t// 设置datagrid属性\r\n");
      out.write("\t\t$('#jeecgEasyUIList').datagrid({\r\n");
      out.write("\t\t\ttitle: '页面不用自定义标签',\r\n");
      out.write("\t        idField: 'id',\r\n");
      out.write("\t        fit:true,\r\n");
      out.write("\t        loadMsg: '数据加载中...',\r\n");
      out.write("\t        pageSize: 10,\r\n");
      out.write("\t        pagination:true,\r\n");
      out.write("\t        sortOrder:'asc',\r\n");
      out.write("\t        rownumbers:true,\r\n");
      out.write("\t        singleSelect:true,\r\n");
      out.write("\t        fitColumns:true,\r\n");
      out.write("\t        showFooter:true,\r\n");
      out.write("\t        url:'jeecgEasyUIController.do?datagrid',  \r\n");
      out.write("\t        toolbar: '#tb2',\r\n");
      out.write("\t        loadFilter: function(data){\r\n");
      out.write("\t        \treturn getData(data);\r\n");
      out.write("\t    \t}\r\n");
      out.write("\t        \r\n");
      out.write("\t    }); \r\n");
      out.write("\t    //设置分页控件  \r\n");
      out.write("\t    $('#jeecgEasyUIList').datagrid('getPager').pagination({  \r\n");
      out.write("\t        pageSize: 10,  \r\n");
      out.write("\t        pageList: [10,20,30],  \r\n");
      out.write("\t        beforePageText: '',  \r\n");
      out.write("\t        afterPageText: '/{pages}',\r\n");
      out.write("\t        displayMsg: '{from}-{to}共{total}条',\r\n");
      out.write("\t        showPageList:true,\r\n");
      out.write("\t        showRefresh:true,\r\n");
      out.write("\t        onBeforeRefresh:function(pageNumber, pageSize){\r\n");
      out.write("\t            $(this).pagination('loading');\r\n");
      out.write("\t            $(this).pagination('loaded');\r\n");
      out.write("\t        }\r\n");
      out.write("\t    });\r\n");
      out.write("\t    // 设置筛选\r\n");
      out.write("    \t$('#jeecgEasyUIListsearchbox').searchbox({\r\n");
      out.write("    \t\tsearcher:function(value,name){\r\n");
      out.write("    \t\t\tjeecgEasyUIListsearchbox(value,name);\r\n");
      out.write("    \t\t},\r\n");
      out.write("    \t\tmenu:'#jeecgEasyUIListmm',\r\n");
      out.write("    \t\tprompt:'请输入查询关键字'\r\n");
      out.write("    \t});\r\n");
      out.write("\t</script></div>\r\n");
      out.write("</div>\r\n");
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
