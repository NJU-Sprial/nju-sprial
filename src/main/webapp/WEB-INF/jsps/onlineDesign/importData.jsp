<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<!--[if IE 8 ]><html class="ie" xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"><!--<![endif]-->

<%@ include file="/WEB-INF/jsps/components/head.jsp" %>
<head>
    <title>基础资产数据导入</title>
</head>
<body>
<div class="boxed blog">
    <!-- Preloader -->
    <div class="preloader">
        <div class="clear-loading loading-effect-2">
            <span></span>
        </div>
    </div>


    <div class="top">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <ul class="flat-infomation">
                        <li class="phone">Call us: <a href="+61383766284" title="phone">+61 3 8376 6284</a></li>
                        <li class="email">Email: <a href="mailto:support24-7@gmail.com" title="email">support24-7@gmail.com</a>
                        </li>
                    </ul><!-- /flat-infomation -->
                    <div class="flat-questions">
                        <a href="#" title="" class="questions">Have any questions?</a>
                        <a href="#" title="" class="appointment">GET AN APPOINTMENT</a>
                    </div><!-- /.flat-questions -->
                    <div class="clearfix"></div><!-- /.clearfix -->
                </div>
            </div>
        </div>
    </div><!-- /.top -->
    <header id="header" class="header bg-color">
        <div class="container">
            <div class="row">
                <div class="header-wrap">
                    <div class="col-md-2">
                        <div id="logo" class="logo">
                            <a href="#" title="">
                                <img src="images/logo-blog.png" alt="logo Finance Business"/>
                            </a>
                        </div><!-- /#logo -->
                    </div><!-- /.col-md-3 -->
                    <div class="col-md-10">
                        <div class="flat-show-search">
                            <div class="show-search">
                                <a href="#"><i class="fa fa-search"></i></a>
                            </div>
                            <div class="top-search">
                                <form action="#" id="searchform-all" method="get">
                                    <div>
                                        <input type="text" id="s" class="sss" placeholder="Search...">
                                        <input type="submit" value="" id="searchsubmit">
                                    </div>
                                </form>
                            </div> <!-- /.top-search -->
                        </div>    <!-- /.flat-show-search -->

                        <div class="nav-wrap">
                            <div class="btn-menu">
                                <span></span>
                            </div><!-- //mobile menu button -->
                            <nav id="mainnav" class="mainnav">
                                <ul class="menu">
                                    <li><a href="index.html" title="">Home</a></li>
                                    <li><a href="about.html" title="">About</a></li>
                                    <li><a href="contact.html" title="">Contact</a></li>
                                </ul><!-- /.menu -->
                            </nav><!-- /#mainnav -->
                        </div><!-- /.nav-wrap -->
                    </div><!-- /.col-md-9 -->
                </div><!-- /.header-wrap -->
            </div><!-- /.row -->
        </div><!-- /.container -->
    </header><!-- /header -->

    <div class="page-title">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="page-title-heading">
                        <h1 class="h1-title">Contact</h1>
                    </div><!-- /.page-title-heading -->
                    <ul class="breadcrumbs">
                        <li><a href="#" title="">Home<i class="fa fa-angle-right" aria-hidden="true"></i></a></li>
                        <li><a href="#" title="">Contact</a></li>
                    </ul><!-- /.breadcrumbs -->
                    <div class="clearfix"></div><!-- /.clearfix -->
                </div>
            </div>
        </div>
    </div><!-- /.page-title -->

    <section class="flat-row pd-contact-v1">
        <div class="container">
            <div class="row">
                <div class="col-md-2">
                    <div class="contact-info">
                        <div class="info info-address">
                            <div class="title name-div" id="pname-div">项目名称</div>
                        </div>

                        <div class="info info-address" id="basic-div">
                            <div class="title name-div">基础资产类型</div>
                        </div>

                        <div class="info info-address">
                            <div class="title name-div">消费用途</div>
                        </div>
                    </div>
                </div> <!-- /.col-md-4 -->

                <div class="col-md-10">
                    <div class="flat-form-info">
                        <form action="#" method="post" class="form-info">
                            <div class="v3">
                                <p class="input-info"><input type="text" name="your-name" value="" placeholder="项目名称">
                                </p>
                                <p class="input-info"><input type="email" name="your-email" value="" placeholder="消费金融"
                                                             disabled="true"></p>
                                <p class="input-info"><label>个人消费贷款、信用卡分期付款、国家助学贷款
                                    <input type="radio" name="your-subject" value="" checked="" placeholder="Subject"></label>
                                    </p>
                                <p class="input-info"><label>个人汽车贷款
                                    <input type="radio" name="your-subject" value="" placeholder="Subject"></label>
                                    </p>
                                <p class="input-info"><label>个人住房贷款（包含装修、租借、购买）
                                    <input type="radio" name="your-subject" value="" placeholder="Subject"></label>
                                    </p>
                                <p class="input-info"><input id="input-data-button" type="button" value="下载数据模板"></p>
                                <%--<p class="input-info"><input type="file" name="file" id="input-file" accept="text/xml" --%>
                                <%--value="导入数据" onchange="fileChange()"></p>--%>
                                <%--<div class="form-group has-success">--%>
                                <!--使用label元素与file控件关联，input被隐藏，用户点的实际上是label-->
                                <p class="input-info">
                                    <label for="input-file" class="btn btn-info one-half">导入数据</label>
                                    <input type="file" name="file" id="input-file" accept="text/xml"
                                           style="position:absolute;clip:rect(0 0 0 0);" onchange="fileChange()"/>
                                    <button id="submit-button" type="submit" disabled="disabled" class="btn btn-special btn-success one-half">
                                        上传
                                    </button>
                                </p>
                                <p class="help-block">添加一个XML文件</p>

                                <%--</div>--%>
                            </div>
                            <script>
                                $("#input-data-button").css("margin-bottom", "30px").css("font-size","15px").css("margin-top","30px");
                                $("#pname-div").css("margin-top", "11px").css("margin-bottom", "56px");
