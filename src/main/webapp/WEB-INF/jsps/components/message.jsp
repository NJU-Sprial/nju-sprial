<%--
  Created by IntelliJ IDEA.
  User: zjy
  Date: 2017/9/5
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<% if (request.getAttribute("alertMessage")!=null) { %>

<!-- 底部的消息栏，如果模板发现有alertMessage，就会显示，否则不显示 -->
<div fragment="message" id="message-alert" class="text-center alert alert-dismissible ${alertType} fade in navbar-fixed-bottom"
     role="alert">
    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
        <span aria-hidden="true">&times;</span>
    </button>
    <strong>${alertMessage}</strong>

    <script type="text/javascript">
        window.setTimeout(function () {
            $("#message-alert").alert("close");
        }, 3000);
    </script>
</div>

<% } %>