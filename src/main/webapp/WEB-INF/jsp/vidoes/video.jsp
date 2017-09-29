<%--
  Created by IntelliJ IDEA.
  User: fengtiepeng
  Date: 2017/7/18
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>播放器</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="description" content="">
    <meta name="keywords" content="">
    <script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <link href="" rel="stylesheet">
    <style type="text/css">
        #modelView{background-color:#DDDDDD;z-index:0;opacity:0.7;height: 100%;width: 100%;position: relative;}
        .playvideo{padding-top: auto;z-index: 9999;position: relative;}
        .zy_media{z-index: 999999999}
    </style>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/zy.media.min.css">
</head>
<body onmousewheel="return false;">

<div class="playvideo">
    <div class="zy_media">
        <video id="audio_id" data-config='{"mediaTitle": "播放视频--${videoName}"}'>
            <source src="${uri}" type="video/mp4">
            您的浏览器不支持HTML5视频
        </video>
    </div>
    <div id="modelView">&nbsp;</div>
</div>

<script src="${pageContext.request.contextPath}/js/zy.media.min.js"></script>
<script>
    //document.documentElement.style.overflow='hidden';
    document.body.style.overflow='hidden';
    zymedia('video',{autoplay: true});
    var screenheight = window.screen.height/2;
    $("#modelView").width(window.screen.width);
    $("#modelView").height(window.screen.height);
    var videoheight = $(".zy_media").height()/2;
    var padding_top = screenheight-videoheight;
    $(".playvideo").css({"top":padding_top});
    $("#modelView").css({"margin-top":-1*(padding_top+$(".zy_media").height())});

</script>
</body>
</html>
