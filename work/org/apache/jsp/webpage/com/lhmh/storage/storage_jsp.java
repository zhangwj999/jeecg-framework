package org.apache.jsp.webpage.com.lhmh.storage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class storage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005flayout_005fformid_005fdialog_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fchoose_0026_005furl_005ftitle_005ftextname_005fname_005fisclear_005ficon_005fhiddenid_005fhiddenName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftitle_005fhasLabel_005ffield_005fdefaultVal_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005flayout_005fformid_005fdialog_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fchoose_0026_005furl_005ftitle_005ftextname_005fname_005fisclear_005ficon_005fhiddenid_005fhiddenName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftitle_005fhasLabel_005ffield_005fdefaultVal_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005flayout_005fformid_005fdialog_005faction.release();
    _005fjspx_005ftagPool_005ft_005fchoose_0026_005furl_005ftitle_005ftextname_005fname_005fisclear_005ficon_005fhiddenid_005fhiddenName_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftitle_005fhasLabel_005ffield_005fdefaultVal_005fnobody.release();
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
      out.write(" <head>\r\n");
      out.write("  <title>存储设备管理</title>\r\n");
      out.write("  ");
      if (_jspx_meth_t_005fbase_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write(" </head>\r\n");
      out.write(" <body style=\"overflow-y: hidden\" scroll=\"no\">\r\n");
      out.write("  ");
      if (_jspx_meth_t_005fformvalid_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write(" </body>\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write(" \tvar id = $(\"#id\").val();\r\n");
      out.write(" \tfunction checkStorageId(obj){\r\n");
      out.write(" \t\tvar val = $(obj).val();\r\n");
      out.write("\t\t$(\"#storageId\").attr(\"ajaxurl\",\"storageController.do?checkStorageId&storageId=\"+val+\"&id=\"+id);\r\n");
      out.write(" \t}\r\n");
      out.write(" \t\r\n");
      out.write(" \tfunction checkStorageName(obj){\r\n");
      out.write(" \t\tvar val = $(obj).val();\r\n");
      out.write(" \t\t$(\"#storageName\").attr(\"ajaxurl\",\"storageController.do?checkStorageName&storageName=\"+encodeURI(encodeURI(val))+\"&id=\"+id);\r\n");
      out.write(" \t}\r\n");
      out.write(" \t\r\n");
      out.write(" \tfunction checkStorageIp(obj){\r\n");
      out.write(" \t\tvar val = $(obj).val();\r\n");
      out.write(" \t\tvar ipv4 = /^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})$/;\r\n");
      out.write(" \t\tvar ipv6 = /^\\s*((([0-9A-Fa-f]{1,4}:){7}([0-9A-Fa-f]{1,4}|:))|(([0-9A-Fa-f]{1,4}:){6}(:[0-9A-Fa-f]{1,4}|((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){5}(((:[0-9A-Fa-f]{1,4}){1,2})|:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3})|:))|(([0-9A-Fa-f]{1,4}:){4}(((:[0-9A-Fa-f]{1,4}){1,3})|((:[0-9A-Fa-f]{1,4})?:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){3}(((:[0-9A-Fa-f]{1,4}){1,4})|((:[0-9A-Fa-f]{1,4}){0,2}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){2}(((:[0-9A-Fa-f]{1,4}){1,5})|((:[0-9A-Fa-f]{1,4}){0,3}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(([0-9A-Fa-f]{1,4}:){1}(((:[0-9A-Fa-f]{1,4}){1,6})|((:[0-9A-Fa-f]{1,4}){0,4}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:))|(:(((:[0-9A-Fa-f]{1,4}){1,7})|((:[0-9A-Fa-f]{1,4}){0,5}:((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}))|:)))(%.+)?\\s*$/;\r\n");
      out.write(" \t\tif(ipv4.test(val) || ipv6.test(val)){\r\n");
      out.write("\t\t\t$(\"#storageIp\").attr(\"ajaxurl\",\"storageController.do?checkStorageIp&storageIp=\"+val+\"&id=\"+id);\r\n");
      out.write(" \t\t}else{\r\n");
      out.write(" \t\t\t$(obj).val('');\r\n");
      out.write(" \t\t\t$(obj).next(\".Validform_checktip\").html(\"IP地址格式不正确！\");\r\n");
      out.write(" \t\t}\r\n");
      out.write(" \t}\r\n");
      out.write(" \t\r\n");
      out.write(" \tfunction checkSpaceMin(obj){\r\n");
      out.write(" \t\tvar val = $(\"#spaceMin\").val();\r\n");
      out.write(" \t\tvar space = $(\"#space\").val();\r\n");
      out.write(" \t\tval = parseFloat(val);\r\n");
      out.write(" \t\tspace = parseFloat(space);\r\n");
      out.write(" \t\tif(val > space){\r\n");
      out.write(" \t\t\t$(obj).val('');\r\n");
      out.write(" \t\t\t$(obj).next(\".Validform_checktip\").html(\"预警空间不能大于存储空间！\");\r\n");
      out.write(" \t\t}\r\n");
      out.write(" \t}\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$('#cc').combotree({\r\n");
      out.write("\t\t\turl : 'departController.do?setPFunction&selfId=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${channelPage.bankId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("',\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\t\r\n");
      out.write(" </script>");
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
    // /webpage/com/lhmh/storage/storage.jsp(7,2) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fbase_005f0.setType("jquery,easyui,tools,DatePicker");
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
    org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_005fformvalid_005f0 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005flayout_005fformid_005fdialog_005faction.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
    _jspx_th_t_005fformvalid_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fformvalid_005f0.setParent(null);
    // /webpage/com/lhmh/storage/storage.jsp(10,2) name = formid type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setFormid("formobj");
    // /webpage/com/lhmh/storage/storage.jsp(10,2) name = dialog type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setDialog(true);
    // /webpage/com/lhmh/storage/storage.jsp(10,2) name = usePlugin type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setUsePlugin("password");
    // /webpage/com/lhmh/storage/storage.jsp(10,2) name = layout type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setLayout("div");
    // /webpage/com/lhmh/storage/storage.jsp(10,2) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setAction("storageController.do?save");
    int _jspx_eval_t_005fformvalid_005f0 = _jspx_th_t_005fformvalid_005f0.doStartTag();
    if (_jspx_eval_t_005fformvalid_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t<input id=\"id\" name=\"id\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${storagePage.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("\t\t<fieldset class=\"step\">\r\n");
        out.write("\t\t\t<div class=\"form\">\r\n");
        out.write("\t\t      <label class=\"Validform_label\">编号:</label>\r\n");
        out.write("\t\t      <input class=\"inputxt\" id=\"storageId\" name=\"storageId\"\r\n");
        out.write("\t\t\t\t\t   value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${storagePage.storageId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" datatype=\"s2-16\" onchange=\"checkStorageId(this)\">\r\n");
        out.write("\t\t      <span class=\"Validform_checktip\">编号范围在2~16位字符</span>\r\n");
        out.write("\t\t    </div>\r\n");
        out.write("\t\t\t<div class=\"form\">\r\n");
        out.write("\t\t      <label class=\"Validform_label\">名称:</label>\r\n");
        out.write("\t\t      <input class=\"inputxt\" id=\"storageName\" name=\"storageName\"\r\n");
        out.write("\t\t\t\t\t   value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${storagePage.storageName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" datatype=\"s2-25\" onchange=\"checkStorageName(this)\">\r\n");
        out.write("\t\t      <span class=\"Validform_checktip\">请填写存储设备名称</span>\r\n");
        out.write("\t\t    </div>\r\n");
        out.write("\t\t\t<div class=\"form\">\r\n");
        out.write("\t\t      <label class=\"Validform_label\">IP:</label>\r\n");
        out.write("\t\t      <input class=\"inputxt\" id=\"storageIp\" name=\"storageIp\"\r\n");
        out.write("\t\t\t\t\t   value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${storagePage.storageIp}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" datatype=\"s1-25\"  onchange=\"checkStorageIp(this)\">\r\n");
        out.write("\t\t      <span class=\"Validform_checktip\"></span>\r\n");
        out.write("\t\t    </div>\r\n");
        out.write("\t\t\t<div class=\"form\">\r\n");
        out.write("\t\t      <label class=\"Validform_label\">存储PORT:</label>\r\n");
        out.write("\t\t      <input class=\"inputxt\" id=\"storagePort\" name=\"storagePort\" \r\n");
        out.write("\t\t\t\t\t   value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${storagePage.storagePort}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" datatype=\"n1-14\">\r\n");
        out.write("\t\t      <span class=\"Validform_checktip\"></span>\r\n");
        out.write("\t\t    </div>\r\n");
        out.write("\t\t\t<div class=\"form\">\r\n");
        out.write("\t\t      <label class=\"Validform_label\">控制PORT:</label>\r\n");
        out.write("\t\t      <input class=\"inputxt\" id=\"dataPort\" name=\"dataPort\"\r\n");
        out.write("\t\t\t\t\t   value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${storagePage.dataPort}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" datatype=\"n1-14\">\r\n");
        out.write("\t\t      <span class=\"Validform_checktip\"></span>\r\n");
        out.write("\t\t    </div>\r\n");
        out.write("\t\t\t<div class=\"form\">\r\n");
        out.write("\t\t      <label class=\"Validform_label\">银行:</label>\r\n");
        out.write("\t\t      <td class=\"value\"  style=\"width:150px;\">\r\n");
        out.write("\t\t      \t<input style=\"width:150px;\" id=\"cc\" name=\"bankId\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${departname}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("\t\t      \t<span class=\"Validform_checktip\"></span>\r\n");
        out.write("\t\t      </td>\r\n");
        out.write("\t\t    </div>\r\n");
        out.write("\t\t\t<div class=\"form\">\r\n");
        out.write("\t\t      <label class=\"Validform_label\">存储空间(G):</label>\r\n");
        out.write("\t\t      <input class=\"inputxt\" id=\"space\" name=\"space\" \r\n");
        out.write("\t\t\t\t\t   value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${storagePage.space}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" datatype=\"n1-14\"  onchange=\"checkSpaceMin(this)\" />\r\n");
        out.write("\t\t      <span class=\"Validform_checktip\"></span>\r\n");
        out.write("\t\t    </div>\r\n");
        out.write("\t\t\t<div class=\"form\">\r\n");
        out.write("\t\t      <label class=\"Validform_label\">预警空间(G):</label>\r\n");
        out.write("\t\t      <input class=\"inputxt\" id=\"spaceMin\" name=\"spaceMin\" \r\n");
        out.write("\t\t\t\t\t   value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${storagePage.spaceMin}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" datatype=\"n1-14\" onchange=\"checkSpaceMin(this)\">\r\n");
        out.write("\t\t      <span class=\"Validform_checktip\"></span>\r\n");
        out.write("\t\t    </div>\r\n");
        out.write("\t\t    \r\n");
        out.write("\t\t\t<div class=\"form\">\r\n");
        out.write("\t\t      \t<label class=\"Validform_label\">联系人:</label>\r\n");
        out.write("\t\t\t\t<input name=\"empId\"  type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${storagePage.empId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" id=\"empId\"> \r\n");
        out.write("\t\t\t\t<input name=\"empName\" class=\"inputxt\"  id=\"empName\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${storagePage.empName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"\r\n");
        out.write("\t\t\t\t\treadonly=\"readonly\" datatype=\"*\"/>\r\n");
        out.write("\t\t \t\t");
        if (_jspx_meth_t_005fchoose_005f0(_jspx_th_t_005fformvalid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t      \t<span class=\"Validform_checktip\"></span>\t\r\n");
        out.write("\t\t    </div>\r\n");
        out.write("\t\t    \r\n");
        out.write("\t\t\t<div class=\"form\">\r\n");
        out.write("\t\t      <label class=\"Validform_label\">是否启用:</label>\r\n");
        out.write("\t\t      ");
        if (_jspx_meth_t_005fdictSelect_005f0(_jspx_th_t_005fformvalid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\r\n");
        out.write("\t\t    </div>\r\n");
        out.write("\t    </fieldset>\r\n");
        out.write("  ");
        int evalDoAfterBody = _jspx_th_t_005fformvalid_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_005fformvalid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005flayout_005fformid_005fdialog_005faction.reuse(_jspx_th_t_005fformvalid_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005flayout_005fformid_005fdialog_005faction.reuse(_jspx_th_t_005fformvalid_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fchoose_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fformvalid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:choose
    org.jeecgframework.tag.core.easyui.ChooseTag _jspx_th_t_005fchoose_005f0 = (org.jeecgframework.tag.core.easyui.ChooseTag) _005fjspx_005ftagPool_005ft_005fchoose_0026_005furl_005ftitle_005ftextname_005fname_005fisclear_005ficon_005fhiddenid_005fhiddenName_005fnobody.get(org.jeecgframework.tag.core.easyui.ChooseTag.class);
    _jspx_th_t_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fformvalid_005f0);
    // /webpage/com/lhmh/storage/storage.jsp(68,5) name = hiddenName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f0.setHiddenName("empId");
    // /webpage/com/lhmh/storage/storage.jsp(68,5) name = hiddenid type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f0.setHiddenid("empId");
    // /webpage/com/lhmh/storage/storage.jsp(68,5) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f0.setUrl("employeeController.do?employeeHelp");
    // /webpage/com/lhmh/storage/storage.jsp(68,5) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f0.setName("functionList");
    // /webpage/com/lhmh/storage/storage.jsp(68,5) name = icon type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f0.setIcon("icon-search");
    // /webpage/com/lhmh/storage/storage.jsp(68,5) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f0.setTitle("员工列表");
    // /webpage/com/lhmh/storage/storage.jsp(68,5) name = textname type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f0.setTextname("empName");
    // /webpage/com/lhmh/storage/storage.jsp(68,5) name = isclear type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f0.setIsclear(new Boolean(true));
    int _jspx_eval_t_005fchoose_005f0 = _jspx_th_t_005fchoose_005f0.doStartTag();
    if (_jspx_th_t_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fchoose_0026_005furl_005ftitle_005ftextname_005fname_005fisclear_005ficon_005fhiddenid_005fhiddenName_005fnobody.reuse(_jspx_th_t_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fchoose_0026_005furl_005ftitle_005ftextname_005fname_005fisclear_005ficon_005fhiddenid_005fhiddenName_005fnobody.reuse(_jspx_th_t_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fdictSelect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fformvalid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_005fdictSelect_005f0 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftitle_005fhasLabel_005ffield_005fdefaultVal_005fnobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_005fdictSelect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdictSelect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fformvalid_005f0);
    // /webpage/com/lhmh/storage/storage.jsp(74,8) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setField("status");
    // /webpage/com/lhmh/storage/storage.jsp(74,8) name = typeGroupCode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setTypeGroupCode("status");
    // /webpage/com/lhmh/storage/storage.jsp(74,8) name = defaultVal type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setDefaultVal("default");
    // /webpage/com/lhmh/storage/storage.jsp(74,8) name = hasLabel type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setHasLabel(false);
    // /webpage/com/lhmh/storage/storage.jsp(74,8) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setTitle("(没有label)");
    int _jspx_eval_t_005fdictSelect_005f0 = _jspx_th_t_005fdictSelect_005f0.doStartTag();
    if (_jspx_th_t_005fdictSelect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftitle_005fhasLabel_005ffield_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftitle_005fhasLabel_005ffield_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f0);
    return false;
  }
}
