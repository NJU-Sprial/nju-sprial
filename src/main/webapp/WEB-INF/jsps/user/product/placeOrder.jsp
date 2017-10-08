<%--
  Created by IntelliJ IDEA.
  User: zjy
  Date: 2017/9/13
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>

<%@ include file="/WEB-INF/jsps/components/head.jsp" %>

<head>
    <title>购买产品</title>
</head>
<body>
<%@ include file="/WEB-INF/jsps/components/top_components.jsp" %>

<div class="container">
    <div class="top-margin form-container">
        <form action="/user/placeOrder/submit" method="post" autocomplete="true">
            <!-- 用户输入套件，用dl包起来，实现纵向对齐 -->
            <dl class="dl-horizontal">
                <div class="form-group col-xs-12 floating-label-form-group controls">
                    <dt>订单日期：</dt>
                    <dd>
                        <span><%= request.getAttribute("orderTime") %></span>
                    </dd>
                    <input type="text" name="orderTime" value="<%= request.getAttribute("orderTime") %>" style="display: none;"/>
                </div>
            </dl>
            <dl class="dl-horizontal">
                <div class="form-group col-xs-12 floating-label-form-group controls">
                    <dt>产品编号：</dt>
                    <dd>
                        <span><%= request.getAttribute("productID") %></span>
                    </dd>
                    <input type="text" name="productID" value="<%= request.getAttribute("productID") %>" style="display: none;"/>
                </div>
            </dl>
            <dl class="dl-horizontal">
                <div class="form-group col-xs-12 floating-label-form-group controls">
                    <dt>产品名称：</dt>
                    <dd>
                        <span><%= request.getAttribute("pname") %></span>
                    </dd>
                </div>
            </dl>
            <dl class="dl-horizontal">
                <div class="form-group col-xs-12 floating-label-form-group controls">
                    <dt>投资者：</dt>
                    <dd>
                        <span><%= request.getAttribute("username") %></span>
                    </dd>
                </div>
            </dl>
            <dl class="dl-horizontal">
                <div class="form-group col-xs-12 floating-label-form-group controls">
                    <dt>投资利率：</dt>
                    <dd>
                        <div class="input-group">
                            <input type="text" class="form-control" placeholder="请输入投资利率" required="required" name="interestRate" value="" onchange="number_validate(this,0,100)"/>
                            <div class="input-group-addon">%</div>
                        </div>
                        <span class="help-block">利率区间：<%= request.getAttribute("interestRange") %></span>
                    </dd>
                </div>
            </dl>
            <dl class="dl-horizontal">
                <div class="form-group col-xs-12 floating-label-form-group controls">
                    <dt>投资金额：</dt>
                    <dd>
                        <div class="input-group">
                            <input type="text" class="form-control" placeholder="请输入投资金额" required="required" name="amount" value=""  onchange="number_validate(this,0,Infinity)"/>
                            <div class="input-group-addon">元</div>
                        </div>
                    </dd>
                </div>
            </dl>
            <div class="text-center">
                <button type="submit" class="btn btn-lg btn-primary">
                    确认提交
                </button>
            </div>
        </form>
    </div>
</div>

<%@ include file="/WEB-INF/jsps/components/message.jsp" %>
</body>
<script type="text/javascript">
    $("#mainnav a:contains('在售商品')").attr("id","current");

    /**
     * 对元素的val()是否是合法数字进行判断
     * @param obj 元素的jquery对象
     * @param lowval 允许的最小值
     * @param hival 允许的最大值
     * @param defaultval （可选） 如果内容非法，则改成此值
     */
    function number_validate(obj, lowval, hival, defaultval) {
        if (/^-?([1-9]\d*\.?\d*|0\.\d*[1-9]\d*|0?\.0+|0)$/.test($(obj).val()) && (($(obj).val() >= lowval) && ($(obj).val() <= hival))) {
            $(obj).css("background-color", "white");//将背景恢复成白色
        } else {
            $(obj).val(defaultval);
            $(obj).css("background-color", "#FFFFCC");//将背景变成黄色以示提醒
        }
    }
</script>
</html>
