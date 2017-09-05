<%@ page import="web.security.WebSecurityConfig" %><%--
  Created by IntelliJ IDEA.
  User: 铠联
  Date: 2017/9/5
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
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
</div><!-- /.top -->
<header id="header" class="header bg-color">
    <div class="container">
        <div class="row">
            <div class="header-wrap">
                <div class="col-md-2">
                    <div id="logo" class="logo">
                        <a href="#" title="">
                            <img src="/images/logo-blog.png" alt="logo Finance Business"/>
                        </a>
                    </div><!-- /#logo -->
                </div><!-- /.col-md-2 -->
                <div class="col-md-10">
                    <div class="flat-show-search">
                        <div class="show-search">
                            <a href="#"><i class="fa fa-search"></i></a>
                        </div>
                        <div class="top-search">
                            <form action="#" id="searchform-all" method="get">
                                <div>
                                    <input type="text" id="s" class="sss" placeholder="Search..."/>
                                    <input type="submit" value="" id="searchsubmit"/>
                                </div>
                            </form>
                        </div> <!-- /.top-search -->
                    </div>    <!-- /.flat-show-search -->
                    <div class="nav-wrap">
                        <div class="btn-menu">
                            <span></span>
                        </div><!-- //mobile menu button -->
                        <nav id="mainnav" class="mainnav">
                            <ul class="menu">
                                <li><a href="/" title="">首页</a></li>

                                <% if (session.getAttribute(WebSecurityConfig.SESSION_KEY)==null) { %>
                                <li><a href="/login" title="">登录</a></li>

                                <% } else { %>
                                <li><a href="/onlineDesign/importData" title="">产品在线设计</a></li>
                                <li><a href="#" title="">发行协作平台</a></li>
                                <li><a href="/user/ManagementPlatform" title="">募集期管理平台</a></li>
                                <li><a href="/logout" title="">注销</a></li>
                                <% } %>

                            </ul><!-- /.menu -->
                        </nav><!-- /#mainnav -->
                    </div><!-- /.nav-wrap -->
                </div><!-- /.col-md-9 -->
            </div><!-- /.header-wrap -->
        </div><!-- /.row -->
    </div><!-- /.container -->
</header><!-- /header -->