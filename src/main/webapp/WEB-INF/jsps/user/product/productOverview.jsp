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
    <div class="top-margin">
        <!-- Nav tabs -->
        <ul class="nav nav-tabs" role="tablist">
            <li role="presentation" class="active"><a href="/user/product/<%= ((ProductVO)request.getAttribute("productInfo")).getProductID() %>/overview" role="tab">产品概览</a></li>
            <li role="presentation"><a href="/user/product/<%= ((ProductVO)request.getAttribute("productInfo")).getProductID() %>/assetPool" role="tab">资产池分析</a></li>
            <li role="presentation"><a href="#"role="tab">相关文档下载</a></li>

            <a class="btn btn-lg btn-green animated bounceIn pull-right" href="/user/placeOrder/<%= ((ProductVO)request.getAttribute("productInfo")).getProductID() %>">
                立即购买
            </a>
        </ul>

    </div>
    <!-- 产品信息 -->
    <div class="panel panel-info top-margin">
        <div class="panel-heading">
            <h3 class="panel-title">产品信息</h3>
        </div>
        <div class="panel-body">
            <blockquote style="margin: 20px;">
                <!-- 发行总额 -->
                <p><%= ((ProductVO)request.getAttribute("productInfo")).getQuantity() %></p>
                <!-- 产品名称 -->
                <footer><%= ((ProductVO)request.getAttribute("productInfo")).getProductName() %></footer>
            </blockquote>

            <!-- 其它信息以标签列表的形式显示 -->
            <div class="row tag-list">
                <div class="col-md-6 tag-item">
                    <span class="glyphicon glyphicon-tag" aria-hidden="true"></span>
                    <span class="tag-title">资产类型：</span>
                    <span class="tag-message"><%= ((ProductVO)request.getAttribute("productInfo")).getAssetType() %></span>
                </div>
                <div class="col-md-6 tag-item">
                    <span class="glyphicon glyphicon-tag" aria-hidden="true"></span>
                    <span class="tag-title">评级结果：</span>
                    <span class="tag-message"><%= ((ProductVO)request.getAttribute("productInfo")).getRatingResult() %></span>
                </div>
                <div class="col-md-6 tag-item">
                    <span class="glyphicon glyphicon-tag" aria-hidden="true"></span>
                    <span class="tag-title">发起机构：</span>
                    <span class="tag-message"><%= ((ProductVO)request.getAttribute("productInfo")).getSponsor() %></span>
                </div>
                <div class="col-md-6 tag-item">
                    <span class="glyphicon glyphicon-tag" aria-hidden="true"></span>
                    <span class="tag-title">发行机构：</span>
                    <span class="tag-message"><%= ((ProductVO)request.getAttribute("productInfo")).getIssuer() %></span>
                </div>
                <div class="col-md-6 tag-item">
                    <span class="glyphicon glyphicon-tag" aria-hidden="true"></span>
                    <span class="tag-title">交易场所：</span>
                    <span class="tag-message"><%= ((ProductVO)request.getAttribute("productInfo")).getTradingPlace() %></span>
                </div>
                <div class="col-md-6 tag-item">
                    <span class="glyphicon glyphicon-tag" aria-hidden="true"></span>
                    <span class="tag-title">资产类型：</span>
                    <span class="tag-message"><%= ((ProductVO)request.getAttribute("productInfo")).getAssetType() %></span>
                </div>
                <div class="col-md-6 tag-item">
                    <span class="glyphicon glyphicon-tag" aria-hidden="true"></span>
                    <span class="tag-title">预计到期日：</span>
                    <span class="tag-message"><%= ((ProductVO)request.getAttribute("productInfo")).getEstimatedMaturityDate().format(FormatUtil.DATE_TIME_FORMATTER) %></span>
                </div>
                <div class="col-md-6 tag-item">
                    <span class="glyphicon glyphicon-tag" aria-hidden="true"></span>
                    <span class="tag-title">募集期限：</span>
                    <span class="tag-message"><%= ((ProductVO)request.getAttribute("productInfo")).getTermOfRecruitment().format(FormatUtil.DATE_TIME_FORMATTER) %></span>
                </div>
            </div>
        </div>
    </div>
    <!-- 资产池信息 -->
    <div class="panel panel-info">
        <div class="panel-heading">
            <h3 class="panel-title">资产池信息</h3>
        </div>
        <div class="panel-body">
            <div class="row" style="margin: 20px;">
                <blockquote class="col-md-6">
                    <!-- 剩余额度 -->
                    <p><%= ((AssetPoolVO) request.getAttribute("assetPool")).getLeftQuantity() %></p>
                    <footer>剩余额度</footer>
                </blockquote>
                <blockquote class="col-md-6">
                    <!-- 发行总额 -->
                    <p><%= ((AssetPoolVO)request.getAttribute("assetPool")).getQuantity() %></p>
                    <footer>发行总额</footer>
                </blockquote>
            </div>

            <!-- 其它信息以标签列表的形式显示 -->
            <div class="row tag-list">
                <div class="col-md-6 tag-item">
                    <span class="glyphicon glyphicon-tag" aria-hidden="true"></span>
                    <span class="tag-title">借款人数量：</span>
                    <span class="tag-message"><%= ((AssetPoolVO)request.getAttribute("assetPool")).getNumOfBorrowers() %></span>
                </div>
                <div class="col-md-6 tag-item">
                    <span class="glyphicon glyphicon-tag" aria-hidden="true"></span>
                    <span class="tag-title">交易场所贷款笔数：</span>
                    <span class="tag-message"><%= ((AssetPoolVO)request.getAttribute("assetPool")).getNumOfLoan() %></span>
                </div>
                <div class="col-md-6 tag-item">
                    <span class="glyphicon glyphicon-tag" aria-hidden="true"></span>
                    <span class="tag-title">单笔贷款最高金额（元）：</span>
                    <span class="tag-message"><%= ((AssetPoolVO)request.getAttribute("assetPool")).getHighestAmount() %></span>
                </div>
                <div class="col-md-6 tag-item">
                    <span class="glyphicon glyphicon-tag" aria-hidden="true"></span>
                    <span class="tag-title">单笔贷款平均金额（元）：</span>
                    <span class="tag-message"><%= ((AssetPoolVO)request.getAttribute("assetPool")).getAveAmount() %></span>
                </div>
                <div class="col-md-6 tag-item">
                    <span class="glyphicon glyphicon-tag" aria-hidden="true"></span>
                    <span class="tag-title">单笔贷款最高利率：</span>
                    <span class="tag-message"><%= ((AssetPoolVO)request.getAttribute("assetPool")).getHighestRate()*100 %>% </span>
                </div>
                <div class="col-md-6 tag-item">
                    <span class="glyphicon glyphicon-tag" aria-hidden="true"></span>
                    <span class="tag-title">加权平均贷款利率：</span>
                    <span class="tag-message"><%= ((AssetPoolVO)request.getAttribute("assetPool")).getAveRate()*100 %>% </span>
                </div>
                <div class="col-md-6 tag-item">
                    <span class="glyphicon glyphicon-tag" aria-hidden="true"></span>
                    <span class="tag-title">单笔贷款最长剩余期限（月）：</span>
                    <span class="tag-message"><%= ((AssetPoolVO)request.getAttribute("assetPool")).getHighestLeftMonth() %></span>
                </div>
                <div class="col-md-6 tag-item">
                    <span class="glyphicon glyphicon-tag" aria-hidden="true"></span>
                    <span class="tag-title">加权平均贷款合同期限（月）：</span>
                    <span class="tag-message"><%= ((AssetPoolVO)request.getAttribute("assetPool")).getAveMonth() %></span>
                </div>
                <div class="col-md-6 tag-item">
                    <span class="glyphicon glyphicon-tag" aria-hidden="true"></span>
                    <span class="tag-title">加权平均最长剩余期限（月）：</span>
                    <span class="tag-message"><%= ((AssetPoolVO)request.getAttribute("assetPool")).getAveLeftMonth() %></span>
                </div>
            </div>
        </div>
    </div>
    <!-- 证券信息 -->
    <div class="panel panel-info">
        <div class="panel-heading">
            <h3 class="panel-title">证券信息</h3>
        </div>
        <div class="table-responsive">
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
</div>

<%@ include file="/WEB-INF/jsps/components/message.jsp" %>
</body>
<script type="text/javascript">
    $("#mainnav a:contains('在售商品')").attr("id","current");
</script>
</html>
