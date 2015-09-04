package org.apache.jsp.webpage.jeecg.demo.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class webOfficeSample_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<TITLE>weboffice演示页面");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</TITLE>\r\n");
      out.write("<LINK href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/plug-in/webOffice/style.css\" type=text/css rel=stylesheet>\r\n");
      out.write("<SCRIPT src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/plug-in/webOffice/main.js\" type=text/javascript></SCRIPT>\r\n");
      out.write("<!-- --------------------=== 调用Weboffice初始化方法 ===--------------------- -->\r\n");
      out.write("<SCRIPT language=javascript event=NotifyCtrlReady for=WebOffice1>\r\n");
      out.write("/****************************************************\r\n");
      out.write("*\r\n");
      out.write("*\t在装载完Weboffice(执行<object>...</object>)\r\n");
      out.write("*\t控件后执行 \"WebOffice1_NotifyCtrlReady\"方法\r\n");
      out.write("*\r\n");
      out.write("****************************************************/\r\n");
      out.write("    WebOffice_Event_Flash(\"NotifyCtrlReady\");\r\n");
      out.write("\tWebOffice1_NotifyCtrlReady()\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("<SCRIPT language=javascript event=NotifyWordEvent(eventname) for=WebOffice1>WebOffice_Event_Flash(\"NotifyWordEvent\");\r\n");
      out.write(" WebOffice1_NotifyWordEvent(eventname);\r\n");
      out.write(" \r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("<SCRIPT language=javascript event=NotifyToolBarClick(iIndex) for=WebOffice1>  WebOffice_Event_Flash(\"NotifyToolBarClick\");\r\n");
      out.write(" WebOffice1_NotifyToolBarClick(iIndex);\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\r\n");
      out.write("<SCRIPT language=javascript>\r\n");
      out.write("/****************************************************\r\n");
      out.write("*\r\n");
      out.write("*\t\t控件初始化WebOffice方法\r\n");
      out.write("*\r\n");
      out.write("****************************************************/\r\n");
      out.write("function WebOffice1_NotifyCtrlReady() {\r\n");
      out.write("\tdocument.all.WebOffice1.SetWindowText(\"授权XX(可通过接口自定义)\", 0);\r\n");
      out.write("\tdocument.all.WebOffice1.OptionFlag |= 128;\r\n");
      out.write("\t// 新建文档\r\n");
      out.write("\t//document.all.WebOffice1.LoadOriginalFile(\"\", \"doc\");\r\n");
      out.write("\tspnWebOfficeInfo.innerText=\"----   您电脑上安装的WebOffice版本为:V\" + document.all.WebOffice1.GetOcxVersion() +\"\\t\\t\\t本实例是根据版本V6044编写\";\r\n");
      out.write("}\r\n");
      out.write("var flag=false;\r\n");
      out.write("function menuOnClick(id){\r\n");
      out.write("\tvar id=document.getElementById(id);\r\n");
      out.write("\tvar dis=id.style.display;\r\n");
      out.write("\tif(dis!=\"none\"){\r\n");
      out.write("\t\tid.style.display=\"none\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tid.style.display=\"block\";\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("/****************************************************\r\n");
      out.write("*\r\n");
      out.write("*\t\t接收office事件处理方法\r\n");
      out.write("*\r\n");
      out.write("****************************************************/\r\n");
      out.write("var vNoCopy = 0;\r\n");
      out.write("var vNoPrint = 0;\r\n");
      out.write("var vNoSave = 0;\r\n");
      out.write("var vClose=0;\r\n");
      out.write("function no_copy(){\r\n");
      out.write("\tvNoCopy = 1;\r\n");
      out.write("}\r\n");
      out.write("function yes_copy(){\r\n");
      out.write("\tvNoCopy = 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function no_print(){\r\n");
      out.write("\tvNoPrint = 1;\r\n");
      out.write("}\r\n");
      out.write("function yes_print(){\r\n");
      out.write("\tvNoPrint = 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function no_save(){\r\n");
      out.write("\tvNoSave = 1;\r\n");
      out.write("}\r\n");
      out.write("function yes_save(){\r\n");
      out.write("\tvNoSave = 0;\r\n");
      out.write("}\r\n");
      out.write("function EnableClose(flag){\r\n");
      out.write(" vClose=flag;\r\n");
      out.write("}\r\n");
      out.write("function CloseWord(){\r\n");
      out.write("\t\r\n");
      out.write("  document.all.WebOffice1.CloseDoc(0); \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function WebOffice1_NotifyWordEvent(eventname) {\r\n");
      out.write("\tif(eventname==\"DocumentBeforeSave\"){\r\n");
      out.write("\t\tif(vNoSave){\r\n");
      out.write("\t\t\tdocument.all.WebOffice1.lContinue = 0;\r\n");
      out.write("\t\t\talert(\"此文档已经禁止保存\");\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tdocument.all.WebOffice1.lContinue = 1;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}else if(eventname==\"DocumentBeforePrint\"){\r\n");
      out.write("\t\tif(vNoPrint){\r\n");
      out.write("\t\t\tdocument.all.WebOffice1.lContinue = 0;\r\n");
      out.write("\t\t\talert(\"此文档已经禁止打印\");\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tdocument.all.WebOffice1.lContinue = 1;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}else if(eventname==\"WindowSelectionChange\"){\r\n");
      out.write("\t\tif(vNoCopy){\r\n");
      out.write("\t\t\tdocument.all.WebOffice1.lContinue = 0;\r\n");
      out.write("\t\t\t//alert(\"此文档已经禁止复制\");\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tdocument.all.WebOffice1.lContinue = 1;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}else   if(eventname ==\"DocumentBeforeClose\"){\r\n");
      out.write("\t    if(vClose==0){\r\n");
      out.write("\t    \tdocument.all.WebOffice1.lContinue=0;\r\n");
      out.write("\t    } else{\r\n");
      out.write("\t    \t//alert(\"word\");\r\n");
      out.write("\t\t    document.all.WebOffice1.lContinue = 1;\r\n");
      out.write("\t\t  }\r\n");
      out.write(" }\r\n");
      out.write("\t//alert(eventname); \r\n");
      out.write("}\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("<META content=\"MSHTML 6.00.2900.5921\" name=GENERATOR>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY style=\"BACKGROUND: #ccc\" onunload=\"return window_onunload()\">\r\n");
      out.write("<CENTER>\r\n");
      out.write("<DIV style=\"PADDING-RIGHT: 0px; PADDING-LEFT: 0px; BACKGROUND: #fff; PADDING-BOTTOM: 0px; MARGIN: -10px 0px 0px; WIDTH: 1024px; PADDING-TOP: 10px; HEIGHT: 750px\" align=center>\r\n");
      out.write("<FORM name=myform>\r\n");
      out.write("<TABLE class=TableBlock width=\"90%\">\r\n");
      out.write("\t<TBODY>\r\n");
      out.write("\t\t<TR class=TableHeader>\r\n");
      out.write("\t\t\t<TD colSpan=2 valign=middle><font size=3> WebOffice演示页面(HTML)</font> <font color=\"#ff0000\" size=-1><Span ID=spnWebOfficeInfo align=\"right\"></Span> </font></TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td width=\"100\">事件列表：</td>\r\n");
      out.write("\t\t\t<td><textarea name=\"commandtext\" cols=100 rows=3></textarea><br>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<TABLE class=TableBlock width=\"90%\">\r\n");
      out.write("\t<TBODY>\r\n");
      out.write("\t\t<TR>\r\n");
      out.write("\t\t\t<TD class=leftTableData vAlign=top width=\"15%\">\r\n");
      out.write("\t\t\t<DIV class=menuItem onclick=\"menuOnClick('chc')\">常用接口调用</DIV>\r\n");
      out.write("\t\t\t<DIV id=chc style=\"DISPLAY: none\"><!-- ---------------=== 该处文件格式的value不可以自定义 ===------------------------- --> <SELECT id=doctype size=1 name=doctype>\r\n");
      out.write("\t\t\t\t<OPTION value=doc selected>Word</OPTION>\r\n");
      out.write("\t\t\t\t<OPTION value=xls>Excel</OPTION>\r\n");
      out.write("\t\t\t\t<OPTION value=wps>wps</OPTION>\r\n");
      out.write("\t\t\t</SELECT> <INPUT class=btn id=CreateFile onclick=newDoc() type=button value=新建文档 name=CreateFile> <INPUT class=btn onclick=\"return docOpen()\" type=button value=打开本地文件 name=button> <INPUT\r\n");
      out.write("\t\t\t\tclass=btn id=showPrint onclick=showPrintDialog() type=button value=显示对话框 name=CreateFile4> <INPUT class=btn id=zhiPrints onclick=zhiPrint() type=button value=直接打印 name=zhiPrints> <INPUT\r\n");
      out.write("\t\t\t\tclass=btn id=CreateFile2 onclick=newSave() type=button value=保存 name=CreateFile2> <INPUT class=btn id=CreateFile3 onclick=SaveAsTo() type=button value=另存为 name=CreateFile3></DIV>\r\n");
      out.write("\t\t\t<DIV class=menuItem onclick=\"menuOnClick('docSafe')\">文档安全设置</DIV>\r\n");
      out.write("\t\t\t<DIV id=docSafe style=\"DISPLAY: none\">保护密码： <INPUT style=\"WIDTH: 74px\" maxLength=10 value=Password name=docPwd> <INPUT class=btn onclick=\"return ProtectFull()\" type=button value=保护文档>\r\n");
      out.write("\t\t\t<INPUT class=btn onclick=\"return UnProtect()\" type=button value=解除保护 name=button3> <INPUT class=btn onclick=\"return notPrint()\" type=button value=禁用打印> <INPUT class=btn\r\n");
      out.write("\t\t\t\tonclick=\"return okPrint()\" type=button value=启用打印 name=button3> <INPUT class=btn onclick=\"return notSave()\" type=button value=禁止保存 name=button10> <INPUT class=btn\r\n");
      out.write("\t\t\t\tonclick=\"return okSave()\" type=button value=允许保存 name=button32> <INPUT class=btn onclick=\"return notCopy()\" type=button value=禁止复制 name=button11> <INPUT class=btn\r\n");
      out.write("\t\t\t\tonclick=\"return okCopy()\" type=button value=允许复制 name=button33> <INPUT class=btn onclick=\"return notDrag()\" type=button value=禁止拖动 name=but11> <INPUT class=btn\r\n");
      out.write("\t\t\t\tonclick=\"return okDrag()\" type=button value=允许拖动 name=but33> 事件控制方式： <INPUT class=btn onclick=\"return no_print()\" type=button value=禁用打印> <INPUT class=btn\r\n");
      out.write("\t\t\t\tonclick=\"return yes_print()\" type=button value=启用打印 name=button3> <INPUT class=btn onclick=\"return no_save()\" type=button value=禁止保存 name=button10> <INPUT class=btn\r\n");
      out.write("\t\t\t\tonclick=\"return yes_save()\" type=button value=允许保存 name=button32> <INPUT class=btn onclick=\"return no_copy()\" type=button value=禁止复制 name=button11> <INPUT class=btn\r\n");
      out.write("\t\t\t\tonclick=\"return yes_copy()\" type=button value=允许复制 name=button33></DIV>\r\n");
      out.write("\t\t\t<DIV class=menuItem onclick=\"menuOnClick('recension')\">修订操作</DIV>\r\n");
      out.write("\t\t\t<DIV id=recension style=\"DISPLAY: none\"><INPUT style=\"WIDTH: 74px\" maxLength=10 value=Test name=UserName> <INPUT class=btn onclick=\"return SetUserName()\" type=button value=设置用户\r\n");
      out.write("\t\t\t\tname=button2> <INPUT class=btn onclick=\"return ProtectRevision()\" type=button value=修订文档 name=button4> <INPUT class=btn onclick=\"return ExitRevisions()\" type=button value=退出修订\r\n");
      out.write("\t\t\t\tname=button42> <INPUT class=btn onclick=\"return ShowRevisions()\" type=button value=显示修订 name=button5> <INPUT class=btn onclick=\"return UnShowRevisions()\" type=button value=隐藏修订\r\n");
      out.write("\t\t\t\tname=button6> <INPUT class=btn onclick=\"return AcceptAllRevisions()\" type=button value=接受所有修订 name=button7> <INPUT class=btn onclick=\"return unAcceptAllRevisions()\" type=button\r\n");
      out.write("\t\t\t\tvalue=拒绝所有修订 name=button72> <INPUT class=btn onclick=\"return GetRevAllInfo()\" type=button value=获取修订信息 name=button922></DIV>\r\n");
      out.write("\t\t\t<DIV class=menuItem onclick=\"menuOnClick('markset')\">书签操作</DIV>\r\n");
      out.write("\t\t\t<DIV id=markset style=\"DISPLAY: none\"><INPUT class=btn onclick=\"return addBookmark()\" type=button value=设置书签 name=button8> <INPUT class=btn onclick=\"return taohong()\" type=button\r\n");
      out.write("\t\t\t\tvalue=套红 name=button8></DIV>\r\n");
      out.write("\t\t\t<DIV class=menuItem onclick=\"menuOnClick('off03menu')\">Office03菜单设置</DIV>\r\n");
      out.write("\t\t\t<DIV id=off03menu style=\"DISPLAY: none\"><INPUT class=btn onclick=\"return hideAll('','','','')\" type=button value=隐藏所有 name=button12> <INPUT class=btn onclick=\"return notMenu()\"\r\n");
      out.write("\t\t\t\ttype=button value=隐藏菜单 name=button12> <INPUT class=btn onclick=\"return okMenu()\" type=button value=显示菜单 name=button12> <INPUT class=btn onclick=\"return notOfter()\" type=button\r\n");
      out.write("\t\t\t\tvalue=隐藏常用 name=button12> <INPUT class=btn onclick=\"return okOfter()\" type=button value=显示常用 name=button12> <INPUT class=btn onclick=\"return notFormat()\" type=button value=隐藏格式\r\n");
      out.write("\t\t\t\tname=button12> <INPUT class=btn onclick=\"return okFormat()\" type=button value=显示格式 name=button12></DIV>\r\n");
      out.write("\t\t\t<DIV class=menuItem onclick=\"menuOnClick('off03menuItem')\">Office03菜单项</DIV>\r\n");
      out.write("\t\t\t<DIV id=off03menuItem style=\"DISPLAY: none\"><INPUT class=btn onclick=\"return hideFileMenu()\" type=button value=隐藏文件 name=button122> <INPUT class=btn onclick=\"return showFileMenu()\"\r\n");
      out.write("\t\t\t\ttype=button value=显示文件 name=button123> <INPUT class=btn onclick=\"return hideEditMenu()\" type=button value=隐藏编辑 name=button124> <INPUT class=btn onclick=\"return showEditMenu()\"\r\n");
      out.write("\t\t\t\ttype=button value=显示编辑 name=button125></DIV>\r\n");
      out.write("\t\t\t<DIV class=menuItem onclick=\"menuOnClick('off03tool')\">Office03工具栏项</DIV>\r\n");
      out.write("\t\t\t<DIV id=off03tool style=\"DISPLAY: none\"><INPUT class=btn onclick=\"return hideNewItem()\" type=button value=隐藏新建 name=button1222> <INPUT class=btn onclick=\"return showNewItem()\"\r\n");
      out.write("\t\t\t\ttype=button value=显示新建 name=button1232> <INPUT class=btn onclick=\"return hideOpenItem()\" type=button value=隐藏打开 name=button1242> <INPUT class=btn onclick=\"return showOpenItem()\"\r\n");
      out.write("\t\t\t\ttype=button value=显示打开 name=button1252> <INPUT class=btn onclick=\"return hideSaveItem()\" type=button value=隐藏保存 name=button1242> <INPUT class=btn onclick=\"return showSaveItem()\"\r\n");
      out.write("\t\t\t\ttype=button value=显示保存 name=button1252></DIV>\r\n");
      out.write("\t\t\t<DIV class=menuItem onclick=\"menuOnClick('off07menu')\">Office07菜单设置</DIV>\r\n");
      out.write("\t\t\t<DIV id=off07menu style=\"DISPLAY: none\"><INPUT class=btn onclick=\"return hideAll('hideall','','','')\" type=button value=隐藏全部 name=button12222> <INPUT class=btn\r\n");
      out.write("\t\t\t\tonclick=\"return hideAll('showmenu','','','')\" type=button value=显示全部 name=button12222> <INPUT class=btn onclick=\"return hideAll('','','','')\" type=button value=隐藏功能区 name=button12222>\r\n");
      out.write("\t\t\t<INPUT class=btn onclick=\"return hideAll('show','','','')\" type=button value=显示功能区 name=button12222> <INPUT class=btn onclick=\"return beginMenu_onclick()\" type=button value=隐藏开始\r\n");
      out.write("\t\t\t\tname=button12222> <INPUT class=btn onclick=\"return insertMenu_onclick()\" type=button value=隐藏插入 name=button12322> <INPUT class=btn onclick=\"return pageMenu_onclick()\" type=button\r\n");
      out.write("\t\t\t\tvalue=隐藏页面布局 name=button12422> <INPUT class=btn onclick=\"return adducMenu_onclick()\" type=button value=隐藏引用 name=button12522> <INPUT class=btn onclick=\"return emailMenu_onclick()\"\r\n");
      out.write("\t\t\t\ttype=button value=隐藏邮件 name=button12422> <INPUT class=btn onclick=\"return checkMenu_onclick()\" type=button value=隐藏审阅 name=button12522> <INPUT class=btn\r\n");
      out.write("\t\t\t\tonclick=\"return viewMenu_onclick()\" type=button value=隐藏视图 name=button125222> <INPUT class=btn onclick=\"return empolderMenu_onclick()\" type=button value=隐藏开发工具 name=button124222> <INPUT\r\n");
      out.write("\t\t\t\tclass=btn onclick=\"return loadMenu_onclick()\" type=button value=隐藏加载项 name=button125222> <INPUT class=btn onclick=\"return allHideMenu_onclick()\" type=button value=隐藏全部 name=button1242222>\r\n");
      out.write("\t\t\t<INPUT class=btn onclick=\"return nullityCopy_onclick()\" type=button value=复制无效 name=button12422222> <INPUT class=btn onclick=\"return nullityAffix_onclick()\" type=button value=粘贴无效\r\n");
      out.write("\t\t\t\tname=button12422223> <INPUT class=btn onclick=\"return affixCopy_onclick()\" type=button value=恢复 name=button1252222></DIV>\r\n");
      out.write("\t\t\t<DIV class=menuItem onclick=\"menuOnClick('webofficeTool')\">weboffice工具栏</DIV>\r\n");
      out.write("\t\t\t<DIV id=webofficeTool style=\"DISPLAY: none\"><INPUT language=javascript class=btn onclick=\"return bToolBar_onclick()\" type=button value=工具栏(隐/显) name=bToolBar> <INPUT\r\n");
      out.write("\t\t\t\tlanguage=javascript class=btn onclick=\"return bToolBar_New_onclick()\" type=button value=新建文档(隐/显) name=bToolBar_New> <INPUT language=javascript class=btn\r\n");
      out.write("\t\t\t\tonclick=\"return bToolBar_Open_onclick()\" type=button value=打开文档(隐/显) name=bToolBar_Open> <INPUT language=javascript class=btn onclick=\"return bToolBar_Save_onclick()\" type=button\r\n");
      out.write("\t\t\t\tvalue=保存文档(隐/显) name=bToolBar_Save></DIV>\r\n");
      out.write("\t\t\t<DIV class=menuItem onclick=\"menuOnClick('tools')\">自定义工具栏</DIV>\r\n");
      out.write("\t\t\t<DIV id=tools style=\"DISPLAY: none\"><INPUT class=btn onclick=\"return SetCustomToolBtn(0,'扩展钮一')\" type=button value=添加扩展钮一 name=EnableClose1> <INPUT class=btn\r\n");
      out.write("\t\t\t\tonclick=\"return SetCustomToolBtn(1,'扩展钮二')\" type=button value=添加扩展钮二 name=EnableClose1> <INPUT class=btn onclick=\"return SetCustomToolBtn(2,'扩展钮三')\" type=button value=添加扩展钮三\r\n");
      out.write("\t\t\t\tname=EnableClose1> <INPUT class=btn onclick=\"return SetCustomToolBtn(3,'扩展钮四')\" type=button value=添加扩展钮四 name=EnableClose1> <INPUT class=btn\r\n");
      out.write("\t\t\t\tonclick=\"return SetCustomToolBtn(4,'扩展钮五')\" type=button value=添加扩展钮五 name=EnableClose1></DIV>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<DIV class=menuItem onclick=\"menuOnClick('word')\">屏蔽word关闭按钮</DIV>\r\n");
      out.write("\t\t\t<DIV id=word style=\"DISPLAY: none\"><INPUT class=btn onclick=\"return EnableClose(0)\" type=button value=禁用Word关闭 name=EnableClose1> <INPUT class=btn onclick=\"return EnableClose(1)\"\r\n");
      out.write("\t\t\t\ttype=button value=启用Word关闭 name=EnableClose2> <INPUT class=btn onclick=\"return CloseWord()\" type=button value=关闭Word name=closeWord></DIV>\r\n");
      out.write("\t\t\t<DIV class=menuItem onclick=\"menuOnClick('face')\">换肤</DIV>\r\n");
      out.write("\t\t\t<DIV id=face style=\"DISPLAY: none\"><INPUT class=btn onclick=\"return ChangeFace(1)\" type=button value=温馨浪漫 name=EnableClose1> <INPUT class=btn onclick=\"return ChangeFace(2)\"\r\n");
      out.write("\t\t\t\ttype=button value=深沉儒雅 name=EnableClose1> <INPUT class=btn onclick=\"return ChangeFace(3)\" type=button value=office风格 name=EnableClose1></DIV>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<DIV class=menuItem onclick=\"menuOnClick('base64')\">base64</DIV>\r\n");
      out.write("\t\t\t<DIV id=base64 style=\"DISPLAY: none\"><INPUT class=btn id=CreateFile4 onclick=GetFileBase64() type=button value=获取文档的base64值 name=CreateFile4> <INPUT class=btn id=CreateFile5\r\n");
      out.write("\t\t\t\tonclick=SaveBinaryFileFromBase64() type=button value=将base64值存回文件 name=CreateFile5> <textarea name=\"FileBase64\" rows=\"10\" cols=\"16\"></textarea></DIV>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<DIV class=menuItem onclick=\"menuOnClick('other')\">其它</DIV>\r\n");
      out.write("\t\t\t<DIV id=other style=\"DISPLAY: none\"><INPUT language=javascript class=btn onclick=\"return bToolBar_FullScreen_onclick()\" type=button value=\"全  屏\" name=bToolBar_FullScreen> <INPUT\r\n");
      out.write("\t\t\t\tclass=btn id=CreateFile32 onclick=TestVBA() type=button value=VBA调用 name=CreateFile32> <INPUT class=btn onclick=\"return UnActiveExcel()\" type=button value=退出Excel编辑状态 name=EnableClose1></DIV>\r\n");
      out.write("\t\t\t</TD>\r\n");
      out.write("\t\t\t<TD class=TableData vAlign=top width=\"85%\"><!-- -----------------------------== 装载weboffice控件 ==--------------------------------- --> <SCRIPT>\r\n");
      out.write("\t\t\t\t\t\t\t\t\tvar s = \"\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ts += \"<object id=WebOffice1 height=500 width='100%' style='LEFT: 0px; TOP: 0px' classid='clsid:E77E049B-23FC-4DB8-B756-60529A35FAD5' codebase='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${webRoot}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/plug-in/webOffice/weboffice_v6.0.5.0.cab#Version=6,0,5,0'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ts +=\"<param name='_ExtentX' value='6350'><param name='_ExtentY' value='6350'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\ts +=\"</OBJECT>\"\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tdocument.write(s)\r\n");
      out.write("\t\t\t\t\t\t\t\t</SCRIPT> <!-- --------------------------------== 结束装载控件 ==----------------------------------- --></TD>\r\n");
      out.write("\t\t</TR>\r\n");
      out.write("\t</TBODY>\r\n");
      out.write("</TABLE>\r\n");
      out.write("</FORM>\r\n");
      out.write("</DIV>\r\n");
      out.write("</CENTER>\r\n");
      out.write("</BODY>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
