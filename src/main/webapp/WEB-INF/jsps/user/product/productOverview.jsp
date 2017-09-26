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
    <!-- 产品信息 -->
    <div>
        <h1>产品信息</h1>
        <!-- 发行总额 -->
        <p><%= ((ProductVO)request.getAttribute("productInfo")).getQuantity() %></p>
        <!-- 产品名称 -->
        <p><%= ((ProductVO)request.getAttribute("productInfo")).getProductName() %></p>

        <p>资产类型：<%= ((ProductVO)request.getAttribute("productInfo")).getAssetType() %></p>
        <p>评级结果：<%= ((ProductVO)request.getAttribute("productInfo")).getRatingResult() %></p>
        <p>发起机构：<%= ((ProductVO)request.getAttribute("productInfo")).getSponsor() %></p>
        <p>发行机构：<%= ((ProductVO)request.getAttribute("productInfo")).getIssuer() %></p>
        <p>交易场所：<%= ((ProductVO)request.getAttribute("productInfo")).getTradingPlace() %></p>
        <p>资产类型：<%= ((ProductVO)request.getAttribute("productInfo")).getAssetType() %></p>
        <p>预计到期日：<%= ((ProductVO)request.getAttribute("productInfo")).getEstimatedMaturityDate() %></p>
        <p>募集期限：<%= ((ProductVO)request.getAttribute("productInfo")).getTermOfRecruitment() %></p>
    </div>
    <!-- 资产池信息 -->
    <div>
        <h1>资产池信息</h1>

    </div>
</div>

<%@ include file="/WEB-INF/jsps/components/message.jsp" %>
</body>
<script type="text/javascript">
    $("#mainnav a:contains('在售商品')").attr("id","current");
</script>
</html>
