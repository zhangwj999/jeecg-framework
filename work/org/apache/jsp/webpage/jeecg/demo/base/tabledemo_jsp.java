package org.apache.jsp.webpage.jeecg.demo.base;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class tabledemo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fformvalid_0026_005flayout_005fformid_005fdialog_005fcallback_005fbtnsub_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fcomboTree_0026_005fvalue_005furl_005fname_005fid_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005flayout_005fformid_005fdialog_005fcallback_005fbtnsub_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fcomboTree_0026_005fvalue_005furl_005fname_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005flayout_005fformid_005fdialog_005fcallback_005fbtnsub_005faction.release();
    _005fjspx_005ftagPool_005ft_005fcomboTree_0026_005fvalue_005furl_005fname_005fid_005fnobody.release();
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
      out.write("<head>\r\n");
      out.write("<title>DEMO添加</title>\r\n");
      if (_jspx_meth_t_005fbase_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<SCRIPT type=\"text/javascript\">\r\n");
      out.write("  function test(data) {\r\n");
      out.write("\t\tclosetab('TAB方式添加');\r\n");
      out.write("\t}\r\n");
      out.write("  </SCRIPT>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"overflow-y: hidden\" scroll=\"no\">\r\n");
      if (_jspx_meth_t_005fformvalid_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
    // /webpage/jeecg/demo/base/tabledemo.jsp(7,0) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fbase_005f0.setType("jquery,easyui,tools");
    int _jspx_eval_t_005fbase_005f0 = _jspx_th_t_005fbase_005f0.doStartTag();
    if (_jspx_th_t_005fbase_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fformvalid_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:formvalid
    org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_005fformvalid_005f0 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _005fjspx_005ftagPool_005ft_005fformvalid_0026_005flayout_005fformid_005fdialog_005fcallback_005fbtnsub_005faction.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
    _jspx_th_t_005fformvalid_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fformvalid_005f0.setParent(null);
    // /webpage/jeecg/demo/base/tabledemo.jsp(15,0) name = formid type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setFormid("formobj");
    // /webpage/jeecg/demo/base/tabledemo.jsp(15,0) name = layout type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setLayout("table");
    // /webpage/jeecg/demo/base/tabledemo.jsp(15,0) name = dialog type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setDialog(false);
    // /webpage/jeecg/demo/base/tabledemo.jsp(15,0) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setAction("demoController.do?saveDemo");
    // /webpage/jeecg/demo/base/tabledemo.jsp(15,0) name = btnsub type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setBtnsub("btn");
    // /webpage/jeecg/demo/base/tabledemo.jsp(15,0) name = callback type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setCallback("test");
    int _jspx_eval_t_005fformvalid_005f0 = _jspx_th_t_005fformvalid_005f0.doStartTag();
    if (_jspx_eval_t_005fformvalid_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<input type=\"hidden\" name=\"id\" id=\"id\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${demo.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("\t<table cellpadding=\"0\" width=\"100%\" cellspacing=\"1\" class=\"formtable\">\r\n");
        out.write("\t\t<tr>\r\n");
        out.write("\t\t\t<td align=\"right\" height=\"40\" width=\"10%\"><span class=\"filedzt\">DEMO名称：</span></td>\r\n");
        out.write("\t\t\t<td class=\"value\" width=\"90%\"><input name=\"demotitle\" id=\"demotitle\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${demo.demotitle}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" datatype=\"s4-10\" errormsg=\"4~10位字符之间 !\" checktip=\"4~10位字符,且不为空\"> <span\r\n");
        out.write("\t\t\t\tclass=\"Validform_checktip\"></span></td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t\t<tr>\r\n");
        out.write("\t\t\t<td align=\"right\" height=\"40\"><span class=\"filedzt\"> DEMO地址：</span></td>\r\n");
        out.write("\t\t\t<td class=\"value\"><input name=\"demourl\" id=\"demourl\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${demo.demourl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"></td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t\t<tr>\r\n");
        out.write("\t\t\t<td align=\"right\" height=\"40\"><span class=\"filedzt\"> 上级DEMO：</span></td>\r\n");
        out.write("\t\t\t<td class=\"value\">");
        if (_jspx_meth_t_005fcomboTree_005f0(_jspx_th_t_005fformvalid_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t\t<tr>\r\n");
        out.write("\t\t\t<td align=\"right\" height=\"40\"><span class=\"filedzt\"> 排序：</span></td>\r\n");
        out.write("\t\t\t<td class=\"value\"><input name=\"demoorder\" id=\"demoorder\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${demo.demoorder }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" datatype=\"n\" errormsg=\"必须数字\" checktip=\"序列号必须为数字\"> <span class=\"Validform_checktip\"></span></td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t\t<tr height=\"40\">\r\n");
        out.write("\t\t\t<td class=\"upload\" colspan=\"6\"><a href=\"#\" class=\"easyui-linkbutton\" id=\"btn\" iconCls=\"icon-ok\">提交</a> <a href=\"#\" class=\"easyui-linkbutton\" id=\"btn_reset\" iconCls=\"icon-back\">重置</a></td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t</table>\r\n");
        int evalDoAfterBody = _jspx_th_t_005fformvalid_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_005fformvalid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fformvalid_0026_005flayout_005fformid_005fdialog_005fcallback_005fbtnsub_005faction.reuse(_jspx_th_t_005fformvalid_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005flayout_005fformid_005fdialog_005fcallback_005fbtnsub_005faction.reuse(_jspx_th_t_005fformvalid_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fcomboTree_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fformvalid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:comboTree
    org.jeecgframework.tag.core.easyui.ComboTreeTag _jspx_th_t_005fcomboTree_005f0 = (org.jeecgframework.tag.core.easyui.ComboTreeTag) _005fjspx_005ftagPool_005ft_005fcomboTree_0026_005fvalue_005furl_005fname_005fid_005fnobody.get(org.jeecgframework.tag.core.easyui.ComboTreeTag.class);
    _jspx_th_t_005fcomboTree_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fcomboTree_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fformvalid_005f0);
    // /webpage/jeecg/demo/base/tabledemo.jsp(29,21) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fcomboTree_005f0.setUrl("demoController.do?pDemoList");
    // /webpage/jeecg/demo/base/tabledemo.jsp(29,21) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fcomboTree_005f0.setName("TSDemo.id");
    // /webpage/jeecg/demo/base/tabledemo.jsp(29,21) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fcomboTree_005f0.setId("pdemo");
    // /webpage/jeecg/demo/base/tabledemo.jsp(29,21) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fcomboTree_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${demo.TSDemo.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_t_005fcomboTree_005f0 = _jspx_th_t_005fcomboTree_005f0.doStartTag();
    if (_jspx_th_t_005fcomboTree_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fcomboTree_0026_005fvalue_005furl_005fname_005fid_005fnobody.reuse(_jspx_th_t_005fcomboTree_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fcomboTree_0026_005fvalue_005furl_005fname_005fid_005fnobody.reuse(_jspx_th_t_005fcomboTree_005f0);
    return false;
  }
}