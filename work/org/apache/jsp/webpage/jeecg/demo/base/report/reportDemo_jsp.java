package org.apache.jsp.webpage.jeecg.demo.base.report;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reportDemo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/context/mytags.jsp");
    _jspx_dependants.add("/WEB-INF/tld/easyui.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdatagrid_0026_005ftitle_005fname_005fidField_005ffit_005factionUrl;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdatagrid_0026_005ftitle_005fname_005fidField_005ffit_005factionUrl = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdatagrid_0026_005ftitle_005fname_005fidField_005ffit_005factionUrl.release();
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody.release();
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
      out.write("<!-- context path -->\r\n");
      if (_jspx_meth_t_005fbase_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/Highcharts-2.2.5/js/highcharts.src.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/Highcharts-2.2.5/js/modules/exporting.src.js\"></script>\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\tvar chart;\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : \"POST\",\r\n");
      out.write("\t\t\t\turl : \"reportDemoController.do?studentCount&reportType=line\",\r\n");
      out.write("\t\t\t\tsuccess : function(jsondata) {\r\n");
      out.write("\t\t\t\t\tdata = eval(jsondata);\r\n");
      out.write("\t\t\t\t\tchart = new Highcharts.Chart({\r\n");
      out.write("\t\t\t\t\t\tchart : {\r\n");
      out.write("\t\t\t\t\t\t\trenderTo : 'containerline',\r\n");
      out.write("\t\t\t\t\t\t\tplotBackgroundColor : null,\r\n");
      out.write("\t\t\t\t\t\t\tplotBorderWidth : null,\r\n");
      out.write("\t\t\t\t\t\t\tplotShadow : false\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\ttitle : {\r\n");
      out.write("\t\t\t\t\t\t\ttext : '班级学生人数比例分析-<b>折线图</b>'\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\txAxis : {\r\n");
      out.write("\t\t\t\t\t\t\tcategories : [ '1班', '2班', '3班', '4班', '5班']\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\ttooltip : {\r\n");
      out.write("\t\t\t\t\t\t\tshadow: false,\r\n");
      out.write("\t\t\t\t\t\t\tpercentageDecimals : 1,\r\n");
      out.write("\t\t\t\t\t\t\tformatter: function() {\r\n");
      out.write("            \t\t\t\t\treturn  '<b>'+this.point.name + '</b>:' +  Highcharts.numberFormat(this.percentage, 1) +'%';\r\n");
      out.write("         \t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\texporting:{  \r\n");
      out.write("\t\t\t                filename:'pie',  \r\n");
      out.write("\t\t\t                 url:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/reportDemoController.do?export'  \r\n");
      out.write("\t\t\t            },  \r\n");
      out.write("\t\t\t\t\t\tplotOptions : {\r\n");
      out.write("\t\t\t\t\t\t\tpie : {\r\n");
      out.write("\t\t\t\t\t\t\t\tallowPointSelect : true,\r\n");
      out.write("\t\t\t\t\t\t\t\tcursor : 'pointer',\r\n");
      out.write("\t\t\t\t\t\t\t\tshowInLegend : true,\r\n");
      out.write("\t\t\t\t\t\t\t\tdataLabels : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tenabled : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tcolor : '#000000',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tconnectorColor : '#000000',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tformatter : function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\treturn '<b>' + this.point.name + '</b>: ' + Highcharts.numberFormat(this.percentage, 1)+\"%\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tseries : data\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\tvar chart;\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : \"POST\",\r\n");
      out.write("\t\t\t\turl : \"reportDemoController.do?studentCount&reportType=column\",\r\n");
      out.write("\t\t\t\tsuccess : function(jsondata) {\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tdata = eval(jsondata);\r\n");
      out.write("\t\t\t\t\tconsole.log(data);\r\n");
      out.write("\t\t\t\t\tchart = new Highcharts.Chart({\r\n");
      out.write("\t\t\t\t\t\tchart : {\r\n");
      out.write("\t\t\t\t\t\t\trenderTo : 'containerCol',\r\n");
      out.write("\t\t\t\t\t\t\tplotBackgroundColor : null,\r\n");
      out.write("\t\t\t\t\t\t\tplotBorderWidth : null,\r\n");
      out.write("\t\t\t\t\t\t\tplotShadow : false\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\ttitle : {\r\n");
      out.write("\t\t\t\t\t\t\ttext : '班级学生人数比例分析-<b>柱状图</b>'\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\txAxis : {\r\n");
      out.write("\t\t\t\t\t\t\tcategories : [ '1班', '2班', '3班', '4班', '5班']\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\ttooltip : {\r\n");
      out.write("\t\t\t\t\t\t\t percentageDecimals : 1,\r\n");
      out.write("\t\t\t\t\t\t\t formatter: function() {\r\n");
      out.write("            \t\t\t\t\treturn  '<b>'+this.point.name + '</b>:' +  Highcharts.numberFormat(this.percentage, 1) +'%';\r\n");
      out.write("         \t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\texporting:{ \r\n");
      out.write("\t\t\t                filename:'column',  \r\n");
      out.write("\t\t\t                url:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/reportDemoController.do?export'//\r\n");
      out.write("\t\t\t            },\r\n");
      out.write("\t\t\t\t\t\tplotOptions : {\r\n");
      out.write("\t\t\t\t\t\t\tcolumn : {\r\n");
      out.write("\t\t\t\t\t\t\t\tallowPointSelect : true,\r\n");
      out.write("\t\t\t\t\t\t\t\tcursor : 'pointer',\r\n");
      out.write("\t\t\t\t\t\t\t\tshowInLegend : true,\r\n");
      out.write("\t\t\t\t\t\t\t\tdataLabels : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tenabled : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tcolor : '#000000',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tconnectorColor : '#000000',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tformatter : function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\treturn '<b>' + this.point.name + '</b>: ' +Highcharts.numberFormat(this.percentage, 1)+\"%\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tseries : data\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\tvar chart;\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : \"POST\",\r\n");
      out.write("\t\t\t\turl : \"reportDemoController.do?studentCount&reportType=pie\",\r\n");
      out.write("\t\t\t\tsuccess : function(jsondata) {\r\n");
      out.write("\t\t\t\t\tdata = eval(jsondata);\r\n");
      out.write("\t\t\t\t\tchart = new Highcharts.Chart({\r\n");
      out.write("\t\t\t\t\t\tchart : {\r\n");
      out.write("\t\t\t\t\t\t\trenderTo : 'containerPie',\r\n");
      out.write("\t\t\t\t\t\t\tplotBackgroundColor : null,\r\n");
      out.write("\t\t\t\t\t\t\tplotBorderWidth : null,\r\n");
      out.write("\t\t\t\t\t\t\tplotShadow : false\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\ttitle : {\r\n");
      out.write("\t\t\t\t\t\t\ttext : '班级学生人数比例分析-<b>饼状图</b>'\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\txAxis : {\r\n");
      out.write("\t\t\t\t\t\t\tcategories : [ '1班', '2班', '3班', '4班', '5班']\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\ttooltip : {\r\n");
      out.write("\t\t\t\t\t\t\tshadow: false,\r\n");
      out.write("\t\t\t\t\t\t\tpercentageDecimals : 1,\r\n");
      out.write("\t\t\t\t\t\t\tformatter: function() {\r\n");
      out.write("            \t\t\t\t\treturn  '<b>'+this.point.name + '</b>:' +  Highcharts.numberFormat(this.percentage, 1) +'%';\r\n");
      out.write("         \t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\texporting:{  \r\n");
      out.write("\t\t\t                filename:'pie',  \r\n");
      out.write("\t\t\t                 url:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctxPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/reportDemoController.do?export'  \r\n");
      out.write("\t\t\t            },  \r\n");
      out.write("\t\t\t\t\t\tplotOptions : {\r\n");
      out.write("\t\t\t\t\t\t\tpie : {\r\n");
      out.write("\t\t\t\t\t\t\t\tallowPointSelect : true,\r\n");
      out.write("\t\t\t\t\t\t\t\tcursor : 'pointer',\r\n");
      out.write("\t\t\t\t\t\t\t\tshowInLegend : true,\r\n");
      out.write("\t\t\t\t\t\t\t\tdataLabels : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tenabled : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\tcolor : '#000000',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tconnectorColor : '#000000',\r\n");
      out.write("\t\t\t\t\t\t\t\t\tformatter : function() {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\treturn '<b>' + this.point.name + '</b>: ' + Highcharts.numberFormat(this.percentage, 1)+\"%\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\tseries : data\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<span id=\"containerline\" style=\"float: left; width: 30%; height: 60%\"></span>\r\n");
      out.write("<span id=\"containerCol\" style=\"float: left; width: 38%; height: 60%\"></span>\r\n");
      out.write("<span id=\"containerPie\" style=\"width: 30%; height: 60%\"></span>\r\n");
      out.write("\r\n");
      out.write("<div style=\"width: 98%; height: 280px\">");
      if (_jspx_meth_t_005fdatagrid_005f0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_t_005fbase_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:base
    org.jeecgframework.tag.core.easyui.BaseTag _jspx_th_t_005fbase_005f0 = (org.jeecgframework.tag.core.easyui.BaseTag) _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.get(org.jeecgframework.tag.core.easyui.BaseTag.class);
    _jspx_th_t_005fbase_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fbase_005f0.setParent(null);
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(4,0) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fbase_005f0.setType("jquery,easyui");
    int _jspx_eval_t_005fbase_005f0 = _jspx_th_t_005fbase_005f0.doStartTag();
    if (_jspx_th_t_005fbase_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent(null);
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(8,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setVar("ctxPath");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(8,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/webpage/jeecg/demo/base/report/reportDemo.jsp(8,0) '${pageContext.request.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
    return false;
  }

  private boolean _jspx_meth_t_005fdatagrid_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:datagrid
    org.jeecgframework.tag.core.easyui.DataGridTag _jspx_th_t_005fdatagrid_005f0 = (org.jeecgframework.tag.core.easyui.DataGridTag) _005fjspx_005ftagPool_005ft_005fdatagrid_0026_005ftitle_005fname_005fidField_005ffit_005factionUrl.get(org.jeecgframework.tag.core.easyui.DataGridTag.class);
    _jspx_th_t_005fdatagrid_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdatagrid_005f0.setParent(null);
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(186,39) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setName("studentStatisticList");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(186,39) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setTitle("班级学生人数统计");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(186,39) name = actionUrl type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setActionUrl("reportDemoController.do?listAllStatisticByJdbc");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(186,39) name = idField type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setIdField("id");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(186,39) name = fit type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdatagrid_005f0.setFit(true);
    int _jspx_eval_t_005fdatagrid_005f0 = _jspx_th_t_005fdatagrid_005f0.doStartTag();
    if (_jspx_eval_t_005fdatagrid_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgCol_005f0(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgCol_005f1(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgCol_005f2(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
        if (_jspx_meth_t_005fdgCol_005f3(_jspx_th_t_005fdatagrid_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        int evalDoAfterBody = _jspx_th_t_005fdatagrid_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_005fdatagrid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdatagrid_0026_005ftitle_005fname_005fidField_005ffit_005factionUrl.reuse(_jspx_th_t_005fdatagrid_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdatagrid_0026_005ftitle_005fname_005fidField_005ffit_005factionUrl.reuse(_jspx_th_t_005fdatagrid_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f0 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(187,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f0.setTitle("编号");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(187,1) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f0.setField("id");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(187,1) name = hidden type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f0.setHidden(false);
    int _jspx_eval_t_005fdgCol_005f0 = _jspx_th_t_005fdgCol_005f0.doStartTag();
    if (_jspx_th_t_005fdgCol_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005ftitle_005fhidden_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f1 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f1.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(188,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f1.setTitle("班级");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(188,1) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f1.setField("classname");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(188,1) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f1.setWidth(new Integer(130));
    int _jspx_eval_t_005fdgCol_005f1 = _jspx_th_t_005fdgCol_005f1.doStartTag();
    if (_jspx_th_t_005fdgCol_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f1);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f2 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f2.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(189,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f2.setTitle("人数");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(189,1) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f2.setField("personcount");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(189,1) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f2.setWidth(new Integer(130));
    int _jspx_eval_t_005fdgCol_005f2 = _jspx_th_t_005fdgCol_005f2.doStartTag();
    if (_jspx_th_t_005fdgCol_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f2);
    return false;
  }

  private boolean _jspx_meth_t_005fdgCol_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fdatagrid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dgCol
    org.jeecgframework.tag.core.easyui.DataGridColumnTag _jspx_th_t_005fdgCol_005f3 = (org.jeecgframework.tag.core.easyui.DataGridColumnTag) _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody.get(org.jeecgframework.tag.core.easyui.DataGridColumnTag.class);
    _jspx_th_t_005fdgCol_005f3.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdgCol_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fdatagrid_005f0);
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(190,1) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f3.setTitle("比例");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(190,1) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f3.setField("rate");
    // /webpage/jeecg/demo/base/report/reportDemo.jsp(190,1) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdgCol_005f3.setWidth(new Integer(130));
    int _jspx_eval_t_005fdgCol_005f3 = _jspx_th_t_005fdgCol_005f3.doStartTag();
    if (_jspx_th_t_005fdgCol_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdgCol_0026_005fwidth_005ftitle_005ffield_005fnobody.reuse(_jspx_th_t_005fdgCol_005f3);
    return false;
  }
}
