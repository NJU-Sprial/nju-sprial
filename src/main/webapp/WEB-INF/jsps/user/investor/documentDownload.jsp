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
                            <th class="cooperationFontSize">文件名</th>
                            <th class="cooperationFontSize">发布日期</th>
                            <th class="cooperationFontSize">用户操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>支持证券发行说明书
                            </td>
                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>2017-9-14
                            </td>
                            <td style='vertical-align: middle;text-align: center;'>
                                <span>
                                <button class="cooperationFileButton">下载</button>
                                </span>
                            </td>
                        </tr>
                        <tr>
                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>支持证券之信托公告
                            </td>
                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>2017-9-1</td>
                            <td style='vertical-align: middle;text-align: center;'>
                                <span>
                                <button class="cooperationFileButton">下载</button>
                                </span>
                            </td>
                        </tr>
                        <tr>
                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>支持证券发行办法</td>
                            <td class="contentFontSize" style='vertical-align: middle;text-align: center;'>2017-8-29
                            </td>
                            <td style='vertical-align: middle;text-align: center;'>
                                <span>
                                <button role="button" class="cooperationFileButton" onclick="window.location.href('#')">下载</button>
                                </span>
                            </td>
                        </tr>
                        <%--<tr>--%>
                        <%--<button class="cooperationFileButton">数据清空</button>--%>
                        <%--</tr>--%>
                        </tbody>
                    </table>
                </div>

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
<script type="text/javascript" src="/js/ItemSelect.js"></script>
<script>
    $(".nav.navbar-nav.sf-menu.menu li a:contains('在售商品')").attr("id", "current");
    function selectProject(element) {
        $("#pname-button").text($(element).text());
    }
</script>
</body>
</html>
