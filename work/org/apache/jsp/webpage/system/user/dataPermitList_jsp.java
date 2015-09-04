package org.apache.jsp.webpage.system.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dataPermitList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$('#addUserDataPermitEntityBtn').linkbutton({   \r\n");
      out.write("\t    iconCls: 'icon-add'  \r\n");
      out.write("\t});\r\n");
      out.write("\t$('#delUserDataPermitEntityBtn').linkbutton({\r\n");
      out.write("\t    iconCls: 'icon-remove'  \r\n");
      out.write("\t}); \r\n");
      out.write("\t$('#addUserDataPermitEntityBtn').bind('click', function(){   \r\n");
      out.write("\t\t var tr =  $(\"#add_userDataPermitEntity_table_template tr\").clone();\r\n");
      out.write("\t \t $(\"#add_userDataPermitEntity_table\").append(tr);\r\n");
      out.write("\t \t resetTrNum('add_userDataPermitEntity_table');\r\n");
      out.write("\t});  \r\n");
      out.write("\t$('#delUserDataPermitEntityBtn').bind('click', function(){   \r\n");
      out.write("\t  \t$(\"#add_userDataPermitEntity_table\").find(\"input:checked\").parent().parent().remove();   \r\n");
      out.write("\t    resetTrNum('add_userDataPermitEntity_table'); \r\n");
      out.write("\t}); \r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\t$(\".datagrid-toolbar\").parent().css(\"width\",\"auto\");\r\n");
      out.write("\t});\r\n");
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
      out.write("\t         \t$(\"#dataUserId1\").append(html1);\r\n");
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
      out.write("\t\t      \t$(\"#dataDepartId1\").append(html1);   \r\n");
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
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//保证数据权限没有重复\r\n");
      out.write("\tfunction checkOnlyOne(obj){\r\n");
      out.write("\t\tvar $type = $(obj).parents(\"tr\").find(\"select[name*='datapermitType']\"); //当前行类型\r\n");
      out.write("\t\tvar objVal = $(obj).val();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar $datapermittypes = $(\"select[name*='datapermitType']\").not($type);\r\n");
      out.write("\t\t//第一个循环判断本行是否重复行，如果是将类型设置为空\r\n");
      out.write("\t\t//第二个循环判断是否已经有类型为空的行，如果已有，删除本行\r\n");
      out.write("\t\tif($datapermittypes != null && $datapermittypes.length>0){\r\n");
      out.write("\t\t\tfor(var i= 0;i<$datapermittypes.length;i++){\r\n");
      out.write("\t\t\t\tvar $tr = $($datapermittypes[i]).parents(\"tr\");\r\n");
      out.write("\t\t\t\tvar $datatype = $tr.find(\"select[name*='datapermitType']\");\r\n");
      out.write("\t\t\t\tif($type.val() == $datatype.val()){\r\n");
      out.write("\t\t\t\t\tif('1' == $type.val() || \"1\" == $type.val() ){\r\n");
      out.write("\t\t\t\t\t\tvar dataOrgId = $tr.find(\"select[name*='dataOrgId']\").val();\r\n");
      out.write("\t\t\t\t\t\tif(dataOrgId == objVal){\r\n");
      out.write("\t\t\t\t\t\t\talert(\"不允许选择相同的权限，请重新选择！\");\r\n");
      out.write("\t\t\t\t\t\t\t$(obj).val(\"\");\r\n");
      out.write("\t\t\t\t\t\t\t$type.val(\"\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\tvar dataUserId = $tr.find(\"select[name*='dataUserId']\").val();\r\n");
      out.write("\t\t\t\t\t\tif(dataUserId == objVal){\r\n");
      out.write("\t\t\t\t\t\t\talert(\"不允许选择相同的权限，请重新选择！\");\r\n");
      out.write("\t\t\t\t\t\t\t$(obj).val(\"\");\r\n");
      out.write("\t\t\t\t\t\t\t$type.val(\"\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif($type.val() == ''){\r\n");
      out.write("\t\t\t\tfor(var i= 0;i<$datapermittypes.length;i++){\r\n");
      out.write("\t\t\t\t\tvar $tr = $($datapermittypes[i]).parents(\"tr\");\r\n");
      out.write("\t\t\t\t\tvar $datatype = $tr.find(\"select[name*='datapermitType']\");\r\n");
      out.write("\t\t\t\t\tif($datatype.val() == ''){\r\n");
      out.write("\t\t\t\t\t\t$(obj).parents(\"tr\").remove();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("<div style=\"padding: 3px; height: 25px;width:auto;\" class=\"datagrid-toolbar\">\r\n");
      out.write("\t<a id=\"addUserDataPermitEntityBtn\" href=\"#\">添加</a> <a id=\"delUserDataPermitEntityBtn\" href=\"#\">删除</a> \r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"width: auto;height: 300px;overflow-y:auto;overflow-x:scroll;\">\r\n");
      out.write("\t<table border=\"0\" cellpadding=\"2\" cellspacing=\"0\" id=\"userDataPermitEntity_table\" width=\"65%\">\r\n");
      out.write("\t\t<tr bgcolor=\"#E6E6E6\">\r\n");
      out.write("\t\t\t<td align=\"center\" bgcolor=\"#EEEEEE\">序号</td>\r\n");
      out.write("\t\t\t<td align=\"center\" bgcolor=\"#EEEEEE\">操作</td>\r\n");
      out.write("\t\t\t\t\t  <td align=\"left\" bgcolor=\"#EEEEEE\">权限类型</td>\r\n");
      out.write("\t\t\t\t\t  <td align=\"left\" bgcolor=\"#EEEEEE\">部门权限</td>\r\n");
      out.write("\t\t\t\t\t  <td align=\"left\" bgcolor=\"#EEEEEE\">人员权限</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tbody id=\"add_userDataPermitEntity_table\">\t\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\t\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
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
    // /webpage/system/user/dataPermitList.jsp(178,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(userDataPermitEntityList)  <= 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<tr>\r\n");
        out.write("\t\t\t\t\t<td align=\"center\"><div style=\"width: 25px;\" name=\"xh\">1</div></td>\r\n");
        out.write("\t\t\t\t\t<td align=\"center\"><input style=\"width:20px;\"  type=\"checkbox\" name=\"ck\"/></td>\r\n");
        out.write("\t\t\t\t\t  <td align=\"left\">\r\n");
        out.write("\t\t\t\t\t  \t<select name=\"userDataPermitEntityList[0].datapermitType\" style=\"width:120px;\" onchange=\"setInvalidOpt(this)\">\r\n");
        out.write("\t\t\t\t\t  \t\t<option></option>\r\n");
        out.write("\t\t\t\t\t  \t\t<option value=\"1\">部门权限</option>\r\n");
        out.write("\t\t\t\t\t  \t\t<option value=\"2\">人员权限</option>\r\n");
        out.write("\t\t\t\t\t  \t</select>\r\n");
        out.write("\t\t\t\t\t  </td>\r\n");
        out.write("\t\t\t\t\t  <td align=\"left\"><select name=\"userDataPermitEntityList[0].dataOrgId\" onchange=\"checkOnlyOne(this)\" id=\"dataDepartId1\"  style=\"width:120px;\"></select></td>\r\n");
        out.write("\t\t\t\t\t  <td align=\"left\"><select name=\"userDataPermitEntityList[0].dataUserId\" onchange=\"checkOnlyOne(this)\"  id=\"dataUserId1\"  style=\"width:120px;\"></select></td>\r\n");
        out.write("\t   \t\t\t</tr>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /webpage/system/user/dataPermitList.jsp(193,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(userDataPermitEntityList)  > 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
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
    // /webpage/system/user/dataPermitList.jsp(194,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/webpage/system/user/dataPermitList.jsp(194,3) '${userDataPermitEntityList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${userDataPermitEntityList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /webpage/system/user/dataPermitList.jsp(194,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("poVal");
    // /webpage/system/user/dataPermitList.jsp(194,3) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("stuts");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t<td align=\"center\"><div style=\"width: 25px;\" name=\"xh\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index+1 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</div></td>\r\n");
          out.write("\t\t\t\t\t<td align=\"center\"><input style=\"width:20px;\"  type=\"checkbox\" name=\"ck\" /></td>\r\n");
          out.write("\t\t\t\t\t<td align=\"left\">\r\n");
          out.write("\t\t\t\t\t\t<input name=\"userDataPermitEntityList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].id\"  value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" type=\"hidden\" >\r\n");
          out.write("\t\t\t\t\t  \t<select name=\"userDataPermitEntityList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].datapermitType\" datapermitType=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.datapermitType}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"  style=\"width:120px;\" ></select>\r\n");
          out.write("\t\t\t\t   \t</td>\r\n");
          out.write("\t\t\t\t\t<td align=\"left\">\r\n");
          out.write("\t\t\t\t\t\t<select  name=\"userDataPermitEntityList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].dataOrgId\"  dataOrgId=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.dataOrgId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" onchange=\"checkOnlyOne(this)\"  style=\"width:120px;\" ></select>\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t<td align=\"left\">\r\n");
          out.write("\t\t\t\t\t\t<select  name=\"userDataPermitEntityList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].dataUserId\"  dataUserId=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.dataUserId}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"  onchange=\"checkOnlyOne(this)\"   style=\"width:120px;\" ></select>\r\n");
          out.write("\t\t\t\t\t</td>\r\n");
          out.write("\t   \t\t\t</tr>\r\n");
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
}
