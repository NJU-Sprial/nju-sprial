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
                            <label class="control-label col-sm-5" for="username_field">用户名：</label>
                            <div class="col-sm-7">
                                <input type="text" class="form-control" placeholder="请输入用户名..." id="username_field" name="username" required="required" title="在这里填写用户名">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-5" for="packageId">项目名称：</label>
                            <div class="col-sm-7">
                                <select class="dropdown" tabindex="9" data-settings='{"wrapperClass":"flat"}' id="packageId">
                                    <option value="1">全部</option>
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
                                <input class="form-control" id="analysisButton" type="submit" value="开始查询">
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-md-3"></div>
            </div><!-- /.row -->
            <div class="row">
                <div class="col-md-1"></div>
                <div class="col-md-10">
                    <div id="assetsBasics">

                        <!--项目一start-->
                        <div style="margin-bottom: 50px">
                            <div><p class="basicHeadLabel">项目一</p></div>
                            <div class="row">
                                <div class="col-md-12" style="padding-left: 50px">
                                    <table class="table table-hover">
                                        <thead>
                                        <tr>
                                            <th class="cooperationFontSize">贷款合同编号</th>
                                            <th class="cooperationFontSize">提取本日余额</th>
                                            <th class="cooperationFontSize">当期年化利率</th>
                                            <th class="cooperationFontSize">提取日期</th>
                                            <th class="cooperationFontSize">到期日期</th>
                                            <th class="cooperationFontSize">利率类型</th>
                                            <th class="cooperationFontSize">还款方式</th>
                                            <th class="cooperationFontSize">用户操作</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>123</td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>10000</td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>5%</td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>2017-09-05
                                            </td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>2017-09-06
                                            </td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>x类</td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>分期还款</td>
                                            <td style='vertical-align: middle;text-align: center;'>
                                <span>
                                <button class="cooperationFileButton">详情</button>
                                </span>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>123</td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>15000</td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>4%</td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>2017-09-05
                                            </td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>2017-09-05
                                            </td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>y类</td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>立即还款</td>
                                            <td style='vertical-align: middle;text-align: center;'>
                                <span>
                                <button class="cooperationFileButton">详情</button>
                                </span>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>432</td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>20000</td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>3%</td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>2017-09-06
                                            </td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>2017-09-06
                                            </td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>x类</td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>分期还款</td>
                                            <td style='vertical-align: middle;text-align: center;'>
                                <span>
                                <button class="cooperationFileButton">详情</button>
                                </span>
                                            </td>
                                        </tr>
                                        <%--<tr>--%>
                                        <%--<button class="cooperationFileButton">数据清空</button>--%>
                                        <%--</tr>--%>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <!--项目一end-->
                            <div><p class="basicHeadLabel">项目二</p></div>
                            <div class="row">
                                <div class="col-md-12" style="padding-left: 50px">
                                    <table class="table table-hover">
                                        <thead>
                                        <tr>
                                            <th class="cooperationFontSize">贷款合同编号</th>
                                            <th class="cooperationFontSize">提取本日余额</th>
                                            <th class="cooperationFontSize">当期年化利率</th>
                                            <th class="cooperationFontSize">提取日期</th>
                                            <th class="cooperationFontSize">到期日期</th>
                                            <th class="cooperationFontSize">利率类型</th>
                                            <th class="cooperationFontSize">还款方式</th>
                                            <th class="cooperationFontSize">用户操作</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>123</td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>10000</td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>5%</td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>2017-09-05
                                            </td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>2017-09-06
                                            </td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>x类</td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>分期还款</td>
                                            <td style='vertical-align: middle;text-align: center;'>
                                <span>
                                <button class="cooperationFileButton">详情</button>
                                </span>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>123</td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>15000</td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>4%</td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>2017-09-05
                                            </td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>2017-09-05
                                            </td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>y类</td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>立即还款</td>
                                            <td style='vertical-align: middle;text-align: center;'>
                                <span>
                                <button class="cooperationFileButton">详情</button>
                                </span>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>432</td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>20000</td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>3%</td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>2017-09-06
                                            </td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>2017-09-06
                                            </td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>x类</td>
                                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>分期还款</td>
                                            <td style='vertical-align: middle;text-align: center;'>
                                <span>
                                <button class="cooperationFileButton">详情</button>
                                </span>
                                            </td>
                                        </tr>
                                        <%--<tr>--%>
                                        <%--<button class="cooperationFileButton">数据清空</button>--%>
                                        <%--</tr>--%>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                        <!--项目二end-->
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
</body>
</html>

