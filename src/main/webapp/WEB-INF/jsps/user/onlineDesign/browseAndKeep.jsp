<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<!--[if IE 8 ]>
<html class="ie" xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"><!--<![endif]-->

<!--[if IE 8 ]>
<html class="ie" xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"/> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"><!--<![endif]-->

<head>
    <title>浏览维护</title>
    <link rel="stylesheet" type="text/css" href="/css/cooperation.css">
    <%--<link rel="stylesheet" type="text/css" href="/css/glyphicon.css">--%>
</head>
<%@ include file="/WEB-INF/jsps/components/head.jsp" %>
<body>
<div class="boxed blog">
    <!-- Preloader -->
    <div class="preloader">
        <div class="clear-loading loading-effect-2">
            <span></span>
        </div>
    </div>
    <%@ include file="/WEB-INF/jsps/components/top_components.jsp" %>

    <section class="flat-row pd-contact-v1">
        <div class="container">
            <div class="row">
                <%--<div class="col-md-2">--%>
                    <%--<div class="contact-info">--%>
                        <%--<div class="info info-address">--%>
                            <%--<div class="title name-div" id="pname-div">项目名称</div>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                <%--</div> <!-- /.col-md-4 -->--%>
                <div class="col-md-4">
                    <%--<div class="flat-form-info">--%>
                        <%--<form action="#" method="post" class="form-info">--%>
                            <%--<div class="v3">--%>
                                <%--<p class="input-info"><input type="text" name="your-name" value="" placeholder="项目名称">--%>
                                <%--</p>--%>
                            <%--</div>--%>

                        <%--</form> <!-- /.flat-form-info -->--%>
                    <%--</div>--%>
                        <div class="dropdown">
                            <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1"
                                    data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                                项目名称
                                <span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                                <li><a href="#">项目1</a></li>
                                <li><a href="#">项目2</a></li>
                                <li><a href="#">项目3</a></li>
                                <%--<li role="separator" class="divider"></li>--%>
                                <%--<li><a href="#">Separated link</a></li>--%>
                            </ul>
                        </div>
                </div>
                <%--<div class="col-md-1"></div>--%>
                <%--<div class="col-md-2">--%>
                    <%--<div class="contact-info">--%>
                        <%--<div class="info info-address">--%>
                            <%--<div class="title name-div" id="search-div">贷款搜索</div>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                <%--</div>--%>

                <div class="col-md-4">
                    <form class="form-inline">
                        <div class="form-group">
                            <label class="sr-only" for="exampleInputAmount">Amount (in dollars)</label>
                            <div class="input-group">
                                <div class="input-group-addon">贷款搜索</div>
                                <input type="text" class="form-control" id="exampleInputAmount" placeholder="Amount">
                                <%--<div class="input-group-addon"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></div>--%>
                            </div>
                        </div>
                        <button type="submit" class="btn btn-primary">
                            确定
                            <%--<span class="glyphicon glyphicon-search" aria-hidden="true"></span>--%>
                        </button>
                    </form>


                </div>
            </div>
            <script>
                //                                $("#input-data-button").css("margin-bottom", "30px").css("font-size", "15px").css("margin-top", "30px");
                $("#pname-div").css("margin-top", "14px").css("font-size", "22px");
                $("#search-div").css("margin-top", "14px").css("font-size", "22px");
                $("#search-icon").css("margin", "10px 0 30px");
                $(".row").css("height", "14px");
                //                                //                                $(".title.name-div");
                //                                $("#basic-div").css("margin-bottom", "47px");
                //                                $(".btn.btn-info").css("padding", "10px 12px").css("padding-bottom", "13px").css("font-weight", "600");
                //                                $("#submit-button").css("font-weight", "600");
                //                                $(".form-info label input").css("height", "inherit").css("width", "inherit");
                //                                $(".input-info label").css("font-weight", "bold");
            </script>

            <div class="row">

                <div class="col-md-12">
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
                                <button class="cooperationFileButton">修改</button>
                                <button class="cooperationFileButton">删除</button>
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
                                <button class="cooperationFileButton">修改</button>
                                <button class="cooperationFileButton">删除</button>
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
                                <button class="cooperationFileButton">修改</button>
                                <button class="cooperationFileButton">删除</button>
                                </span>
                            </td>
                        </tr>
                        <tr>
                            <button class="cooperationFileButton">数据清空</button>
                        </tr>
                        </tbody>
                    </table>
                    <!--<div class="flat-form-info">-->
                    <!--<form action="#" method="post" class="form-info">-->
                    <!--<div class="one-half v3">-->
                    <!--<p class="input-info"><input type="text" name="your-name" value="" placeholder="Name"></p>-->
                    <!--<p class="input-info"><input type="email" name="your-email" value="" placeholder="Email"></p>-->
                    <!--<p class="input-info"><input type="text" name="your-subject" value="" placeholder="Subject"></p>-->
                    <!--<p class="input-info"><input type="submit" value="Send Message"></p>-->
                    <!--</div>-->
                    <!--<div class="one-half v4">-->
                    <!--<p class="input-info"><textarea name="your-message" placeholder="Message"></textarea></p>-->
                    <!--</div>-->
                    <!--</form> &lt;!&ndash; /.flat-form-info &ndash;&gt;-->
                    <!--</div>-->
                </div> <!-- /.col-md-10 -->

            </div><!-- /.row -->
        </div><!-- /.container -->
    </section><!-- /.flat-row-iconbox -->

    <%--<div class="container search">--%>
        <%--<div class="search-input">--%>
            <%--<div class="input-group">--%>
                <%--<input type="text" class="form-control" id="txtKeyword" placeholder="输入关键字：" value="">--%>
                <%--<span class="input-group-btn">--%>
                                <%--<button class="btn btn-default" id="btnSearch" type="button">--%>
                                    <%--<span class="glyphicon glyphicon-search" aria-hidden="true"></span>--%>
                                <%--</button>--%>
                            <%--</span>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
    <!-- map -->
    <%--<section class="flat-row pdmap">--%>
    <%--<div class="flat-maps" data-address="Thành phố New York, Tiểu bang New York" data-height="454"--%>
    <%--data-images="images/map/map-1.png" data-name="Themesflat Map"></div>--%>
    <%--<div class="gm-map">--%>
    <%--<div class="map"></div>--%>
    <%--</div>--%>
    <%--</section>--%>

    <div class="button-go-top">
        <a href="#" title="" class="go-top">
            <i class="fa fa-chevron-up"></i>
        </a>
    </div>

</div> <!-- /.boxed -->

<!-- Javascript -->
<script type="text/javascript" src="../../js/jquery.min.js"></script>
<script type="text/javascript" src="../../js/bootstrap.min.js"></script>
<script type="text/javascript" src="../../js/jquery.flexslider-min.js"></script>
<script type="text/javascript" src="../../js/jquery.easing.js"></script>

<script type="text/javascript" src="../../js/jquery.cookie.js"></script>
<!--<script type="text/javascript" src="javascript/gmap3.min.js"></script>
<script type="text/javascript" src="http://ditu.google.cn/maps/api/js?key=AIzaSyAcNjdyQ_xJKXqTnbGIhw7jlls3idn9rZM"></script>-->
<script type="text/javascript" src="../../js/waypoints.min.js"></script>
<script type="text/javascript" src="../../js/main.js"></script>


</body>
</html>
