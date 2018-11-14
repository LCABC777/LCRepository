<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
		<table border="1" align="center" width="50%">
			<thead>
				<tr>
					<td>name</td>
					<td>pwd</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${lu}" var="u">
					<tr>
						<td>${u.name}</td>
						<td>${u.pwd}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</form>
</body>
</html>