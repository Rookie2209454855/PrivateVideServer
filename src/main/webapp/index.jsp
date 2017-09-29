<%--
  Created by IntelliJ IDEA.
  User: fengtiepeng
  Date: 2017/7/17
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.tmpl.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-paginator.js"></script>
<head>
    <title>欢迎访问视频服务</title>
</head>
<body>
    <div  class="container" >
        <h1  class="text-center">welcome</h1>

        <div class="input-group">
            <select class="form-control" id="disks"></select>
            <span class="input-group-addon" id="scanning">扫描</span>
        </div>

        <div class="input-group">
            <span class="input-group-addon">搜索</span>
            <input type="text" id="videoQuery" class="form-control" placeholder="请输入视频名称!">
        </div>
    </div>


    <div>

        <ul class="nav nav-pills text-center">
            <li class="active" onclick="addActive(this);"><a href="#">视频</a></li>
            <li onclick="addActive(this);"><a href="${pageContext.request.contextPath}/showImages">图片</a></li>
            <li onclick="addActive(this);"><a href="#">小说</a></li>
        </ul>

        <div id="videLink">

        </div>


        <ul class="pagination">

        </ul>

    </div>
</div>
<script id="videLinkTemplate" type="text/x-jquery-tmpl">
{{each(i,item) links}}
    <div class="list-group-item ">
         <a href="${pageContext.request.contextPath}/showVideo?id={{= item.id}}" >
             <span class="text-center">{{= item.name}}</span>
         </a>
         <button type="button" class="btn btn-warning btn-sm pull-right" onclick="delVideo(this);" value="{{= item.id}}">删除</button>
    </div>
{{/each}}
</script>
<script id="disksTemplate" type="text/x-jquery-tmpl">
<option value="0">请选择</option>
{{each(i,disk) _disks}}
    <option value="{{= disk.diskLable}}">{{= disk.diskName}}</option>
{{/each}}
</script>
<script type="text/javascript">
        function addActive(actv) {
            console.log(actv);
            $(".active").removeAttr("class");
            actv.setAttribute("class","active");
        }
</script>
<script  charset="utf-8"  src="${pageContext.request.contextPath}/js/index.js"></script>
</body>
</html>
