<%@ page import="java.util.List" %>
<%@ page import="vo.ProjectCooperationVO" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xiaoJun
  Date: 2017/9/12
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!--[if IE 8 ]><html class="ie" xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en-US" lang="en-US"><!--<![endif]-->

<%@ include file="/WEB-INF/jsps/components/head.jsp" %>

<head>
    <title>发行协作平台</title>

    <link rel="stylesheet" type="text/css" href="/css/demo.css">

    <link rel="stylesheet" type="text/css" href="/css/cooperation.css">
</head>
<body>
<%@ include file="/WEB-INF/jsps/components/top_components.jsp" %>
<div class="boxed blog">

    <section class="flat-row pd-contact-v1">
        <div class="container">
            <div class="row">
                <div class="col-md-1">

                </div> <!-- /.col-md-1 -->

                <div class="col-md-10">
                    <table class="table table-hover">
                        <thead>
                        <tr>
                            <th>项目名称</th>
                            <th>项目进度</th>
                            <th>人员安排</th>
                            <th>用户操作</th>
                            <th>文件</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach var="ProjectCooperationVO" items="${cooperationProjectList}">
                            <tr>
                                <td>${ProjectCooperationVO.getProjectName()}</td>
                                <td>${ProjectCooperationVO.getProjectProgress()}</td>
                                <td>
                                    <c:forEach var="ParterVO" items="${ProjectCooperationVO.getPartnerInfo()}">
                                        <div>
                                            ${ParterVO.getName()} ${ParterVO.getGender()} ${ParterVO.getWorkUnit()} ${ParterVO.getPosition()}
                                        </div>
                                    </c:forEach>
                                </td>
                                <td><button class="cooperationConfirmButton">确认发行</button></td>
                                <td><span>
                                        <button class="cooperationFileButton">文件下载</button>
                                        <button class="cooperationFileButton">文件上传</button>
                                </span></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div> <!-- /.col-md-10 -->

                <div class="col-md-1">

                </div>
            </div><!-- /.row -->
        </div><!-- /.container -->
    </section><!-- /.flat-row-iconbox -->

<%@ include file="/WEB-INF/jsps/components/message.jsp" %>

</div> <!-- /.boxed -->

<!-- Javascript -->
<script type="text/javascript" src="/js/waypoints.min.js"></script>
</body>
</html>

