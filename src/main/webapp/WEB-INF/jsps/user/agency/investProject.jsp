<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2017/9/15
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!--[if IE 8 ]><html class="ie" xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"><!--<![endif]-->

<%@ include file="/WEB-INF/jsps/components/head.jsp" %>

<html>
<head>
    <title>已投资项目</title>
    <link rel="stylesheet" type="text/css" href="/css/assetpackage.css">
</head>
<body>
<div class="boxed blog">

    <section class="flat-row pd-contact-v1">
        <div class="container">
            <div class="row">
                <div class="col-md-1">

                </div> <!-- /.col-md-1 -->

                <div class="col-md-10">
                    <table class="table table-hover">
                        <thead>
                        <tr>
                            <th>订单号</th>
                            <th>产品编号</th>
                            <th>产品名称</th>
                            <th>投资利率</th>
                            <th>投资金额</th>
                            <th>收入预算</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>0001</td>
                            <td>0001</td>
                            <td>产品1</td>
                            <td>5.0%</td>
                            <td>10000</td>
                            <td>1000</td>
                        </tr>
                        <tr>
                            <td>0002</td>
                            <td>0002</td>
                            <td>产品2</td>
                            <td>5.0%</td>
                            <td>10000</td>
                            <td>1000</td>
                        </tr>
                        </tbody>
                    </table>
                </div> <!-- /.col-md-10 -->

                <div class="col-md-1">

                </div>
            </div><!-- /.row -->
        </div><!-- /.container -->
    </section><!-- /.flat-row-iconbox -->

    <%@ include file="/WEB-INF/jsps/components/message.jsp" %>

</div> <!-- /.boxed -->
</body>
</html>
