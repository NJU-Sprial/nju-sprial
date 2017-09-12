<%--
  Created by IntelliJ IDEA.
  User: xiaoJun
  Date: 2017/9/12
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!--[if IE 8 ]><html class="ie" xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"><!--<![endif]-->

<%@ include file="/WEB-INF/jsps/components/head.jsp" %>

<head>
    <link rel="stylesheet" type="text/css" href="../../css/demo.css">

    <link rel="stylesheet" type="text/css" href="../../css/assetpackage.css">
</head>
<body>
<%@ include file="/WEB-INF/jsps/components/top_components.jsp" %>
<div class="boxed blog">

    <section class="flat-row pd-contact-v1">
        <div class="container">
            <div class="row">
                <div class="input-holder">
                    <input type="text" id="projectSearchInput" placeholder="搜索">
                    <button class="search-button"><i class="fa fa-search" id="search-icon" aria-hidden="true"></i></button>
                </div>
                <div>
                    <table class="table">
                        <thead>
                        <tr>
                            <th>项目名称</th>
                            <th>资产包编号</th>
                            <th>资产数量</th>
                            <th>封包日期</th>
                            <th>资产包封包本金金额</th>
                            <th>封包利率</th>
                            <th>用户操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>项目1</td>
                            <td>0001</td>
                            <td>5</td>
                            <td>2017-9-6</td>
                            <td>10000</td>
                            <td>5.5</td>
                            <td><span>
											<button class="packageInfoButton">详情</button>
											<button class="packageInfoButton">修改</button>
											<button class="packageDeleteButton">删除</button>
										</span></td>
                        </tr>
                        <tr>
                            <td>项目2</td>
                            <td>0002</td>
                            <td>5</td>
                            <td>2017-9-6</td>
                            <td>10000</td>
                            <td>5.5</td>
                            <td><span>
											<button class="packageInfoButton">详情</button>
											<button class="packageInfoButton">修改</button>
											<button class="packageDeleteButton">删除</button>
										</span></td>
                        </tr>
                        <tr>
                            <td>项目3</td>
                            <td>0003</td>
                            <td>5</td>
                            <td>2017-9-6</td>
                            <td>10000</td>
                            <td>5.5</td>
                            <td><span>
											<button class="packageInfoButton">详情</button>
											<button class="packageInfoButton">修改</button>
											<button class="packageDeleteButton">删除</button>
										</span></td>
                        </tr>
                        </tbody>
                    </table>
                </div>





            </div><!-- /.row -->
        </div><!-- /.container -->
    </section><!-- /.flat-row-iconbox -->

    <%@ include file="/WEB-INF/jsps/components/message.jsp" %>

</div> <!-- /.boxed -->

<!-- Javascript -->
<script type="text/javascript" src="../../js/main.js"></script>
<script type="text/javascript" src="../../js/jquery.easydropdown.min.js"></script>
<script type="text/javascript" src="../../js/echarts.min.js"></script>
<script type="text/javascript" src="../../charts/packageAnalysisPieChart.js"></script>
<script type="text/javascript" src="../../js/assetpackage.js"></script>
<script type="text/javascript" src="../../js/packageAnalysis.js"></script>
</body>
</html>