//                                $(".title.name-div");
                                $("#basic-div").css("margin-bottom", "47px");
                                $(".btn.btn-info").css("padding","10px 12px").css("padding-bottom","13px").css("font-weight","600");
                                $("#submit-button").css("font-weight","600");
                                $(".form-info label input").css("height","inherit").css("width","inherit");
                                $(".input-info label").css("font-weight","bold");
                            </script>
                            <%--<div class="one-half v4">--%>

                                <%--<form id="form" method='post' target='_blank' action="/showCase"--%>
                                      <%--enctype="multipart/form-data">--%>

                                <%--</form>--%>
                            <%--</div>--%>
                        </form> <!-- /.flat-form-info -->
                    </div>
                </div> <!-- /.col-md-8 -->

            </div><!-- /.row -->
        </div><!-- /.container -->
    </section><!-- /.flat-row-iconbox -->

    <!-- map -->
    <section class="flat-row pdmap">
        <div class="flat-maps" data-address="Thành phố New York, Tiểu bang New York" data-height="454"
             data-images="images/map/map-1.png" data-name="Themesflat Map"></div>
        <div class="gm-map">
            <div class="map"></div>
        </div>
    </section>

    <footer id="footer">

    </footer><!-- /#footer -->

    <div class="button-go-top">
        <a href="#" title="" class="go-top">
            <i class="fa fa-chevron-up"></i>
        </a>
    </div>

</div> <!-- /.boxed -->

<!-- Javascript -->
<script type="text/javascript" src="/js/jquery.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/jquery.flexslider-min.js"></script>
<script type="text/javascript" src="/js/jquery.easing.js"></script>

<script type="text/javascript" src="/js/jquery.cookie.js"></script>
<!--<script type="text/javascript" src="/js/gmap3.min.js"></script>
<script type="text/javascript" src="http://ditu.google.cn/maps/api/js?key=AIzaSyAcNjdyQ_xJKXqTnbGIhw7jlls3idn9rZM"></script>-->
<script type="text/javascript" src="/js/waypoints.min.js"></script>
<script type="text/javascript" src="/js/main.js"></script>
<script type="text/javascript">

    // 文件上传的监听
    function fileChange() {
        if ($("#input-file").val() === '') {
            $("#form .help-block").text('添加一个XML文件');
            $("#form > div > button").attr('disabled', true);
        } else {
            $("#form .help-block").text($("#input-file").get(0).files[0].name);
            $("#form > div > button").attr('disabled', false);
        }
    }
</script>

</body>
</html>
