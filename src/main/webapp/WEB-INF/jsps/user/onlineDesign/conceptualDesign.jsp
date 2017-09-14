<%@ page import="java.util.List" %>
<%@ page import="vo.ConceptualVO" %>
<%@ page import="java.time.format.DateTimeFormatter" %><%--
  Created by IntelliJ IDEA.
  User: zjy
  Date: 2017/9/9
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>

<%@ include file="/WEB-INF/jsps/components/head.jsp" %>

<head>
    <title>方案设计</title>
</head>
<body>
<%@ include file="/WEB-INF/jsps/components/top_components.jsp" %>

<% ConceptualVO conceptualVO=(ConceptualVO)request.getAttribute("conceptualVO"); %>
<div class="container">
    <div class="top-margin ">
        <!-- 填参组件块 -->
        <div class="col-md-6 bottom-margin">
            <!-- 用户输入套件，用dl包起来，实现纵向对齐 -->
            <dl class="dl-horizontal">
                <div class="form-group">
                    <dt>方案名称</dt>
                    <dd>
                        <input class="form-control" value="<%=conceptualVO.getPname()%>" required="required" id="sname"/>
                    </dd>
                </div>
                <div class="form-group">
                    <dt>封包日期</dt>
                    <dd>
                        <span id="packageDate"><%=conceptualVO.getPackageDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))%></span>
                    </dd>
                </div>
                <div class="form-group">
                    <dt>成立日</dt>
                    <dd>
                        <!-- 日期选择器，控制的脚本在sprial.js里 -->
                        <div class="input-group date form_date" data-date="" data-date-format="yyyy-mm-dd"
                             data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
                            <input class="form-control" size="16" type="text" required="required" value="<%=conceptualVO.getStartDate()%>"
                                   pattern="[0-9]{4}-[0-9]{2}-[0-9]{2}" id="startDate">
                            <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
                        </div>
                    </dd>
                </div>
                <div class="form-group">
                    <dt>首次兑付日</dt>
                    <dd>
                        <!-- 日期选择器，控制的脚本在sprial.js里 -->
                        <div class="input-group date form_date" data-date="" data-date-format="yyyy-mm-dd"
                             data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
                            <input class="form-control" size="16" type="text" required="required" value="<%=conceptualVO.getFirstPayDate()%>"
                                   pattern="[0-9]{4}-[0-9]{2}-[0-9]{2}" id="firstPayDate">
                            <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
                        </div>
                    </dd>
                </div>
                <div class="form-group">
                    <dt>法定到期日</dt>
                    <dd>
                        <!-- 日期选择器，控制的脚本在sprial.js里 -->
                        <div class="input-group date form_date" data-date="" data-date-format="yyyy-mm-dd"
                             data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
                            <input class="form-control" size="16" type="text" required="required" value="<%=conceptualVO.getLawEndDate()%>"
                                   pattern="[0-9]{4}-[0-9]{2}-[0-9]{2}" id="lawEndDate">
                            <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
                        </div>
                    </dd>
                </div>
            </dl>

            <div class="row text-center">
                <button type="submit" class="btn btn-primary btn-lg btn-clean animated" onclick="analysis()">
                    分析
                </button>
                <button type="submit" class="btn btn-primary btn-lg btn-clean animated" onclick="save()">
                    保存方案
                </button>
            </div>
        </div>
        <!-- 分析结果显示组件块 -->
        <div class="col-md-6">
            <!-- 用户输入套件，用dl包起来，实现纵向对齐 -->
            <dl class="dl-horizontal">
                <div class="form-group">
                    <dt>证券类型：</dt>
                    <dd>
                        <span id="securityType"></span>
                    </dd>
                </div>
                <div class="form-group">
                    <dt>优先级：</dt>
                    <dd>
                        <span id="priority"></span>
                    </dd>
                </div>
                <div class="form-group">
                    <dt>证券简称：</dt>
                    <dd>
                        <span id="securityAbbreviation"></span>
                    </dd>
                </div>
                <div class="form-group">
                    <dt>发行金额占比：</dt>
                    <dd>
                        <span id="issueAmountProportion"></span>
                    </dd>
                </div>
                <div class="form-group">
                    <dt>发行金额：</dt>
                    <dd>
                        <span id="issueAmount"></span>
                    </dd>
                </div>
                <div class="form-group">
                    <dt>付息频率：</dt>
                    <dd>
                        <span id="interestPaymentFrequency"></span>
                    </dd>
                </div>
                <div class="form-group">
                    <dt>利率：</dt>
                    <dd>
                        <span id="interestRate"></span>
                    </dd>
                </div>
            </dl>
        </div>
    </div>

</div>

<%@ include file="/WEB-INF/jsps/components/message.jsp" %>
</body>

<script type="text/javascript">
    $("#mainnav a:contains('产品在线设计')").attr("id","current");

    function collectData() {
        return {
            "pname": "<%=conceptualVO.getPname()%>",
            "packageNumber": "<%=conceptualVO.getPackageNumber()%>",
            "sname": $("#sname").val(),
            "packageDate": $("#packageDate").text(),
            "startDate": $("#startDate").val(),
            "firstPayDate": $("#firstPayDate").val(),
            "lawEndDate": $("#lawEndDate").val(),
        };
    }

    function analysis() {
        $.ajax({
            type: "post",
            async: true, //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
            url: "/user/onlineDesign/productDesign/conceptualDesign/analysisConceptual", //请求发送到TestServlet处
            data: collectData(),
            dataType: "json", //返回数据形式
            success: (result) => {
                $("#securityType").text(result.securityType);
                $("#priority").text(result.priority);
                $("#securityAbbreviation").text(result.securityAbbreviation);
                $("#issueAmountProportion").text(result.issueAmountProportion);
                $("#issueAmount").text(result.issueAmount);
                $("#interestPaymentFrequency").text(result.interestPaymentFrequency);
                $("#interestRate").text(result.interestRate);
            },
        });
    }

    function save() {
        $.ajax({
            type: "post",
            async: true, //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
            url: "/user/onlineDesign/productDesign/conceptualDesign/saveConceptual", //请求发送到TestServlet处
            data: collectData(),
            dataType: "text", //返回数据形式
            success: (result) => {
                if(result==="SUCESS"){
                    $('body').after('<div id="bottom-alert" class="text-center alert alert-dismissible alert-success fade in navbar-fixed-bottom" role="alert"> <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button> <strong>保存成功</strong> </div>');
                }else {
                    $('body').after('<div id="bottom-alert" class="text-center alert alert-dismissible alert-danger fade in navbar-fixed-bottom" role="alert"> <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button> <strong>'+result+'</strong> </div>');
                }
                window.setTimeout(function () {
                    $('#bottom-alert').alert('close');
                }, 3000);
            },
        });
    }
</script>
</html>
