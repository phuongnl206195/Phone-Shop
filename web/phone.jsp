<%-- 
    Document   : phone
    Created on : Feb 19, 2021, 9:08:01 PM
    Author     : Phuong Nguyen
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>All Phone Shop</title>

        <!-- Google Fonts -->
        <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>

        <!-- Bootstrap -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/owl.carousel.css">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="css/responsive.css">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="css/font-awesome.min.css">

        <!-- Custom CSS -->
        <link href="css/cssHome.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>

        <%@include file="header.jsp" %>

        <div class="product-big-title-area">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="product-bit-title text-center">
                            <h2>Shop</h2>
                        </div>
                    </div>
                </div>
            </div>
        </div>




        <div class="single-product-area">

            <div class="card bg-light mb-3" style="width: 15%; float: left; margin-left: 100px;">
                <div class="card-header bg-primary text-white text-uppercase"><i class="fa fa-list"></i>Categories</div>
                <ul class="list-group category_block">
                    <c:forEach items="${listCC}" var="o">
                        <li class="list-group-item text-white"><a href="Category?cid=${o.category_ID}">${o.category_Name}</a></li>
                        </c:forEach>
                </ul>
            </div>

            <div class="zigzag-bottom"></div>
            <div class="container" style="width: 75%; float: right; background-color: white">

                <div class="row">
                    <c:forEach items="${listP}" var="o">
                        <div class="col-md-3 col-sm-6">
                            <div class="single-shop-product">
                                <div class="product-upper">
                                    <img src="${o.image}" alt="">
                                </div>
                                <h2><a href="PhoneDetail?phone_ID=${o.phone_ID}">${o.name}</a></h2>
                                <div class="product-carousel-price">
                                    <ins>${o.price} $</ins>
                                </div>  
                                
                                <div class="product-option-shop">
                                    <c:if test="${sessionScope.acc.permission == 0}">
                                    <a class="add_to_cart_button" data-quantity="1" 
                                       data-product_sku="" data-product_id="70" rel="nofollow" href="cart?phone_ID=${o.phone_ID}">Add to cart</a>
                                       </c:if>
                                    <c:if test="${sessionScope.acc.permission == 1}">
                                        <a onclick="return ConfirmDelete()" href="Delete?pid=${o.phone_ID}" class="add_to_cart_button" ><i title="Delete"><strong>Delete</strong></i></a>
                                        <a href="LoadPhone?pid=${o.phone_ID}"  class="add_to_cart_button" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit"><strong>Edit</strong></i></a>
                                       </c:if>
                                </div> 
                                
                            </div>
                        </div>
                    </c:forEach>
                </div>


                <div class="row">
                    <div class="col-md-12">
                        <div class="product-pagination text-center">
                            <nav>
                                <ul class="pagination">
                                    <c:if test="${index > 1}">
                                    <li>
                                        <a href="ListPhone?index=${index-1}" aria-label="Previous">
                                            <span aria-hidden="true">&laquo;</span>
                                        </a>
                                    </li>
                                    </c:if>
                                    <c:forEach begin="1" end="${end}" var="i">
                                        <li class="page-item ${index == i?"active":""}"><a  href="ListPhone?index=${i}">${i}</a></li>
                                    </c:forEach>
                                    <c:if test="${index < end}">
                                    <li>
                                        <a href="ListPhone?index=${index+1}" aria-label="Next">
                                            <span aria-hidden="true">&raquo;</span>
                                        </a>
                                    </li>
                                    </c:if>
                                </ul>
                            </nav>                        
                        </div>
                    </div>
                </div>
            </div>
            
            
            
        </div>


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
        
        <script>
            function ConfirmDelete() {
                var x = confirm("Are you sure you want to delete?");
                if (x)
                    return true;
                else
                    return false;
            }
        </script>
    </body>
</html>
