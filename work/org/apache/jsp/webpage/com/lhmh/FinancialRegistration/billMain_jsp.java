package org.apache.jsp.webpage.com.lhmh.FinancialRegistration;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class billMain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fchoose_0026_005furl_005ftitle_005ftextname_005fname_005fisclear_005ficon_005fhiddenid_005fhiddenName_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftitle_005fhasLabel_005ffield_005fdefaultVal_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005ftabs_0026_005ftabPosition_005fiframe_005fid_005ffit;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fchoose_0026_005furl_005ftitle_005ftextname_005fname_005fisclear_005ficon_005fhiddenid_005fhiddenName_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftitle_005fhasLabel_005ffield_005fdefaultVal_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005ftabs_0026_005ftabPosition_005fiframe_005fid_005ffit = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005faction.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005ft_005fchoose_0026_005furl_005ftitle_005ftextname_005fname_005fisclear_005ficon_005fhiddenid_005fhiddenName_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftitle_005fhasLabel_005ffield_005fdefaultVal_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005ftabs_0026_005ftabPosition_005fiframe_005fid_005ffit.release();
    _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody.release();
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
      out.write("  <title>业务登记</title>\r\n");
      out.write("  ");
      if (_jspx_meth_t_005fbase_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("  //初始化下标\r\n");
      out.write("\tfunction resetTrNum(tableId) {\r\n");
      out.write("\t\t$tbody = $(\"#\"+tableId+\"\");\r\n");
      out.write("\t\t$tbody.find('>tr').each(function(i){\r\n");
      out.write("\t\t\t$(':input, select', this).each(function(){\r\n");
      out.write("\t\t\t\tvar $this = $(this), name = $this.attr('name'), val = $this.val();\r\n");
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
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$(this).find('div[name=\\'xh\\']').html(i+1);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("    //加载产品\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t \t$.ajax({ //一个Ajax过程 \r\n");
      out.write("   \t         type : \"post\", //以post方式与后台沟通\r\n");
      out.write("              async : false,\r\n");
      out.write("              data: {info:encodeURIComponent(JSON.stringify(obj))}, \r\n");
      out.write("              url : 'billMainController.do?getPrdouct',\r\n");
      out.write("              dataType : 'text',//\r\n");
      out.write("              success : function(json) {\r\n");
      out.write("            \t  var html=\"\";\r\n");
      out.write("            \t  \r\n");
      out.write("            \t  json=eval( \"( \"+json+\" )\" )\r\n");
      out.write("            \t html=\"<option ></option>\";\r\n");
      out.write("            \t for(var i=0;i<json.length;i++){\r\n");
      out.write("            \t\t \r\n");
      out.write("            \t\thtml+=\"<option value='\"+json[i].productId+\"'>\"+json[i].productName+\"</option>\"; \r\n");
      out.write("            \t\t\r\n");
      out.write("            \t }\r\n");
      out.write("            \t $(\"#productId0\").append(html);\r\n");
      out.write("              }\r\n");
      out.write("        });\r\n");
      out.write("\t});\r\n");
      out.write("   \r\n");
      out.write("\tfunction setPrice(val){\r\n");
      out.write("\t\t var name = $(val).attr(\"name\");\r\n");
      out.write("\t\t name=name.substr(0,name.indexOf(\".\"))+\".price\";\r\n");
      out.write("\t\t var p1=$(val).children('option:selected').val();//这就是selected的值 \r\n");
      out.write("\t\t $.ajax({ //一个Ajax过程 \r\n");
      out.write("\t             type : \"post\", //以post方式与后台沟通\r\n");
      out.write("\t             async : false,\r\n");
      out.write("\t             data: {info:encodeURIComponent(JSON.stringify(obj))}, \r\n");
      out.write("\t             url : 'billMainController.do?getPrdouct',\r\n");
      out.write("\t             dataType : 'text',//\r\n");
      out.write("\t             success : function(json) {\r\n");
      out.write("\t           \t  \t json=eval( \"( \"+json+\" )\" );\r\n");
      out.write("\t\t           \t for(var i=0;i<json.length;i++){\r\n");
      out.write("\t\t           \t\tif(p1==json[i].productId){\r\n");
      out.write("\t\t           \t\t\t//设置price的值\r\n");
      out.write("\t\t           \t\t\t$(\"input[name='\"+name+\"']\").val(json[i].price);\r\n");
      out.write("\t\t           \t\t} \r\n");
      out.write("\t\t           \t }\r\n");
      out.write("\t             }\r\n");
      out.write("\t     });\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write(" \tfunction checkDitOnly(obj){\r\n");
      out.write(" \t\tvar val = $(obj).val();\r\n");
      out.write(" \t\tvar reg = /[\\d]*/g;\r\n");
      out.write(" \t\tvar rlt = reg.exec(val);\r\n");
      out.write("\t\tif(rlt!=null && rlt.length>0){\r\n");
      out.write("\t\t\t$(obj).val(rlt[0]);\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(obj).val('');\r\n");
      out.write("\t\t}\r\n");
      out.write(" \t}\r\n");
      out.write(" </script>\r\n");
      out.write(" </head>\r\n");
      out.write(" <body style=\"overflow-y: hidden\" scroll=\"no\">\r\n");
      out.write("  ");
      if (_jspx_meth_t_005fformvalid_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<!-- 添加 明细 模版 -->\r\n");
      out.write("\t<table style=\"display:none\">\r\n");
      out.write("\t<tbody id=\"add_billProduct_table_template\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t <td align=\"center\"><div style=\"width: 25px;\" name=\"xh\"></div></td>\r\n");
      out.write("\t\t <td align=\"center\"><input style=\"width:20px;\" type=\"checkbox\" name=\"ck\"/></td>\r\n");
      out.write("\t\t\t  <td align=\"left\">\r\n");
      out.write("\t\t\t   <select name=\"billProductList[#index#].productId\" id=\"productId0\" onchange=\"setPrice(this)\"></select>\r\n");
      out.write("\t\t\t  </td>\r\n");
      out.write("\t\t\t  <td align=\"left\"><input name=\"billProductList[#index#].billNum\" maxlength=\"100\" type=\"text\" style=\"width:70px;\" onchange=\"checkDitOnly(this)\"></td>\r\n");
      out.write("\t\t\t  <td align=\"left\"><input name=\"billProductList[#index#].puhCard\" maxlength=\"50\" type=\"text\" style=\"width:100px;\" onchange=\"checkDitOnly(this)\"></td>\r\n");
      out.write("\t\t\t  <td align=\"left\"><input name=\"billProductList[#index#].qty\" maxlength=\"22\" type=\"text\" style=\"width:50px;\" onblur=\"setAmt(this)\" onchange=\"checkDitOnly(this)\"></td>\r\n");
      out.write("\t\t\t  <td align=\"left\"><input name=\"billProductList[#index#].price\" maxlength=\"14\" type=\"text\" style=\"width:50px;\" onblur=\"setAmtPrice(this)\" onchange=\"checkFloatOnly(this)\"></td>\r\n");
      out.write("\t\t\t  <td align=\"left\"><input name=\"billProductList[#index#].amt\" maxlength=\"22\" type=\"text\" style=\"width:50px;\"  onchange=\"checkDitOnly(this)\"></td>\r\n");
      out.write("\t\t\t  <td align=\"left\"><input name=\"billProductList[#index#].note\" maxlength=\"200\" type=\"text\" style=\"width:100px;\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t </tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write(" </body>");
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
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(7,2) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(87,2) name = formid type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setFormid("formobj");
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(87,2) name = dialog type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setDialog(true);
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(87,2) name = usePlugin type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setUsePlugin("password");
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(87,2) name = layout type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setLayout("table");
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(87,2) name = tiptype type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setTiptype("1");
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(87,2) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setAction("billMainController.do?save");
    int _jspx_eval_t_005fformvalid_005f0 = _jspx_th_t_005fformvalid_005f0.doStartTag();
    if (_jspx_eval_t_005fformvalid_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<input id=\"id\" name=\"id\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${billMainPage.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t<input id=\"crtDate\" name=\"crtDate\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${billMainPage.crtDate }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" />\r\n");
        out.write("\t<table cellpadding=\"0\" cellspacing=\"1\" class=\"formtable\">\r\n");
        out.write("\t\t<tr>\r\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 业务流水号: </label></td>\r\n");
        out.write("\t\t\t<td class=\"value\">\r\n");
        out.write("\t\t\t\t<input type=\"hidden\" class=\"inputxt\" id=\"billId\" name=\"billId\" readonly=\"readonly\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${billMainPage.billId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" datatype=\"s1-16\">\r\n");
        out.write("\t\t\t\t");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${billMainPage.billId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\r\n");
        out.write("\t\t\t</td>\r\n");
        out.write("\t\t\t\r\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 理财室: </label></td>\r\n");
        out.write("\t\t\t<td class=\"value\">\r\n");
        out.write("\t\t\t   <select id=\"officeId\" name=\"officeId\" datatype=\"*\">\r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_t_005fformvalid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t</select>\r\n");
        out.write("\t\t\t</td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t\t\r\n");
        out.write("\t\t<tr>\r\n");
        out.write("\t\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 客户名称: </label></td>\r\n");
        out.write("\t\t\t\t<td class=\"value\">\r\n");
        out.write("\t\t\t\t\t<input name=\"custId\"  type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${billMainPage.custId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" id=\"custId\"> \r\n");
        out.write("\t\t\t\t\t<input name=\"custName\" class=\"inputxt\"  id=\"custName\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${custName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"\r\n");
        out.write("\t\t\t\t\t\treadonly=\"readonly\" datatype=\"s1-32\"  errormsg=\"请选择一个客户\"/>\r\n");
        out.write("\t\t\t \t\t");
        if (_jspx_meth_t_005fchoose_005f0(_jspx_th_t_005fformvalid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t      \t<span class=\"Validform_checktip\"></span>\r\n");
        out.write("\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 签约状态: </label></td>\r\n");
        out.write("\t\t\t\t<td class=\"value\"> \r\n");
        out.write("\t\t\t\t\t");
        if (_jspx_meth_t_005fdictSelect_005f0(_jspx_th_t_005fformvalid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t</td>\t\t\t\t\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t\t<tr>\t\t   \r\n");
        out.write("\t\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 业务类型: </label></td>\r\n");
        out.write("\t\t\t\t<td class=\"value\">\r\n");
        out.write("\t\t\t\t\t<input name=\"billType\"  type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${billMainPage.billType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" id=\"billType\" > \r\n");
        out.write("\t\t\t\t\t<input name=\"busstypeName\" class=\"inputxt\"  id=\"busstypeName\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${busiTypeName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"\r\n");
        out.write("\t\t\t\t\t\treadonly=\"readonly\" datatype=\"s1-32\" errormsg=\"请选择一种业务类型\"/>\t\t\t\t\t\r\n");
        out.write("\t\t\t\t\t ");
        if (_jspx_meth_t_005fchoose_005f1(_jspx_th_t_005fformvalid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t      \t<span class=\"Validform_checktip\"></span>\r\n");
        out.write("\t\t\t\t</td>\r\n");
        out.write("\t\t\t\t\r\n");
        out.write("\t\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 备注: </label></td>\r\n");
        out.write("\t\t\t\t<td class=\"value\">\r\n");
        out.write("\t\t\t\t\t<input class=\"inputxt\" id=\"note\" name=\"note\" ignore=\"ignore\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${billMainPage.note}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("\t\t\t\t</td>\t\t\t\t\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t<tr>\r\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 到期日期: </label></td>\r\n");
        out.write("\t\t\t<td class=\"value\" colspan=\"3\"><input class=\"inputxt\" id=\"dueDate\" name=\"dueDate\" ignore=\"ignore\"\r\n");
        out.write("\t\t\t\t\t   value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${billMainPage.dueDate}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" readonly=\"readonly\"></td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t</table>\r\n");
        out.write("\t<div style=\"width: auto;height: 200px;\">\r\n");
        out.write("\t\t");
        out.write("\r\n");
        out.write("\t\t<div style=\"width:850px;height:1px;\"></div>\r\n");
        out.write("\t\t");
        if (_jspx_meth_t_005ftabs_005f0(_jspx_th_t_005fformvalid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t</div>\r\n");
        out.write(" ");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fformvalid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fformvalid_005f0);
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(101,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/webpage/com/lhmh/FinancialRegistration/billMain.jsp(101,5) '${departList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${departList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(101,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("depart");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${depart.officeId }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${depart.officeeName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t");
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
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(102,42) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${depart.officeId==billMainPage.officeId}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("selected=\"selected\"");
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

  private boolean _jspx_meth_t_005fchoose_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fformvalid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:choose
    org.jeecgframework.tag.core.easyui.ChooseTag _jspx_th_t_005fchoose_005f0 = (org.jeecgframework.tag.core.easyui.ChooseTag) _005fjspx_005ftagPool_005ft_005fchoose_0026_005furl_005ftitle_005ftextname_005fname_005fisclear_005ficon_005fhiddenid_005fhiddenName_005fnobody.get(org.jeecgframework.tag.core.easyui.ChooseTag.class);
    _jspx_th_t_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fchoose_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fformvalid_005f0);
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(114,6) name = hiddenName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f0.setHiddenName("custId");
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(114,6) name = hiddenid type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f0.setHiddenid("custId");
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(114,6) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f0.setUrl("custController.do?custHelp");
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(114,6) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f0.setName("custfunctionList");
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(114,6) name = icon type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f0.setIcon("icon-search");
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(114,6) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f0.setTitle("客户列表");
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(114,6) name = textname type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f0.setTextname("custName");
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(114,6) name = isclear type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(120,5) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setField("signStatus");
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(120,5) name = typeGroupCode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setTypeGroupCode("signstatus");
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(120,5) name = defaultVal type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setDefaultVal("default");
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(120,5) name = hasLabel type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setHasLabel(false);
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(120,5) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setTitle("性别(没有label)");
    int _jspx_eval_t_005fdictSelect_005f0 = _jspx_th_t_005fdictSelect_005f0.doStartTag();
    if (_jspx_th_t_005fdictSelect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftitle_005fhasLabel_005ffield_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftitle_005fhasLabel_005ffield_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fchoose_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fformvalid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:choose
    org.jeecgframework.tag.core.easyui.ChooseTag _jspx_th_t_005fchoose_005f1 = (org.jeecgframework.tag.core.easyui.ChooseTag) _005fjspx_005ftagPool_005ft_005fchoose_0026_005furl_005ftitle_005ftextname_005fname_005fisclear_005ficon_005fhiddenid_005fhiddenName_005fnobody.get(org.jeecgframework.tag.core.easyui.ChooseTag.class);
    _jspx_th_t_005fchoose_005f1.setPageContext(_jspx_page_context);
    _jspx_th_t_005fchoose_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fformvalid_005f0);
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(130,6) name = hiddenName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f1.setHiddenName("billType");
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(130,6) name = hiddenid type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f1.setHiddenid("busstypeId");
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(130,6) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f1.setUrl("busstypeController.do?busstypeHelp");
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(130,6) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f1.setName("functionList");
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(130,6) name = icon type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f1.setIcon("icon-search");
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(130,6) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f1.setTitle("业务类型列表");
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(130,6) name = textname type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f1.setTextname("busstypeName");
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(130,6) name = isclear type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fchoose_005f1.setIsclear(new Boolean(true));
    int _jspx_eval_t_005fchoose_005f1 = _jspx_th_t_005fchoose_005f1.doStartTag();
    if (_jspx_th_t_005fchoose_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fchoose_0026_005furl_005ftitle_005ftextname_005fname_005fisclear_005ficon_005fhiddenid_005fhiddenName_005fnobody.reuse(_jspx_th_t_005fchoose_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fchoose_0026_005furl_005ftitle_005ftextname_005fname_005fisclear_005ficon_005fhiddenid_005fhiddenName_005fnobody.reuse(_jspx_th_t_005fchoose_005f1);
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
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(148,2) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftabs_005f0.setId("tt");
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(148,2) name = iframe type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftabs_005f0.setIframe(false);
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(148,2) name = tabPosition type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftabs_005f0.setTabPosition("top");
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(148,2) name = fit type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftabs_005f0.setFit(false);
    int _jspx_eval_t_005ftabs_005f0 = _jspx_th_t_005ftabs_005f0.doStartTag();
    if (_jspx_eval_t_005ftabs_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t ");
        if (_jspx_meth_t_005ftab_005f0(_jspx_th_t_005ftabs_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
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
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(149,3) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f0.setHref((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("billMainController.do?billProductList&id=${billMainPage.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(149,3) name = icon type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f0.setIcon("icon-search");
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(149,3) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f0.setTitle("产品明细");
    // /webpage/com/lhmh/FinancialRegistration/billMain.jsp(149,3) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f0.setId("billProduct");
    int _jspx_eval_t_005ftab_005f0 = _jspx_th_t_005ftab_005f0.doStartTag();
    if (_jspx_th_t_005ftab_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody.reuse(_jspx_th_t_005ftab_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody.reuse(_jspx_th_t_005ftab_005f0);
    return false;
  }
}
