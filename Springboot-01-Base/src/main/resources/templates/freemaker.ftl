<html>
	<head>
		<title>title</title>
		<meta charset="utf-8" />
	</head>
	<body>
		<table border="1px">
			<tr>
				<td>name</td>
				<td>pwd</td>
			</tr>
			<#list lu as user>
				<tr>
					<td>${user.name}</td>
					<td>${user.pwd}</td>
				</tr>
			</#list> 
		</table>
	</body>
</html>