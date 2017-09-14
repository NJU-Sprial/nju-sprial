<%--
  Created by IntelliJ IDEA.
  User: xiaoJun
  Date: 2017/9/12
  Time: 11:27
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
                            <label class="control-label col-sm-5" for="packageId">资产包编号：</label>
                            <div class="col-sm-7">
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
                    <div class="greenBottomBorder">
                        <button class="cashButton cashClickButton" id="assetsBasicsButton">资产基本情况</button>
                        <button class="cashButton" id="assetsCountButton">资产统计分析</button>
                    </div>
                    <div id="assetsBasics">

                        <!--个人消费信贷、信用卡分期付款、国家助学贷款表格start-->
                        <div style="margin-bottom: 50px">
                            <div><p class="basicHeadLabel">个人消费信贷、信用卡分期付款、国家助学贷款</p></div>
                            <div class="row">
                                <div class="col-md-6" style="padding-left: 50px">
                                    <table class="table table-bordered table-condensed" style="padding: 0px;margin: 0px">
                                        <tbody>
                                        <tr>
                                            <td colspan="2" class="subLabel">入池资产基本情况</td>
                                        </tr>
                                        <tr>
                                            <td>资产池未偿本金金额(万元)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>证券发行总金额(万元)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>合同总金额(元)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>借款人数量(户)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>贷款笔数(笔)</td>
                                            <td>1,203,27</td>
                                        </tr>

                                        <tr>
                                            <td>单笔贷款最高本金余额(万元)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>单笔贷款平均本金余额(万元)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>借款人贷款平均本金金额(万元)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>单笔贷款最高合同总额(万元)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>单笔贷款平均合同金额(万元)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td colspan="2" class="subLabel">入池资产期限特征</td>
                                        </tbody>
                                        <tr>
                                            <td>加权平均贷款合同期限(年)</td>
                                            <td>6.00</td>
                                        </tr>
                                        <tr>
                                            <td>加权平均贷款剩余期限(年)</td>
                                            <td>6.00</td>
                                        </tr>
                                        <tr>
                                            <td>加权平均贷款账龄(年)</td>
                                            <td>6.00</td>
                                        </tr>
                                        <tr>
                                            <td>单笔贷款最长剩余期限(年)</td>
                                            <td>6.00</td>
                                        </tr>
                                        <tr>
                                            <td>单笔贷款最短剩余期限(年)</td>
                                            <td>6.00</td>
                                        </tr>
                                    </table>
                                </div>
                                <div class="col-md-6" style="padding-right: 50px">
                                    <table class="table table-bordered table-condensed" style="padding: 0px;margin: 0px">
                                        <tbody>
                                        <tr>
                                            <td colspan="2" class="subLabel">入池资产信用状况</td>
                                        </tr>
                                        <tr>
                                            <td>正常类贷款占比(%)</td>
                                            <td>18.0</td>
                                        </tr>
                                        <tr>
                                            <td colspan="2" class="subLabel">入池资产利率特征</td>
                                        </tr>
                                        <tr>
                                            <td>加权平均贷款年利率(%)</td>
                                            <td>18.0</td>
                                        </tr>
                                        <tr>
                                            <td>单笔贷款最高年利率(%)</td>
                                            <td>18.0</td>
                                        </tr>
                                        <tr>
                                            <td>单笔贷款最低年利率(%)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>浮动利率贷款剩余本金占比(%)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td colspan="2" class="subLabel">入池资产集中度</td>
                                        </tr>
                                        <tr>
                                            <td>借款金额最高的前五名借款人集中度(%)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>借款金额最高的前十名借款人集中度(%)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td colspan="2" class="subLabel">借款人特征</td>
                                        </tr>
                                        <tr>
                                            <td>加权平均借款人年龄(岁)</td>
                                            <td>1,203,27</td>
                                        </tr>

                                        <tr>
                                            <td>30-40岁借款人贷款金额占比(%)</td>
                                            <td>6.00</td>
                                        </tr>
                                        <tr>
                                            <td>借款人加权平均年收入(万元)</td>
                                            <td>6.00</td>
                                        </tr>
                                        <tr>
                                            <td>借款人加权平均收入债务比(%)</td>
                                            <td>6.00</td>
                                        </tr>
                                    </table>
                                </div>
                            </div>
                        </div>
                        <!--个人消费信贷、信用卡分期付款、国家助学贷款表格end-->

                        <!--个人汽车贷款start-->
                        <div style="margin-bottom: 50px">
                            <div><p class="basicHeadLabel">个人汽车贷款</p></div>
                            <div class="row">
                                <div class="col-md-6" style="padding-left: 50px">
                                    <table class="table table-bordered table-condensed" style="padding: 0px;margin: 0px">
                                        <tbody>
                                        <tr>
                                            <td colspan="2" class="subLabel">入池资产基本情况</td>
                                        </tr>
                                        <tr>
                                            <td>资产池未偿本金金额(万元)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>证券发行总金额(万元)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>合同总金额(元)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>借款人数量(户)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>贷款笔数(笔)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>单笔贷款最高本金余额(万元)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>单笔贷款平均本金余额(万元)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>借款人贷款平均本金金额(万元)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>单笔贷款最高合同总额(万元)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>单笔贷款平均合同金额(万元)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td colspan="2" class="subLabel">入池资产期限特征</td>
                                        </tbody>
                                        <tr>
                                            <td>加权平均贷款合同期限(年)</td>
                                            <td>6.00</td>
                                        </tr>
                                        <tr>
                                            <td>加权平均贷款剩余期限(年)</td>
                                            <td>6.00</td>
                                        </tr>
                                        <tr>
                                            <td>加权平均贷款账龄(年)</td>
                                            <td>6.00</td>
                                        </tr>
                                        <tr>
                                            <td>单笔贷款最长剩余期限(年)</td>
                                            <td>6.00</td>
                                        </tr>
                                        <tr>
                                            <td>单笔贷款最短剩余期限(年)</td>
                                            <td>6.00</td>
                                        </tr>
                                    </table>
                                </div>
                                <div class="col-md-6" style="padding-right: 50px">
                                    <table class="table table-bordered table-condensed" style="padding: 0px;margin: 0px">
                                        <tbody>
                                        <tr>
                                            <td colspan="2" class="subLabel">入池资产信用状况</td>
                                        </tr>
                                        <tr>
                                            <td>正常类贷款占比(%)</td>
                                            <td>18.0</td>
                                        </tr>
                                        <tr>
                                            <td colspan="2" class="subLabel">入池资产利率特征</td>
                                        </tr>
                                        <tr>
                                            <td>加权平均贷款年利率(%)</td>
                                            <td>18.0</td>
                                        </tr>
                                        <tr>
                                            <td>单笔贷款最高年利率(%)</td>
                                            <td>18.0</td>
                                        </tr>
                                        <tr>
                                            <td>单笔贷款最低年利率(%)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>浮动利率贷款剩余本金占比(%)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td colspan="2" class="subLabel">入池资产集中度</td>
                                        </tr>
                                        <tr>
                                            <td>借款金额最高的前五名借款人集中度(%)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>借款金额最高的前十名借款人集中度(%)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td colspan="2" class="subLabel">借款人特征</td>
                                        </tr>
                                        <tr>
                                            <td>加权平均借款人年龄(岁)</td>
                                            <td>1,203,27</td>
                                        </tr>

                                        <tr>
                                            <td>30-40岁借款人贷款金额占比(%)</td>
                                            <td>6.00</td>
                                        </tr>
                                        <tr>
                                            <td>借款人加权平均年收入(万元)</td>
                                            <td>6.00</td>
                                        </tr>
                                        <tr>
                                            <td>借款人加权平均收入债务比(%)</td>
                                            <td>6.00</td>
                                        </tr>
                                        <tr>
                                            <td colspan="2" class="subLabel">入池资产抵押物特征</td>
                                        </tr>
                                        <tr>
                                            <td>抵押车辆初始合同价值合计(万元)</td>
                                            <td>6.00</td>
                                        </tr>
                                        <tr>
                                            <td>加权平均初始贷款价值比(LTV)</td>
                                            <td>6.00</td>
                                        </tr>
                                    </table>
                                </div>
                            </div>
                        </div>
                        <!--个人汽车贷款end-->

                        <!--个人汽车贷款start-->
                        <div style="margin-bottom: 50px">
                            <div><p class="basicHeadLabel">个人住房(装修、租借、买房)贷款</p></div>
                            <div class="row">
                                <div class="col-md-6" style="padding-left: 50px">
                                    <table class="table table-bordered table-condensed" style="padding: 0px;margin: 0px">
                                        <tbody>
                                        <tr>
                                            <td colspan="2" class="subLabel">入池资产基本情况</td>
                                        </tr>
                                        <tr>
                                            <td>资产池未偿本金金额(万元)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>证券发行总金额(万元)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>合同总金额(元)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>借款人数量(户)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>贷款笔数(笔)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>单笔贷款最高本金余额(万元)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>单笔贷款平均本金余额(万元)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>借款人贷款平均本金金额(万元)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>单笔贷款最高合同总额(万元)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>单笔贷款平均合同金额(万元)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td colspan="2" class="subLabel">入池资产期限特征</td>
                                        </tbody>
                                        <tr>
                                            <td>加权平均贷款合同期限(年)</td>
                                            <td>6.00</td>
                                        </tr>
                                        <tr>
                                            <td>加权平均贷款剩余期限(年)</td>
                                            <td>6.00</td>
                                        </tr>
                                        <tr>
                                            <td>加权平均贷款账龄(年)</td>
                                            <td>6.00</td>
                                        </tr>
                                        <tr>
                                            <td>单笔贷款最长剩余期限(年)</td>
                                            <td>6.00</td>
                                        </tr>
                                        <tr>
                                            <td>单笔贷款最短剩余期限(年)</td>
                                            <td>6.00</td>
                                        </tr>
                                    </table>
                                </div>
                                <div class="col-md-6" style="padding-right: 50px">
                                    <table class="table table-bordered table-condensed" style="padding: 0px;margin: 0px">
                                        <tbody>
                                        <tr>
                                            <td colspan="2" class="subLabel">入池资产信用状况</td>
                                        </tr>
                                        <tr>
                                            <td>正常类贷款占比(%)</td>
                                            <td>18.0</td>
                                        </tr>
                                        <tr>
                                            <td colspan="2" class="subLabel">入池资产利率特征</td>
                                        </tr>
                                        <tr>
                                            <td>加权平均贷款年利率(%)</td>
                                            <td>18.0</td>
                                        </tr>
                                        <tr>
                                            <td>单笔贷款最高年利率(%)</td>
                                            <td>18.0</td>
                                        </tr>
                                        <tr>
                                            <td>单笔贷款最低年利率(%)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>浮动利率贷款剩余本金占比(%)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td colspan="2" class="subLabel">入池资产集中度</td>
                                        </tr>
                                        <tr>
                                            <td>借款金额最高的前五名借款人集中度(%)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td>借款金额最高的前十名借款人集中度(%)</td>
                                            <td>1,203,27</td>
                                        </tr>
                                        <tr>
                                            <td colspan="2" class="subLabel">借款人特征</td>
                                        </tr>
                                        <tr>
                                            <td>加权平均借款人年龄(岁)</td>
                                            <td>1,203,27</td>
                                        </tr>

                                        <tr>
                                            <td>30-40岁借款人贷款金额占比(%)</td>
                                            <td>6.00</td>
                                        </tr>
                                        <tr>
                                            <td>借款人加权平均年收入(万元)</td>
                                            <td>6.00</td>
                                        </tr>
                                        <tr>
                                            <td>借款人加权平均收入债务比(%)</td>
                                            <td>6.00</td>
                                        </tr>
                                        <tr>
                                            <td colspan="2" class="subLabel">入池资产抵押物特征</td>
                                        </tr>
                                        <tr>
                                            <td>抵押车辆初始合同价值合计(万元)</td>
                                            <td>6.00</td>
                                        </tr>
                                        <tr>
                                            <td>加权平均初始贷款价值比(LTV)</td>
                                            <td>6.00</td>
                                        </tr>
                                    </table>
                                </div>
                            </div>
                        </div>
                        <!--个人汽车贷款end-->


                    </div>
                    <div id="assetsCount" class="displayNone">
                        <!--资产五级分类start-->
                        <div style="margin-bottom: 50px">
                            <div><p class="headLabel">资产五级分类</p></div>
                            <div class="row">
                                <div class="col-md-7" style="padding-right: 30px">
                                    <table class="table table-bordered table-striped">
                                        <thead>
                                        <tr>
                                            <th>资产池五级分类</th>
                                            <th>总额(万元)</th>
                                            <th>金额占比(%)</th>
                                            <th>资产个数(个)</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td>正常</td>
                                            <td>1.1</td>
                                            <td>18.1</td>
                                            <td>6</td>
                                        </tr>
                                        <tr>
                                            <td>关注</td>
                                            <td>1.1</td>
                                            <td>18.1</td>
                                            <td>6</td>
                                        </tr>
                                        <tr>
                                            <td>次级</td>
                                            <td>1.1</td>
                                            <td>18.1</td>
                                            <td>6</td>
                                        </tr>
                                        <tr>
                                            <td>可疑</td>
                                            <td>1.1</td>
                                            <td>18.1</td>
                                            <td>6</td>
                                        </tr>
                                        <tr>
                                            <td>损失</td>
                                            <td>1.1</td>
                                            <td>18.1</td>
                                            <td>6</td>
                                        </tr>
                                        </tbody>
                                    </table>
                                </div>
                                <div class="col-md-5">
                                    <div id="fivePieContainer" style="height: 350px"></div>
                                </div>
                            </div>
                        </div>
                        <!--资产五级分类end-->

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
                                <div><p class="headLabel">贷款利率分布</p></div>
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
                                <div><p class="headLabel">贷款规模分布</p></div>
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
                                                <td>>10.0(含)</td>
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
<script type="text/javascript" src="/charts/packageAnalysisPieChart.js"></script>
<script type="text/javascript" src="/js/assetpackage.js"></script>
<script type="text/javascript" src="/js/packageAnalysis.js"></script>
</body>
<script type="text/javascript">
    $("#mainnav a:contains('产品在线设计')").attr("id","current");
</script>
</html>

