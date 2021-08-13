<%-- 
    Document   : add-order
    Created on : Feb 21, 2021, 2:16:26 PM
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
    <title>Cart Page</title>
    
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

 
  </head>
  <body>
   
    <%@include file="header.jsp" %>
    
    <div class="product-big-title-area">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="product-bit-title text-center">
                        <h2>Shopping Cart</h2>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End Page title area -->
    
    
    <div class="single-product-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <div class="single-sidebar">
                        <h2 class="sidebar-title">Search Products</h2>
                        <form action="Search">
                            <input type="text" placeholder="Search products...">
                            <input type="submit" value="Search">
                        </form>
                    </div>
                </div>
                
                <div class="col-md-8">
                    <div class="product-content-right">
                        <div class="woocommerce">
                            <form method="post" action="">
                                <table cellspacing="0" class="shop_table cart">
                                    <thead>
                                        <tr>
                                            <th class="product-remove">&nbsp;</th>
                                            <th class="product-thumbnail">&nbsp;</th>
                                            <th class="product-name">Phone</th>
                                            <th class="product-price">Price</th>
                                            <th class="product-quantity">Quantity</th>
                                            <th class="product-subtotal">Total</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${listP}" var="o">
                                        <tr class="cart_item">
                                            <td class="product-remove">
                                                <a title="Remove this item" class="remove" href="remove?phone_ID=${o.phone_ID}">×</a> 
                                            </td>

                                            <td class="product-thumbnail">
                                                <a href=""><img width="145" height="145" alt="" class="shop_thumbnail" src="${o.image}"></a>
                                            </td>

                                            <td class="product-name">
                                                <input name="phoneID" value="${o.phone_ID}" hidden="" readonly="">
                                                <a href="">${o.name}</a> 
                                            </td>

                                            <td class="product-price">
                                                <span class="amount">${o.price}</span> 
                                            </td>

                                            <td class="">
                                                <div class="">
<!--                                                    <input type="button" class="minus" value="-">
                                                    <input type="number" size="4" class="input-text qty text" title="Qty" value="1" min="0" step="1">
                                                    <input type="button" class="plus" value="+">-->
                                                    <button><a href="MinusButon?phone_ID=${o.phone_ID}">-</a></button>
                                                    <input name="amount" value="${o.amount}" hidden="" readonly="">
                                                    <strong>${o.amount}</strong>
                                                    <button><a href="cart?phone_ID=${o.phone_ID}">+</a></button>
                                                </div>
                                            </td>
                                            <td class="product-subtotal">
                                               
                                                <span class="amount">${total}</span> 
                                            </td>
                                        </tr>
                                          </c:forEach>
                                    </tbody>
                                </table>
                            </form>

                            <div class="cart-collaterals">


                            <div class="cart_totals ">
                                <h2>Cart Totals</h2>

                                <table cellspacing="0">
                                    <tbody>
                                        <tr class="cart-subtotal">
                                            <th>Cart Subtotal</th>
                                            <td><span class="amount">${total}</span></td>
                                        </tr>

                                        <tr class="shipping">
                                            <th>Shipping and Handling</th>
                                            <td>Free Shipping</td>
                                        </tr>
                                        
                                         <tr class="vat">
                                            <th>VAT</th>
                                    <input name="vat" value="${vat}" hidden="" readonly="">
                                            <td>${vat}</td>
                                        </tr>

                                        <tr class="order-total">
                                            <th>Order Total</th>
                                             <input name="total" value="${sum}" hidden="" readonly="">
                                            <td><strong><span class="amount">${sum}</span></strong> </td>
                                        </tr>
                                    </tbody>
                                </table>
                                        <a href="order" class="button-radius" style="background-color: #5a88ca; font-weight: bold">Buy</a>
                            </div>
                            </div>
                        </div>                        
                    </div>                    
                </div>
                <h3>History Order</h3>                        
                <form method="post" action="">
                                <table cellspacing="0" class="shop_table cart">
                                    <thead>
                                        <tr>
                                            
                                            <th class="product-name">Name</th>
                                            <th class="product-price">Address</th>
                                            <th class="product-quantity">Phone Number</th>
                                            <th class="product-subtotal">Email</th>
                                            <th class="product-subtotal">Amount</th>
                                            <th class="product-subtotal">Total</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${listo}" var="o">
                                        <tr class="cart_item">

                                            <td class="">
                                                <a href="">${o.userName}</a> 
                                            </td>

                                            <td class="">
                                                <a href="">${o.address}</a> 
                                            </td>
                                            
                                            <td class="">
                                                <a href="">${o.phoneNumber}</a> 
                                            </td>
                                            
                                            <td class="">
                                                <a href="">${o.email}</a> 
                                            </td>
                                            
                                            <td class="">
                                                <a href="">${o.amount}</a> 
                                            </td>
                                            
                                            <td class="">
                                                <a href="">${o.total}</a> 
                                            </td>

                                        </tr>
                                          </c:forEach>
                                    </tbody>
                                </table>
                            </form>
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
            <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>