<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="com.hpe.ssa.pojo.Shoes" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    Shoes shoe = (Shoes) request.getAttribute("shoe");
%>
<html>
<head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>鞋子修改</title>
</head>
<body class="theme-3">
<jsp:include page="../common/common_head.jsp" flush="false"/>
<jsp:include page="../common/common_left.jsp" flush="false"/>
<div class="content">
    <div class="header">
        <h1 class="page-title">鞋子信息修改</h1>
    </div>

    <div class="main-content">
        <div class="row">
            <form class="form-horizontal col-sm-offset-2" id="editshoeinfo" method="post">
                <input type="text"  name="id" hidden>
                <div class="form-group">
                    <label for="sname" class="col-sm-2 control-label">姓名：</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" id="sname" name="sname">
                    </div>
                    <label for="sex" class="col-sm-2 control-label">性别：</label>
                    <div class="col-sm-4">
                        <label class="radio-inline">
                            <input type="radio" id="sex" name="sex" value="男" checked> 男
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="sex" value="女"> 女
                        </label>
                    </div>
                    <label for="direction" class="col-sm-2 control-label">方向：</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" id="direction" name="direction" >
                    </div>
                    <label for="clzname" class="col-sm-2 control-label">班级名称：</label>
                    <div class="col-sm-4">
                        <select class="form-control" id="clzname" name="clzname">
                        </select>
                    </div>
                    <label for="schoolname" class="col-sm-2 control-label">学校名称：</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" id="schoolname" name="schoolname">
                    </div>
                    <label for="depatment" class="col-sm-2 control-label">系名称：</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" id="depatment" name="depatment">
                    </div>
                    <label for="major" class="col-sm-2 control-label">专业名称：</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" id="major" name="major" >
                    </div>
                    <label for="card" class="col-sm-2 control-label">身份证号：</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" id="card" name="card">
                    </div>
                    <label for="phone" class="col-sm-2 control-label">电话号码：</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" id="phone" name="phone">
                    </div>
                    <label for="address" class="col-sm-2 control-label">家庭住址：</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" id="address" name="address">
                    </div>
                    <label for="parentname" class="col-sm-2 control-label">父母姓名：</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" id="parentname" name="parentname">
                    </div>
                    <label for="parentphone" class="col-sm-2 control-label">父母电话：</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" id="parentphone" name="parentphone">
                    </div>
                </div>
                <div class="form-group has-error">
                    <div class="col-sm-offset-2 col-sm-4 col-xs-6 ">
                        <span class="text-warning"></span>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-3 col-xs-12">
                        <button type="button" class="btn btn-success" data-toggle="modal"
                                onclick="editshoeinfo();">提交</button>
                    </div>
                </div>
            </form>
        </div>

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
</div>
<script>
    function editshoeinfo() {
        $.ajax({
            url : "update/shoe",
            type : "POST",
            async : "true",
            data : $("#editshoeinfo").serialize(),
            dataType : "json",
            success : function(data) {
                if (data.res == 1){
                    alert(data.info);
                    window.location.reload();
                }
                else {
                    $(".text-warning").text(data.info);
                }
            }
        });
    }
</script>
</body>
</html>
