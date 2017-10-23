<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>

</head>
<body class="theme-3">
	<jsp:include page="../common/common_head.jsp" flush="false"/>
	<jsp:include page="../common/common_left.jsp" flush="false"/>
	<div class="content">
		<div class="header">

			<h1 class="page-title">用户列表</h1>

		</div>
		<div class="main-content">
			<div class="row">
			<div class="btn-toolbar list-toolbar col-lg-4">
				<!-- <a class="btn btn-primary" href="userInput.jsp">
					<i class="fa fa-plus"></i> 新增用户
				</a> -->
				<!-- <a class="btn btn-default">导出</a> -->
			</div>
				<form class="form-inline" action="users.action">
				  <input type="search" class="input-sm" name="search" value="${search }">
				  <button type="submit" class="btn"><i class="fa fa-search"></i>查询</button>
				</form>
			</div>
			<table class="table">
				<thead>
					<tr>
						<th>#</th>
						<th>用户账号</th>
						<th>用户姓名</th>
						<th>联系电话</th>
						<th>性别</th>
						<th>积分</th>
						<th>邮箱</th>
						<th>注册时间</th>
						<th ></th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${page.data }" var="users" varStatus="i">
				
				
					<tr id="tr${users.uid }">
						<td>${i.count }</td>
						<td>${users.uaccount }</td>
						<td>${users.uname }</td>
						<td>${users.utel }</td>
						<td>${users.ugender }</td>
						<td>${users.uintegral }</td>
						<td>${users.uemail }</td>
						<td><fmt:formatDate value="${users.uregtime }" pattern="yyyy-MM-dd HH:mm:ss"/> </td>
						<td><a href="editUsers.action?id=${users.uid} " title="修改"><i class="fa fa-pencil"></i></a> 
						<c:if test="${users.udelete==0 }">
							<a class="dela" id="del${users.uid }" href="javascript:void(0)" delid="${users.uid }" del="1">禁用</a>
						</c:if>	
						<c:if test="${users.udelete==1 }">
							<a class="dela" id="del${users.uid }" href="javascript:void(0)" delid="${users.uid }" del="0">撤销禁用</a>
						</c:if>	
						</td>
					</tr>
				</c:forEach>	
				</tbody>
			</table>
			<jsp:include page="../page/page.jsp" flush="false"/>
			

			<div class="modal small fade" id="myModal" tabindex="-1"
				role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true">×</button>
							<h3 id="myModalLabel">操作确认</h3>
						</div>
						<div class="modal-body">
							<p class="error-text">
								<i class="fa fa-warning modal-icon"></i>确定此操作？<br>操作无法撤销
							</p>
						</div>
						<div class="modal-footer">
							<input type="hidden" id="delid">
							<input type="hidden" id="del">
							<button class="btn btn-default" data-dismiss="modal"
								aria-hidden="true">取消</button>
							<button id="delBtn" class="btn btn-danger" data-dismiss="modal">确认</button>
						</div>
					</div>
				</div>
			</div>

		</div>
		<jsp:include page="../common/common_foot.jsp" flush="false"/>
		<script type="text/javascript">
			$(".dela").click(function(){
				var delid = $(this).attr("delid");
				var del = $(this).attr("del");
				$("#delid").val(delid);
				$("#del").val(del);
				$("#myModal").modal("show");
			});
			$("#delBtn").click(function(){
				var delid = $("#delid").val();
				var del = $("#del").val();
				$.ajax({
					type:"post",
					dataType:"json",
					url:"delUsers.action",
					data:{"delid":delid,"del":del},
					success:function(data){
						$("#delid").val("");
						$("#del").val("");
						if(del==1){
							$("#del"+delid).attr("del","0");
							$("#del"+delid).text("撤销禁用");
						}else{
							$("#del"+delid).attr("del","1");
							$("#del"+delid).text("禁用");
						}
					}
				});
			});
		</script>
</body>
</html>