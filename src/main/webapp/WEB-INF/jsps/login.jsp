<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<%@ include file="/WEB-INF/jsps/components/head.jsp" %>

<head>
<title>登录</title>
</head>
<body>
<%@ include file="/WEB-INF/jsps/components/top_components.jsp" %>
<div class="container">
	<div class="content">
		<form action="/loginPost" method="post" autocomplete="true">
			<div class="row control-group">
				<div class="form-group col-xs-12 floating-label-form-group controls">
					<label>用户名</label>
					<input type="text" class="form-control" placeholder="请输入用户名..." id="username_field"
						   name="username" required="required" title="在这里填写用户名"/>
				</div>
			</div>
			<div class="row control-group">
				<div class="form-group col-xs-12 floating-label-form-group controls">
					<label>密码</label>
					<input type="password" class="form-control" placeholder="请输入密码..." id="password_field"
						   name="password" required="required" title="在这里输入密码"/>
				</div>
			</div>
			<div class="text-center" style="margin: 20px 0;">
				<button type="submit"
						class="btn-primary bloc-button btn btn-lg btn-block animated"
						id="signInButton">
					登陆
				</button>
			</div>
		</form>
		<div class= "text-center"> 还没有账户？<br/> <a class="text-info" href="/signUp"><b>现在注册</b></a>
		</div>
	</div>
</div>

<%@ include file="/WEB-INF/jsps/components/message.jsp" %>
</body>
<script type="text/javascript">
    $("#mainnav a:contains('登录')").attr("id","current");
</script>
</html>