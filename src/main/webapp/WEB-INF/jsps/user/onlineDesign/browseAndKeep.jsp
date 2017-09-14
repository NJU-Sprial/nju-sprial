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
                <div class="col-md-2">
                    <%--<div class="flat-form-info">--%>
                    <%--<form action="#" method="post" class="form-info">--%>
                    <%--<div class="v3">--%>
                    <%--<p class="input-info"><input type="text" name="your-name" value="" placeholder="项目名称">--%>
                    <%--</p>--%>
                    <%--</div>--%>

                    <%--</form> <!-- /.flat-form-info -->--%>
                    <%--</div>--%>
                    <div class="btn-group">
                        <button type="button" class="btn btn-primary" id="pname-button">项目名称</button>
                        <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown"
                                aria-haspopup="true" aria-expanded="false">
                            <span class="caret"></span>
                            <span class="sr-only">Toggle Dropdown</span>
                        </button>
                        <ul class="dropdown-menu">
                            <li><a href="#" onclick="selectProject(this)">项目1</a></li>
                            <li><a href="#" onclick="selectProject(this)">项目2</a></li>
                            <li><a href="#" onclick="selectProject(this)">项目3</a></li>
                            <%--<li role="separator" class="divider"></li>--%>
                            <%--<li><a href="#">Separated link</a></li>--%>
                        </ul>
                    </div>
                </div>

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
            <div class="divider"></div>
            <script>
                $(document).ready(function () {
                    $("#pname-div").css("margin-top", "14px").css("font-size", "22px");
                    $("#search-div").css("margin-top", "14px").css("font-size", "22px");
                    $("#search-icon").css("margin", "10px 0 30px");
                    $(".row").css("height", "14px");
                    $('.dropdown-toggle').dropdown();
                    $(".divider").css("margin", "60px 0");
                })

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
                        <%--<tr>--%>
                        <%--<button class="cooperationFileButton">数据清空</button>--%>
                        <%--</tr>--%>
                        </tbody>
                    </table>
                    <a type="button" class="btn btn-link" data-toggle="tooltip" data-placement="right" data-html="true"
                       title="将删除该项目资产池的所有数据信息，请谨慎操作！">数据清空</a>
                    <a type="button" class="btn btn-link" data-toggle="tooltip" data-placement="right" data-html="true"
                       title="向该项目中追加新的资产池数据，需要按照模板导入资产池文件" href="/user/onlineDesign/addMoreData">
                        数据追加</a>
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

<script>
    $("#mainnav a:contains('产品在线设计')").attr("id","current");

    function selectProject(element) {
        $("#pname-button").text($(element).text());
    }
</script>
</body>
</html>
