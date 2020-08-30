package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.bean.Patient;
import java.util.Iterator;
import java.util.ArrayList;

public final class Search_005fpatient_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n");
      out.write("    <title>Search</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Poppins\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/-Login-form-Page-BS4-.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Footer-Basic.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Login-Form-Dark.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Navigation-Clean.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Pretty-Registration-Form.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body style=\"background-image: url(&quot;assets/img/Horizon.jpg&quot;);\">\n");
      out.write("        <nav class=\"navbar navbar-light navbar-expand-md navigation-clean\" style=\"background-color: rgb(0,51,91);\">\n");
      out.write("        <div class=\"container\"><button data-toggle=\"collapse\" class=\"navbar-toggler\" data-target=\"#navcol-1\"><span class=\"sr-only\">Toggle navigation</span><span class=\"navbar-toggler-icon\" style=\"color: #c4d3dd;\"></span></button>\n");
      out.write("            <p style=\"color: #e0ddbc;font-size: 30px;font-family: Poppins, sans-serif;margin-bottom: 8px;\">ABC HOSPITAL</p>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navcol-1\" style=\"height: 47px;\">\n");
      out.write("                <ul class=\"nav navbar-nav ml-auto\" style=\"margin-left: 725px;padding-right: 0px;\">\n");
      out.write("                    <li class=\"nav-item dropdown \"><a class=\"dropdown-toggle nav-link\" data-toggle=\"dropdown\" aria-expanded=\"false\" href=\"#\" style=\"color: #c4d3dd;margin-right: 72px;font-size: 19px;\">Patient</a>\n");
      out.write("                        <div class=\"dropdown-menu \" role=\"menu\" style=\"background-color: #00335b;\">\n");
      out.write("                                <a class=\"dropdown-item\" role=\"presentation\" href=\"patient_register.html\" style=\"color: #c4d3dd;\">Registration</a>\n");
      out.write("                                <a class=\"dropdown-item\" role=\"presentation\" href=\"update_patient.jsp\" style=\"color: #c4d3dd;\">Update Details</a>\n");
      out.write("                                <a class=\"dropdown-item\" role=\"presentation\" href=\"Delete_patient.jsp\" style=\"color: #c4d3dd;\">Delete Patient</a>\n");
      out.write("                                <a class=\"dropdown-item\" role=\"presentation\" href=\"Search_patient.jsp\" style=\"color: #c4d3dd;\">Search Patients</a>\n");
      out.write("                                <a class=\"dropdown-item\" role=\"presentation\" href=\"discharge_patient.html\" style=\"color: #c4d3dd;\">Discharge Patient</a>\n");
      out.write("                                <a class=\"dropdown-item\" role=\"presentation\" href=\"billing_detail.html\" style=\"color: #c4d3dd;\">Billing Details</a>\n");
      out.write("                                <a class=\"dropdown-item\" role=\"presentation\" href=\"view_patients.html\" style=\"color: #c4d3dd;\">View Patients</a></div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\"><a class=\"dropdown-toggle nav-link\" data-toggle=\"dropdown\" aria-expanded=\"false\" href=\"#\" style=\"color: #c4d3dd;margin-right: 70px;font-size: 19px;\">Pharmacy</a>\n");
      out.write("                        <div class=\"dropdown-menu\" role=\"menu\" style=\"background-color: #00335b;\"><a class=\"dropdown-item\" role=\"presentation\" href=\"medicine_issue.html\" style=\"color: #c4d3dd;\">Medicine Issued</a><a class=\"dropdown-item\" role=\"presentation\" href=\"new_medicine_issue.html\" style=\"color: #c4d3dd;\">Issue New Medicine</a>\n");
      out.write("                            <a\n");
      out.write("                                class=\"dropdown-item\" role=\"presentation\" href=\"medicine_stock.html\" style=\"color: #c4d3dd;\">Stock</a><a class=\"dropdown-item\" role=\"presentation\" href=\"add_new_medicine.html\" style=\"color: #c4d3dd;\">Add New Medicine</a></div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\"><a class=\"dropdown-toggle nav-link\" data-toggle=\"dropdown\" aria-expanded=\"false\" href=\"#\" style=\"color: #c4d3dd;font-size: 19px;\">Diagnostics</a>\n");
      out.write("                        <div class=\"dropdown-menu\" role=\"menu\" style=\"background-color: #00335b;\"><a class=\"dropdown-item\" role=\"presentation\" href=\"diagnostics_done.html\" style=\"color: #c4d3dd;\">Diagonstics Done</a><a class=\"dropdown-item\" role=\"presentation\" href=\"new_diagnostic.html\" style=\"color: #c4d3dd;\">Allot New Test</a>\n");
      out.write("                            <a\n");
      out.write("                                class=\"dropdown-item\" role=\"presentation\" href=\"diagnostics_list.html\" style=\"color: #c4d3dd;\">List Of Tests</a><a class=\"dropdown-item\" role=\"presentation\" href=\"add_new_diagnostics.html\" style=\"color: #c4d3dd;\">Add New Diagnostics</a></div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    \n");
      out.write("  ");
      out.write("\n");
      out.write("        ");
 
    Patient p=new Patient();
        
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"row register-form\" style=\"padding-right: 0;\">\n");
      out.write("        <div class=\"col-md-8 offset-md-2\">\n");
      out.write("            <form class=\"custom-form\"  action=\"SearchServ\" style=\"background-color: rgba(71,186,235,0.13);padding: 55px;padding-top: 25px;padding-bottom: 25px;margin-top: 25px;margin-bottom: 25px;margin-right: 25px;margin-left: 25px;\">\n");
      out.write("                <h1 style=\"margin-bottom: 45px;\">Search Patient</h1>\n");
      out.write("                \n");
      out.write("                <input type=\"hidden\" name=\"source\" value=\"search\">        \n");
      out.write("                \n");
      out.write("                <div class=\"form-row form-group\" style=\"margin-bottom: 5px;\">\n");
      out.write("                    <div class=\"col-sm-4 label-column\">\n");
      out.write("                        <label class=\"col-form-label\" for=\"name-input-field\" style=\"font-size: 16px;padding-right: 5px;\">Patient SSN ID</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-6 input-column\">\n");
      out.write("                        <input class=\"form-control\" type=\"text\" name=\"ssnid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ssnid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"background-color: #ffffff;\" required=\"\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <button class=\"btn btn-light submit-button\"  type=\"submit\" style=\"margin: 10px;padding: 10px;\">Get</button>\n");
      out.write("                \n");
      out.write("              \n");
      out.write("                <div class=\"form-row form-group\">\n");
      out.write("                    <div class=\"col-sm-4 label-column\"><label class=\"col-form-label\" for=\"email-input-field\" style=\"font-size: 16px;padding-right: 5px;\">Patient Name</label></div>\n");
      out.write("                    <div class=\"col-sm-6 input-column\"><input class=\"form-control\" type=\"text\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-row form-group\">\n");
      out.write("                    <div class=\"col-sm-4 label-column\"><label class=\"col-form-label\" for=\"pawssword-input-field\" style=\"font-size: 16px;padding-right: 5px;\">Patient Age</label></div>\n");
      out.write("                    <div class=\"col-sm-6 input-column\"><input class=\"form-control\" type=\"text\" name=\"age\" value= ");
      out.print( request.getAttribute("age") );
      out.write(" readonly></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-row form-group\">\n");
      out.write("                    <div class=\"col-sm-4 label-column\"><label class=\"col-form-label\" for=\"repeat-pawssword-input-field\" style=\"font-size: 16px;padding-right: 5px;\">Date Of Admission</label></div>\n");
      out.write("                    <div class=\"col-sm-6 input-column\"><input class=\"form-control\" name=\"dateofadmission\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dateofadmission}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-row form-group\">\n");
      out.write("                    <div class=\"col-sm-4 label-column\"><label class=\"col-form-label\" for=\"dropdown-input-field\" style=\"font-size: 16px;padding-right: 5px;\">Type Of Bed</label></div>\n");
      out.write("                    <div class=\"col-sm-4 input-column\"><input class=\"form-control\"  name=\"bedtype\" type=\"text\" value= ");
      out.print( request.getAttribute("bedtype") );
      out.write(" readonly></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-row form-group\">\n");
      out.write("                    <div class=\"col-sm-4 label-column\"><label class=\"col-form-label\" for=\"dropdown-input-field\" style=\"font-size: 16px;padding-right: 5px;\">Address</label></div>\n");
      out.write("                    <div class=\"col-sm-4 input-column\"><textarea class=\"form-control\" name=\"addr\" style=\"height: 85px;width: 225px;\" readonly>");
      out.print( request.getAttribute("addr") );
      out.write("</textarea></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-row form-group\">\n");
      out.write("                    <div class=\"col-sm-4 label-column\"><label class=\"col-form-label\" for=\"dropdown-input-field\" style=\"font-size: 16px;padding-right: 5px;\">State</label></div>\n");
      out.write("                    <div class=\"col-sm-4 input-column\"><input class=\"form-control\" name=\"state\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-row form-group\">\n");
      out.write("                    <div class=\"col-sm-4 label-column\"><label class=\"col-form-label\" for=\"dropdown-input-field\" style=\"font-size: 16px;padding-right: 5px;\">City</label></div>\n");
      out.write("                    <div class=\"col-sm-4 input-column\"><input class=\"form-control\" name=\"city\" type=\"text\" value= ");
      out.print( request.getAttribute("city") );
      out.write(" readonly></div>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\" integrity=\"sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=\" crossorigin=\"anonymous\"></script>\n");
      out.write("     \n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write(" \n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
