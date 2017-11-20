<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xiaoJun
  Date: 2017/9/12
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!--[if IE 8 ]><html class="ie" xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"><!--<![endif]-->

<%@ include file="/WEB-INF/jsps/components/head.jsp" %>

<head>
    <link rel="stylesheet" type="text/css" href="/css/cooperation.css">

    <link rel="stylesheet" type="text/css" href="/css/demo.css">
</head>
<body>
<%@ include file="/WEB-INF/jsps/components/top_components.jsp" %>
<div class="boxed blog">

    <section class="flat-row pd-contact-v1">
        <div class="container">
            <div class="row">
                <div class="col-md-2">

                </div>
                <div class="col-md-8">
                    <form class="form-horizontal packageCreateFont" role="form">
                        <div class="form-group">
                            <label class="control-label col-sm-5" for="projectName">项目名称：</label>
                            <div class="col-sm-7">
                                <select class="dropdown" tabindex="9" data-settings='{"wrapperClass":"flat"}' id="projectName">
                                    <c:forEach var="projectName" items="${projectNameList}">
                                        <option>${projectName}</option>
                                    </c:forEach>
                                        <%--<option>projectName1</option>--%>
                                        <%--<option>projectName2</option>--%>
                                        <%--<option>projectName3</option>--%>
                                        <%--<option>projectName4</option>--%>
                                </select>

                                <!--<select class="form-control projectSelect" id="projectName">-->
                                <!--<option><p>源计划1</p></option>-->
                                <!--<option><p>源计划2</p></option>-->
                                <!--<option><p>源计划3</p></option>-->
                                <!--<option><p>源计划4</p></option>-->
                                <!--</select>-->
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-5" for="assetPackageId">资产包编号：</label>
                            <div class="col-sm-7">
                                <p class="form-control-static" id="assetPackageId">（自动生成）</p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-5" for="assetNumber">资产数量：</label>
                            <div class="col-sm-7">
                                <p class="form-control-static" id="assetNumber">（自动生成）</p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-5" for="packetDate">封包日期：</label>
                            <div class="col-sm-7">
                                <p class="form-control-static" id="packetDate">（自动生成）</p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-5" for="principal">资产包封包本金金额：</label>
                            <div class="col-sm-7">
                                <p class="form-control-static" id="principal">（自动生成）</p>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-5" for="rate">封包利率：</label>
                            <div class="col-sm-7">
                                <p class="form-control-static" id="rate">（自动生成）</p>
                            </div>
                        </div>
                        <div>
                            <label class="control-label col-sm-5" for="submit"></label>
                            <div class="col-sm-7">
                                <input class="form-control cooperationConfirmButton" style="color:#ffffff" type="submit" id="submit" value="创建资产包">
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-md-2">

                </div>
            </div><!-- /.row -->
        </div><!-- /.container -->
    </section><!-- /.flat-row-iconbox -->

<%@ include file="/WEB-INF/jsps/components/message.jsp" %>

</div> <!-- /.boxed -->

<!-- Javascript -->
<script type="text/javascript" src="/js/jquery.easydropdown.min.js"></script>
<script type="text/javascript" src="/js/ItemSelect.js"></script>
<script type="text/javascript">
    $(function () {
        $("#submit").click(function () {
            $.ajax({
                type: 'post',
                async: true,   //异步请求
                url: '/user/onlineDesign/packageManage/packageCreate/packageVO',
                data:{
                    "projectName": $("#projectName").val()
                },
                dataType: 'json',
                success:function (result) {
                    $("#assetPackageId").text(result.packageId);
                    $("#assetNumber").text(result.assetNumber);
                    $("#packageDate").text(result.packageData);
                    $("#principal").text(result.principal);
                    $('#rate').text(result.rate);
                }
            })
        })
    })
</script>
</body>
</html>
