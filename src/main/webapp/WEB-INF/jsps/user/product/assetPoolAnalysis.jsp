<%--
  Created by IntelliJ IDEA.
  User: 铠联
  Date: 2017/9/28
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!--[if IE 8 ]><html class="ie" xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"><!--<![endif]-->

<%@ include file="/WEB-INF/jsps/components/head.jsp" %>

<head>
    <link rel="stylesheet" type="text/css" href="/css/demo.css">

    <link rel="stylesheet" type="text/css" href="/css/assetpackage.css">
</head>
<body>
<%@ include file="/WEB-INF/jsps/components/top_components.jsp" %>
<div class="boxed blog">

    <section class="flat-row pd-contact-v1">
        <div class="container">
            <div class="row">
                <div class="col-md-1"></div>
                <div class="col-md-8">
                    <form class="form-horizontal formFont" role="form">
                        <div class="form-group">
                            <label class="control-label col-sm-5" for="projectName">项目名称：</label>
                            <div class="col-sm-7">
                                <select class="dropdown" tabindex="9" data-settings='{"wrapperClass":"flat"}' id="projectName">
                                    <option value="1">项目1</option>
                                    <option value="2">项目2</option>
                                    <option value="3">项目3</option>
                                    <option value="4">项目4</option>
                                    <option value="5">项目5</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-5" for="analysisButton"></label>
                            <div class="col-sm-7">
                                <input class="form-control" id="analysisButton" type="submit" value="统计分析">
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-md-3"></div>
            </div><!-- /.row -->
            <div class="row">
                <div class="col-md-1"></div>
                <div class="col-md-10">
                    <div id="assetsCount">
                        <!--贷款剩余期限分析start-->
                        <div style="margin-bottom: 50px">
                            <div class="row">
                                <div><p class="headLabel">贷款剩余期限分析</p></div>
                                <div>
                                    <div class="col-md-7" style="padding-right: 30px">
                                        <table class="table table-bordered table-striped">
                                            <thead>
                                            <tr>
                                                <th>贷款剩余期限(年)</th>
                                                <th>总额(万元)</th>
                                                <th>金额占比(%)</th>
                                                <th>资产个数(个)</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <tr>
                                                <td>0-0.5(含)</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>0.5-1.0(含)</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>1.0-2.0(含)</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>2.0-3.0(含)</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>3.0-4.0(含)</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>4.0-5.0(含)</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>>5.0</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                    <div class="col-md-5" style="vertical-align: middle">
                                        <div id="remainPieContainer" style="height: 350px"></div>
                                    </div>
                                </div>
                            </div>

                        </div>
                        <!--贷款剩余期限分析end-->

                        <!--贷款合同期限分布start-->
                        <div style="margin-bottom: 50px">
                            <div class="row">
                                <div><p class="headLabel">贷款合同期限分布</p></div>
                                <div>
                                    <div class="col-md-7" style="padding-right: 30px">
                                        <table class="table table-bordered table-striped">
                                            <thead>
                                            <tr>
                                                <th>贷款原始合同期限(年)</th>
                                                <th>总额(万元)</th>
                                                <th>金额占比(%)</th>
                                                <th>资产个数(个)</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <tr>
                                                <td>0-3</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>3-5</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>5-10</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>>10</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                    <div class="col-md-5" style="vertical-align: middle">
                                        <div id="contractPieContainer" style="height: 350px"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--贷款合同期限分布end-->

                        <!--贷款利率分布start-->
                        <div style="margin-bottom: 50px">
                            <div class="row">
                                <div><p class="headLabel">贷款利率分布</p></div>
                                <div>
                                    <div class="col-md-7" style="padding-right: 30px">
                                        <table class="table table-bordered table-striped">
                                            <thead>
                                            <tr>
                                                <th>贷款原始利率(年)</th>
                                                <th>总额(万元)</th>
                                                <th>金额占比(%)</th>
                                                <th>资产个数(个)</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <tr>
                                                <td>4-4.5</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>4.5-5</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>5-5.5</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>5.5-6</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>6-6.5</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>6.5-7</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                    <div class="col-md-5" style="vertical-align: middle">
                                        <div id="ratePieContainer" style="height: 350px"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--贷款利率分布end-->

                        <!--入池资产地域分布start-->
                        <div style="margin-bottom: 50px">
                            <div class="row">
                                <div><p class="headLabel">入池资产地域分布</p></div>
                                <div>
                                    <div class="col-md-7" style="padding-right: 30px">
                                        <table class="table table-bordered table-striped">
                                            <thead>
                                            <tr>
                                                <th>地区</th>
                                                <th>总额(万元)</th>
                                                <th>金额占比(%)</th>
                                                <th>资产个数(个)</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <tr>
                                                <td>河南省</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>辽宁省</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>湖北省</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>江苏省</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>安徽省</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>山东省</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>广东省</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>湖南省</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>其他</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                    <div class="col-md-5" style="vertical-align: middle">
                                        <div id="regionPieContainer" style="height: 350px"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--入池资产地域分布end-->

                        <!--入池资产行业分布start-->
                        <div style="margin-bottom: 50px">
                            <div class="row">
                                <div><p class="headLabel">入池资产行业分布</p></div>
                                <div>
                                    <div class="col-md-7" style="padding-right: 30px">
                                        <table class="table table-bordered table-striped">
                                            <thead>
                                            <tr>
                                                <th>行业</th>
                                                <th>总额(万元)</th>
                                                <th>金额占比(%)</th>
                                                <th>资产个数(个)</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <tr>
                                                <td>电力、热力生产和供应业</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>煤炭开采和洗选业</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>黑色金属冶炼和压延加工业</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>道路运输业</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>铁路运输业</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>化学原料和化学制品制造业</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>石油加工、炼焦和核燃料加工业</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>食品制造业</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>房屋建筑业</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>其他</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                    <div class="col-md-5" style="vertical-align: middle">
                                        <div id="industryPieContainer" style="height: 500px"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--入池资产行业分布end-->

                        <!--贷款规模分布start-->
                        <div style="margin-bottom: 50px">
                            <div class="row">
                                <div><p class="headLabel">贷款规模分布</p></div>
                                <div>
                                    <div class="col-md-7" style="padding-right: 30px">
                                        <table class="table table-bordered table-striped">
                                            <thead>
                                            <tr>
                                                <th>贷款规模(亿元)</th>
                                                <th>总额(万元)</th>
                                                <th>金额占比(%)</th>
                                                <th>资产个数(个)</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <tr>
                                                <td><0.5(含)</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>0.5-1(含)</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>1-2(含)</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>2-3(含)</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>3-5(含)</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>>5</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                    <div class="col-md-5" style="vertical-align: middle">
                                        <div id="scalePieContainer" style="height: 350px"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--贷款规模分布end-->

                        <!--贷款账龄分布start-->
                        <div style="margin-bottom: 50px">
                            <div class="row">
                                <div><p class="headLabel">贷款账龄分布</p></div>
                                <div>
                                    <div class="col-md-7" style="padding-right: 30px">
                                        <table class="table table-bordered table-striped">
                                            <thead>
                                            <tr>
                                                <th>账龄</th>
                                                <th>总额(万元)</th>
                                                <th>金额占比(%)</th>
                                                <th>资产个数(个)</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <tr>
                                                <td>0-0.5(含)</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>0.5-1.0(含)</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>1.0-2.0(含)</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>2.0-3.0(含)</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>3.0-5.0(含)</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>5.0-1.0(含)</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            <tr>
                                                <td>>10.0</td>
                                                <td>1.1</td>
                                                <td>18.1</td>
                                                <td>6</td>
                                            </tr>
                                            </tbody>
                                        </table>
                                    </div>
                                    <div class="col-md-5" style="vertical-align: middle">
                                        <div id="agePieContainer" style="height: 350px"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--贷款账龄分布end-->
                    </div>
                </div>

            </div>
        </div><!-- /.container -->
    </section><!-- /.flat-row-iconbox -->

    <%@ include file="/WEB-INF/jsps/components/message.jsp" %>

</div> <!-- /.boxed -->

<!-- Javascript -->
<script type="text/javascript" src="/js/jquery.easydropdown.min.js"></script>
<script type="text/javascript" src="/js/echarts.min.js"></script>
<script type="text/javascript" src="/js/charts/packageAnalysisPieChart.js"></script>
<script type="text/javascript" src="/js/assetPoolAnalysis.js"></script>
<script type="text/javascript" src="/js/ItemSelect.js"></script>
</body>
</html>

