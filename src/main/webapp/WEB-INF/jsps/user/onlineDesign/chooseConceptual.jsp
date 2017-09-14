<%@ page import="java.util.List" %><%--
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
<div class="container">
    <div class="top-margin ">
        <% for(String pname:(List<String>) request.getAttribute("allProduct")){ %>
        <div>
            <span class="blockquote-reverse"><%=pname%></span>
            <% for(String packageNumber:(List<String>) request.getAttribute(pname)){ %>
            <a style="padding-left: 45px;" href="/user/onlineDesign/productDesign/conceptualDesign/<%= pname %>/<%= packageNumber %>"><%=packageNumber%></a>
            <% } %>
        </div>
        <% } %>
    </div>

</div>

<%@ include file="/WEB-INF/jsps/components/message.jsp" %>
<script type="text/javascript" src="/js/ItemSelect.js"></script>
</body>
</html>
