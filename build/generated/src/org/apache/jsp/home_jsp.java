package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Phone Shop</title>\n");
      out.write("    \n");
      out.write("    <!-- Google Fonts -->\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>\n");
      out.write("    \n");
      out.write("    <!-- Bootstrap -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    \n");
      out.write("    <!-- Font Awesome -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("    \n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("   \n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"header-area\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"user-menu\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"login.jsp\"> Login</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"header-right\">\n");
      out.write("                        <ul class=\"list-unstyled list-inline\">\n");
      out.write("                            <li class=\"dropdown dropdown-small\">\n");
      out.write("                                <a data-toggle=\"dropdown\" data-hover=\"dropdown\" class=\"dropdown-toggle\" href=\"#\"><span class=\"key\">Language :</span><span class=\"value\">English </span><b class=\"caret\"></b></a>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    <li><a href=\"#\">English</a></li>\n");
      out.write("                                    <li><a href=\"#\">Vietnam</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div> <!-- End header area -->\n");
      out.write("    \n");
      out.write("    <div class=\"site-branding-area\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <div class=\"logo\">\n");
      out.write("                        <h1><a href=\"./\"><img src=\"#\" alt=\"Logo\"></a></h1>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div> <!-- End site branding area -->\n");
      out.write("    \n");
      out.write("    <div class=\"mainmenu-area\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                </div> \n");
      out.write("                <div class=\"navbar-collapse collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li class=\"active\"><a href=\"LoadDB\">Home</a></li>\n");
      out.write("                        <li><a href=\"#\">Category</a></li>\n");
      out.write("                        <li><a href=\"LoadPhone\">All phone</a></li>\n");
      out.write("                        <li><a href=\"PhoneDetail\">Phone Detail</a></li>\n");
      out.write("                        <li><a href=\"cart.html\">Cart</a></li>\n");
      out.write("                        <li><a href=\"#\">Others</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div> <!-- End mainmenu area -->\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"slider-area\">\n");
      out.write("        \t<!-- Slider -->\n");
      out.write("\t\t\t<div class=\"block-slider block-slider4\">\n");
      out.write("\t\t\t\t<ul class=\"\" id=\"bxslider-home4\">\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t    <img src=\"img/realme-7.png\" alt=\"Slide\">\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("                                            <img src=\"img/samsung-n20.png\" alt=\"Slide\">\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("                                            <img src=\"img/samsung-s21.png\" alt=\"Slide\">\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("                                            <img src=\"img/h4-slide.png\" alt=\"Slide\">\n");
      out.write("\t\t\t\t\t\t<div class=\"caption-group\">\n");
      out.write("\t\t\t\t\t\t  <h2 class=\"caption title\">\n");
      out.write("\t\t\t\t\t\t\t\tApple <span class=\"primary\">Store </span>\n");
      out.write("\t\t\t\t\t\t\t</h2>\n");
      out.write("\t\t\t\t\t\t\t<h4 class=\"caption subtitle\">& Phone</h4>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"caption button-radius\" href=\"#\"><span class=\"icon\"></span>Shop now</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!-- ./Slider -->\n");
      out.write("    </div> <!-- End slider area -->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class=\"maincontent-area\">\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"latest-product\">\n");
      out.write("                        <h2 class=\"section-title\"><strong>New Phone</strong></h2>\n");
      out.write("                         \n");
      out.write("                        <div class=\"product-carousel\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                                 \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div> <!-- End main content area -->\n");
      out.write("    <hr>\n");
      out.write("    <div class=\"maincontent-area\">\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"latest-product\">\n");
      out.write("                        <h2 class=\"section-title\"><strong>Most Buy</strong></h2>\n");
      out.write("                         \n");
      out.write("                        <div class=\"product-carousel\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                                 \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"brands-area\">\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"brand-wrapper\">\n");
      out.write("                        <div class=\"brand-list\">\n");
      out.write("                            <img src=\"img/brand1.png\" alt=\"\">\n");
      out.write("                            <img src=\"img/brand2.png\" alt=\"\">\n");
      out.write("                            <img src=\"img/brand3.png\" alt=\"\">\n");
      out.write("                            <img src=\"img/brand4.png\" alt=\"\">\n");
      out.write("                            <img src=\"img/brand5.png\" alt=\"\">\n");
      out.write("                            <img src=\"img/brand6.png\" alt=\"\">\n");
      out.write("                            <img src=\"img/brand1.png\" alt=\"\">\n");
      out.write("                            <img src=\"img/brand2.png\" alt=\"\">                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div> <!-- End brands area -->\n");
      out.write("    \n");
      out.write("    <div class=\"product-widget-area\">\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"single-product-widget\">\n");
      out.write("                        <h2 class=\"product-wid-title\">Top Sellers</h2>\n");
      out.write("                        <a href=\"\" class=\"wid-view-more\">View All</a>\n");
      out.write("                        <div class=\"single-wid-product\">\n");
      out.write("                            <a href=\"single-product.html\"><img src=\"img/product-thumb-1.jpg\" alt=\"\" class=\"product-thumb\"></a>\n");
      out.write("                            <h2><a href=\"single-product.html\">Iphone 12</a></h2>\n");
      out.write("                            <div class=\"product-wid-rating\">\n");
      out.write("                                <i class=\"fa fa-star\"></i>\n");
      out.write("                                <i class=\"fa fa-star\"></i>\n");
      out.write("                                <i class=\"fa fa-star\"></i>\n");
      out.write("                                <i class=\"fa fa-star\"></i>\n");
      out.write("                                <i class=\"fa fa-star\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"product-wid-price\">\n");
      out.write("                                <ins>$400.00</ins> <del>$425.00</del>\n");
      out.write("                            </div>                            \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"single-product-widget\">\n");
      out.write("                        <h2 class=\"product-wid-title\">Recently Viewed</h2>\n");
      out.write("                        <a href=\"#\" class=\"wid-view-more\">View All</a>\n");
      out.write("                        <div class=\"single-wid-product\">\n");
      out.write("                            <a href=\"single-product.html\"><img src=\"img/product-thumb-4.jpg\" alt=\"\" class=\"product-thumb\"></a>\n");
      out.write("                            <h2><a href=\"single-product.html\">Iphone 12</a></h2>\n");
      out.write("                            <div class=\"product-wid-rating\">\n");
      out.write("                                <i class=\"fa fa-star\"></i>\n");
      out.write("                                <i class=\"fa fa-star\"></i>\n");
      out.write("                                <i class=\"fa fa-star\"></i>\n");
      out.write("                                <i class=\"fa fa-star\"></i>\n");
      out.write("                                <i class=\"fa fa-star\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"product-wid-price\">\n");
      out.write("                                <ins>$400.00</ins> <del>$425.00</del>\n");
      out.write("                            </div>                            \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"single-product-widget\">\n");
      out.write("                        <h2 class=\"product-wid-title\">Top New</h2>\n");
      out.write("                        <a href=\"#\" class=\"wid-view-more\">View All</a>\n");
      out.write("                        <div class=\"single-wid-product\">\n");
      out.write("                            <a href=\"single-product.html\"><img src=\"img/product-thumb-3.jpg\" alt=\"\" class=\"product-thumb\"></a>\n");
      out.write("                            <h2><a href=\"single-product.html\">Iphone 12</a></h2>\n");
      out.write("                            <div class=\"product-wid-rating\">\n");
      out.write("                                <i class=\"fa fa-star\"></i>\n");
      out.write("                                <i class=\"fa fa-star\"></i>\n");
      out.write("                                <i class=\"fa fa-star\"></i>\n");
      out.write("                                <i class=\"fa fa-star\"></i>\n");
      out.write("                                <i class=\"fa fa-star\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"product-wid-price\">\n");
      out.write("                                <ins>$400.00</ins> <del>$425.00</del>\n");
      out.write("                            </div>                            \n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div> <!-- End product widget area -->\n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"footer-top-area\">\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"footer-about-us\">\n");
      out.write("                        <h2>u<span>PhoneX</span></h2>\n");
      out.write("                        <p>Infomation</p>\n");
      out.write("                        <div class=\"footer-social\">\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-youtube\"></i></a>\n");
      out.write("                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-linkedin\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"footer-menu\">\n");
      out.write("                        <h2 class=\"footer-wid-title\">User Navigation </h2>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">My account</a></li>\n");
      out.write("                        </ul>                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"footer-menu\">\n");
      out.write("                        <h2 class=\"footer-wid-title\">Categories</h2>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Mobile Phone</a></li>\n");
      out.write("                        </ul>                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"footer-newsletter\">\n");
      out.write("                        <h2 class=\"footer-wid-title\">Newsletter</h2>\n");
      out.write("                        <p>Comment Here</p>\n");
      out.write("                        <div class=\"newsletter-form\">\n");
      out.write("                            <form action=\"#\">\n");
      out.write("                                <input type=\"email\" placeholder=\"Type your email\">\n");
      out.write("                                <input type=\"submit\" value=\"Subscribe\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div> <!-- End footer top area -->\n");
      out.write("    \n");
      out.write("    <div class=\"footer-bottom-area\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"copyright\">\n");
      out.write("                        <p>&copy; 2021 uCommerce. All Rights Reserved. <a href=\"\" target=\"_blank\"></a></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"footer-card-icon\">\n");
      out.write("                        <i class=\"fa fa-cc-discover\"></i>\n");
      out.write("                        <i class=\"fa fa-cc-mastercard\"></i>\n");
      out.write("                        <i class=\"fa fa-cc-paypal\"></i>\n");
      out.write("                        <i class=\"fa fa-cc-visa\"></i>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div> <!-- End footer bottom area -->");
      out.write("\n");
      out.write("   \n");
      out.write("    <!-- Latest jQuery form server -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery.min.js\"></script>\n");
      out.write("    \n");
      out.write("    <!-- Bootstrap JS form CDN -->\n");
      out.write("    <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("    <!-- jQuery sticky menu -->\n");
      out.write("    <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"js/jquery.sticky.js\"></script>\n");
      out.write("    \n");
      out.write("    <!-- jQuery easing -->\n");
      out.write("    <script src=\"js/jquery.easing.1.3.min.js\"></script>\n");
      out.write("    \n");
      out.write("    <!-- Main Script -->\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("    \n");
      out.write("    <!-- Slider -->\n");
      out.write("    <script type=\"text/javascript\" src=\"js/bxslider.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/script.slider.js\"></script>\n");
      out.write("  </body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <div class=\"single-product\">\n");
          out.write("                                <div class=\"product-f-image\">\n");
          out.write("                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                                    <div class=\"product-hover\">\n");
          out.write("                                        <a href=\"#\" class=\"add-to-cart-link\"><i class=\"fa fa-shopping-cart\"></i> Add to cart</a>\n");
          out.write("                                        <a href=\"PhoneDetail?phone_ID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.phone_ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"view-details-link\"><i class=\"fa fa-link\"></i> See details</a>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                                \n");
          out.write("                                <h2><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h2>\n");
          out.write("                                \n");
          out.write("                                <div class=\"product-carousel-price\">\n");
          out.write("                                    <ins>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" $</ins>\n");
          out.write("                                </div> \n");
          out.write("                            </div>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("o");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                            <div class=\"single-product\">\n");
          out.write("                                <div class=\"product-f-image\">\n");
          out.write("                                    <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\">\n");
          out.write("                                    <div class=\"product-hover\">\n");
          out.write("                                        <a href=\"#\" class=\"add-to-cart-link\"><i class=\"fa fa-shopping-cart\"></i> Add to cart</a>\n");
          out.write("                                        <a href=\"#\" class=\"view-details-link\"><i class=\"fa fa-link\"></i> See details</a>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                                \n");
          out.write("                                <h2><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h2>\n");
          out.write("                                \n");
          out.write("                                <div class=\"product-carousel-price\">\n");
          out.write("                                    <ins>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" $</ins>\n");
          out.write("                                </div> \n");
          out.write("                            </div>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
