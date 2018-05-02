var pageNo=1;
var pageSize=10;
$(document).ready(function(){
	showDisk();
	showLink();

	function showLink() {
		$.ajax({
			type:'GET',
			data:{
				"pageNo":pageNo,
				"pageSize":pageSize,
				"type":"jpg"
			},
			url:"/ssm/showLink",
			success:function(data){
				console.log(data);
				$("#videLink").empty();
				$("#videLinkTemplate").tmpl({links:data.data}).appendTo("#videLink");
                fenye("fenye",data,showPage);
			},
			error:function(){
				alert("加载视频列表失败");
			}
		})
	}

    function showPage(obj) {
        $.ajax({
            type:'GET',
            data:{
                "pageNo":obj.curr,
                "pageSize":obj.limit,
                "type":"jpg"
            },
            url:"/ssm/showLink",
            success:function(data){
                $("#videLink").empty();
                $("#videLinkTemplate").tmpl({links:data.data}).appendTo("#videLink");
            },
            error:function(){
                showalert("加载视频列表失败");
            }
        })
    }

	function showDisk() {
		$.ajax({
			type:'GET',
			dataType: "json",
			url:"/ssm/Disks",
			success:function(data){
				console.log(data);
				$("#disks").empty();
				$("#disksTemplate").tmpl({_disks:data}).appendTo("#disks");
			},
			error:function(){
				alert("加载磁盘列表失败");
			}
		})
	}

	$("#scanning").click(function () {
		$("#disks").attr("disabled","disabled");
		var dir=$("#disks").val();
		if(dir!=0){
			$.ajax({
				type:'GET',
				data:{
					"dir":dir
				},
				dataType: "json",
				url:"/ssm/init",
				success:function(data){
					$("#disks").removeAttr("disabled");
					alert("已添加"+data+"条视频!");
					showLink();
				},
				error:function(){
					alert("添加磁盘文件失败");
				}
			})
		}
	});

	$("#myButton4").click(function(){
		$(this).button('扫描中...').delay(1000).queue(function() {
			$(this).button('complete');
		});
	});

	$("#videoQuery").blur(function () {
		$.ajax({
			type:'GET',
			data:{
				"name":$("#videoQuery").val(),
				"pageNo":pageNo,
				"pageSize":pageSize
			},
			url:"/ssm/showLink",
			success:function(data){
				console.log(data);
				$("#videLink").empty();
				$("#videLinkTemplate").tmpl({links:data.data}).appendTo("#videLink");
				pageing(data.record);
			},
			error:function(){
				alert("加载视频列表失败");
			}
		})
	});


})

function delVideo(video) {
	console.log(video.value);
	$.ajax({
		type:'GET',
		data:{
			"vid":video.value
		},
		url:"/ssm/delVideo",
		success:function(){
			//alert("删除成功！");
			var s=video;
			console.log(s.parentNode);
			var node1=s.parentNode;
			node1.parentNode.removeChild(node1);
			//window.location.reload(true);
			//showLink();
		},
		error:function(){
			alert("删除失败，请联系管理员!");
		}
	})
}

