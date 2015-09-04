package org.apache.jsp.webpage.system.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class datapermit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fformvalid_0026_005ftiptype_005flayout_005fformid_005fdialog_005faction;
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
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005ftiptype_005flayout_005fformid_005fdialog_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005ftabs_0026_005ftabPosition_005fiframe_005fid_005ffit = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005ftiptype_005flayout_005fformid_005fdialog_005faction.release();
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
      out.write("  <title>用户权限控制</title>\r\n");
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
      out.write("\t//人员\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$.ajax({ //一个Ajax过程 \r\n");
      out.write("           type : \"get\", //以post方式与后台沟通\r\n");
      out.write("           async : false,\r\n");
      out.write("           url : 'userController.do?getUserList',\r\n");
      out.write("           success : function(json) {\r\n");
      out.write("        \t   \tjson = eval( '('+json+')' );\r\n");
      out.write("\t         \tvar html1=\"<option ></option>\";\r\n");
      out.write("\t         \tvar userList = json;\r\n");
      out.write("\t\t\t\tfor(var i=0;i<userList.length;i++){\r\n");
      out.write("\t\t\t\t\tvar user = eval(userList[i]);\r\n");
      out.write("\t\t\t\t\thtml1+=\"<option value='\"+user.id+\"'>\"+user.userName+\"</option>\"; \r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t         \t$(\"#dataUserId0\").append(html1);\r\n");
      out.write("\t         \t\r\n");
      out.write("\t   \t   \t \t$(\"select[name*='dataUserId']\").not(\"#dataUserId0\").each(function(){\r\n");
      out.write("\t\t \t\t\tvar sel = $(this).attr(\"dataUserId\");\r\n");
      out.write("\t\t\t\t \tvar html2 = \"<option ></option>\";\r\n");
      out.write("\t\t\t\t \tfor(var i=0;i<userList.length;i++){\r\n");
      out.write("\t\t\t\t\t\tvar user = eval(userList[i]);\r\n");
      out.write("\t\t    \t\t \tif(sel == user.id){\r\n");
      out.write("\t\t    \t\t\t \thtml2+=\"<option selected='selected' value='\"+user.id+\"'>\"+user.userName+\"</option>\"; \r\n");
      out.write("\t\t    \t\t \t}else{\r\n");
      out.write("\t\t    \t\t\t \thtml2+=\"<option value='\"+user.id+\"'>\"+user.userName+\"</option>\"; \r\n");
      out.write("\t\t    \t\t \t}\r\n");
      out.write("\t\t    \t \t}\r\n");
      out.write("\t\t\t\t \t$(this).html(html2);\r\n");
      out.write("\t\t\t \t});\r\n");
      out.write("           \t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t//部门\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$.ajax({ //一个Ajax过程 \r\n");
      out.write("           type : \"get\", //以post方式与后台沟通\r\n");
      out.write("           async : false,\r\n");
      out.write("           url : 'userController.do?getOrgList',\r\n");
      out.write("           success : function(json) {\r\n");
      out.write("        \t   \r\n");
      out.write("\t\t      \tvar html1=\"<option ></option>\";\r\n");
      out.write("\t\t\t\tfor(var i=0;i<json.length;i++){\r\n");
      out.write("\t\t\t\t\tvar user = json[i];\r\n");
      out.write("\t\t\t\t\thtml1+=\"<option value='\"+user.id+\"'>\"+user.departname+\"</option>\"; \r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t      \t$(\"#dataDepartId0\").append(html1);   \r\n");
      out.write("\t         \t\r\n");
      out.write("\t   \t \t\t$(\"select[name*='dataOrgId']\").not(\"#dataDepartId0\").each(function(){\r\n");
      out.write("\t\t\t\t\tvar sel = $(this).attr(\"dataOrgId\");\r\n");
      out.write("\t\t\t\t\tvar html2 = \"<option ></option>\";\r\n");
      out.write("\t\t\t\t\tfor(var i=0;i<json.length;i++){\r\n");
      out.write("\t\t\t\t\t\tvar user = json[i];\r\n");
      out.write("\t\t\t\t \t\tif(sel == user.id){\r\n");
      out.write("\t\t\t\t \t\t\t html2+=\"<option selected='selected' value='\"+user.id+\"'>\"+user.departname+\"</option>\"; \r\n");
      out.write("\t\t\t\t \t\t}else{\r\n");
      out.write("\t\t\t\t \t\t\t html2+=\"<option value='\"+user.id+\"'>\"+user.departname+\"</option>\"; \r\n");
      out.write("\t\t\t\t \t\t}\r\n");
      out.write("\t\t\t\t \t}\r\n");
      out.write("\t\t\t\t\t$(this).html(html2);\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("           }\r\n");
      out.write("           \r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t  \t $(\"select[name*='datapermitType']\").not(\"#datapermitType\").each(function(){\r\n");
      out.write("\t\t\t var sel = $(this).attr(\"datapermitType\");\r\n");
      out.write("\t\t\t var html3 = \"<option ></option>\";\r\n");
      out.write("\t\t\t if(sel == '1'){\r\n");
      out.write("\t\t\t\t html3 += '<option selected=\"selected\" value=\"1\">部门权限</option><option value=\"2\">人员权限</option>';\r\n");
      out.write("\t\t\t }else if(sel == '2'){\r\n");
      out.write("\t\t\t\t html3 += '<option value=\"1\">部门权限</option><option  selected=\"selected\" value=\"2\">人员权限</option>';\r\n");
      out.write("\t\t\t }else{\r\n");
      out.write("\t\t\t\t html3 += '<option value=\"1\">部门权限</option><option value=\"2\">人员权限</option>';\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t\t $(this).html(html3);   \r\n");
      out.write("\t\t\t \r\n");
      out.write("\t   \t\t setInvalidOpt(this);\r\n");
      out.write("\t\t });\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction setInvalidOpt(obj){\r\n");
      out.write("\t\tvar type = $(obj).val();\r\n");
      out.write("\t\tvar dataOrgId = $(obj).parents(\"tr\").find(\"select[name*='dataOrgId']\");\r\n");
      out.write("\t\tvar dataUserId = $(obj).parents(\"tr\").find(\"select[name*='dataUserId']\");\r\n");
      out.write("\t\tif(type == null || type === undefined){\r\n");
      out.write("\t\t\tdataOrgId.removeAttr(\"disabled\");\r\n");
      out.write("\t\t\tdataUserId.removeAttr(\"disabled\");\r\n");
      out.write("\t\t}else if('1'==type){\r\n");
      out.write("\t\t\tdataOrgId.removeAttr(\"disabled\");\r\n");
      out.write("\t\t\tdataUserId.attr(\"disabled\",\"true\");\r\n");
      out.write("\t\t}else if('2'==type){\r\n");
      out.write("\t\t\tdataOrgId.attr(\"disabled\",\"true\");\r\n");
      out.write("\t\t\tdataUserId.removeAttr(\"disabled\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}  \r\n");
      out.write(" </script>\r\n");
      out.write(" </head>\r\n");
      out.write(" <body style=\"overflow-y: hidden\" scroll=\"no\">\r\n");
      out.write("  ");
      if (_jspx_meth_t_005fformvalid_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t<!-- 添加 明细 模版 -->\r\n");
      out.write("\t\t<table style=\"display:none\">\r\n");
      out.write("\t\t<tbody id=\"add_userDataPermitEntity_table_template\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t <td align=\"center\"><div style=\"width: 25px;\" name=\"xh\"></div></td>\r\n");
      out.write("\t\t\t <td align=\"center\"><input style=\"width:20px;\" type=\"checkbox\" name=\"ck\"/></td>\r\n");
      out.write("\t\t\t\t  <td align=\"left\">\r\n");
      out.write("\t\t\t\t  \t<select name=\"userDataPermitEntityList[#index#].datapermitType\" style=\"width:120px;\"  onchange=\"setInvalidOpt(this)\">\r\n");
      out.write("\t\t\t\t  \t\t<option></option>\r\n");
      out.write("\t\t\t\t  \t\t<option value=\"1\">部门权限</option>\r\n");
      out.write("\t\t\t\t  \t\t<option value=\"2\">人员权限</option>\r\n");
      out.write("\t\t\t\t  \t</select>\r\n");
      out.write("\t\t\t\t  </td>\r\n");
      out.write("\t\t\t\t  <td align=\"left\"><select name=\"userDataPermitEntityList[#index#].dataOrgId\"  id=\"dataDepartId0\" onchange=\"checkOnlyOne(this)\" style=\"width:120px;\"></select></td>\r\n");
      out.write("\t\t\t\t  <td align=\"left\"><select name=\"userDataPermitEntityList[#index#].dataUserId\" id=\"dataUserId0\"  onchange=\"checkOnlyOne(this)\" style=\"width:120px;\"></select></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t </tbody>\r\n");
      out.write("\t\t</table>\r\n");
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
    // /webpage/system/user/datapermit.jsp(7,2) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_005fformvalid_005f0 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _005fjspx_005ftagPool_005ft_005fformvalid_0026_005ftiptype_005flayout_005fformid_005fdialog_005faction.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
    _jspx_th_t_005fformvalid_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fformvalid_005f0.setParent(null);
    // /webpage/system/user/datapermit.jsp(130,2) name = formid type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setFormid("formobj");
    // /webpage/system/user/datapermit.jsp(130,2) name = dialog type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setDialog(true);
    // /webpage/system/user/datapermit.jsp(130,2) name = layout type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setLayout("table");
    // /webpage/system/user/datapermit.jsp(130,2) name = tiptype type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setTiptype("1");
    // /webpage/system/user/datapermit.jsp(130,2) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setAction("userController.do?savedatapermit");
    int _jspx_eval_t_005fformvalid_005f0 = _jspx_th_t_005fformvalid_005f0.doStartTag();
    if (_jspx_eval_t_005fformvalid_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t<input id=\"id\" name=\"id\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\r\n");
        out.write("\t<table cellpadding=\"0\" cellspacing=\"1\" class=\"formtable\">\r\n");
        out.write("\t\t<tr>\r\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 用户名: </label></td>\r\n");
        out.write("\t\t\t<td class=\"value\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userName }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write(" \r\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 姓名: </label></td>\r\n");
        out.write("\t\t\t<td class=\"value\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.realName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</td>\r\n");
        out.write("\t\t</tr>\r\n");
        out.write("\t</table>\r\n");
        out.write("\t\r\n");
        out.write("\t\t\t<div style=\"width: auto;height: 200px;\">\r\n");
        out.write("\t\t\t\t");
        out.write("\r\n");
        out.write("\t\t\t\t<div style=\"width:690px;height:1px;\"></div>\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_t_005ftabs_005f0(_jspx_th_t_005fformvalid_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t</div>\r\n");
        out.write("\t\t\t");
        int evalDoAfterBody = _jspx_th_t_005fformvalid_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_005fformvalid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fformvalid_0026_005ftiptype_005flayout_005fformid_005fdialog_005faction.reuse(_jspx_th_t_005fformvalid_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005ftiptype_005flayout_005fformid_005fdialog_005faction.reuse(_jspx_th_t_005fformvalid_005f0);
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
    // /webpage/system/user/datapermit.jsp(145,4) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftabs_005f0.setId("tt");
    // /webpage/system/user/datapermit.jsp(145,4) name = iframe type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftabs_005f0.setIframe(false);
    // /webpage/system/user/datapermit.jsp(145,4) name = tabPosition type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftabs_005f0.setTabPosition("top");
    // /webpage/system/user/datapermit.jsp(145,4) name = fit type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftabs_005f0.setFit(false);
    int _jspx_eval_t_005ftabs_005f0 = _jspx_th_t_005ftabs_005f0.doStartTag();
    if (_jspx_eval_t_005ftabs_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t ");
        if (_jspx_meth_t_005ftab_005f0(_jspx_th_t_005ftabs_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
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
    // /webpage/system/user/datapermit.jsp(146,5) name = href type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f0.setHref((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("userController.do?dataPermitList&id=${user.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /webpage/system/user/datapermit.jsp(146,5) name = icon type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f0.setIcon("icon-search");
    // /webpage/system/user/datapermit.jsp(146,5) name = title type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f0.setTitle("数据权限明细");
    // /webpage/system/user/datapermit.jsp(146,5) name = id type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005ftab_005f0.setId("userDataPermitEntity");
    int _jspx_eval_t_005ftab_005f0 = _jspx_th_t_005ftab_005f0.doStartTag();
    if (_jspx_th_t_005ftab_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody.reuse(_jspx_th_t_005ftab_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005ftab_0026_005ftitle_005fid_005ficon_005fhref_005fnobody.reuse(_jspx_th_t_005ftab_005f0);
    return false;
  }
}
