<%--
  Created by IntelliJ IDEA.
  User: fengtiepeng
  Date: 2017/7/17
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/js/layui/css/layui.css">
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.tmpl.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap-paginator.js"></script>
<script  src="${pageContext.request.contextPath}/js/layui/layui.js"></script>
<head>
    <title>欢迎访问视频服务</title>
</head>
<body>
    <div  class="container" >
        <h1  class="text-center">welcome</h1>

        <div>
            <div class="input-group">
                <span class="input-group-addon" >筛选:</span>
                <select class="form-control" id="disks" ></select>
                <span  class="input-group-addon btn btn-default" id="scanning">确定</span>
            </div>

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

        <table class="table table-bordered table-hover table-condensed table-striped text-center" id="j-table-1">
            <thead>
            <tr>
                <th>视频名称</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody id="videLink">
            </tbody>
        </table>

        <div id="fenye"></div>


    </div>

    <!-- 视频下载模态框（Modal） -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                    <h4 class="modal-title" id="myModalLabel">

                    </h4>
                </div>
                <div class="modal-body" id="links">

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                    </button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal -->
    </div>

<script id="videLinkTemplate" type="text/x-jquery-tmpl">
{{each(i,item) links}}
    <tr>
        <td>
            <a href="${pageContext.request.contextPath}/showVideo?id={{= item.id}}" >
            <span class="text-center">{{= item.name}}</span>
            </a>
        </td>
 		<td>
           <button type="button" class="btn btn-info btn-xs j-set" onclick="dowloadVideo({{= item.id}});" data-toggle="modal" data-target="#myModal">下载</button>
		   <button type="button" class="btn btn-info btn-xs j-set" onclick="delVideo(this);" value="{{= item.id}}">删除</button>
        </td>
    </tr>
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
<script  charset="utf-8"  src="${pageContext.request.contextPath}/js/utils.js"></script>
<script  charset="utf-8"  src="${pageContext.request.contextPath}/js/index.js"></script>
</body>
</html>
