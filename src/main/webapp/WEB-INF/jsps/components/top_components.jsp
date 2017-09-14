<%@ page import="web.security.WebSecurityConfig" %><%--
  Created by IntelliJ IDEA.
  User: 铠联
  Date: 2017/9/10
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div class="top">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <ul class="flat-infomation">
                    <li class="phone">Call us: <a href="+61383766284" title="phone">+61 3 8376 6284</a></li>
                    <li class="email">Email: <a href="mailto:support24-7@gmail.com"
                                                title="email">support24-7@gmail.com</a></li>
                </ul><!-- /flat-infomation -->
                <div class="flat-questions">
                    <a href="#" title="" class="appointment">获得帮助</a>
                </div><!-- /.flat-questions -->
                <div class="clearfix"></div><!-- /.clearfix -->
            </div>
        </div>
    </div>
</div>
<!-- /.top -->
<header id="header" class="header bg-color">
    <div class="container">
        <div class="row">
            <div class="header-wrap">
                <div class="col-md-2">
                    <div id="logo" class="logo">
                        <a href="#" title="">
                            <img src="/images/log.gif" alt="logo sec"/>
                        </a>
                    </div><!-- /#logo -->
                </div><!-- /.col-md-2 -->
                <div class="col-md-10">
                    <div class="nav-wrap">
                        <div class="btn-menu">
                            <span></span>
                        </div><!-- //mobile menu button -->
                        <nav id="mainnav" class="collapse navbar-collapse menu">
                            <ul class="nav navbar-nav sf-menu menu">
                                <li>
                                    <a id="current" href="/">
                                        首页
                                    </a>
                                </li>
                                <% if (session.getAttribute(WebSecurityConfig.SESSION_KEY)==null) { %>
                                <li><a href="/login" title="">登录</a></li>

                                <% } else { %>
                                <li>
                                    <a href="#" class="sf-with-ul">
                                        产品在线设计
                                    </a>
                                    <ul>
                                        <li>
                                            <a href="#" class="sf-with-ul">
                                                资产池管理
                                            </a>
                                            <ul>
                                                <li><a href="/user/onlineDesign/importData" class="sf-with-ul">数据导入</a></li>
                                                <li><a href="/user/onlineDesign/browseAndKeep" class="sf-with-ul">浏览维护</a></li>
                                                <li><a href="/user/onlineDesign/addMoreData" class="sf-with-ul">数据追加</a></li>
                                            </ul>
                                        </li>
                                        <li>
                                            <a href="#" class="sf-with-ul">
                                                资产包管理
                                            </a>
                                            <ul>
                                                <li><a href="/user/onlineDesign/packageManage/packageCreate" class="sf-with-ul">资产包创建</a></li>
                                                <li><a href="/user/onlineDesign/packageManage/packageBrowse" class="sf-with-ul">浏览维护</a></li>
                                                <li><a href="/user/onlineDesign/packageManage/packageAnalysis" class="sf-with-ul">统计分析</a></li>
                                                <li><a href="/user/onlineDesign/packageManage/packageMeasure" class="sf-with-ul">现金流测算</a></li>
                                            </ul>
                                        </li>
                                        <li>
                                            <a href="#" class="sf-with-ul">
                                                产品设计
                                            </a>
                                            <ul>
                                                <li><a href="#" class="sf-with-ul">项目情景</a></li>
                                                <li><a href="#" class="sf-with-ul">方案设计</a></li>
                                            </ul>
                                        </li>

                                    </ul>
                                </li>
                                <li>
                                    <a href="#" class="sf-with-ul">
                                        发行协作平台
                                    </a>
                                    <ul>
                                        <li><a href="/user/cooperationPlatform" class="sf-with-ul">项目列表</a></li>

                                    </ul>
                                </li>
                                <li>
                                    <a href="#" class="sf-with-ul">
                                        募集期管理平台
                                    </a>
                                    <ul>
                                        <li><a href="/user/ManagementPlatform" class="sf-with-ul">管理产品列表</a></li>
                                    </ul>
                                </li>
                                <li><a href="/logout">注销</a></li>
                                <% } %>
                            </ul>
                        </nav>
                    </div><!-- /.nav-wrap -->
                </div><!-- /.col-md-9 -->
            </div><!-- /.header-wrap -->
        </div><!-- /.row -->
    </div><!-- /.container -->
</header>
<script>
    $("#logo img" ).css("max-width","43%");
</script>
<!-- /header -->

