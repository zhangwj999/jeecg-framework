package org.apache.jsp.webpage.jeecg.cgreport.core;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class cgreportConfigHead_002dadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005ftabs_0026_005ftabPosition_005fiframe_005fid_005ffit;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005ftabs_0026_005ftabPosition_005fiframe_005fid_005ffit = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005faction.release();
    _005fjspx_005ftagPool_005ft_005ftabs_0026_005ftabPosition_005fiframe_005fid_005ffit.release();
    _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.release();
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
      out.write("<title>动态报表配置抬头</title>\r\n");
      if (_jspx_meth_t_005fbase_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/ckeditor_new/ckeditor.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/ckfinder/ckfinder.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("  $(document).ready(function(){\r\n");
      out.write("\t$('#tt').tabs({\r\n");
      out.write("\t   onSelect:function(title){\r\n");
      out.write("\t       $('#tt .panel-body').css('width','auto');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("  });\r\n");
      out.write(" //初始化下标\r\n");
      out.write("\tfunction resetTrNum(tableId) {\r\n");
      out.write("\t\t$tbody = $(\"#\"+tableId+\"\");\r\n");
      out.write("\t\t$tbody.find('>tr').each(function(i){\r\n");
      out.write("\t\t\t$(':input, select,button,a', this).each(function(){\r\n");
      out.write("\t\t\t\tvar $this = $(this), name = $this.attr('name'),id=$this.attr('id'),onclick_str=$this.attr('onclick'), val = $this.val();\r\n");
      out.write("\t\t\t\tif(name!=null){\r\n");
      out.write("\t\t\t\t\tif (name.indexOf(\"#index#\") >= 0){\r\n");
      out.write("\t\t\t\t\t\t$this.attr(\"name\",name.replace('#index#',i));\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\tvar s = name.indexOf(\"[\");\r\n");
      out.write("\t\t\t\t\t\tvar e = name.indexOf(\"]\");\r\n");
      out.write("\t\t\t\t\t\tvar new_name = name.substring(s+1,e);\r\n");
      out.write("\t\t\t\t\t\t$this.attr(\"name\",name.replace(new_name,i));\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(id!=null){\r\n");
      out.write("\t\t\t\t\tif (id.indexOf(\"#index#\") >= 0){\r\n");
      out.write("\t\t\t\t\t\t$this.attr(\"id\",id.replace('#index#',i));\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\tvar s = id.indexOf(\"[\");\r\n");
      out.write("\t\t\t\t\t\tvar e = id.indexOf(\"]\");\r\n");
      out.write("\t\t\t\t\t\tvar new_id = id.substring(s+1,e);\r\n");
      out.write("\t\t\t\t\t\t$this.attr(\"id\",id.replace(new_id,i));\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(onclick_str!=null){\r\n");
      out.write("\t\t\t\t\tif (onclick_str.indexOf(\"#index#\") >= 0){\r\n");
      out.write("\t\t\t\t\t\t$this.attr(\"onclick\",onclick_str.replace(/#index#/g,i));\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction browseImages(inputId, Img) {// 图片管理器，可多个上传共用\r\n");
      out.write("\t\tvar finder = new CKFinder();\r\n");
      out.write("\t\tfinder.selectActionFunction = function(fileUrl, data) {//设置文件被选中时的函数 \r\n");
      out.write("\t\t\t$(\"#\" + Img).attr(\"src\", fileUrl);\r\n");
      out.write("\t\t\t$(\"#\" + inputId).attr(\"value\", fileUrl);\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\tfinder.resourceType = 'Images';// 指定ckfinder只为图片进行管理\r\n");
      out.write("\t\tfinder.selectActionData = inputId; //接收地址的input ID\r\n");
      out.write("\t\tfinder.removePlugins = 'help';// 移除帮助(只有英文)\r\n");
      out.write("\t\tfinder.defaultLanguage = 'zh-cn';\r\n");
      out.write("\t\tfinder.popup();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction browseFiles(inputId, file) {// 文件管理器，可多个上传共用\r\n");
      out.write("\t\tvar finder = new CKFinder();\r\n");
      out.write("\t\tfinder.selectActionFunction = function(fileUrl, data) {//设置文件被选中时的函数 \r\n");
      out.write("\t\t\t$(\"#\" + file).attr(\"href\", fileUrl);\r\n");
      out.write("\t\t\t$(\"#\" + inputId).attr(\"value\", fileUrl);\r\n");
      out.write("\t\t\tdecode(fileUrl, file);\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\tfinder.resourceType = 'Files';// 指定ckfinder只为文件进行管理\r\n");
      out.write("\t\tfinder.selectActionData = inputId; //接收地址的input ID\r\n");
      out.write("\t\tfinder.removePlugins = 'help';// 移除帮助(只有英文)\r\n");
      out.write("\t\tfinder.defaultLanguage = 'zh-cn';\r\n");
      out.write("\t\tfinder.popup();\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction decode(value, id) {//value传入值,id接受值\r\n");
      out.write("\t\tvar last = value.lastIndexOf(\"/\");\r\n");
      out.write("\t\tvar filename = value.substring(last + 1, value.length);\r\n");
      out.write("\t\t$(\"#\" + id).text(decodeURIComponent(filename));\r\n");
      out.write("\t}\r\n");
      out.write(" </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"overflow-x: hidden;\">\r\n");
      if (_jspx_meth_t_005fformvalid_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<!-- 添加 附表明细 模版 -->\r\n");
      out.write("<table style=\"display: none\">\r\n");
      out.write("\t<tbody id=\"add_cgreportConfigItem_table_template\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\"><input style=\"width: 20px;\" type=\"checkbox\" name=\"ck\" /></td>\r\n");
      out.write("\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[#index#].fieldName\" maxlength=\"36\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\"></td>\r\n");
      out.write("\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[#index#].orderNum\" maxlength=\"10\" type=\"text\" class=\"inputxt\" style=\"width: 30px;\"></td>\r\n");
      out.write("\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[#index#].fieldTxt\" maxlength=\"1000\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\"></td>\r\n");
      out.write("\t\t\t<td align=\"left\">");
      if (_jspx_meth_t_005fdictSelect_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("\t\t\t<td align=\"left\"><select id=\"isShow\" name=\"cgreportConfigItemList[#index#].isShow\"  style=\"width: 60px;\">\r\n");
      out.write("\t\t\t\t<option value=\"Y\">显示</option>\r\n");
      out.write("\t\t\t\t<option value=\"N\">隐藏</option>\r\n");
      out.write("\t\t\t</select></td>\r\n");
      out.write("\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[#index#].fieldHref\" maxlength=\"1000\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\">\r\n");
      out.write("\t\t\t<td align=\"left\">");
      if (_jspx_meth_t_005fdictSelect_005f1(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[#index#].replaceVa\" maxlength=\"36\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\"></td>\r\n");
      out.write("\t\t\t<td align=\"left\"><input name=\"cgreportConfigItemList[#index#].dictCode\" maxlength=\"36\" type=\"text\" class=\"inputxt\" style=\"width: 120px;\"></td>\r\n");
      out.write("\t\t\t<td align=\"left\">");
      if (_jspx_meth_t_005fdictSelect_005f2(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"webpage/jeecg/cgreport/core/cgreportConfigHead.js\"></script>");
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
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(7,0) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_005fformvalid_005f0 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005faction.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
    _jspx_th_t_005fformvalid_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fformvalid_005f0.setParent(null);
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(86,0) name = formid type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setFormid("formobj");
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(86,0) name = dialog type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setDialog(true);
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(86,0) name = usePlugin type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setUsePlugin("password");
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(86,0) name = layout type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setLayout("table");
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(86,0) name = tiptype type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setTiptype("1");
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(86,0) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setAction("cgreportConfigHeadController.do?doAdd");
    int _jspx_eval_t_005fformvalid_005f0 = _jspx_th_t_005fformvalid_005f0.doStartTag();
    if (_jspx_eval_t_005fformvalid_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<input id=\"id\" name=\"id\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cgreportConfigHeadPage.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("\t<table cellpadding=\"0\" cellspacing=\"1\" class=\"formtable\">\r\n");
        out.write("\t\t<tr>\r\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\">编码:</label></td>\r\n");
        out.write("\t\t\t<td class=\"value\"><input id=\"code\" name=\"code\" type=\"text\" style=\"width: 150px\" class=\"inputxt\" datatype=\"w1\"> <span class=\"Validform_checktip\"></span></td>\r\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\">名称:</label></td>\r\n");
        out.write("\t\t\t<td class=\"value\"><input id=\"name\" name=\"name\" type=\"text\" style=\"width: 150px\" class=\"inputxt\" datatype=\"*\"> <span class=\"Validform_checktip\"></span></td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t\t<tr>\r\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\">查询数据SQL:</label></td>\r\n");
        out.write("\t\t\t<td class=\"value\" colspan=\"3\"><textarea rows=\"5\" cols=\"90\" id=\"cgrSql\" name=\"cgrSql\" datatype=\"*\"></textarea> <span class=\"Validform_checktip\"></span></td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t\t<tr>\r\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\">描述:</label></td>\r\n");
        out.write("\t\t\t<td class=\"value\" colspan=\"3\"><textarea rows=\"3\" cols=\"90\" id=\"content\" name=\"content\" datatype=\"*\"></textarea> <span class=\"Validform_checktip\"></span></td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t</table>\r\n");
        out.write("\t<div style=\"width: auto; height: 200px;\">");
        out.write("\r\n");
        out.write("\t<div style=\"width: 800px; height: 1px;\"></div>\r\n");
        out.write("\t");
        if (_jspx_meth_t_005ftabs_005f0(_jspx_th_t_005fformvalid_005f0, _jspx_page_context))
          return true;
        out.write("</div>\r\n");
        int evalDoAfterBody = _jspx_th_t_005fformvalid_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_005fformvalid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005faction.reuse(_jspx_th_t_005fformvalid_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005faction.reuse(_jspx_th_t_005fformvalid_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005ftabs_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fformvalid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tabs
    org.jeecgframework.tag.core.easyui.TabsTag _jspx_th_t_005ftabs_005f0 = (org.jeecgframework.tag.core.easyui.TabsTag) _005fjspx_005ftagPool_005ft_005ftabs_0026_005ftabPosition_005fiframe_005fid_005ffit.get(org.jeecgframework.tag.core.easyui.TabsTag.class);
    _jspx_th_t_005ftabs_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005ftabs_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fformvalid_005f0);
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(106,1) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftabs_005f0.setId("tt");
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(106,1) name = iframe type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftabs_005f0.setIframe(false);
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(106,1) name = tabPosition type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftabs_005f0.setTabPosition("top");
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(106,1) name = fit type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftabs_005f0.setFit(false);
    int _jspx_eval_t_005ftabs_005f0 = _jspx_th_t_005ftabs_005f0.doStartTag();
    if (_jspx_eval_t_005ftabs_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_t_005ftab_005f0(_jspx_th_t_005ftabs_005f0, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
        int evalDoAfterBody = _jspx_th_t_005ftabs_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_005ftabs_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005ftabs_0026_005ftabPosition_005fiframe_005fid_005ffit.reuse(_jspx_th_t_005ftabs_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005ftabs_0026_005ftabPosition_005fiframe_005fid_005ffit.reuse(_jspx_th_t_005ftabs_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005ftab_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005ftabs_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:tab
    org.jeecgframework.tag.core.easyui.TabTag _jspx_th_t_005ftab_005f0 = (org.jeecgframework.tag.core.easyui.TabTag) _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody.get(org.jeecgframework.tag.core.easyui.TabTag.class);
    _jspx_th_t_005ftab_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005ftab_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005ftabs_005f0);
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(107,2) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f0.setHref((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("cgreportConfigHeadController.do?cgreportConfigItemList&id=${cgreportConfigHeadPage.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(107,2) name = icon type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f0.setIcon("icon-search");
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(107,2) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f0.setTitle("动态报表配置明细");
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(107,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f0.setId("cgreportConfigItem");
    int _jspx_eval_t_005ftab_005f0 = _jspx_th_t_005ftab_005f0.doStartTag();
    if (_jspx_th_t_005ftab_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody.reuse(_jspx_th_t_005ftab_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody.reuse(_jspx_th_t_005ftab_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fdictSelect_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_005fdictSelect_005f0 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_005fdictSelect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdictSelect_005f0.setParent(null);
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(118,20) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setField("cgreportConfigItemList[#index#].fieldType");
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(118,20) name = extendJson type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setExtendJson("{style:'width:80px'}");
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(118,20) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setType("list");
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(118,20) name = typeGroupCode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setTypeGroupCode("fieldtype");
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(118,20) name = defaultVal type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setDefaultVal("String");
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(118,20) name = hasLabel type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setHasLabel(false);
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(118,20) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setTitle("字段类型");
    int _jspx_eval_t_005fdictSelect_005f0 = _jspx_th_t_005fdictSelect_005f0.doStartTag();
    if (_jspx_th_t_005fdictSelect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fdictSelect_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_005fdictSelect_005f1 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_005fdictSelect_005f1.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdictSelect_005f1.setParent(null);
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(124,20) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f1.setField("cgreportConfigItemList[#index#].SMode");
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(124,20) name = extendJson type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f1.setExtendJson("{style:'width:90px'}");
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(124,20) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f1.setType("list");
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(124,20) name = typeGroupCode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f1.setTypeGroupCode("searchmode");
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(124,20) name = defaultVal type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f1.setDefaultVal("");
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(124,20) name = hasLabel type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f1.setHasLabel(false);
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(124,20) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f1.setTitle("查询模式");
    int _jspx_eval_t_005fdictSelect_005f1 = _jspx_th_t_005fdictSelect_005f1.doStartTag();
    if (_jspx_th_t_005fdictSelect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f1);
    return false;
  }

  private boolean _jspx_meth_t_005fdictSelect_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_005fdictSelect_005f2 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_005fdictSelect_005f2.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdictSelect_005f2.setParent(null);
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(127,20) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f2.setField("cgreportConfigItemList[#index#].SFlag");
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(127,20) name = extendJson type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f2.setExtendJson("{style:'width:60px'}");
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(127,20) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f2.setType("list");
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(127,20) name = typeGroupCode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f2.setTypeGroupCode("yesorno");
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(127,20) name = defaultVal type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f2.setDefaultVal("");
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(127,20) name = hasLabel type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f2.setHasLabel(false);
    // /webpage/jeecg/cgreport/core/cgreportConfigHead-add.jsp(127,20) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f2.setTitle("是否查询");
    int _jspx_eval_t_005fdictSelect_005f2 = _jspx_th_t_005fdictSelect_005f2.doStartTag();
    if (_jspx_th_t_005fdictSelect_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fextendJson_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f2);
    return false;
  }
}
