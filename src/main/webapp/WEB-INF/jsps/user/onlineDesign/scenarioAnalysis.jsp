<%@ page import="java.util.List" %><%--
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
    <script src="/js/echarts.min.js"></script>
</head>
<body>
<%@ include file="/WEB-INF/jsps/components/top_components.jsp" %>
<div class="container">
    <div class="top-margin ">
        <!-- 填参组件块 -->
        <div class="col-md-5 bottom-margin">
            <!-- 用户输入套件，用dl包起来，实现纵向对齐 -->
            <dl class="dl-horizontal">
                <div class="form-group">
                    <dt>项目名称</dt>
                    <dd>
                        <select class="form-control" style="max-width: 200px;" id="pname">
                            <%-- 每个项目映射一个选项 --%>
                            <% for (String pname : (List<String>) request.getAttribute("allProduct")) { %>
                            <option><%= pname %>
                            </option>
                            <% } %>
                        </select>
                    </dd>
                </div>
                <div class="form-group">
                    <dt>资产包编号</dt>
                    <dd>
                        <select class="form-control" style="max-width: 200px;" id="packageNumber">
                            <!-- 里面的选项通过用户选择了项目后发送的ajax的结果请求添加 -->
                        </select>
                    </dd>
                </div>
                <div class="form-group">
                    <dt>评估日期</dt>
                    <dd>
                        <!-- 日期选择器，控制的脚本在sprial.js里 -->
                        <div class="input-group date form_date" data-date="" data-date-format="yyyy/mm/dd"
                             data-link-field="dtp_input2" data-link-format="yyyy-mm-dd">
                            <input class="form-control" size="16" type="text" required="required"
                                   pattern="[0-9]{4}-[0-9]{2}-[0-9]{2}" id="assessDate">
                            <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
                        </div>
                    </dd>
                </div>
                <div class="form-group">
                    <dt>累计违约率</dt>
                    <dd>
                        <!-- pattern是正浮点数 -->
                        <input class="form-control" style="max-width: 100px;" required="required" value="0.05"
                               pattern="^[1-9]\d*\.\d*|0\.\d*[1-9]\d*$" id="TotalBreakOffRate"
                               onchange="number_validate(this,0,1,0.05)"/>
                    </dd>
                </div>
                <div class="form-group">
                    <dt>违约本金回收率</dt>
                    <dd>
                        <!-- pattern是正浮点数 -->
                        <input class="form-control" style="max-width: 100px;" required="required" value="0.05"
                               pattern="^[1-9]\d*\.\d*|0\.\d*[1-9]\d*$" id="BreakOffCapitalRecoverRate"
                               onchange="number_validate(this,0,1,0.05)"/>
                    </dd>
                </div>
            </dl>

            <div class="row text-center">
                <button type="submit" class="btn btn-primary btn-lg btn-clean animated" onclick="analysis()">
                    分析
                </button>
            </div>
        </div>
        <!-- 分析结果显示组件块 -->
        <div class="col-md-7">
            <div id="chart" style="width: 650px;height:320px;"></div>
            <script>
                // 基于准备好的dom，初始化echarts实例
                let myChartDom = document.getElementById('chart')
                //自适应宽高
