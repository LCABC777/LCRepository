<%@ page language="java" import="java.util.*,com.lc.pojo.User"
	contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>"></base>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.js"></script>
</head>


<body>

	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">首页</a></li>
			<li><a href="#">个人信息</a></li>
			<li><a href="#">查看个人信息</a></li>
		</ul>
	</div>
	<div class="rightinfo">
		<table class="tablelist">
			<thead>
				<tr>
					<th><input name="" type="checkbox" value="" checked="checked" /></th>
					<th style="font-size: 16px">用户id<i class="sort"><img
							src="images/px.gif" /></i></th>
					<th>用户名</th>
					<th>密码</th>
					<th>性别</th>
					<th>年龄</th>
					<th>出生日期</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td><input name="" type="checkbox" value="" /></td>
					<td>${user.uid}</td>
					<td>${user.uname}</td>
					<td>${user.pwd}</td>
					<td>${user.sex}</td>
					<td>${user.age}</td>
					<td>${user.birth}</td>
				</tr>
			</tbody>
		</table>
	</div>

</body>

</html>
