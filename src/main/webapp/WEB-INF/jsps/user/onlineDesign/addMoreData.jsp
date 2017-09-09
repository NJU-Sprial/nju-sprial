<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<!--[if IE 8 ]><html class="ie" xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"><!--<![endif]-->

<%@ include file="/WEB-INF/jsps/components/head.jsp" %>
<head>
    <title>资产数据追加</title>
</head>
<body>
<div class="boxed blog">
    <!-- Preloader -->
    <div class="preloader">
        <div class="clear-loading loading-effect-2">
            <span></span>
        </div>
    </div>
    <%@ include file="/WEB-INF/jsps/components/top_components.jsp" %>
    <%--<div class="page-title">--%>
        <%--<div class="container">--%>
            <%--<div class="row">--%>
                <%--<div class="col-md-12">--%>
                    <%--<div class="page-title-heading">--%>
                        <%--<h1 class="h1-title">Contact</h1>--%>
                    <%--</div><!-- /.page-title-heading -->--%>
                    <%--<ul class="breadcrumbs">--%>
                        <%--<li><a href="#" title="">Home<i class="fa fa-angle-right" aria-hidden="true"></i></a></li>--%>
                        <%--<li><a href="#" title="">Contact</a></li>--%>
                    <%--</ul><!-- /.breadcrumbs -->--%>
                    <%--<div class="clearfix"></div><!-- /.clearfix -->--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div><!-- /.page-title -->--%>

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
                        <form action="/user/onlineDesign/browseAndKeepAfterAddProject" method="post" class="form-info">
                            <div class="v3">
                                <p class="input-info"><input type="text" name="pname" value="" placeholder="项目名称">
                                </p>
                                <p class="input-info"><input type="email" name="ptype" value="" placeholder="消费金融"
                                                             disabled="true" text="消费金融"></p>
                                <p class="input-info"><label>个人消费贷款、信用卡分期付款、国家助学贷款
                                    <input type="radio" name="pway" value="" checked="" placeholder="Subject"></label>
                                    </p>
                                <p class="input-info"><label>个人汽车贷款
                                    <input type="radio" name="pway" value="" placeholder="Subject"></label>
                                    </p>
                                <p class="input-info"><label>个人住房贷款（包含装修、租借、购买）
                                    <input type="radio" name="pway" value="" placeholder="Subject"></label>
                                    </p>
                                <p class="input-info"><input id="input-data-button" type="button" value="下载数据模板"></p>
                                <!--使用label元素与file控件关联，input被隐藏，用户点的实际上是label-->
                                <p class="input-info">
                                    <label for="input-file" class="btn btn-info one-half">导入数据</label>
                                    <input type="file" name="file" id="input-file" accept="application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
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

    $(document).ready(function () {
        $("#input-data-button").click(function () {
            window.location.href = "http://localhost:8080/example.xlsx";
        });
    });
</script>

</body>
</html>
