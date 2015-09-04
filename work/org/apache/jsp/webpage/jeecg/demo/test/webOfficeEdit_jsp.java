package org.apache.jsp.webpage.jeecg.demo.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class webOfficeEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>weboffice演示页面</TITLE>\r\n");
      out.write("<!-- --------------------=== 调用Weboffice初始化方法 ===--------------------- -->\r\n");
      out.write("<SCRIPT language=javascript event=NotifyCtrlReady for=WebOffice1>\r\n");
      out.write("/****************************************************\r\n");
      out.write("*\r\n");
      out.write("*\t在装载完Weboffice(执行<object>...</object>)\r\n");
      out.write("*\t控件后执行 \"WebOffice1_NotifyCtrlReady\"方法\r\n");
      out.write("*\r\n");
      out.write("****************************************************/\r\n");
      out.write("\tWebOffice1_NotifyCtrlReady();\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<SCRIPT language=javascript>\r\n");
      out.write("/****************************************************\r\n");
      out.write("*\r\n");
      out.write("*\t\t控件初始化WebOffice方法\r\n");
      out.write("*\r\n");
      out.write("****************************************************/\r\n");
      out.write("function WebOffice1_NotifyCtrlReady() {\r\n");
      out.write("\tdocument.all.WebOffice1.ShowToolBar(0);\r\n");
      out.write("\t//document.all.WebOffice1.SetWindowText(\"WebOffice\", 0);\r\n");
      out.write("\tdocument.all.WebOffice1.OptionFlag |= 128;\r\n");
      out.write("\tvar sFileType = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fileType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\";//doc,xls,ppt,wps\r\n");
      out.write("\tif (\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${docId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" != \"\") {\r\n");
      out.write("\t\tdocument.all.WebOffice1.LoadOriginalFile(\"./webOfficeController.do?getDoc&fileId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${docId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\", sFileType);\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\t// 新建文档\r\n");
      out.write("\t\tdocument.all.WebOffice1.LoadOriginalFile(\"\", sFileType);\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("// ---------------------== 关闭页面时调用此函数，关闭文件 ==---------------------- //\r\n");
      out.write("function window_onunload() {\r\n");
      out.write("\tdocument.all.WebOffice1.Close();\r\n");
      out.write("}\r\n");
      out.write("function newDoc() {\r\n");
      out.write("\tdocument.all.WebOffice1.ShowToolBar(0);\r\n");
      out.write("\tvar doctype=document.all.doctype.value;\r\n");
      out.write("\tdocument.all.WebOffice1.LoadOriginalFile(\"\", doctype);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// 打开本地文件\r\n");
      out.write("function docOpen() {\r\n");
      out.write("\tdocument.all.WebOffice1.LoadOriginalFile(\"open\", \"doc\");\r\n");
      out.write("}\r\n");
      out.write("// -----------------------------== 保存文档 ==------------------------------------ //\r\n");
      out.write("function newSave() {\r\n");
      out.write("\tdocument.all.WebOffice1.Save();\r\n");
      out.write("}\r\n");
      out.write("// -----------------------------== 另存为文档 ==------------------------------------ //\r\n");
      out.write("function SaveAsTo() {\r\n");
      out.write("\tdocument.all.WebOffice1.ShowDialog(84);\r\n");
      out.write("}\r\n");
      out.write("// -----------------------------== 上传文档 ==------------------------------------ //\r\n");
      out.write("function SaveDoc() {\r\n");
      out.write("\tvar returnValue;\r\n");
      out.write("\t if(myform.DocTitle.value ==\"\"){\r\n");
      out.write("\t\talert(\"标题不可为空\")\r\n");
      out.write("\t\tmyform.DocTitle.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\tif(myform.DocID.value ==\"\"){\r\n");
      out.write("\t\talert(\"文号不可为空\")\r\n");
      out.write("\t\tmyform.DocID.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tdocument.all.WebOffice1.HttpInit();\t\t\t//初始化Http引擎\r\n");
      out.write("\t// 添加相应的Post元素 \r\n");
      out.write("\tdocument.all.WebOffice1.HttpAddPostString(\"id\", \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${docId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\");\r\n");
      out.write("\tdocument.all.WebOffice1.HttpAddPostString(\"doctitle\", myform.DocTitle.value);\r\n");
      out.write("\tdocument.all.WebOffice1.HttpAddPostString(\"docid\", myform.DocID.value);\r\n");
      out.write("\tdocument.all.WebOffice1.HttpAddPostString(\"doctype\",myform.doctype.value);\r\n");
      out.write("\tdocument.all.WebOffice1.HttpAddPostCurrFile(\"DocContent\",\"\");\t\t// 上传文件\r\n");
      out.write("\r\n");
      out.write("\treturnValue = document.all.WebOffice1.HttpPost(\"./webOfficeController.do?saveDoc&fileId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${docId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\");\t// 判断上传是否成功\r\n");
      out.write("\tif(\"succeed\" == returnValue){\r\n");
      out.write("\t\talert(\"文件上传成功\");\t\r\n");
      out.write("\t}else if(\"failed\" == returnValue)\r\n");
      out.write("\t\talert(\"文件上传失败\")\r\n");
      out.write("\treturn_onclick(); \r\n");
      out.write("}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY style=\"BACKGROUND: #ccc\" onunload=\"return window_onunload()\">\r\n");
      out.write("<form name=\"myform\">\r\n");
      out.write("<table width=\"1123\" border=\"0\" cellpadding=\"1\" cellspacing=\"3\">\r\n");
      out.write("\t<tr bgcolor=\"#8CBFE9\">\r\n");
      out.write("\t\t<td height=\"15\" valign=\"top\" class=\"downSide\"><font size=\"-1\">&nbsp;&nbsp; 文档编号:</font> <input name=\"DocID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${docData.docid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"14\"> <span class=\"STYLE1\"> | </span> <font\r\n");
      out.write("\t\t\tsize=\"-1\">&nbsp;&nbsp; 标 题:</font> <input name=\"DocTitle\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${docData.doctitle}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" size=\"14\"> <span class=\"STYLE1\"> | </span> <font size=\"-1\">&nbsp;&nbsp;&nbsp;文件格式: </font> <select\r\n");
      out.write("\t\t\tname=\"doctype\" size=\"1\" id=\"doctype\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${docId!='' ?\"disabled='true' \":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" onchange=\"newDoc()\">\r\n");
      out.write("\t\t\t<option value=\"doc\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${docData.doctype== 'doc'?\"selected='selected'\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">Word</option>\r\n");
      out.write("\t\t\t<option value=\"xls\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${docData.doctype== 'xls'?\"selected='selected'\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">Excel</option>\r\n");
      out.write("\t\t\t<option value=\"ppt\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${docData.doctype== 'ppt'?\"selected='selected'\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">Powerpoint</option>\r\n");
      out.write("\t\t\t<option value=\"wps\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${docData.doctype== 'wps'?\"selected='selected'\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(">wps</option>\r\n");
      out.write("\t\t</select> <span class=\"STYLE1\">|</span> <input name=\"button9\" type=\"button\" onClick=\"return SaveDoc()\" value=\"上传到服务器\" classs=\"rollout\"> <span class=\"STYLE1\">|</span> <input name=\"button\"\r\n");
      out.write("\t\t\ttype=\"button\" onClick=\"return docOpen()\" value=\"打开本地文件\" /></td>\r\n");
      out.write("\t\t<td></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\" rowspan=\"12\" valign=\"top\"><!-- -----------------------------== 装载weboffice控件 ==--------------------------------- --> <SCRIPT>\r\n");
      out.write("\t\t\t\t\tvar s = \"\"\r\n");
      out.write("\t\t\t\t\t\ts += \"<object id=WebOffice1 height=500 width='100%' style='LEFT: 0px; TOP: 0px' classid='clsid:E77E049B-23FC-4DB8-B756-60529A35FAD5' codebase='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/plug-in/webOffice/weboffice_v6.0.5.0.cab#Version=6,0,5,0'>\"\r\n");
      out.write("\t\t\t\t\t\ts +=\"<param name='_ExtentX' value='6350'><param name='_ExtentY' value='6350'>\"\r\n");
      out.write("\t\t\t\t\t\ts +=\"</OBJECT>\"\t\t\t\r\n");
      out.write("\t\t\t\t\t\tdocument.write(s)\r\n");
      out.write("\t\t\t\t</SCRIPT> <!-- --------------------------------== 结束装载控件 ==----------------------------------- --></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
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