//                function myChartPC() {
//                    myChartDom.style.width = $(window).width() / 2 + 'px';
//                    myChartDom.style.height = $(window).height() / 3 * 2 + 'px';
//                };
//                function myChartMobile() {
//                    myChartDom.style.width = $(window).width() + 'px';
//                    myChartDom.style.height = $(window).height() / 9 * 5 + 'px';
//                }
//                function myChartContainer() {
//                    if (isMobileBrowser()) {
//                        myChartMobile()
//                    }
//                    else {
//                        myChartPC()
//                    }
//                }
//                myChartContainer()
                let myChart = echarts.init(myChartDom);

                option = {
                    title: {
                        text: '现金流对比分析图',
                        textStyle:{
                            fontSize: 10
                        }
                    },
                    tooltip: {
                        trigger: 'axis'
                    },
                    legend: {
                        data: ['邮件营销', '联盟广告', '视频广告', '直接访问', '搜索引擎']
                    },
                    grid: {
                        left: '3%',
                        right: '4%',
                        bottom: '3%',
                        containLabel: true
                    },
                    toolbox: {
                        feature: {
                            saveAsImage: {}
                        }
                    },
                    xAxis: {
                        type: 'category',
                        boundaryGap: false,
                        data: ['周一', '周二', '周三', '周四', '周五', '周六', '周日']
                    },
                    yAxis: {
                        name: '金额(万元)',
                        type: 'value'
                    },
                    series: [
                        {
                            name: '邮件营销',
                            type: 'line',
                            stack: '总量',
                            data: [120, 132, 101, 134, 90, 230, 210]
                        },
                        {
                            name: '联盟广告',
                            type: 'line',
                            stack: '总量',
                            data: [220, 182, 191, 234, 290, 330, 310]
                        },
                        {
                            name: '视频广告',
                            type: 'line',
                            stack: '总量',
                            data: [150, 232, 201, 154, 190, 330, 410]
                        },
                        {
                            name: '直接访问',
                            type: 'line',
                            stack: '总量',
                            data: [320, 332, 301, 334, 390, 330, 320]
                        },
                        {
                            name: '搜索引擎',
                            type: 'line',
                            stack: '总量',
                            data: [820, 932, 901, 934, 1290, 1330, 1320]
                        }
                    ]
                };

                // 使用刚指定的配置项和数据显示图表。
                myChart.setOption(option)
                //浏览器大小改变时重置大小
                window.onresize = function () {
                    myChartContainer();
                    myChart.resize();
                };
            </script>
        </div>
    </div>

    <div>
        <table class="table table-bordered table-text-center">
            <thead>
            <tr>
                <th>期数</th>
                <th>日期</th>
                <th>本金现金流</th>
            </tr>
            </thead>
            <tbody class="center" id="capitalCashFlowDetail">
            </tbody>
        </table>
        <table class="table table-bordered table-text-center">
            <thead>
            <tr>
                <th>期数</th>
                <th>日期</th>
                <th>利息现金流</th>
            </tr>
            </thead>
            <tbody class="center" id="interestCashFlowDetail">
            </tbody>
        </table>
        <table class="table table-bordered table-text-center">
            <thead>
            <tr>
                <th>期数</th>
                <th>日期</th>
                <th>本息现金流</th>
            </tr>
            </thead>
            <tbody class="center" id="capitalAndInterestCashFlowDetail">
            </tbody>
        </table>
    </div>
</div>

<%@ include file="/WEB-INF/jsps/components/message.jsp" %>
</body>

<script type="text/javascript">
    $(document).ready(function () {
        //每次选中项目名称变更时获取对应的所有资产包编号
        function pnameChange() {
            $.ajax({
                    type: "post",
                    async: true, //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
                    url: "/user/onlineDesign/productDesign/scenarioAnalysis/packageNumbers", //请求发送到TestServlet处
                    data: {
                        "pname": $("#pname").val()
                    },
                    dataType: "json", //返回数据形式
                    success: (result) = > {
                    //修改资产包编号的选项
                    $("#packageNumber").children().remove();
            for (let index = 0; index < result.length; index++) {
                $("#packageNumber").append("<option>" + result[index] + "</option>");
            }
        },
        })
            ;
        }

        $("#pname").change(pnameChange);

        pnameChange();
        $(".form_date > input").val((new Date()).Format("yyyy-MM-dd"));
    });

    function analysis() {
        $.ajax({
                type: "post",
                async: true, //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
                url: "/user/onlineDesign/productDesign/scenarioAnalysis/analysis", //请求发送到TestServlet处
                data: {
                    "pname": $("#pname").val(),
                    "packageNumber": $("#packageNumber").val(),
                    "assessDate": $("#assessDate").val(),
                    "TotalBreakOffRate": $("#TotalBreakOffRate").val(),
                    "BreakOffCapitalRecoverRate": $("#BreakOffCapitalRecoverRate").val(),
                },
                dataType: "json", //返回数据形式
                success: (result) = > {
                addRow($("#capitalCashFlowDetail"), result.capitalCashFlowDetailList, "capitalCashFlow");
        addRow($("#interestCashFlowDetail"), result.interestCashFlowDetailList, "interestCashFlow");
        addRow($("#capitalAndInterestCashFlowDetail"), result.capitalAndInterestCashFlowDetailList, "capitalAndInterestCashFlow");
    },
    })
        ;
    }

    function addRow(tbody, data, messageName) {
        tbody.children().remove();
        for (let i = 0; i < data.length; i++) {
            let rowData = data[i];
            tbody.append("<tr><td>" + rowData.cycleNum + "</td><td>" + new Date(rowData.date.year, rowData.date.month, rowData.date.day).Format("yyyy-MM-dd") + "</td><td>" + rowData[messageName] + "</td></tr>");
        }
    }

    /**
     * 对元素的val()是否是合法数字进行判断
     * @param obj 元素的jquery对象
     * @param lowval 允许的最小值
     * @param hival 允许的最大值
     * @param defaultval （可选） 如果内容非法，则改成此值
     */
    function number_validate(obj, lowval, hival, defaultval) {
        if (/^-?([1-9]\d*\.\d*|0\.\d*[1-9]\d*|0?\.0+|0)$/.test($(obj).val()) && (($(obj).val() >= lowval) && ($(obj).val() <= hival))) {
            $(obj).css("background-color", "white");//将背景恢复成白色
        } else {
            $(obj).val(defaultval);
            $(obj).css("background-color", "#FFFFCC");//将背景变成黄色以示提醒
        }
    }
</script>
</html>
