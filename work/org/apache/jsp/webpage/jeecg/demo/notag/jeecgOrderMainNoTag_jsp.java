package org.apache.jsp.webpage.jeecg.demo.notag;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class jeecgOrderMainNoTag_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fhasLabel_005ffield_005fdefaultVal_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fhasLabel_005ffield_005fdefaultVal_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fhasLabel_005ffield_005fdefaultVal_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>订单信息(无标签)</title>\r\n");
      out.write("<link id=\"easyuiTheme\" rel=\"stylesheet\" href=\"plug-in/easyui/themes/default/easyui.css\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"plug-in/easyui/themes/icon.css\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"plug-in/accordion/css/accordion.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"plug-in/Validform/css/style.css\" type=\"text/css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"plug-in/Validform/css/tablefrom.css\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/jquery/jquery-1.8.3.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/tools/dataformat.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/easyui/jquery.easyui.min.1.3.2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/tools/syUtil.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/My97DatePicker/WdatePicker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/lhgDialog/lhgdialog.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/tools/curdtools.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/tools/easyuiextend.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/Validform/js/Validform_v5.3.1_min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/Validform/js/Validform_Datatype.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/Validform/js/datatype.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/Validform/plugin/passwordStrength/passwordStrength-min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction resetTrNum(tableId) {\r\n");
      out.write("\t\t$tbody = $(\"#\" + tableId + \"\");\r\n");
      out.write("\t\t$tbody.find('>tr').each(function(i){\r\n");
      out.write("\t\t\t$(':input, select', this).each(function() {\r\n");
      out.write("\t\t\t\tvar $this = $(this), name = $this.attr('name'), val = $this.val();\r\n");
      out.write("\t\t\t\tif (name != null) {\r\n");
      out.write("\t\t\t\t\tif (name.indexOf(\"#index#\") >= 0) {\r\n");
      out.write("\t\t\t\t\t\t$this.attr(\"name\",name.replace('#index#',i));\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\tvar s = name.indexOf(\"[\");\r\n");
      out.write("\t\t\t\t\t\tvar e = name.indexOf(\"]\");\r\n");
      out.write("\t\t\t\t\t\tvar new_name = name.substring(s + 1,e);\r\n");
      out.write("\t\t\t\t\t\t$this.attr(\"name\",name.replace(new_name,i));\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$(\"#formobj\").Validform({\r\n");
      out.write("\t\t\ttiptype : 1,\r\n");
      out.write("\t\t\tbtnSubmit : \"#btn_sub\",\r\n");
      out.write("\t\t\tbtnReset : \"#btn_reset\",\r\n");
      out.write("\t\t\tajaxPost : true,\r\n");
      out.write("\t\t\tusePlugin : {\r\n");
      out.write("\t\t\t\tpasswordstrength : {\r\n");
      out.write("\t\t\t\t\tminLen : 6,\r\n");
      out.write("\t\t\t\t\tmaxLen : 18,\r\n");
      out.write("\t\t\t\t\ttrigger : function(obj, error) {\r\n");
      out.write("\t\t\t\t\t\tif (error) {\r\n");
      out.write("\t\t\t\t\t\t\tobj.parent().next().find(\".Validform_checktip\").show();\r\n");
      out.write("\t\t\t\t\t\t\tobj.find(\".passwordStrength\").hide();\r\n");
      out.write("\t\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\t\t$(\".passwordStrength\").show();\r\n");
      out.write("\t\t\t\t\t\t\tobj.parent().next().find(\".Validform_checktip\").hide();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tcallback : function(data) {\r\n");
      out.write("\t\t\t\tvar win = frameElement.api.opener;\r\n");
      out.write("\t\t\t\tif (data.success == true) {\r\n");
      out.write("\t\t\t\t\tframeElement.api.close();\r\n");
      out.write("\t\t\t\t\twin.tip(data.msg);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\tif (data.responseText == ''|| data.responseText == undefined){\r\n");
      out.write("\t\t\t\t\t\t$(\"#formobj\").html(data.msg);\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t$(\"#formobj\").html(data.responseText);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\twin.reloadTable();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#addBtn').linkbutton({   \r\n");
      out.write("\t\t    iconCls: 'icon-add'  \r\n");
      out.write("\t\t});  \r\n");
      out.write("\t\t$('#delBtn').linkbutton({   \r\n");
      out.write("\t\t    iconCls: 'icon-remove'  \r\n");
      out.write("\t\t}); \r\n");
      out.write("\t\t$('#addBtn').bind('click', function(){   \r\n");
      out.write("\t \t\t var tr =  $(\"#add_jeecgOrderProduct_table_template tr\").clone();\r\n");
      out.write("\t\t \t $(\"#add_jeecgOrderProduct_table\").append(tr);\r\n");
      out.write("\t\t \t resetTrNum('add_jeecgOrderProduct_table');\r\n");
      out.write("\t    });  \r\n");
      out.write("\t\t$('#delBtn').bind('click', function(){   \r\n");
      out.write("\t       $(\"#add_jeecgOrderProduct_table\").find(\"input:checked\").parent().parent().remove();   \r\n");
      out.write("\t        resetTrNum('add_jeecgOrderProduct_table');\r\n");
      out.write("\t    });\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#addCustomBtn').linkbutton({   \r\n");
      out.write("\t\t    iconCls: 'icon-add'  \r\n");
      out.write("\t\t});  \r\n");
      out.write("\t\t$('#delCustomBtn').linkbutton({   \r\n");
      out.write("\t\t    iconCls: 'icon-remove'  \r\n");
      out.write("\t\t}); \r\n");
      out.write("\t\t$('#addCustomBtn').bind('click', function(){   \r\n");
      out.write("\t \t\t var tr =  $(\"#add_jeecgOrderCustom_table_template tr\").clone();\r\n");
      out.write("\t\t \t $(\"#add_jeecgOrderCustom_table\").append(tr);\r\n");
      out.write("\t\t \t resetTrNum('add_jeecgOrderCustom_table');\r\n");
      out.write("\t    });  \r\n");
      out.write("\t\t$('#delCustomBtn').bind('click', function(){   \r\n");
      out.write("\t      \t$(\"#add_jeecgOrderCustom_table\").find(\"input:checked\").parent().parent().remove();   \r\n");
      out.write("\t        resetTrNum('add_jeecgOrderCustom_table'); \r\n");
      out.write("\t    }); \r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("<form id=\"formobj\" action=\"jeecgOrderMainNoTagController.do?save\" name=\"formobj\" method=\"post\"><input type=\"hidden\" id=\"btn_sub\" class=\"btn_sub\" /> <input id=\"id\" name=\"id\" type=\"hidden\"\r\n");
      out.write("\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jeecgOrderMainPage.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("<table cellpadding=\"0\" cellspacing=\"1\" class=\"formtable\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"right\"><label class=\"Validform_label\"> 订单号:</label></td>\r\n");
      out.write("\t\t<td class=\"value\"><input class=\"inputxt\" id=\"goOrderCode\" name=\"goOrderCode\" datatype=\"*\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jeecgOrderMainPage.goOrderCode}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" /></td>\r\n");
      out.write("\t\t<td align=\"right\"><label class=\"Validform_label\"> 订单类型:</label></td>\r\n");
      out.write("\t\t<td class=\"value\">");
      if (_jspx_meth_t_005fdictSelect_005f0(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"right\"><label class=\"Validform_label\">顾客类型 :</label></td>\r\n");
      out.write("\t\t<td class=\"value\">");
      if (_jspx_meth_t_005fdictSelect_005f1(_jspx_page_context))
        return;
      out.write("</td>\r\n");
      out.write("\t\t<td align=\"right\"><label class=\"Validform_label\">联系人:</label></td>\r\n");
      out.write("\t\t<td class=\"value\"><input nullmsg=\"联系人不能为空\" errormsg=\"联系人格式不对\" class=\"inputxt\" id=\"goContactName\" name=\"goContactName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jeecgOrderMainPage.goContactName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" datatype=\"*\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"right\"><label class=\"Validform_label\">手机:</label></td>\r\n");
      out.write("\t\t<td class=\"value\"><input class=\"inputxt\" id=\"goTelphone\" name=\"goTelphone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jeecgOrderMainPage.goTelphone}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" datatype=\"m\" errormsg=\"手机号码不正确!\" ignore=\"ignore\"></td>\r\n");
      out.write("\t\t<td align=\"right\"><label class=\"Validform_label\">订单人数:</label></td>\r\n");
      out.write("\t\t<td class=\"value\"><input nullmsg=\"订单人数不能为空\" errormsg=\"订单人数必须为数字\" class=\"inputxt\" id=\"goOrderCount\" name=\"goOrderCount\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jeecgOrderMainPage.goOrderCount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" datatype=\"n\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"right\"><label class=\"Validform_label\">总价(不含返款):</label></td>\r\n");
      out.write("\t\t<td class=\"value\"><input class=\"inputxt\" id=\"goAllPrice\" name=\"goAllPrice\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jeecgOrderMainPage.goAllPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" datatype=\"d\"></td>\r\n");
      out.write("\t\t<td align=\"right\"><label class=\"Validform_label\">返款:</label></td>\r\n");
      out.write("\t\t<td class=\"value\"><input nullmsg=\"返款不能为空\" errormsg=\"返款格式不对\" class=\"inputxt\" id=\"goReturnPrice\" name=\"goReturnPrice\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jeecgOrderMainPage.goReturnPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\" datatype=\"d\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td align=\"right\"><label class=\"Validform_label\">备注:</label></td>\r\n");
      out.write("\t\t<td class=\"value\" colspan=\"3\"><input class=\"inputxt\" id=\"goContent\" name=\"goContent\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jeecgOrderMainPage.goContent}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<div style=\"width: auto; height: 200px;\">\r\n");
      out.write("<div style=\"width: 690px; height: 1px;\"></div>\r\n");
      out.write("<div id=\"tt\" class=\"easyui-tabs\" data-options=\"onSelect:function(t){$('#tt .panel-body').css('width','auto');}\">\r\n");
      out.write("<div title=\"产品明细\">\r\n");
      out.write("<div style=\"padding: 3px; height: 25px; width: auto;\" class=\"datagrid-toolbar\"><a id=\"addBtn\" href=\"#\">添加</a> <a id=\"delBtn\" href=\"#\">删除</a></div>\r\n");
      out.write("<table border=\"0\" cellpadding=\"2\" cellspacing=\"0\" id=\"jeecgOrderCustom_table\">\r\n");
      out.write("\t<tr bgcolor=\"#E6E6E6\">\r\n");
      out.write("\t\t<td align=\"center\" bgcolor=\"#EEEEEE\">序号</td>\r\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\">产品名称</td>\r\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\">个数</td>\r\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\">服务项目类型</td>\r\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\">单价</td>\r\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\">小计</td>\r\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\">备注</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tbody id=\"add_jeecgOrderProduct_table\">\r\n");
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
      out.write("</div>\r\n");
      out.write("<div title=\"客户明细 \">\r\n");
      out.write("<div style=\"padding: 3px; height: 25px; width: auto;\" class=\"datagrid-toolbar\"><a id=\"addCustomBtn\" href=\"#\">添加</a> <a id=\"delCustomBtn\" href=\"#\">删除</a></div>\r\n");
      out.write("<table border=\"0\" cellpadding=\"2\" cellspacing=\"0\" id=\"jeecgOrderCustom_table\">\r\n");
      out.write("\t<tr bgcolor=\"#E6E6E6\">\r\n");
      out.write("\t\t<td align=\"center\" bgcolor=\"#EEEEEE\">序号</td>\r\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\">姓名</td>\r\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\">性别</td>\r\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\">身份证号</td>\r\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\">护照号</td>\r\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\">业务</td>\r\n");
      out.write("\t\t<td align=\"left\" bgcolor=\"#EEEEEE\">备注</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tbody id=\"add_jeecgOrderCustom_table\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("<input type=\"hidden\" name=\"jeecgOrderCustomShow\" value=\"true\" /></div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<table style=\"display: none\">\r\n");
      out.write("\t<tbody id=\"add_jeecgOrderProduct_table_template\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\"><input style=\"width: 20px;\" type=\"checkbox\" name=\"ck\" /></td>\r\n");
      out.write("\t\t\t<td align=\"left\"><input nullmsg=\"请输入订单产品明细的产品名称！\" datatype=\"s6-10\" errormsg=\"订单产品明细的产品名称应该为6到10位\" name=\"jeecgOrderProductList[#index#].gopProductName\" maxlength=\"100\" type=\"text\"></td>\r\n");
      out.write("\t\t\t<td align=\"left\"><input nullmsg=\"请输入订单产品明细的产品个数！\" datatype=\"n\" errormsg=\"订单产品明细的产品个数必须为数字\" name=\"jeecgOrderProductList[#index#].gopCount\" maxlength=\"10\" type=\"text\"></td>\r\n");
      out.write("\t\t\t<td align=\"left\"><select name=\"jeecgOrderProductList[#index#].gopProductType\">\r\n");
      out.write("\t\t\t\t<option value=\"1\">特殊服务</option>\r\n");
      out.write("\t\t\t\t<option value=\"2\">普通服务</option>\r\n");
      out.write("\t\t\t</select></td>\r\n");
      out.write("\t\t\t<td align=\"left\"><input nullmsg=\"请输入订单产品明细的产品单价！\" datatype=\"d\" errormsg=\"订单产品明细的产品单价填写不正确\" name=\"jeecgOrderProductList[#index#].gopOnePrice\" maxlength=\"10\" type=\"text\"></td>\r\n");
      out.write("\t\t\t<td align=\"left\"><input nullmsg=\"请输入订单产品明细的产品小计！\" datatype=\"d\" errormsg=\"订单产品明细的产品小计填写不正确\" name=\"jeecgOrderProductList[#index#].gopSumPrice\" maxlength=\"10\" type=\"text\"></td>\r\n");
      out.write("\t\t\t<td align=\"left\"><input name=\"jeecgOrderProductList[#index#].gopContent\" maxlength=\"200\" type=\"text\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</tbody>\r\n");
      out.write("\t<tbody id=\"add_jeecgOrderCustom_table_template\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td align=\"center\"><input style=\"width: 20px;\" type=\"checkbox\" name=\"ck\" /></td>\r\n");
      out.write("\t\t\t<td align=\"left\"><input name=\"jeecgOrderCustomList[#index#].gocCusName\" maxlength=\"50\" type=\"text\"></td>\r\n");
      out.write("\t\t\t<td align=\"left\"><select name=\"jeecgOrderCustomList[#index#].gocSex\">\r\n");
      out.write("\t\t\t\t<option value=\"0\">男性</option>\r\n");
      out.write("\t\t\t\t<option value=\"1\">女性</option>\r\n");
      out.write("\t\t\t</select></td>\r\n");
      out.write("\t\t\t<td align=\"left\"><input name=\"jeecgOrderCustomList[#index#].gocIdcard\" maxlength=\"32\" type=\"text\"></td>\r\n");
      out.write("\t\t\t<td align=\"left\"><input name=\"jeecgOrderCustomList[#index#].gocPassportCode\" maxlength=\"32\" type=\"text\"></td>\r\n");
      out.write("\t\t\t<td align=\"left\"><input name=\"jeecgOrderCustomList[#index#].gocBussContent\" maxlength=\"100\" type=\"text\"></td>\r\n");
      out.write("\t\t\t<td align=\"left\"><input name=\"jeecgOrderCustomList[#index#].gocContent\" maxlength=\"200\" type=\"text\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_t_005fdictSelect_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_005fdictSelect_005f0 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fhasLabel_005ffield_005fdefaultVal_005fnobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_005fdictSelect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdictSelect_005f0.setParent(null);
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(126,20) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setField("goderType");
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(126,20) name = typeGroupCode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setTypeGroupCode("order");
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(126,20) name = hasLabel type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setHasLabel(false);
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(126,20) name = defaultVal type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jeecgOrderMainPage.goderType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_t_005fdictSelect_005f0 = _jspx_th_t_005fdictSelect_005f0.doStartTag();
    if (_jspx_th_t_005fdictSelect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fhasLabel_005ffield_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fhasLabel_005ffield_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fdictSelect_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_005fdictSelect_005f1 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fhasLabel_005ffield_005fdefaultVal_005fnobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_005fdictSelect_005f1.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdictSelect_005f1.setParent(null);
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(130,20) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f1.setField("usertype");
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(130,20) name = typeGroupCode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f1.setTypeGroupCode("custom");
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(130,20) name = hasLabel type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f1.setHasLabel(false);
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(130,20) name = defaultVal type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f1.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jeecgOrderMainPage.usertype}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_t_005fdictSelect_005f1 = _jspx_th_t_005fdictSelect_005f1.doStartTag();
    if (_jspx_th_t_005fdictSelect_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fhasLabel_005ffield_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fhasLabel_005ffield_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(167,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(jeecgOrderProductList)  <= 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td align=\"center\"><input style=\"width: 20px;\" type=\"checkbox\" name=\"ck\" /></td>\r\n");
        out.write("\t\t\t\t<td align=\"left\"><input nullmsg=\"请输入订单产品明细的产品名称！\" datatype=\"s6-10\" errormsg=\"订单产品明细的产品名称应该为6到10位\" name=\"jeecgOrderProductList[0].gopProductName\" maxlength=\"100\" type=\"text\" value=\"\"></td>\r\n");
        out.write("\t\t\t\t<td align=\"left\"><input nullmsg=\"请输入订单产品明细的产品个数！\" datatype=\"n\" errormsg=\"订单产品明细的产品个数必须为数字\" name=\"jeecgOrderProductList[0].gopCount\" maxlength=\"10\" type=\"text\" value=\"\"></td>\r\n");
        out.write("\t\t\t\t<td align=\"left\">");
        if (_jspx_meth_t_005fdictSelect_005f2(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t<td align=\"left\"><input nullmsg=\"请输入订单产品明细的产品单价！\" datatype=\"d\" errormsg=\"订单产品明细的产品单价填写不正确\" name=\"jeecgOrderProductList[0].gopOnePrice\" maxlength=\"10\" type=\"text\" value=\"\"></td>\r\n");
        out.write("\t\t\t\t<td align=\"left\"><input nullmsg=\"请输入订单产品明细的产品小计！\" datatype=\"d\" errormsg=\"订单产品明细的产品小计填写不正确\" name=\"jeecgOrderProductList[0].gopSumPrice\" maxlength=\"10\" type=\"text\" value=\"\"></td>\r\n");
        out.write("\t\t\t\t<td align=\"left\"><input name=\"jeecgOrderProductList[0].gopContent\" maxlength=\"200\" type=\"text\" value=\"\"></td>\r\n");
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

  private boolean _jspx_meth_t_005fdictSelect_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_005fdictSelect_005f2 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fhasLabel_005ffield_005fdefaultVal_005fnobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_005fdictSelect_005f2.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdictSelect_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(172,21) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f2.setField("jeecgOrderProductList[0].gopProductType");
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(172,21) name = typeGroupCode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f2.setTypeGroupCode("service");
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(172,21) name = hasLabel type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f2.setHasLabel(false);
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(172,21) name = defaultVal type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f2.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.gocSex}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_t_005fdictSelect_005f2 = _jspx_th_t_005fdictSelect_005f2.doStartTag();
    if (_jspx_th_t_005fdictSelect_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fhasLabel_005ffield_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fhasLabel_005ffield_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f2);
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
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(178,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(jeecgOrderProductList)  > 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
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
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(179,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(179,3) '${jeecgOrderProductList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${jeecgOrderProductList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(179,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("poVal");
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(179,3) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("stuts");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t<td align=\"center\"><input style=\"width: 20px;\" type=\"checkbox\" name=\"ck\" /></td>\r\n");
          out.write("\t\t\t\t\t<td align=\"left\"><input nullmsg=\"请输入订单产品明细的产品名称！\" datatype=\"s6-10\" errormsg=\"订单产品明细的产品名称应该为6到10位\" name=\"jeecgOrderProductList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].gopProductName\" maxlength=\"100\" type=\"text\"\r\n");
          out.write("\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.gopProductName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></td>\r\n");
          out.write("\t\t\t\t\t<td align=\"left\"><input nullmsg=\"请输入订单产品明细的产品个数！\" datatype=\"n\" errormsg=\"订单产品明细的产品个数必须为数字\" name=\"jeecgOrderProductList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].gopCount\" maxlength=\"10\" type=\"text\"\r\n");
          out.write("\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.gopCount }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></td>\r\n");
          out.write("\t\t\t\t\t<td align=\"left\">");
          if (_jspx_meth_t_005fdictSelect_005f3(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td align=\"left\"><input nullmsg=\"请输入订单产品明细的产品单价！\" datatype=\"d\" errormsg=\"订单产品明细的产品单价填写不正确\" name=\"jeecgOrderProductList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].gopOnePrice\" maxlength=\"10\" type=\"text\"\r\n");
          out.write("\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.gopOnePrice }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></td>\r\n");
          out.write("\t\t\t\t\t<td align=\"left\"><input nullmsg=\"请输入订单产品明细的产品小计！\" datatype=\"d\" errormsg=\"订单产品明细的产品小计填写不正确\" name=\"jeecgOrderProductList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].gopSumPrice\" maxlength=\"10\" type=\"text\"\r\n");
          out.write("\t\t\t\t\t\tvalue=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.gopSumPrice }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></td>\r\n");
          out.write("\t\t\t\t\t<td align=\"left\"><input name=\"jeecgOrderProductList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].gopContent\" maxlength=\"200\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.gopContent }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></td>\r\n");
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
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_005fdictSelect_005f3 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fhasLabel_005ffield_005fdefaultVal_005fnobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_005fdictSelect_005f3.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdictSelect_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(186,22) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f3.setField((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("jeecgOrderProductList[${stuts.index }].gopProductType", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(186,22) name = typeGroupCode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f3.setTypeGroupCode("service");
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(186,22) name = hasLabel type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f3.setHasLabel(false);
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(186,22) name = defaultVal type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f3.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.gopProductType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_t_005fdictSelect_005f3 = _jspx_th_t_005fdictSelect_005f3.doStartTag();
    if (_jspx_th_t_005fdictSelect_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fhasLabel_005ffield_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fhasLabel_005ffield_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(211,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(jeecgOrderCustomList)  <= 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td align=\"center\"><input style=\"width: 20px;\" type=\"checkbox\" name=\"ck\" /></td>\r\n");
        out.write("\t\t\t\t<td align=\"left\"><input name=\"jeecgOrderCustomList[0].gocCusName\" maxlength=\"50\" type=\"text\"></td>\r\n");
        out.write("\t\t\t\t<td align=\"left\">");
        if (_jspx_meth_t_005fdictSelect_005f4(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("</td>\r\n");
        out.write("\t\t\t\t<td align=\"left\"><input name=\"jeecgOrderCustomList[0].gocIdcard\" maxlength=\"32\" type=\"text\"></td>\r\n");
        out.write("\t\t\t\t<td align=\"left\"><input name=\"jeecgOrderCustomList[0].gocPassportCode\" maxlength=\"32\" type=\"text\"></td>\r\n");
        out.write("\t\t\t\t<td align=\"left\"><input name=\"jeecgOrderCustomList[0].gocBussContent\" maxlength=\"100\" type=\"text\"></td>\r\n");
        out.write("\t\t\t\t<td align=\"left\"><input name=\"jeecgOrderCustomList[0].gocContent\" maxlength=\"200\" type=\"text\"></td>\r\n");
        out.write("\t\t\t</tr>\r\n");
        out.write("\t\t");
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

  private boolean _jspx_meth_t_005fdictSelect_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_005fdictSelect_005f4 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fhasLabel_005ffield_005fdefaultVal_005fnobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_005fdictSelect_005f4.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdictSelect_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(215,21) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f4.setField("jeecgOrderCustomList[0].gocSex");
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(215,21) name = typeGroupCode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f4.setTypeGroupCode("sex");
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(215,21) name = hasLabel type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f4.setHasLabel(false);
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(215,21) name = defaultVal type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f4.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jgDemo.sex}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_t_005fdictSelect_005f4 = _jspx_th_t_005fdictSelect_005f4.doStartTag();
    if (_jspx_th_t_005fdictSelect_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fhasLabel_005ffield_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fhasLabel_005ffield_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent(null);
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(222,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(jeecgOrderCustomList)  > 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t");
        if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fif_005f3, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(223,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(223,3) '${jeecgOrderCustomList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${jeecgOrderCustomList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(223,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("poVal");
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(223,3) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVarStatus("stuts");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t<td align=\"center\"><input style=\"width: 20px;\" type=\"checkbox\" name=\"ck\" /></td>\r\n");
          out.write("\t\t\t\t\t<td align=\"left\"><input name=\"jeecgOrderCustomList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].gocCusName\" maxlength=\"50\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.gocCusName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></td>\r\n");
          out.write("\t\t\t\t\t<td align=\"left\">");
          if (_jspx_meth_t_005fdictSelect_005f5(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td align=\"left\"><input name=\"jeecgOrderCustomList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].gocIdcard\" maxlength=\"32\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.gocIdcard }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></td>\r\n");
          out.write("\t\t\t\t\t<td align=\"left\"><input name=\"jeecgOrderCustomList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].gocPassportCode\" maxlength=\"32\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.gocPassportCode }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></td>\r\n");
          out.write("\t\t\t\t\t<td align=\"left\"><input name=\"jeecgOrderCustomList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].gocBussContent\" maxlength=\"100\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.gocBussContent }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></td>\r\n");
          out.write("\t\t\t\t\t<td align=\"left\"><input name=\"jeecgOrderCustomList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].gocContent\" maxlength=\"200\" type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.gocContent }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"></td>\r\n");
          out.write("\t\t\t\t</tr>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_t_005fdictSelect_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_005fdictSelect_005f5 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fhasLabel_005ffield_005fdefaultVal_005fnobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_005fdictSelect_005f5.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdictSelect_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(227,22) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f5.setField((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("jeecgOrderCustomList[${stuts.index }].gocSex", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(227,22) name = typeGroupCode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f5.setTypeGroupCode("sex");
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(227,22) name = hasLabel type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f5.setHasLabel(false);
    // /webpage/jeecg/demo/notag/jeecgOrderMainNoTag.jsp(227,22) name = defaultVal type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f5.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.gocSex}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_t_005fdictSelect_005f5 = _jspx_th_t_005fdictSelect_005f5.doStartTag();
    if (_jspx_th_t_005fdictSelect_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fhasLabel_005ffield_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005fhasLabel_005ffield_005fdefaultVal_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f5);
    return false;
  }
}
