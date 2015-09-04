package org.apache.jsp.webpage.com.lhmh.FinancialRegistration;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.Map;

public final class bill_005fplayViedo_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"zh_cn\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<title>视频播放</title>\r\n");
      out.write("<meta name=\"description\"\r\n");
      out.write("\tcontent=\"A simple HTML5 media player with custom controls and WebVTT captions.\">\r\n");
      out.write("<meta name=\"author\" content=\"Sam Potts\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.print(path);
      out.write("/webpage/com/lhmh/FinancialRegistration/tablecloth/tablecloth.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.print(path);
      out.write("/webpage/com/lhmh/FinancialRegistration/tablecloth/tablecloth.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tbackground: #f1f1f1;\r\n");
      out.write("\tfont: 70% Arial, Helvetica, sans-serif;\r\n");
      out.write("\tcolor: #555;\r\n");
      out.write("\tline-height: 150%;\r\n");
      out.write("\ttext-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcolor: #057fac;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a:hover {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("\tcolor: #999;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1 {\r\n");
      out.write("\tfont-size: 140%;\r\n");
      out.write("\tmargin: 0 20px;\r\n");
      out.write("\tline-height: 80px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h2 {\r\n");
      out.write("\tfont-size: 120%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#container {\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\twidth: 720px;\r\n");
      out.write("\tbackground: #fff;\r\n");
      out.write("\tpadding-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#content {\r\n");
      out.write("\tmargin: 0 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p.sig {\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\twidth: 680px;\r\n");
      out.write("\tpadding: 1em 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("form {\r\n");
      out.write("\tmargin: 1em 0;\r\n");
      out.write("\tpadding: .2em 20px;\r\n");
      out.write("\tbackground: #eee;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");

	List list = (List) request.getAttribute("billList");
	// System.out.print(list.size());
	String url1="";

      out.write("\r\n");
      out.write("<body onunload=\"startstop()\">\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"content\" height=\"200px\">\r\n");
      out.write("\t\t<table cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t<tr height=\"25px\">\r\n");
      out.write("\t\t\t\t<td align=center>视频名称</td>\r\n");
      out.write("\t\t\t\t<!--  <td align=center> 视频地址</td>-->\r\n");
      out.write("\t\t\t\t<td colspan=\"2\" align=center>操作</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");

				String[] playurl = new String[list.size()];
				for (int i = 0; i < list.size(); i++) {

					Object[] temp = (Object[]) list.get(i);
					String url = (String) temp[0];
					String playName = (String) temp[1];
					if (i==0) url1 =url ;
				
			
      out.write("\r\n");
      out.write("\t\t\t<tr height=\"25px\">\r\n");
      out.write("\t\t\t\t<td>");
      out.print(playName);
      out.write("</td>\r\n");
      out.write("\t\t\t\t<!-- <td>");
      out.print(url);
      out.write("</td>-->\r\n");
      out.write("\t\t\t\t<td><a title=\"");
      out.print(url);
      out.write("\" href=\"#\" onclick=\"doGo(this.title);return false;\">播放</a> \r\n");
      out.write("        <span style=\"margin: 20px;\" /> </td>\r\n");
      out.write("\t\t\t\t<td><div onclick=\"startstop()\">停止</div></td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t");

				}
				//顺序播放文件
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div> \r\n");
      out.write("        <object classid=\"clsid:9be31822-fdad-461b-ad51-be1d1c159921\" \r\n");
      out.write("                width=\"640\" \r\n");
      out.write("                height=\"480\" \r\n");
      out.write("                id=\"vlc\" \r\n");
      out.write("                events=\"true\"> \r\n");
      out.write("        <param name=\"mrl\" value=\"\" /> \r\n");
      out.write("        <param name=\"showdisplay\" value=\"true\" /> \r\n");
      out.write("        <param name=\"autoloop\" value=\"false\" /> \r\n");
      out.write("        <param name=\"autoplay\" value=\"true\" /> \r\n");
      out.write("        <param name=\"volume\" value=\"50\" /> \r\n");
      out.write("        <param name=\"starttime\" value=\"0\" /> \r\n");
      out.write("        <embed pluginspage=\"http://www.videolan.org\" \r\n");
      out.write("                     type=\"application/x-vlc-plugin\" \r\n");
      out.write("                     version=\"videolan.vlcplugin.2\" \r\n");
      out.write("                     width=\"640\" \r\n");
      out.write("                     height=\"480\" \r\n");
      out.write("                     name=\"vlc\"> \r\n");
      out.write("        </embed> \r\n");
      out.write("        </object> \r\n");
      out.write("</div> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t//wmp.controls.stop() ;\r\n");
      out.write("\tvar itemId = 0; \r\n");
      out.write("\t//点击播放\r\n");
      out.write("\tfunction startplay(url) {\r\n");
      out.write("\t\talert(url);\r\n");
      out.write("\t\t itemId=vlc.playlist.add(url); \r\n");
      out.write("\t\talert(\"sss\");\r\n");
      out.write("\t\tvlc.playlist.playItem(itemId); \r\n");
      out.write("\t\talert(\"aa\");\r\n");
      out.write("\t\t//wmp.controls.stop() ;\r\n");
      out.write("\t\t//wmp.URL=url ;\r\n");
      out.write("\t\t//wmp.controls.play(); \r\n");
      out.write("\t}\r\n");
      out.write("\tfunction startstop() {\r\n");
      out.write("\t\t    getVLC(\"vlc\").playlist.stop(); \r\n");
      out.write("\t\t//wmp.controls.stop() ;\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction getVLC(name) \r\n");
      out.write("{ \r\n");
      out.write("        if (window.document[name])    \r\n");
      out.write("        { \r\n");
      out.write("                return window.document[name]; \r\n");
      out.write("        } \r\n");
      out.write("        if (navigator.appName.indexOf(\"Microsoft Internet\")==-1) \r\n");
      out.write("        { \r\n");
      out.write("                if (document.embeds && document.embeds[name]) \r\n");
      out.write("                        return document.embeds[name];    \r\n");
      out.write("        } \r\n");
      out.write("        else \r\n");
      out.write("        { \r\n");
      out.write("                return document.getElementById(name); \r\n");
      out.write("        } \r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("function doGo(mrl) \r\n");
      out.write("{ \r\n");
      out.write("        var vlc = getVLC(\"vlc\"); \r\n");
      out.write("        //alert(vlc);\r\n");
      out.write("        itemId=vlc.playlist.add(mrl); \r\n");
      out.write("       //   alert(itemId);\r\n");
      out.write("        vlc.playlist.playItem(itemId); \r\n");
      out.write("       // document.getElementById(\"btn_stop\").disabled = false; \r\n");
      out.write("} \r\n");
      out.write("</script>\r\n");
      out.write(" <script for=\"vlc\" language=\"JavaScript\" event=\"ErrorEvent(nFlag)\">\r\n");
      out.write("\talert(nFlag);\r\n");
      out.write("</script>");
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
