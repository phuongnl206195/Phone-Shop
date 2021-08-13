<%-- 
    Document   : header
    Created on : Feb 21, 2021, 3:28:17 PM
    Author     : Phuong Nguyen
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

    
    <div class="site-branding-area">
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    <div class="logo">
                        <h1><a href="LoadDB"><img src="img/logo.PNG" alt="Logo" style="width: 100px; height: 100px"></a></h1>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End site branding area -->
    
    <div class="mainmenu-area">
        <div class="container">
            <div class="row">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div> 
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="LoadDB">Home</a></li>
                        <li><a href="ListPhone">All phone</a></li>
                        <li><a href="PhoneDetail">Phone Detail</a></li>
                        
                        <c:if test="${sessionScope.acc == null}">
                            <li><a href="login.jsp"> Login</a></li>
                        </c:if>
                         <c:if test="${sessionScope.acc != null}">
                            <li><a href="print">Cart</a></li>
                            <li><a href="Logout"> Logout</a></li>
                            <li><a href="LoadProfile?acc_ID=${sessionScope.acc.acc_ID}">Profile</a></li>
                        </c:if>
                        
                         <c:if test="${sessionScope.acc.permission == 1}">
                        <li><a href="PhoneManage">Phone Manage</a></li>
                         </c:if>
                        
                    </ul>
                </div>  
            </div>
        </div>
    </div> <!-- End mainmenu area -->
