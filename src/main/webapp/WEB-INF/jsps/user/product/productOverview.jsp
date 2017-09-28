<%@ page import="java.util.List" %>
<%@ page import="vo.ProductVO" %>
<%@ page import="vo.AssetPoolVO" %>
<%@ page import="vo.ProductStrategyVO" %>
<%@ page import="util.FormatUtil" %><%--
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
        <p>预计到期日：<%= ((ProductVO)request.getAttribute("productInfo")).getEstimatedMaturityDate().format(FormatUtil.DATE_TIME_FORMATTER) %></p>
        <p>募集期限：<%= ((ProductVO)request.getAttribute("productInfo")).getTermOfRecruitment().format(FormatUtil.DATE_TIME_FORMATTER) %></p>
    </div>
    <!-- 资产池信息 -->
    <div>
        <h1>资产池信息</h1>
        <!-- 剩余额度 -->
        <p><%= ((AssetPoolVO) request.getAttribute("assetPool")).getLeftQuantity() %></p>
        <p>剩余额度</p>
        <!-- 发行总额 -->
        <p><%= ((AssetPoolVO)request.getAttribute("assetPool")).getQuantity() %></p>
        <p>发行总额</p>

        <p>借款人数量：<%= ((AssetPoolVO)request.getAttribute("assetPool")).getNumOfBorrowers() %></p>
        <p>交易场所贷款笔数：<%= ((AssetPoolVO)request.getAttribute("assetPool")).getNumOfLoan() %></p>
        <p>单笔贷款最高金额（元）：<%= ((AssetPoolVO)request.getAttribute("assetPool")).getHighestAmount() %></p>
        <p>单笔贷款平均金额（元）：<%= ((AssetPoolVO)request.getAttribute("assetPool")).getAveAmount() %></p>
        <p>单笔贷款最高利率：<%= ((AssetPoolVO)request.getAttribute("assetPool")).getHighestRate()*100 %>% </p>
        <p>加权平均贷款利率：<%= ((AssetPoolVO)request.getAttribute("assetPool")).getAveRate()*100 %>% </p>
        <p>单笔贷款最长剩余期限（月）：<%= ((AssetPoolVO)request.getAttribute("assetPool")).getHighestLeftMonth() %></p>
        <p>加权平均贷款合同期限（月）：<%= ((AssetPoolVO)request.getAttribute("assetPool")).getAveMonth() %></p>
        <p>加权平均最长剩余期限（月）：<%= ((AssetPoolVO)request.getAttribute("assetPool")).getAveLeftMonth() %></p>
    </div>
    <!-- 证券信息 -->
    <div>
        <h1>证券信息</h1>
        <table class="table table-text-center">
            <thead>
            <tr>
                <th>证券简称</th>
                <th>证券类型</th>
                <th>发行金额（元）</th>
                <th>发行金额占比</th>
                <th>利率</th>
                <th>付息频率</th>
                <th>优先级</th>
            </tr>
            </thead>
            <tbody>

            <% for(ProductStrategyVO productStrategyVO:(List<ProductStrategyVO>)request.getAttribute("securityList")){ %>
            <tr>
                <td><%= productStrategyVO.getBondNameForShort() %></td>
                <td><%= productStrategyVO.getBondType() %></td>
                <td><%= productStrategyVO.getReleaseMoney() %></td>
                <td><%= productStrategyVO.getReleaseMoneyPercentage() %>% </td>
                <td><%= productStrategyVO.getEstimatedInterestRate() %>% </td>
                <td><%= productStrategyVO.getInterestPayFrequency() %></td>
                <td><%= productStrategyVO.getPriority() %></td>
            </tr>
            <% } %>

            </tbody>
        </table>
    </div>
</div>

<%@ include file="/WEB-INF/jsps/components/message.jsp" %>
</body>
<script type="text/javascript">
    $("#mainnav a:contains('在售商品')").attr("id","current");
</script>
</html>
