<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<meta charset="utf-8">
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>505</title>
<meta name="description" content="">
<meta name="keywords" content="">
<link href="" rel="stylesheet">
<style>
	*{
		margin: 0;
		padding: 0;
	}
	html,body{
		background: #D5DFF7;
		height: 100%;
	}
	div.p404,div.p500{
		width: 70%;
		height: 70%;
		border: #fff solid 2px;
		background: #f1f1f1;
		background: linear-gradient(#f1f1f1,#A7BEF9);
		margin: 5% auto;
	}
	div p{
		margin-top: 3%;
		font-size: 40px;
		text-align: center;
		font-family: 'Consolas';
		color: #474747;
	}
	div p a{
		font-size: 20px;
		text-decoration: none;
		font-family: '黑体';
		color: #666;
	}
</style>
</head>
<body>
    <div class="p500">
    	<p style="font-size: 100px;color: #BC1717; margin-top:10%;">500</p>
    	<p style="font-family: '黑体'">服务器内部错误或非法操作,请联系管理员</p>
    	<p>
    		<a href="javascript:window.history.go(-1)">→上一页</a>
    	</p>
    </div>
</body>
</html>