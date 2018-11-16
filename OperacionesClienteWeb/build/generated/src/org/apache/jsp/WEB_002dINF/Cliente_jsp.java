package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ipn.mx.rmi.Operaciones;
import java.rmi.Naming;;

public final class Cliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

  /*Operaciones ope=(Operaciones)Naming.lookup("rmi://localhost/operaciones");
  System.out.println("-------------------CONECTADO-----------");
  double x=0, y =0, resultado=0;
  int op=0;
  */

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html  xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:th=\"http://www.thymeleaf.org\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Operaciones </title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Básicas</h1>\n");
      out.write("        \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label class=\"col-lg-4 \">Operación: </label>\n");
      out.write("                <label>\n");
      out.write("                    <select class=\"form-control m-b\" name=\"operacion\" required>\n");
      out.write("                        <option></option>\n");
      out.write("                        <option>Suma</option>\n");
      out.write("                        <option>Resta</option>\n");
      out.write("                        <option>Multiplicación</option>\n");
      out.write("                        <option>Division</option>\n");
      out.write("                    </select>\n");
      out.write("                </label>\n");
      out.write("            <label>Introduce los dos numeros implicados en la operación: </label> \n");
      out.write("            <input type=\"text\"  name=\"x\"> \n");
      out.write("            ");

               /* String operacion = request.getParameter("operacion");
                if(operacion.equals("Suma")){
                    out.println(" + ");
                    op=1;
                }else if(operacion.equals("Resta")){
                    out.println(" - ");
                    op=2;
                }else if(operacion.equals("Multiplicación")){
                    out.println(" x ");
                    op=3;
                }else {
                    out.println(" / ");
                    op=4;
                }*/
            
      out.write("\n");
      out.write("            <input type=\"text\" name=\"y\"> \n");
      out.write("        </div>\n");
      out.write("        <button name=\"Calcular\" value=\"Calcular\" type=\"submit\">Calcular</button>\n");
      out.write("        ");

            /*String calcular=request.getParameter("Calcular");
            String n1= request.getParameter("x");
            String n2= request.getParameter("y");
            x= Double.valueOf(n1);
            y= Double.valueOf(n2);
            if(calcular!= null){
                switch (op){
                    case 1:
                        resultado= ope.sumar(x, y);
                    case 2:
                        resultado= ope.restar(x, y);
                    case 3:
                        resultado= ope.multiplicar(x, y);
                    case 4:
                        resultado= ope.dividir(x, y);
                }
                        
                 out.println("Resultado = "+ resultado);
            }*/
        
      out.write("\n");
      out.write("        \n");
      out.write("            \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
