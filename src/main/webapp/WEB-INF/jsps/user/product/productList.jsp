<%@ page import="vo.ProductVO" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: zjy
  Date: 2017/9/13
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>

<%@ include file="/WEB-INF/jsps/components/head.jsp" %>

<head>
    <title>在售产品</title>
</head>
<body>
<%@ include file="/WEB-INF/jsps/components/top_components.jsp" %>

<div class="container">
    <div class="top-margin ">
        <% for(ProductVO productVO:(List<ProductVO>) request.getAttribute("productList")){ %>
        <a style="padding-left: 45px;" href="/user/product/<%=productVO.getProductID()%>/overview"><%=productVO.getProductName()%></a>
        <% } %>
    </div>
</div>

<%@ include file="/WEB-INF/jsps/components/message.jsp" %>
</body>
<script type="text/javascript">
    $("#mainnav a:contains('在售商品')").attr("id","current");
</script>
</html>
