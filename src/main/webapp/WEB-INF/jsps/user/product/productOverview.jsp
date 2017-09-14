<%@ page import="java.util.List" %>
<%@ page import="vo.ProductVO" %><%--
  Created by IntelliJ IDEA.
  User: zjy
  Date: 2017/9/14
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>

<%@ include file="/WEB-INF/jsps/components/head.jsp" %>

<head>
    <title>产品概览</title>
</head>
<body>
<%@ include file="/WEB-INF/jsps/components/top_components.jsp" %>

<div class="container">
    <p>
            <%= ((ProductVO)request.getAttribute("productInfo")).getProductName() %>
    </p>
</div>

<%@ include file="/WEB-INF/jsps/components/message.jsp" %>
</body>
<script type="text/javascript">
    $("#mainnav a:contains('在售商品')").attr("id","current");
</script>
</html>
