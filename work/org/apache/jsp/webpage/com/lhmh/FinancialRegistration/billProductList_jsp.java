package org.apache.jsp.webpage.com.lhmh.FinancialRegistration;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class billProductList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t$('#addBillProductBtn').linkbutton({   \r\n");
      out.write("\t    iconCls: 'icon-add'  \r\n");
      out.write("\t});  \r\n");
      out.write("\t$('#delBillProductBtn').linkbutton({   \r\n");
      out.write("\t    iconCls: 'icon-remove'  \r\n");
      out.write("\t}); \r\n");
      out.write("\t$('#addBillProductBtn').bind('click', function(){   \r\n");
      out.write(" \t\t var tr =  $(\"#add_billProduct_table_template tr\").clone();\r\n");
      out.write("\t \t $(\"#add_billProduct_table\").append(tr);\r\n");
      out.write("\t \t resetTrNum('add_billProduct_table');\r\n");
      out.write("    });  \r\n");
      out.write("\t$('#delBillProductBtn').bind('click', function(){   \r\n");
      out.write("      \t$(\"#add_billProduct_table\").find(\"input:checked\").parent().parent().remove();   \r\n");
      out.write("        resetTrNum('add_billProduct_table'); \r\n");
      out.write("    }); \r\n");
      out.write("    $(document).ready(function(){\r\n");
      out.write("    \t$(\".datagrid-toolbar\").parent().css(\"width\",\"auto\");\r\n");
      out.write("    });\r\n");
      out.write("    //加载产品\r\n");
      out.write("\t$(function() {\r\n");
      out.write(" \t\t/* $('#productId').combotree({\r\n");
      out.write("\t\t\turl : 'billMainController.do?getChildren'\r\n");
      out.write("\t\t});  */\r\n");
      out.write("\t\t  $.ajax({ //一个Ajax过程 \r\n");
      out.write("\t              type : \"post\", //以post方式与后台沟通\r\n");
      out.write("\t              async : false,\r\n");
      out.write("\t              data: {info:encodeURIComponent(JSON.stringify(obj))}, \r\n");
      out.write("\t              url : 'billMainController.do?getPrdouct',\r\n");
      out.write("\t              dataType : 'text',//\r\n");
      out.write("\t              success : function(json) {\r\n");
      out.write("\t            \t var html=\"\";\r\n");
      out.write("\t            \t json=eval( \"( \"+json+\" )\" );\r\n");
      out.write("\t            \t html=\"<option ></option>\";\r\n");
      out.write("\t            \t for(var i=0;i<json.length;i++){\r\n");
      out.write("\t            \t\thtml+=\"<option value='\"+json[i].productId+\"'>\"+json[i].productName+\"</option>\"; \r\n");
      out.write("\t            \t }\r\n");
      out.write("\t            \t $(\"#productId\").append(html);\r\n");
      out.write("\t            \t \r\n");
      out.write("\t            \t $(\"select[name*='productId']\").not(\"#productId\").each(function(){\r\n");
      out.write("\t            \t\t var sel = $(this).attr(\"productId\");\r\n");
      out.write("\t            \t\t var html1 = \"<option ></option>\";\r\n");
      out.write("\t\t            \t for(var i=0;i<json.length;i++){\r\n");
      out.write("\t\t            \t\t if(sel == json[i].productId){\r\n");
      out.write("\t\t            \t\t\t html1+=\"<option selected='selected' value='\"+json[i].productId+\"'>\"+json[i].productName+\"</option>\"; \t\t            \t\t\t \r\n");
      out.write("\t\t            \t\t }else{\r\n");
      out.write("\t\t            \t\t\t html1+=\"<option value='\"+json[i].productId+\"'>\"+json[i].productName+\"</option>\"; \r\n");
      out.write("\t\t            \t\t }\r\n");
      out.write("\t\t            \t }\r\n");
      out.write("\t            \t\t $(this).html(html1);\r\n");
      out.write("\t            \t });\r\n");
      out.write("\t              }\r\n");
      out.write("\t            });\r\n");
      out.write("\t});\r\n");
      out.write("\tfunction setPrice(val){\r\n");
      out.write("\t\t var name = $(val).attr(\"name\");\r\n");
      out.write("\t\t name=name.substr(0,name.indexOf(\".\"))+\".price\"\r\n");
      out.write("\t\t var p1=$(val).children('option:selected').val();//这就是selected的值 \r\n");
      out.write("\t\t $.ajax({ //一个Ajax过程 \r\n");
      out.write("\t             type : \"post\", //以post方式与后台沟通\r\n");
      out.write("\t             async : false,\r\n");
      out.write("\t             data: {info:encodeURIComponent(JSON.stringify(obj))}, \r\n");
      out.write("\t             url : 'billMainController.do?getPrdouct',\r\n");
      out.write("\t             dataType : 'text',//\r\n");
      out.write("\t             success : function(json) {\r\n");
      out.write("\t           \t  var html=\"\";\r\n");
      out.write("\t           \t  \r\n");
      out.write("\t           \t  json=eval( \"( \"+json+\" )\" )\r\n");
      out.write("\t           \t \r\n");
      out.write("\t           \t for(var i=0;i<json.length;i++){\r\n");
      out.write("\t           \t\tif(p1==json[i].productId){\r\n");
      out.write("\t           \t\t\t//设置price的值\r\n");
      out.write("\t           \t\t\t$(\"input[name='\"+name+\"']\").val(json[i].price);\r\n");
      out.write("\t           \t\t} \r\n");
      out.write("\t           \t }\r\n");
      out.write("\t             }\r\n");
      out.write("\t           });\r\n");
      out.write("\t\t \r\n");
      out.write("\t}\r\n");
      out.write("\tfunction setAmt(obj){\r\n");
      out.write("\t\t var name = $(obj).attr(\"name\");\r\n");
      out.write("\t\t var qty = $(obj).val();\r\n");
      out.write("\t\t var price = name.substr(0,name.indexOf(\".\"))+\".price\";\r\n");
      out.write("\t\t var amt = name.substr(0,name.indexOf(\".\"))+\".amt\";\r\n");
      out.write("\t\t var priceVal = $(\"input[name='\"+price+\"']\").val();\r\n");
      out.write("\t\t if(qty == null || qty == ''){\r\n");
      out.write("\t\t\t $(\"input[name='\"+amt+\"']\").val(\"0.00\");\r\n");
      out.write("\t\t }else if(priceVal == null || priceVal==''){\r\n");
      out.write("\t\t\t $(\"input[name='\"+amt+\"']\").val(\"0.00\");\r\n");
      out.write("\t\t }else{\r\n");
      out.write("\t\t\t var amtVal = parseFloat(qty)*parseFloat(priceVal);\r\n");
      out.write("\t\t\t amtVal = amtVal+\"\";\r\n");
      out.write("\t\t\t var pointInx = amtVal.indexOf(\".\");\r\n");
      out.write("\t\t\t if( pointInx !=-1 && amtVal.length>(pointInx+3) ){\r\n");
      out.write("\t\t\t\t amtVal = amtVal.substring(0,pointInx+3);\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t\t $(\"input[name='\"+amt+\"']\").attr(\"value\",amtVal);\r\n");
      out.write("\t\t }\t\t\t \r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction setAmtPrice(obj){\r\n");
      out.write("\t\t var name = $(obj).attr(\"name\");\r\n");
      out.write("\t\t var price = $(obj).val();\r\n");
      out.write("\t\t var qty = name.substr(0,name.indexOf(\".\"))+\".qty\";\r\n");
      out.write("\t\t var amt = name.substr(0,name.indexOf(\".\"))+\".amt\";\r\n");
      out.write("\t\t var qtyVal = $(\"input[name='\"+qty+\"']\").val();\r\n");
      out.write("\t\t if(price == null || price == ''){\r\n");
      out.write("\t\t\t $(\"input[name='\"+amt+\"']\").val(\"0.00\");\r\n");
      out.write("\t\t }else if(qtyVal == null || qtyVal==''){\r\n");
      out.write("\t\t\t $(\"input[name='\"+amt+\"']\").val(\"0.00\");\r\n");
      out.write("\t\t }else{\r\n");
      out.write("\t\t\t var amtVal = parseFloat(price)*parseFloat(qtyVal);\r\n");
      out.write("\t\t\t amtVal = amtVal+\"\";\r\n");
      out.write("\t\t\t var pointInx = amtVal.indexOf(\".\");\r\n");
      out.write("\t\t\t if( pointInx !=-1 && amtVal.length>(pointInx+3) ){\r\n");
      out.write("\t\t\t\t amtVal = amtVal.substring(0,pointInx+3);\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t\t $(\"input[name='\"+amt+\"']\").attr(\"value\",amtVal);\r\n");
      out.write("\t\t }\t\t\t \r\n");
      out.write("\t}\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write(" \tfunction checkDitOnly(obj){\r\n");
      out.write(" \t\tvar val = $(obj).val();\r\n");
      out.write(" \t\tvar reg = /[\\d]{1,22}/g;\r\n");
      out.write(" \t\tvar rlt = reg.exec(val);\r\n");
      out.write("\t\tif(rlt!=null && rlt.length>0){\r\n");
      out.write("\t\t\t$(obj).val(rlt[0]);\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(obj).val('');\r\n");
      out.write("\t\t}\r\n");
      out.write(" \t}\r\n");
      out.write(" \t\r\n");
      out.write(" \tfunction checkFloatOnly(obj){\r\n");
      out.write("\t\tvar reg = /(([\\d]{1,12})(\\.[\\d]{1,2})?)/g;\r\n");
      out.write("\t\tvar val = $(obj).val();\r\n");
      out.write("\t\tvar rlt = reg.exec(val);\r\n");
      out.write("\t\tif(rlt!=null && rlt.length>0){\r\n");
      out.write("\t\t\t$(obj).val(rlt[0]);\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t$(obj).val('');\r\n");
      out.write("\t\t}\r\n");
      out.write(" \t}\r\n");
      out.write("</script>\r\n");
      out.write("<div style=\"padding: 3px; height: 25px;width:auto;\" class=\"datagrid-toolbar\">\r\n");
      out.write("\t<a id=\"addBillProductBtn\" href=\"#\">添加</a> <a id=\"delBillProductBtn\" href=\"#\">删除</a> \r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"width: auto;height: 300px;overflow-y:auto;overflow-x:scroll;\">\r\n");
      out.write("<table border=\"0\" cellpadding=\"2\" cellspacing=\"0\" id=\"billProduct_table\">\r\n");
      out.write("\t<tr bgcolor=\"#E6E6E6\">\r\n");
      out.write("\t\t<td align=\"center\" bgcolor=\"#EEEEEE\">序号</td>\r\n");
      out.write("\t\t<td align=\"center\" bgcolor=\"#EEEEEE\">操作</td>\r\n");
      out.write("\t\t\t\t  <td align=\"left\" bgcolor=\"#EEEEEE\">产品名称</td>\r\n");
      out.write("\t\t\t\t  <td align=\"left\" bgcolor=\"#EEEEEE\">单据编号</td>\r\n");
      out.write("\t\t\t\t  <td align=\"left\" bgcolor=\"#EEEEEE\">银行卡号</td>\r\n");
      out.write("\t\t\t\t  <td align=\"left\" bgcolor=\"#EEEEEE\">份数</td>\r\n");
      out.write("\t\t\t\t  <td align=\"left\" bgcolor=\"#EEEEEE\">单价</td>\r\n");
      out.write("\t\t\t\t  <td align=\"left\" bgcolor=\"#EEEEEE\">金额</td>\r\n");
      out.write("\t\t\t\t  <td align=\"left\" bgcolor=\"#EEEEEE\">备注</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tbody id=\"add_billProduct_table\">\t\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\t\r\n");
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
    // /webpage/com/lhmh/FinancialRegistration/billProductList.jsp(164,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(billProductList)  <= 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<tr>\r\n");
        out.write("\t\t\t\t<td align=\"center\"><div style=\"width: 25px;\" name=\"xh\">1</div></td>\r\n");
        out.write("\t\t\t\t<td align=\"center\"><input style=\"width:20px;\"  type=\"checkbox\" name=\"ck\"/></td>\r\n");
        out.write("\t\t\t\t  <td align=\"left\">\r\n");
        out.write("\t\t\t\t  \r\n");
        out.write("\t\t\t\t  <select name=\"billProductList[0].productId\" id=\"productId\" onchange=\"setPrice(this)\"></select>\r\n");
        out.write("\t\t\t\t  </td>\r\n");
        out.write("\t\t\t\t  <td align=\"left\"><input name=\"billProductList[0].billNum\" maxlength=\"100\" type=\"text\" style=\"width:70px;\"  onchange=\"checkDitOnly(this)\"></td>\r\n");
        out.write("\t\t\t\t  <td align=\"left\"><input name=\"billProductList[0].puhCard\" maxlength=\"50\" type=\"text\" style=\"width:100px;\"  onchange=\"checkDitOnly(this)\"></td>\r\n");
        out.write("\t\t\t\t  <td align=\"left\"><input name=\"billProductList[0].qty\" maxlength=\"22\" type=\"text\" style=\"width:50px;\"  onblur=\"setAmt(this)\" onchange=\"checkDitOnly(this)\"></td>\r\n");
        out.write("\t\t\t\t  <td align=\"left\"><input name=\"billProductList[0].price\" maxlength=\"14\" type=\"text\" style=\"width:50px;\" onblur=\"setAmtPrice(this)\" id=\"price\" onchange=\"checkFloatOnly(this)\"></td>\r\n");
        out.write("\t\t\t\t  <td align=\"left\"><input name=\"billProductList[0].amt\" maxlength=\"22\" type=\"text\" style=\"width:50px;\"   onchange=\"checkFloatOnly(this)\"></td>\r\n");
        out.write("\t\t\t\t  <td align=\"left\"><input name=\"billProductList[0].note\" maxlength=\"200\" type=\"text\" style=\"width:100px;\" ></td>\r\n");
        out.write("   \t\t\t</tr>\r\n");
        out.write("\t");
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
    // /webpage/com/lhmh/FinancialRegistration/billProductList.jsp(180,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(billProductList)  > 0 }", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fif_005f1, _jspx_page_context))
          return true;
        out.write('\r');
        out.write('\n');
        out.write('	');
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
    // /webpage/com/lhmh/FinancialRegistration/billProductList.jsp(181,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/webpage/com/lhmh/FinancialRegistration/billProductList.jsp(181,2) '${billProductList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${billProductList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /webpage/com/lhmh/FinancialRegistration/billProductList.jsp(181,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("poVal");
    // /webpage/com/lhmh/FinancialRegistration/billProductList.jsp(181,2) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("stuts");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<tr>\r\n");
          out.write("\t\t\t\t<td align=\"center\"><div style=\"width: 25px;\" name=\"xh\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index+1 }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</div></td>\r\n");
          out.write("\t\t\t\t<td align=\"center\"><input style=\"width:20px;\"  type=\"checkbox\" name=\"ck\" /></td>\r\n");
          out.write("\t\t\t\t\r\n");
          out.write("\t\t\t\t   <td align=\"left\">\r\n");
          out.write("\t\t\t\t   \t<input type=\"hidden\" name=\"billProductList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\"/>\r\n");
          out.write("\t\t\t\t   \t<select name=\"billProductList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].productId\" maxlength=\"32\" productId=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.productId }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" ></select>\r\n");
          out.write("\t\t\t\t   </td>\r\n");
          out.write("\t\t\t\t   <td align=\"left\"><input name=\"billProductList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].billNum\" maxlength=\"100\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.billNum }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" type=\"text\" style=\"width:70px;\" onchange=\"checkDitOnly(this)\"></td>\r\n");
          out.write("\t\t\t\t   <td align=\"left\"><input name=\"billProductList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].puhCard\" maxlength=\"50\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.puhCard }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" type=\"text\" style=\"width:100px;\" onchange=\"checkDitOnly(this)\"></td>\r\n");
          out.write("\t\t\t\t   <td align=\"left\"><input name=\"billProductList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].qty\" maxlength=\"22\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.qty }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" type=\"text\" style=\"width:50px;\"  onblur=\"setAmt(this)\" onchange=\"checkDitOnly(this)\"></td>\r\n");
          out.write("\t\t\t\t   <td align=\"left\"><input name=\"billProductList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].price\" maxlength=\"14\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.price }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" type=\"text\" style=\"width:50px;\" onblur=\"setAmtPrice(this)\" onchange=\"checkFloatOnly(this)\"></td>\r\n");
          out.write("\t\t\t\t   <td align=\"left\"><input name=\"billProductList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].amt\" maxlength=\"22\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.amt }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" type=\"text\" style=\"width:50px;\"  onchange=\"checkFloatOnly(this)\"></td>\r\n");
          out.write("\t\t\t\t   <td align=\"left\"><input name=\"billProductList[");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stuts.index }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("].note\" maxlength=\"200\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${poVal.note }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" type=\"text\" style=\"width:100px;\"></td>\r\n");
          out.write("   \t\t\t</tr>\r\n");
          out.write("\t\t");
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
