package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_002dorder_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Cart Page</title>\n");
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
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                         ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("<!--                <div class=\"col-md-4\">\n");
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
      out.write("                </div>-->\n");
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
      out.write("                        \n");
      out.write("                         ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div> <!-- End mainmenu area -->\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"product-big-title-area\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"product-bit-title text-center\">\n");
      out.write("                        <h2>Shopping Cart</h2>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div> <!-- End Page title area -->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class=\"single-product-area\">\n");
      out.write("        <div class=\"zigzag-bottom\"></div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"single-sidebar\">\n");
      out.write("                        <h2 class=\"sidebar-title\">Search Products</h2>\n");
      out.write("                        <form action=\"#\">\n");
      out.write("                            <input type=\"text\" placeholder=\"Search products...\">\n");
      out.write("                            <input type=\"submit\" value=\"Search\">\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"product-content-right\">\n");
      out.write("                        <div class=\"woocommerce\">\n");
      out.write("                            <form method=\"post\" action=\"#\">\n");
      out.write("                                <table cellspacing=\"0\" class=\"shop_table cart\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th class=\"product-remove\">&nbsp;</th>\n");
      out.write("                                            <th class=\"product-thumbnail\">&nbsp;</th>\n");
      out.write("                                            <th class=\"product-name\">Product</th>\n");
      out.write("                                            <th class=\"product-price\">Price</th>\n");
      out.write("                                            <th class=\"product-quantity\">Quantity</th>\n");
      out.write("                                            <th class=\"product-subtotal\">Total</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <tr class=\"cart_item\">\n");
      out.write("                                            <td class=\"product-remove\">\n");
      out.write("                                                <a title=\"Remove this item\" class=\"remove\" href=\"#\">×</a> \n");
      out.write("                                            </td>\n");
      out.write("\n");
      out.write("                                            <td class=\"product-thumbnail\">\n");
      out.write("                                                <a href=\"single-product.html\"><img width=\"145\" height=\"145\" alt=\"poster_1_up\" class=\"shop_thumbnail\" src=\"img/product-thumb-2.jpg\"></a>\n");
      out.write("                                            </td>\n");
      out.write("\n");
      out.write("                                            <td class=\"product-name\">\n");
      out.write("                                                <a href=\"single-product.html\">Ship Your Idea</a> \n");
      out.write("                                            </td>\n");
      out.write("\n");
      out.write("                                            <td class=\"product-price\">\n");
      out.write("                                                <span class=\"amount\">£15.00</span> \n");
      out.write("                                            </td>\n");
      out.write("\n");
      out.write("                                            <td class=\"product-quantity\">\n");
      out.write("                                                <div class=\"quantity buttons_added\">\n");
      out.write("                                                   \n");
      out.write("                                                    <input type=\"number\" size=\"4\" class=\"input-text qty text\" title=\"Qty\" value=\"1\" min=\"0\" step=\"1\">\n");
      out.write("                                                   \n");
      out.write("                                                </div>\n");
      out.write("                                            </td>\n");
      out.write("\n");
      out.write("                                            <td class=\"product-subtotal\">\n");
      out.write("                                                <span class=\"amount\">£15.00</span> \n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        \n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                            <div class=\"cart-collaterals\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"cart_totals \">\n");
      out.write("                                <h2>Cart Totals</h2>\n");
      out.write("\n");
      out.write("                                <table cellspacing=\"0\">\n");
      out.write("                                    <tbody>\n");
      out.write("                                        <tr class=\"cart-subtotal\">\n");
      out.write("                                            <th>Cart Subtotal</th>\n");
      out.write("                                            <td><span class=\"amount\">£15.00</span></td>\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                        <tr class=\"shipping\">\n");
      out.write("                                            <th>Shipping and Handling</th>\n");
      out.write("                                            <td>Free Shipping</td>\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                        <tr class=\"order-total\">\n");
      out.write("                                            <th>Order Total</th>\n");
      out.write("                                            <td><strong><span class=\"amount\">£15.00</span></strong> </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>                        \n");
      out.write("                    </div>                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <link href=\"css/footer.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("<div class=\"footer-container\">\n");
      out.write("    <div class=\"footer-top-area\">\n");
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
      out.write("\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"footer-menu\">\n");
      out.write("                        <h2 class=\"footer-wid-title\">User Navigation </h2>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">My account</a></li>\n");
      out.write("                        </ul>                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-3 col-sm-6\">\n");
      out.write("                    <div class=\"footer-menu\">\n");
      out.write("                        <h2 class=\"footer-wid-title\">Categories</h2>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Mobile Phone</a></li>\n");
      out.write("                        </ul>                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
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
      out.write("\n");
      out.write("    <div class=\"footer-bottom-area\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-8\">\n");
      out.write("                    <div class=\"copyright\">\n");
      out.write("                        <p>&copy; 2021 uCommerce. All Rights Reserved. <a href=\"\" target=\"_blank\"></a></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
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
      out.write("    </div> <!-- End footer bottom area -->\n");
      out.write("</div>\n");
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
      out.write("  </body>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <ul>\n");
        out.write("                            <li><a href=\"login.jsp\"> Login</a></li>\n");
        out.write("                        </ul>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <ul>\n");
        out.write("                            <li><a href=\"Logout\"> Logout</a></li>\n");
        out.write("                        </ul>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.acc.permission == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <li><a href=\"PhoneManage\">Phone Manage</a></li>\n");
        out.write("                         ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }
}
