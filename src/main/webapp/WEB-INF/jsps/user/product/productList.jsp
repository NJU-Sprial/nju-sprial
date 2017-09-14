<%@ page import="vo.ProductVO" %>
<%@ page import="java.util.List" %>
<%@ page import="java.time.format.DateTimeFormatter" %><%--
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
        <div>
            <div>
                <p><%=productVO.getQuantity()%></p>
                <p>发行总额</p>
            </div>
            <div>
                <span>利率区间</span>
                <span><%=productVO.getInterestLowerBound()*100%>%-<%=productVO.getInterestUpperBound()*100%></span>
            </div>
            <div>
                <!-- 用户输入套件，用dl包起来，实现纵向对齐 -->
                <dl class="dl-horizontal">
                    <div class="form-group">
                        <dt>评级结果：</dt>
                        <dd>
                            <span><%=productVO.getRatingResult()%></span>
                        </dd>
                    </div>
                    <div class="form-group">
                        <dt>发起机构：</dt>
                        <dd>
                            <span><%=productVO.getSponsor()%></span>
                        </dd>
                    </div>
                    <div class="form-group">
                        <dt>发行机构：</dt>
                        <dd>
                            <span><%=productVO.getIssuer()%></span>
                        </dd>
                    </div>
                    <div class="form-group">
                        <dt>资产类型：</dt>
                        <dd>
                            <span><%=productVO.getAssetType()%></span>
                        </dd>
                    </div>
                    <div class="form-group">
                        <dt>交易场所：</dt>
                        <dd>
                            <span><%=productVO.getTradingPlace()%></span>
                        </dd>
                    </div>
                    <div class="form-group">
                        <dt>预计到期日：</dt>
                        <dd>
                            <span><%=productVO.getEstimatedMaturityDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))%></span>
                        </dd>
                    </div>
                    <div class="form-group">
                        <dt>募集期限：</dt>
                        <dd>
                            <span><%=productVO.getTermOfRecruitment().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))%></span>
                        </dd>
                    </div>
                </dl>
            </div>
        </div>
        <% } %>
    </div>
</div>

<%@ include file="/WEB-INF/jsps/components/message.jsp" %>
</body>
<script type="text/javascript">
    $("#mainnav a:contains('在售商品')").attr("id","current");
</script>
</html>
