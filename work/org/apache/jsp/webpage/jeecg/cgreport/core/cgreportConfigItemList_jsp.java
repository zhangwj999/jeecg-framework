package org.apache.jsp.webpage.jeecg.cgreport.core;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cgreportConfigItemList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/context/mytags.jsp");
    _jspx_dependants.add("/WEB-INF/tld/easyui.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdivClass_005fdefaultVal_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdivClass_005fdefaultVal_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdivClass_005fdefaultVal_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
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
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$('#addCgreportConfigItemBtn').linkbutton({   \r\n");
      out.write("\t    iconCls: 'icon-add'  \r\n");
      out.write("\t});  \r\n");
      out.write("\t$('#delCgreportConfigItemBtn').linkbutton({   \r\n");
      out.write("\t    iconCls: 'icon-remove'  \r\n");
      out.write("\t}); \r\n");
      out.write("\t$('#addCgreportConfigItemBtn').bind('click', function(){   \r\n");
      out.write(" \t\t var tr =  $(\"#add_cgreportConfigItem_table_template tr\").clone();\r\n");
      out.write("\t \t $(\"#add_cgreportConfigItem_table\").append(tr);\r\n");
      out.write("\t \t resetTrNum('add_cgreportConfigItem_table');\r\n");
      out.write("    });  \r\n");
      out.write("\t$('#delCgreportConfigItemBtn').bind('click', function(){   \r\n");
      out.write("      \t$(\"#add_cgreportConfigItem_table\").find(\"input:checked\").parent().parent().remove();   \r\n");
      out.write("        resetTrNum('add_cgreportConfigItem_table'); \r\n");
      out.write("    }); \r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("    \t$(\".datagrid-toolbar\").parent().css(\"width\",\"auto\");\r\n");
      out.write("    \tif(location.href.indexOf(\"load=detail\")!=-1){\r\n");
      out.write("\t\t\t$(\":input\").attr(\"disabled\",\"true\");\r\n");
      out.write("\t\t\t$(\".datagrid-toolbar\").hide();\r\n");
      out.write("\t\t}\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("<div style=\"padding: 3px; height: 25px; width: auto;\" class=\"datagrid-toolbar\"><a id=\"addCgreportConfigItemBtn\" href=\"#\">添加</a> <a id=\"delCgreportConfigItemBtn\" href=\"#\">删除</a></div>\r\n");
      out.write("<div style=\"width: auto; height: 300px; overflow-y: auto; overflow-x: scroll;\">\r\n");
      out.write("<table border=\"0\" cellpadding=\"2\" cellspacing=\"0\" id=\"cgreportConfigItem_table\">\r\n");
      out.write("\t<tr bgcolor=\"#E6E6E6\">\r\n");
      out.write("\t\t<td align=\"center\" bgcolor=\"#EEEEEE\"><label class=\"Validform_label\">序号</label></td>\r\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\"><label class=\"Validform_label\"> 字段名 </label></td>\r\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\"><label class=\"Validform_label\"> 排序 </label></td>\r\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\"><label class=\"Validform_label\"> 字段文本 </label></td>\r\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\"><label class=\"Validform_label\"> 字段类型 </label></td>\r\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\"><label class=\"Validform_label\"> 是否显示 </label></td>\r\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\"><label class=\"Validform_label\"> 字段href </label></td>\r\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\"><label class=\"Validform_label\"> 查询模式 </label></td>\r\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\"><label class=\"Validform_label\"> 取值表达式 </label></td>\r\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\"><label class=\"Validform_label\"> 字典Code </label></td>\r\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\"><label class=\"Validform_label\"> 是否查询 </label></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tbody id=\"add_cgreportConfigItem_table\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</tbody>\r\n");
      out.write("</table>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(44,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(cgreportConfigItemList)  <= 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td align=\"center\"><input style=\"width: 20px;\" type=\"checkbox\" name=\"ck\" /></td>\r\n");
        out.write("\t\t\t\t<input name=\"cgreportConfigItemList[0].id\" type=\"hidden\" />\r\n");
        out.write("\t\t\t\t<input name=\"cgreportConfigItemList[0].cgrheadId\" type=\"hidden\" />\r\n");
        out.write("\t\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[0].fieldName\" maxlength=\"36\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\"></td>\r\n");
        out.write("\t\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[0].orderNum\" maxlength=\"3\" type=\"text\" class=\"inputxt\" style=\"width: 30px;\"></td>\r\n");
        out.write("\t\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[0].fieldTxt\" maxlength=\"1000\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\"></td>\r\n");
        out.write("\t\t\t\t<td align=\"left\">");
        if (_jspx_meth_t_005fdictSelect_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t<td align=\"left\"><select name=\"cgreportConfigItemList[0].isShow\" style=\"width: 60px;\">\r\n");
        out.write("\t\t\t\t\t<option value=\"Y\">显示</option>\r\n");
        out.write("\t\t\t\t\t<option value=\"N\">隐藏</option>\r\n");
        out.write("\t\t\t\t</select></td>\r\n");
        out.write("\t\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[0].fieldHref\" maxlength=\"100\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\"></td>\r\n");
        out.write("\t\t\t\t<td align=\"left\">");
        if (_jspx_meth_t_005fdictSelect_005f1(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[0].replaceVa\" maxlength=\"36\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\"></td>\r\n");
        out.write("\t\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[0].dictCode\" maxlength=\"36\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\"></td>\r\n");
        out.write("\t\t\t\t<td align=\"left\">");
        if (_jspx_meth_t_005fdictSelect_005f2(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fdictSelect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_005fdictSelect_005f0 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_005fdictSelect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdictSelect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(52,21) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setField("cgreportConfigItemList[0].fieldType");
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(52,21) name = extendJson type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setExtendJson("{style:'width:80px'}");
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(52,21) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setType("list");
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(52,21) name = typeGroupCode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setTypeGroupCode("fieldtype");
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(52,21) name = defaultVal type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cgreportConfigItemPage.fieldType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(52,21) name = hasLabel type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setHasLabel(false);
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(52,21) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setTitle("字段类型");
    int _jspx_eval_t_005fdictSelect_005f0 = _jspx_th_t_005fdictSelect_005f0.doStartTag();
    if (_jspx_th_t_005fdictSelect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fdictSelect_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_005fdictSelect_005f1 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_005fdictSelect_005f1.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdictSelect_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(58,21) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f1.setField("cgreportConfigItemList[0].SMode");
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(58,21) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f1.setType("list");
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(58,21) name = extendJson type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f1.setExtendJson("{style:'width:90px'}");
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(58,21) name = typeGroupCode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f1.setTypeGroupCode("searchmode");
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(58,21) name = defaultVal type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f1.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cgreportConfigItemPage.sMode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(58,21) name = hasLabel type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f1.setHasLabel(false);
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(58,21) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f1.setTitle("查询模式");
    int _jspx_eval_t_005fdictSelect_005f1 = _jspx_th_t_005fdictSelect_005f1.doStartTag();
    if (_jspx_th_t_005fdictSelect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f1);
    return false;
  }

  private boolean _jspx_meth_t_005fdictSelect_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_005fdictSelect_005f2 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdivClass_005fdefaultVal_005fnobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_005fdictSelect_005f2.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdictSelect_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(61,21) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f2.setField("cgreportConfigItemList[0].SFlag");
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(61,21) name = extendJson type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f2.setExtendJson("{style:'width:60px'}");
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(61,21) name = divClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f2.setDivClass("STYLE_LEG");
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(61,21) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f2.setType("list");
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(61,21) name = typeGroupCode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f2.setTypeGroupCode("yesorno");
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(61,21) name = defaultVal type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f2.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cgreportConfigItemPage.sFlag}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(61,21) name = hasLabel type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f2.setHasLabel(false);
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(61,21) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f2.setTitle("是否查询");
    int _jspx_eval_t_005fdictSelect_005f2 = _jspx_th_t_005fdictSelect_005f2.doStartTag();
    if (_jspx_th_t_005fdictSelect_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdivClass_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdivClass_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(64,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(cgreportConfigItemList)  > 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fif_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(65,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(65,3) '${cgreportConfigItemList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${cgreportConfigItemList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(65,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("poVal");
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(65,3) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("stuts");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t<td align=\"center\"><input style=\"width: 20px;\" type=\"checkbox\" name=\"ck\" /></td>\r\n");
          out.write("\t\t\t\t\t<input name=\"cgreportConfigItemList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].id\" type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" />\r\n");
          out.write("\t\t\t\t\t<input name=\"cgreportConfigItemList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].cgrheadId\" type=\"hidden\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.cgrheadId }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" />\r\n");
          out.write("\t\t\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].fieldName\" maxlength=\"36\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.fieldName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></td>\r\n");
          out.write("\t\t\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].orderNum\" maxlength=\"10\" type=\"text\" class=\"inputxt\" style=\"width: 30px;\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.orderNum }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></td>\r\n");
          out.write("\t\t\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].fieldTxt\" maxlength=\"1000\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.fieldTxt }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></td>\r\n");
          out.write("\t\t\t\t\t<td align=\"left\">");
          if (_jspx_meth_t_005fdictSelect_005f3(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t<td align=\"left\"><select id=\"isShow\" name=\"cgreportConfigItemList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].isShow\"  style=\"width: 60px;\">\r\n");
          out.write("\t\t\t\t\t\t<option value=\"N\" ");
          if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write(">隐藏</option>\r\n");
          out.write("\t\t\t\t\t\t<option value=\"Y\" ");
          if (_jspx_meth_c_005fif_005f3(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write(">显示</option>\r\n");
          out.write("\t\t\t\t\t</select></td>\r\n");
          out.write("\t\t\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].fieldHref\" maxlength=\"120\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.fieldHref}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></td>\r\n");
          out.write("\t\t\t\t\t<td align=\"left\">");
          if (_jspx_meth_t_005fdictSelect_005f4(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].replaceVa\" maxlength=\"36\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.replaceVa }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></td>\r\n");
          out.write("\t\t\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].dictCode\" maxlength=\"36\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.dictCode }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></td>\r\n");
          out.write("\t\t\t\t\t<td align=\"left\">");
          if (_jspx_meth_t_005fdictSelect_005f5(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>\r\n");
          out.write("\t\t\t\t</tr>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_t_005fdictSelect_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_005fdictSelect_005f3 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_005fdictSelect_005f3.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdictSelect_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(73,22) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f3.setField((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("cgreportConfigItemList[${stuts.index }].fieldType", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(73,22) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f3.setType("list");
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(73,22) name = extendJson type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f3.setExtendJson("{style:'width:80px'}");
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(73,22) name = typeGroupCode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f3.setTypeGroupCode("fieldtype");
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(73,22) name = defaultVal type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f3.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.fieldType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(73,22) name = hasLabel type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f3.setHasLabel(false);
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(73,22) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f3.setTitle("字段类型");
    int _jspx_eval_t_005fdictSelect_005f3 = _jspx_th_t_005fdictSelect_005f3.doStartTag();
    if (_jspx_th_t_005fdictSelect_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(76,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.isShow eq 'N'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected=\"selected\"");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(77,24) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.isShow eq 'Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected=\"selected\"");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_t_005fdictSelect_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_005fdictSelect_005f4 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_005fdictSelect_005f4.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdictSelect_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(80,22) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f4.setField((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("cgreportConfigItemList[${stuts.index }].SMode", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(80,22) name = extendJson type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f4.setExtendJson("{style:'width:90px'}");
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(80,22) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f4.setType("list");
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(80,22) name = typeGroupCode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f4.setTypeGroupCode("searchmode");
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(80,22) name = defaultVal type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f4.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.SMode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(80,22) name = hasLabel type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f4.setHasLabel(false);
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(80,22) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f4.setTitle("查询模式");
    int _jspx_eval_t_005fdictSelect_005f4 = _jspx_th_t_005fdictSelect_005f4.doStartTag();
    if (_jspx_th_t_005fdictSelect_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f4);
    return false;
  }

  private boolean _jspx_meth_t_005fdictSelect_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_005fdictSelect_005f5 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_005fdictSelect_005f5.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdictSelect_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(83,22) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f5.setField((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("cgreportConfigItemList[${stuts.index }].SFlag", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(83,22) name = extendJson type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f5.setExtendJson("{style:'width:60px'}");
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(83,22) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f5.setType("list");
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(83,22) name = typeGroupCode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f5.setTypeGroupCode("yesorno");
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(83,22) name = defaultVal type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f5.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.SFlag}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(83,22) name = hasLabel type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f5.setHasLabel(false);
    // /webpage/jeecg/cgreport/core/cgreportConfigItemList.jsp(83,22) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f5.setTitle("是否查询");
    int _jspx_eval_t_005fdictSelect_005f5 = _jspx_th_t_005fdictSelect_005f5.doStartTag();
    if (_jspx_th_t_005fdictSelect_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f5);
    return false;
  }
}
