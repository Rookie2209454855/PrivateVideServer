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
    <link href="${pageContext.request.contextPath}/css/video-js.css" rel="stylesheet">
    <style>
        body{background-color: #191919}
        .m{ width: 740px; height: 400px; margin-left: auto; margin-right: auto; margin-top: 100px; }
    </style>
</head>
<body onmousewheel="return false;">

<%--<div class="playvideo">
    <div class="zy_media">
        <video id="audio_id" data-config='{"mediaTitle": "播放视频--${videoName}"}'>
            <source src="${uri}" type="video/mp4">
            您的浏览器不支持HTML5视频
        </video>
    </div>
    <div id="modelView">&nbsp;</div>
</div>--%>

<div class="m">
    <video id="audio_id" class="video-js" controls preload="auto" width="740" height="400"
           poster="" data-setup="{}">
        <source src="${uri}" type="video/mp4">
        <source src="${uri}" type="video/webm">
        <source src="${uri}" type="video/ogg">
        <p class="vjs-no-js">
            To view this video please enable JavaScript, and consider upgrading to a web browser that
            <a href="http://videojs.com/html5-video-support/" target="_blank">supports HTML5 video</a>
        </p>
    </video>
    <script src=${pageContext.request.contextPath}/js/video.min.js"></script>
    <script type="text/javascript">
        var myPlayer = videojs('my-video');
        videojs("my-video").ready(function(){
            var myPlayer = this;
            myPlayer.play();
        });
    </script>
</div>
</body>
</html>
