<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<%@ include file="/WEB-INF/jsps/components/head.jsp" %>

<head>
<title>募集期管理平台</title>
</head>
<body>
<div class="container">
	<table class="table table-bordered table-text-center" style="font-size: 10px;">
		<thead>
		<tr>
			<th>序号</th>
			<th>产品名称</th>
			<th>产品信息</th>
			<th>募集情况</th>
		</tr>
		</thead>
		<tbody>

		<%! int index = 0; %>
		<c:forEach var="productVO" items="${productList}">
			<tr>
				<th scope="row"><%= ++index %></th>
				<td>${productVO.getProductName()}</td>
				<td>
					<!-- 产品信息的显示 -->
					<table class="table table-text-center">
						<thead>
						<tr>
							<th>发行总额</th>
							<th>利率区间</th>
							<th>评级结果</th>
							<th>发起机构</th>
							<th>发行机构</th>
							<th>资产类型</th>
							<th>交易场所</th>
							<th>预计到期日</th>
							<th>募集期限</th>
						</tr>
						</thead>
						<tbody>
						<tr>
							<td>${productVO.getQuantity()}</td>
							<td>${productVO.getInterestLowerBound()*100}%-${productVO.getInterestUpperBound()*100}%</td>
							<td>${productVO.getRatingResult()}</td>
							<td>${productVO.getSponsor()}</td>
							<td>${productVO.getIssuer()}</td>
							<td>${productVO.getAssetType()}</td>
							<td>${productVO.getTradingPlace()}</td>
							<td>${productVO.getEstimatedMaturityDate()}</td>
							<td>${productVO.getTermOfRecruitment()}</td>
						</tr>
						</tbody>
					</table>
					<!-- 产品信息的显示结束 -->
				</td>
				<td>
					<!-- 募集情况的显示 -->
					<table class="table table-text-center">
						<thead>
						<tr>
							<th>投资者</th>
							<th>投资金额</th>
							<th>投资利率</th>
						</tr>
						</thead>
						<tbody>

						<c:forEach var="recruitmentSituation" items="${sponsorList.get(index)}">
							<tr>
								<td>${recruitmentSituation.investor}</td>
								<td>${recruitmentSituation.amount}</td>
								<td>${recruitmentSituation.rate}</td>
							</tr>
						</c:forEach>

						</tbody>
					</table>
					<!-- 募集情况的显示结束 -->
				</td>
			</tr>
		</c:forEach>

		</tbody>
	</table>
</div>
</body>
</html>