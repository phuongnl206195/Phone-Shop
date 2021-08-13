<%-- 
    Document   : home
    Created on : Feb 18, 2021, 8:05:51 PM
    Author     : Phuong Nguyen
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Phone Shop</title>
    
    <!-- Google Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>
    
    <!-- Bootstrap -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    
    <!-- Font Awesome -->
    <link rel="stylesheet" href="css/font-awesome.min.css">
    
    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/owl.carousel.css">
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="css/responsive.css">

    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  </head>
  <body>
   
    <%@include file="header.jsp" %>
    
    <div class="slider-area">
        	<!-- Slider -->
			<div class="block-slider block-slider4">
				<ul class="" id="bxslider-home4">
					<li>
					    <img src="img/realme-7.png" alt="Slide">
					</li>
					<li>
                                            <img src="img/samsung-n20.png" alt="Slide">
					</li>
					<li>
                                            <img src="img/samsung-s21.png" alt="Slide">
					</li>
					<li>
                                            <img src="img/h4-slide.png" alt="Slide">
						
					</li>
				</ul>
			</div>
			<!-- ./Slider -->
    </div> <!-- End slider area -->
    
    
    <div class="maincontent-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="latest-product">
                        <h2 class="section-title"><strong>New Phone</strong></h2>
                         
                        <div class="product-carousel">
                            <c:forEach items="${listP}" var="o">
                            <div class="single-product">
                                <div class="product-f-image">
                                    <img src="${o.image}" alt="">
                                    <div class="product-hover">
                                        <c:if test="${sessionScope.acc.permission == 0}">
                                        <a href="cart?phone_ID=${o.phone_ID}" class="add-to-cart-link"><i class="fa fa-shopping-cart"></i> Add to cart</a>
                                        </c:if>
                                        <a href="PhoneDetail?phone_ID=${o.phone_ID}" class="view-details-link"><i class="fa fa-link"></i> See details</a>
                                    </div>
                                </div>
                                
                                <h2><a href="#">${o.name}</a></h2>
                                
                                <div class="product-carousel-price">
                                    <ins>${o.price} $</ins>
                                </div> 
                            </div>
                                </c:forEach>
                        </div>
                                 
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End main content area -->
    <hr>
    <div class="maincontent-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="latest-product">
                        <h2 class="section-title"><strong>Most Buy</strong></h2>
                         
                        <div class="product-carousel">
                            <c:forEach items="${listA}" var="o">
                            <div class="single-product">
                                <div class="product-f-image">
                                    <img src="${o.image}" alt="">
                                    <div class="product-hover">
                                        <c:if test="${sessionScope.acc.permission == 0}">
                                        <a href="cart?phone_ID=${o.phone_ID}" class="add-to-cart-link"><i class="fa fa-shopping-cart"></i> Add to cart</a>
                                        </c:if>
                                        <a href="PhoneDetail?phone_ID=${o.phone_ID}" class="view-details-link"><i class="fa fa-link"></i> See details</a>
                                    </div>
                                </div>
                                
                                <h2><a href="#">${o.name}</a></h2>
                                
                                <div class="product-carousel-price">
                                    <ins>${o.price} $</ins>
                                </div> 
                            </div>
                                </c:forEach>
                        </div>
                                 
                    </div>
                </div>
            </div>
        </div>
    </div>
    
    <div class="brands-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="brand-wrapper">
                        <div class="brand-list">
                            <img src="img/brand1.png" alt="">
                            <img src="img/brand2.png" alt="">
                            <img src="img/brand3.png" alt="">
                            <img src="img/brand4.png" alt="">
                            <img src="img/brand5.png" alt="">
                            <img src="img/brand6.png" alt="">
                            <img src="img/brand1.png" alt="">
                            <img src="img/brand2.png" alt="">                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End brands area -->
    
    <div class="product-widget-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <div class="single-product-widget">
                        <h2 class="product-wid-title">Top Sellers</h2>
                        <a href="ListPhone" class="wid-view-more">View All</a>
                        <c:forEach items="${listP}" var="o" end="4">
                        <div class="single-wid-product">
                            <a href=""><img src="${o.image}" alt="" class="product-thumb"></a>
                            <h2><a href="PhoneDetail?phone_ID=${o.phone_ID}">${o.name}</a></h2>
                            <div class="product-wid-rating">
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                            </div>
                            <div class="product-wid-price">
                                <ins>${o.price} $</ins>
                            </div>                            
                        </div>
                        </c:forEach>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="single-product-widget">
                        <h2 class="product-wid-title">Recently Viewed</h2>
                        <a href="ListPhone" class="wid-view-more">View All</a>
                         <c:forEach items="${listA}" var="o" end="4">
                        <div class="single-wid-product">
                            <a href=""><img src="${o.image}" alt="" class="product-thumb"></a>
                            <h2><a href="PhoneDetail?phone_ID=${o.phone_ID}">${o.name}</a></h2>
                            <div class="product-wid-rating">
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                            </div>
                            <div class="product-wid-price">
                                <ins>${o.price}</ins>
                            </div>                            
                        </div>
                        </c:forEach>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="single-product-widget">
                        <h2 class="product-wid-title">Top New</h2>
                        <a href="ListPhone" class="wid-view-more">View All</a>
                        <c:forEach items="${listP}" var="o" end="4">
                        <div class="single-wid-product">
                            <a href=""><img src="${o.image}" alt="" class="product-thumb"></a>
                            <h2><a href="PhoneDetail?phone_ID=${o.phone_ID}">${o.name}</a></h2>
                            <div class="product-wid-rating">
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                            </div>
                            <div class="product-wid-price">
                                <ins>${o.price}</ins>
                            </div>                            
                        </div>
                          </c:forEach>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End product widget area -->
    
    <%@include file="footer.jsp" %>
   
    <!-- Latest jQuery form server -->
    <script src="https://code.jquery.com/jquery.min.js"></script>
    
    <!-- Bootstrap JS form CDN -->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    
    <!-- jQuery sticky menu -->
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/jquery.sticky.js"></script>
    
    <!-- jQuery easing -->
    <script src="js/jquery.easing.1.3.min.js"></script>
    
    <!-- Main Script -->
    <script src="js/main.js"></script>
    
    <!-- Slider -->
    <script type="text/javascript" src="js/bxslider.min.js"></script>
	<script type="text/javascript" src="js/script.slider.js"></script>
  </body>
</html>
