<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<%@ include file="/WEB-INF/jsps/components/head.jsp" %>

<head>
<title>注册</title>
</head>
<body>
<%@ include file="/WEB-INF/jsps/components/top_components.jsp" %>
<div class="container">
	<div class="content">
		<form action="/signUpPost" method="post" name="signUp" autocomplete="true">
			<div class="row col-md-12 control-group">
				<div class="form-group col-xs-12 floating-label-form-group controls">
					<label>用户类型</label>
					<!-- 这个是不可见的输入框，value的值通过脚本sprial.js修改，提交表单时内容会提交上去 -->
					<input type="text" name="userType" value="SecuritiesTrader"
						   style="visibility: hidden;max-height: 0;border: 0;padding: 0;margin: 0;">
					<!-- 这个列表只是给用户看的，里面的选项是否选定和最后提交的内容无关 -->
					<ul>
						<li class="select-item selected btn btn-default" role="menuitem">
							券商
						</li>
						<li class="select-item btn btn-default" role="menuitem">
							投资人
						</li>
						<li class="select-item btn btn-default" role="menuitem">
							中介
						</li>
					</ul>
				</div>
			</div>
			<div class="col-md-6">
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
				<div class="row control-group">
					<div class="form-group col-xs-12 floating-label-form-group controls">
						<label>密码确认</label>
						<input type="password" class="form-control" placeholder="请再次输入密码..."
							   id="password_confirm_field" name="password_confirm"
							   required="required" title="在这里输入密码"/>
					</div>
				</div>
				<div class="row control-group">
					<div class="form-group col-xs-12 floating-label-form-group controls">
						<label>姓名</label>
						<input type="text" class="form-control" placeholder=""
							   id="name_field" name="name"
							   required="required" title="在这里输入姓名"/>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="row control-group">
					<div class="form-group col-xs-12 floating-label-form-group controls">
						<label>所属公司</label>
						<input type="text" class="form-control" placeholder=""
							   id="company_field" name="company"
							   required="required" title="在这里输入所属公司"/>
					</div>
				</div>
				<div class="row control-group">
					<div class="form-group col-xs-12 floating-label-form-group controls">
						<label>工作邮箱</label>
						<div class="form-inline">
							<input type="email" class="form-control" style="min-width: 300px;" placeholder=""
								   id="e_mail_field" name="e_mail"
								   required="required" title="在这里输入工作邮箱"/>
							<a class="btn btn-info pull-right" style="margin-top: 5px;" id="sendAuthenticationCode">
								发送验证码
								<script type="text/javascript">
                                    $("#sendAuthenticationCode").click(function () {
                                        $.ajax({
                                            type: "post",
                                            async: true, //异步请求（同步请求将会锁住浏览器，用户其他操作必须等待请求完成才可以执行）
                                            url: "/signUp/sendAuthenticationCode", //请求发送到TestServlet处
											data: {
                                                "e_mail": $("#e_mail_field").val()
											},
                                            dataType: "text", //返回数据形式为text
                                            success: (result) => {
                                                if("SUCESS" === result){
                                                    $('body').after('<div id="bottom-alert" class="text-center alert alert-dismissible alert-success fade in navbar-fixed-bottom" role="alert"> <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button> <strong>验证邮件已发送</strong> </div>');
												}else {
                                                    $('body').after('<div id="bottom-alert" class="text-center alert alert-dismissible alert-danger fade in navbar-fixed-bottom" role="alert"> <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button> <strong>'+result+'</strong> </div>');
                                                }
                                                window.setTimeout(function () {
                                                    $('#bottom-alert').alert('close');
                                                }, 3000);
                                            },
                                        });
                                    });
								</script>
							</a>
						</div>
					</div>
				</div>
				<div class="row control-group">
					<div class="form-group col-xs-12 floating-label-form-group controls">
						<label>认证码</label>
						<input type="text" class="form-control" placeholder=""
							   id="authenticationCode_field" name="authenticationCode"
							   required="required" title="在这里输入认证码"/>
					</div>
				</div>
				<div class="row control-group">
					<div class="form-group col-xs-12 floating-label-form-group controls">
						<label>工作电话</label>
						<input type="tel" class="form-control" placeholder=""
							   id="phoneNumber_field" name="phoneNumber"
							   required="required" title="在这里输入工作电话"/>
					</div>
				</div>
			</div>
			<div class="row col-md-12 text-center" style="margin: 20px 0;">
				<button type="submit"
						class="btn-success bloc-button btn btn-lg btn-block animated"
						id="signUpButton">
					立即注册
				</button>

				<script type="text/javascript">
                    $(function () {

                        $("#signUpButton").click(function () {

                            let pwd = $('#password_field').val();

                            let cpwd = $('#password_confirm_field').val();
                            if (pwd !== cpwd) {
                                $('body').after('<div id="bottom-alert" class="text-center alert alert-dismissible alert-danger fade in navbar-fixed-bottom" role="alert"> <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button> <strong>两次输入的密码不一致！</strong> </div>');

                                window.setTimeout(function () {
                                    $('#bottom-alert').alert('close');
                                }, 3000);

                                return false;
                            }
                        });
                    });
				</script>
			</div>
		</form>
	</div>
</div>

<%@ include file="/WEB-INF/jsps/components/message.jsp" %>
</body>
</html>