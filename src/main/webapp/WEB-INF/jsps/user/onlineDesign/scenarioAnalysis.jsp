<%--
  Created by IntelliJ IDEA.
  User: zjy
  Date: 2017/9/6
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<html>

<%@ include file="/WEB-INF/jsps/components/head.jsp" %>

<head>
    <title>情景分析</title>
</head>
<body>
<%@ include file="/WEB-INF/jsps/components/top_components.jsp" %>
<div class="container">
    <!-- 填参组件块 -->
    <div class="col-md-6">
        <dl class="dl-horizontal">
            <dt>项目名称</dt>
            <dd>
                <select class="form-control" style="max-width: 120px;" id="pname">
                    <option selected="selected">沪深300</option>
                    <option >随机500</option>
                    <option >沪深A股</option>
                    <option >中小板</option>
                    <option >创业板</option>
                    <option >自选股票池</option>
                </select>
            </dd>
            <dt>资产包编号</dt>
            <dd>
                <select class="form-control" style="max-width: 120px;">
                </select>
            </dd>
            <dt>评估日期</dt>
            <dd>
                <div class="input-group date form_date" data-date="" data-date-format="yyyy/mm/dd"
                     data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
                    <input class="form-control" size="16" type="text" required="required" value="new Date()"
                           pattern="[0-9]{4}-[0-9]{2}-[0-9]{2}" id="assess-date">
                    <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
                </div>
            </dd>
            <dt>累计违约率</dt>
            <dd>
                <input>
            </dd>
            <dt>违约本金回收率</dt>
            <dd>
                <input>
            </dd>
        </dl>
    </div>
    <!-- 分析结果显示组件块 -->
    <div class="col-md-6">

    </div>
</div>

<%@ include file="/WEB-INF/jsps/components/message.jsp" %>
</body>

<script type="text/javascript">
    $(document).ready(function () {
        $("#pname").change(function () {
            $.ajax({
                type: "post",
                async: true, //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
                url: "/user/onlineDesign/productDesign/scenarioAnalysis/packageNumbers", //请求发送到TestServlet处
                data: {
                    "pname": $("#pname").val()
                },
                dataType: "json", //返回数据形式
                success: (result) => {
                    console.log(result);
                },
            });
        })
    });
</script>
</html>
