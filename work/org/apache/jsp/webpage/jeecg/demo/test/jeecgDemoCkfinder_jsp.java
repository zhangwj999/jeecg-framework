package org.apache.jsp.webpage.jeecg.demo.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class jeecgDemoCkfinder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fckfinder_0026_005fwidth_005fvalue_005fuploadType_005fname_005fheight_005fbuttonValue_005fbuttonClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fckfinder_0026_005fvalue_005fuploadType_005fname_005fbuttonValue_005fbuttonClass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fckeditor_0026_005fvalue_005ftype_005fname_005fisfinder_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005flayout_005fformid_005fdialog_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fckfinder_0026_005fwidth_005fvalue_005fuploadType_005fname_005fheight_005fbuttonValue_005fbuttonClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fckfinder_0026_005fvalue_005fuploadType_005fname_005fbuttonValue_005fbuttonClass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fckeditor_0026_005fvalue_005ftype_005fname_005fisfinder_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005flayout_005fformid_005fdialog_005faction.release();
    _005fjspx_005ftagPool_005ft_005fckfinder_0026_005fwidth_005fvalue_005fuploadType_005fname_005fheight_005fbuttonValue_005fbuttonClass_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fckfinder_0026_005fvalue_005fuploadType_005fname_005fbuttonValue_005fbuttonClass_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fckeditor_0026_005fvalue_005ftype_005fname_005fisfinder_005fnobody.release();
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

 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>ckeditor+ckfinder例子</title>\r\n");
      if (_jspx_meth_t_005fbase_005f0(_jspx_page_context))
        return;
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"plug-in/jquery-ui/css/ui-lightness/jquery-ui-1.9.2.custom.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      if (_jspx_meth_t_005fformvalid_005f0(_jspx_page_context))
        return;
      out.write("</body>");
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
    // /webpage/jeecg/demo/test/jeecgDemoCkfinder.jsp(8,0) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fbase_005f0.setType("ckfinder,ckeditor,jquery,easyui,tools,DatePicker");
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
    // /webpage/jeecg/demo/test/jeecgDemoCkfinder.jsp(12,0) name = formid type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setFormid("formobj");
    // /webpage/jeecg/demo/test/jeecgDemoCkfinder.jsp(12,0) name = dialog type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setDialog(true);
    // /webpage/jeecg/demo/test/jeecgDemoCkfinder.jsp(12,0) name = usePlugin type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setUsePlugin("password");
    // /webpage/jeecg/demo/test/jeecgDemoCkfinder.jsp(12,0) name = layout type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setLayout("table");
    // /webpage/jeecg/demo/test/jeecgDemoCkfinder.jsp(12,0) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setAction("jeecgDemoCkfinderController.do?save");
    int _jspx_eval_t_005fformvalid_005f0 = _jspx_th_t_005fformvalid_005f0.doStartTag();
    if (_jspx_eval_t_005fformvalid_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<input id=\"id\" name=\"id\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jeecgDemoCkfinderPage.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("\t<table style=\"width: 870px; height: 500px;\" cellpadding=\"0\" cellspacing=\"1\" class=\"formtable\">\r\n");
        out.write("\t\t<tr>\r\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 图片: </label></td>\r\n");
        out.write("\t\t\t<td class=\"value\">");
        if (_jspx_meth_t_005fckfinder_005f0(_jspx_th_t_005fformvalid_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t\t<tr>\r\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 附件: </label></td>\r\n");
        out.write("\t\t\t<td class=\"value\">");
        if (_jspx_meth_t_005fckfinder_005f1(_jspx_th_t_005fformvalid_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t\t<tr>\r\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 备注: </label></td>\r\n");
        out.write("\t\t\t<td class=\"value\">");
        if (_jspx_meth_t_005fckeditor_005f0(_jspx_th_t_005fformvalid_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t</table>\r\n");
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

  private boolean _jspx_meth_t_005fckfinder_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fformvalid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:ckfinder
    org.jeecgframework.tag.core.easyui.CkfinderTag _jspx_th_t_005fckfinder_005f0 = (org.jeecgframework.tag.core.easyui.CkfinderTag) _005fjspx_005ftagPool_005ft_005fckfinder_0026_005fwidth_005fvalue_005fuploadType_005fname_005fheight_005fbuttonValue_005fbuttonClass_005fnobody.get(org.jeecgframework.tag.core.easyui.CkfinderTag.class);
    _jspx_th_t_005fckfinder_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fckfinder_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fformvalid_005f0);
    // /webpage/jeecg/demo/test/jeecgDemoCkfinder.jsp(17,21) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fckfinder_005f0.setName("image");
    // /webpage/jeecg/demo/test/jeecgDemoCkfinder.jsp(17,21) name = uploadType type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fckfinder_005f0.setUploadType("Images");
    // /webpage/jeecg/demo/test/jeecgDemoCkfinder.jsp(17,21) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fckfinder_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jeecgDemoCkfinderPage.image}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /webpage/jeecg/demo/test/jeecgDemoCkfinder.jsp(17,21) name = width type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fckfinder_005f0.setWidth("100");
    // /webpage/jeecg/demo/test/jeecgDemoCkfinder.jsp(17,21) name = height type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fckfinder_005f0.setHeight("60");
    // /webpage/jeecg/demo/test/jeecgDemoCkfinder.jsp(17,21) name = buttonClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fckfinder_005f0.setButtonClass("ui-button");
    // /webpage/jeecg/demo/test/jeecgDemoCkfinder.jsp(17,21) name = buttonValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fckfinder_005f0.setButtonValue("上传图片");
    int _jspx_eval_t_005fckfinder_005f0 = _jspx_th_t_005fckfinder_005f0.doStartTag();
    if (_jspx_th_t_005fckfinder_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fckfinder_0026_005fwidth_005fvalue_005fuploadType_005fname_005fheight_005fbuttonValue_005fbuttonClass_005fnobody.reuse(_jspx_th_t_005fckfinder_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fckfinder_0026_005fwidth_005fvalue_005fuploadType_005fname_005fheight_005fbuttonValue_005fbuttonClass_005fnobody.reuse(_jspx_th_t_005fckfinder_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fckfinder_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fformvalid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:ckfinder
    org.jeecgframework.tag.core.easyui.CkfinderTag _jspx_th_t_005fckfinder_005f1 = (org.jeecgframework.tag.core.easyui.CkfinderTag) _005fjspx_005ftagPool_005ft_005fckfinder_0026_005fvalue_005fuploadType_005fname_005fbuttonValue_005fbuttonClass_005fnobody.get(org.jeecgframework.tag.core.easyui.CkfinderTag.class);
    _jspx_th_t_005fckfinder_005f1.setPageContext(_jspx_page_context);
    _jspx_th_t_005fckfinder_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fformvalid_005f0);
    // /webpage/jeecg/demo/test/jeecgDemoCkfinder.jsp(21,21) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fckfinder_005f1.setName("attachment");
    // /webpage/jeecg/demo/test/jeecgDemoCkfinder.jsp(21,21) name = uploadType type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fckfinder_005f1.setUploadType("Files");
    // /webpage/jeecg/demo/test/jeecgDemoCkfinder.jsp(21,21) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fckfinder_005f1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jeecgDemoCkfinderPage.attachment}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /webpage/jeecg/demo/test/jeecgDemoCkfinder.jsp(21,21) name = buttonClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fckfinder_005f1.setButtonClass("ui-button");
    // /webpage/jeecg/demo/test/jeecgDemoCkfinder.jsp(21,21) name = buttonValue type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fckfinder_005f1.setButtonValue("上传附件");
    int _jspx_eval_t_005fckfinder_005f1 = _jspx_th_t_005fckfinder_005f1.doStartTag();
    if (_jspx_th_t_005fckfinder_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fckfinder_0026_005fvalue_005fuploadType_005fname_005fbuttonValue_005fbuttonClass_005fnobody.reuse(_jspx_th_t_005fckfinder_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fckfinder_0026_005fvalue_005fuploadType_005fname_005fbuttonValue_005fbuttonClass_005fnobody.reuse(_jspx_th_t_005fckfinder_005f1);
    return false;
  }

  private boolean _jspx_meth_t_005fckeditor_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fformvalid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:ckeditor
    org.jeecgframework.tag.core.easyui.CkeditorTag _jspx_th_t_005fckeditor_005f0 = (org.jeecgframework.tag.core.easyui.CkeditorTag) _005fjspx_005ftagPool_005ft_005fckeditor_0026_005fvalue_005ftype_005fname_005fisfinder_005fnobody.get(org.jeecgframework.tag.core.easyui.CkeditorTag.class);
    _jspx_th_t_005fckeditor_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fckeditor_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fformvalid_005f0);
    // /webpage/jeecg/demo/test/jeecgDemoCkfinder.jsp(25,21) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fckeditor_005f0.setName("remark");
    // /webpage/jeecg/demo/test/jeecgDemoCkfinder.jsp(25,21) name = isfinder type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fckeditor_005f0.setIsfinder(true);
    // /webpage/jeecg/demo/test/jeecgDemoCkfinder.jsp(25,21) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fckeditor_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jeecgDemoCkfinderPage.remark}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /webpage/jeecg/demo/test/jeecgDemoCkfinder.jsp(25,21) name = type type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fckeditor_005f0.setType("width:750");
    int _jspx_eval_t_005fckeditor_005f0 = _jspx_th_t_005fckeditor_005f0.doStartTag();
    if (_jspx_th_t_005fckeditor_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fckeditor_0026_005fvalue_005ftype_005fname_005fisfinder_005fnobody.reuse(_jspx_th_t_005fckeditor_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fckeditor_0026_005fvalue_005ftype_005fname_005fisfinder_005fnobody.reuse(_jspx_th_t_005fckeditor_005f0);
    return false;
  }
}
