package org.apache.jsp.webpage.com.lhmh.FinancialRegistration;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class bill_005fdisplay_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write(" <body style=\"overflow-y: hidden\" scroll=\"no\" onunload=\"stopPlay()\" >\r\n");
      out.write(" \r\n");
      out.write("<div>\r\n");
      out.write("\t<button id=\"dispaly\" onclick=\"display()\" value=\"预览\">开始</button>\r\n");
      out.write("</div>   \r\n");
      out.write("   <!-- 播放区域 -->\r\n");
      out.write(" <div id=\"playzone\" width=\"550px\" height=\"500\" >\r\n");
      out.write("<object classid=\"clsid:E39BA3CC-FC92-4446-939A-922EF80D5389\" id=\"prew\" width='100%' height=\"550\" VIEWASTEXT>\r\n");
      out.write("  <param name=\"BorderStyle\" value=\"1\" />\r\n");
      out.write("  <param name=\"MousePointer\" value=\"0\" />\r\n");
      out.write("  <param name=\"Enabled\" value=\"1\" />\r\n");
      out.write("  <param name=\"Min\" value=\"0\" />\r\n");
      out.write("  <param name=\"Max\" value=\"10\" />\r\n");
      out.write("</object>\r\n");
      out.write(" </div>\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write(" </body>\r\n");
      out.write(" \r\n");
      out.write(" <script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write(" //关闭预览\r\n");
      out.write(" function stopPlay(){\r\n");
      out.write("  alert(\"关闭预览\");\r\n");
      out.write("\t prew.ClosePrew();//关闭视频预览 \r\n");
      out.write(" }\r\n");
      out.write("function display(){\r\n");
      out.write("\t//alert(\"这是预览\");\r\n");
      out.write("\t\t//prew.CreatePrew(\"192.168.199.103\",0);\r\n");
      out.write("\t\t prew.CreatePrew(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ip}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\",0);\r\n");
      out.write("\t}\r\n");
      out.write("//display();\r\n");
      out.write(" </script>\r\n");
      out.write(" \r\n");
      out.write("<script for=\"prew\" language=\"JavaScript\" event=\"ErrorEvent(nFlag)\">\r\n");
      out.write("\talert(nFlag);\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<SCRIPT language=javascript event=TimeEvent(type,time) for=nvrclient>\r\n");
      out.write("\talert(time);\r\n");
      out.write("\tif ( type == 0 ){\r\n");
      out.write("\t   parent.document.getElementById(\"begin\").value=time;\r\n");
      out.write("\t}else{\r\n");
      out.write("\t   parent.document.getElementById(\"end\").value=time;\r\n");
      out.write("\t}\r\n");
      out.write("</SCRIPT>");
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
