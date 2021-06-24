<%-- 
    Document   : signup2
    Created on : Jun 2, 2021, 12:55:31 PM
    Author     : msi-pc
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
                <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"
              integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            header{
                font-size: 50px;
                font-weight: bold;
                color: green;
            }
        </style>
    </head>
    <body>
        <header> Đăng ký </header>
         <div class="row">
                        <c:forEach items="${list}" var="o">
                            <div class="col-12 col-md-6 col-lg-4">
                                <div class="card">
                                    <img class="card-img-top" src="${o.image}" alt="Card image cap">
                                    <div class="card-body">
                                        <h4 class="card-title show_txt"><a href="detail?pid=${o.foodID}" title="View Product">${o.foodName}</a></h4>
                                        <p class="card-text show_txt"></p>
                                        <div class="row">
                                            <div class="col">
                                                <p class="btn btn-danger btn-block">${o.foodPrice} $</p>
                                            </div>
                                            
                                            <c:if test="${sessionScope.acc != null}"> 
                                            <div class="col">
                                                <a href="cart?id=" class="btn btn-success btn-block">Add to cart</a>
                                                
                                            </div>
                                            </c:if>
                                            
                                            <c:if test="${sessionScope.acc == null}"> 
                                            <div class="col">
                                                <a href="Login.jsp" class="btn btn-success btn-block">Add to cart</a>
                                                
                                            </div>
                                            </c:if>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>

        </form>
    </body>
</html>
