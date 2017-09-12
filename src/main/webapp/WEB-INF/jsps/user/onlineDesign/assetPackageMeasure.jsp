<%--
  Created by IntelliJ IDEA.
  User: xiaoJun
  Date: 2017/9/12
  Time: 11:56
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
                <div class="col-sm-1"></div>
                <div class="col-md-10">
                    <form class="form-horizontal formFont" role="form">
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="projectName">项目名称：</label>
                            <div class="col-sm-4">
                                <select class="dropdown" tabindex="9" data-settings='{"wrapperClass":"flat"}' id="projectName">
                                    <option value="1">项目1</option>
                                    <option value="2">项目2</option>
                                    <option value="3">项目3</option>
                                    <option value="4">项目4</option>
                                    <option value="5">项目5</option>
                                </select>
                            </div>
                            <label class="control-label col-sm-2" for="packageId">资产包编号：</label>
                            <div class="col-sm-4">
                                <select class="dropdown" tabindex="9" data-settings='{"wrapperClass":"flat"}' id="packageId">
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="3">3</option>
                                    <option value="4">4</option>
                                    <option value="5">5</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2" for="packageCycle">统计周期：</label>
                            <div class="col-sm-4">
                                <select class="dropdown" tabindex="9" data-settings='{"wrapperClass":"flat"}' id="packageCycle">
                                    <option value="1">月</option>
                                    <option value="2">季</option>
                                    <option value="3">年</option>
                                </select>
                            </div>
                            <label class="control-label col-sm-2" for="repayDate">每期偿付日：</label>
                            <div class="col-sm-4">
                                <input type="date" id="repayDate">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="control-label col-sm-2" for="moneyUnit">金额单位：</label>
                            <div class="col-sm-4">
                                <select class="dropdown" tabindex="9" data-settings='{"wrapperClass":"flat"}' id="moneyUnit">
                                    <option value="1">元</option>
                                    <option value="2">万元</option>
                                    <option value="3">亿元</option>
                                </select>
                            </div>
                            <label class="control-label col-sm-2" for="analysisButton"></label>
                            <div class="col-sm-4">
                                <input class="form-control" id="analysisButton" type="submit" value="查询">
                            </div>
                        </div>
                    </form>
                    <div class="greenBottomBorder">
                        <button class="cashButton cashClickButton" id="cashSummaryButton">现金流汇总</button>
                        <button class="cashButton" id="cashDetailButton">各期现金流明细</button>
                    </div>
                    <div id="cashSummary">
                        <table class="table">
                            <thead>
                            <tr>
                                <th>资产包性质</th>
                                <th>封包日期</th>
                                <th>资产数量(笔)</th>
                                <th>加权平均利率</th>
                                <th>加权剩余期限(月)</th>
                                <th>现金流入总额(元)</th>
                                <th>利息总额(元)</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>暂定</td>
                                <td>2017-9-7</td>
                                <td>49</td>
                                <td>10.19%</td>
                                <td>5.77</td>
                                <td>12,392,945,05</td>
                                <td>360,237,55</td>
                            </tr>
                            </tbody>
                        </table>

                        <!--现金流入金额折线图容器-->
                        <div id="cashSummaryChartContainer" style="height: 400px"></div>
                    </div>
                    <div id="cashDetail" class="displayNone">
                        <table class="table">
                            <thead>
                            <tr>
                                <th>期数</th>
                                <th>日期</th>
                                <th>现金流入金额(元)</th>
                                <th>本金(元)</th>
                                <th>本金占比</th>
                                <th>利息(元)</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>1</td>
                                <td>2017-9-7</td>
                                <td>2,065,490,81</td>
                                <td>1,963,298,99</td>
                                <td>95.05%</td>
                                <td>102,191,84</td>
                            </tr>
                            <tr>
                                <td>2</td>
                                <td>2017-9-8</td>
                                <td>2,065,490,81</td>
                                <td>1,963,298,99</td>
                                <td>95.05%</td>
                                <td>102,191,84</td>
                            </tr>
                            <tr>
                                <td>3</td>
                                <td>2017-9-9</td>
                                <td>2,065,490,81</td>
                                <td>1,963,298,99</td>
                                <td>95.05%</td>
                                <td>102,191,84</td>
                            </tr>
                            <tr>
                                <td>4</td>
                                <td>2017-9-9</td>
                                <td>2,065,490,81</td>
                                <td>1,963,298,99</td>
                                <td>95.05%</td>
                                <td>102,191,84</td>
                            </tr>
                            <tr>
                                <td>5</td>
                                <td>2017-9-9</td>
                                <td>2,065,490,81</td>
                                <td>1,963,298,99</td>
                                <td>95.05%</td>
                                <td>102,191,84</td>
                            </tr>
                            <tr>
                                <td>6</td>
                                <td>2017-9-9</td>
                                <td>2,065,490,81</td>
                                <td>1,963,298,99</td>
                                <td>95.05%</td>
                                <td>102,191,84</td>
                            </tr>
                            <tr>
                                <td>7</td>
                                <td>2017-9-9</td>
                                <td>2,065,490,81</td>
                                <td>1,963,298,99</td>
                                <td>95.05%</td>
                                <td>102,191,84</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div class="col-sm-1"></div>
                <!--<div class="col-md-2"></div>-->
            </div><!-- /.row -->

        </div><!-- /.container -->
    </section><!-- /.flat-row-iconbox -->

    <%@ include file="/WEB-INF/jsps/components/message.jsp" %>

</div> <!-- /.boxed -->

<!-- Javascript -->
<script type="text/javascript" src="../../js/main.js"></script>
<script type="text/javascript" src="../../js/jquery.easydropdown.min.js"></script>
<script type="text/javascript" src="../../js/echarts.min.js"></script>
<script type="text/javascript" src="../../charts/cashSummaryLineChart.js"></script>
<script type="text/javascript" src="../../js/assetpackage.js"></script>
</body>
</html>
