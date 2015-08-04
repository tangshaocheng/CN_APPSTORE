<html>
<head>
<meta charset="utf-8">
</head>
<body>
	<h2></h2>
	<form method="post"
		action="<%=request.getContextPath()%>/user?method=add">
		mac:<input type="text" name="mac" id="name"> appName:<input
			type="text" name="appName" id="author"> <input type="submit"
			value="Add">
	</form>
</body>
</html>
