<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>商品列表</title>

</head>
<body class="theme-3">
<jsp:include page="../common/common_head.jsp" flush="false"/>
<jsp:include page="../common/common_left.jsp" flush="false"/>
<div class="content">
    <div class="header">

        <h1 class="page-title">商品列表</h1>

    </div>

    <div class="main-content">
        <div class="row">
            <div class="btn-toolbar list-toolbar col-lg-4">
                <!-- <a class="btn btn-primary" href="userInput.jsp">
                    <i class="fa fa-plus"></i> 新增用户
                </a> -->
                <!-- <a class="btn btn-default">导出</a> -->
            </div>
            <form class="form-inline" action="get/shoe">
                <input type="search" class="input-sm" name="search" value="${search }">
                <button type="submit" class="btn"><i class="fa fa-search"></i>查询</button>
            </form>
        </div>
        <table class="table">
            <thead>
            <tr>
                <%--<th>#</th>--%>
                <th>编号</th>
                <th>类型</th>
                <th>品牌</th>
                <th>名称</th>
                <th>价格</th>
                <th>生产商</th>
                <th>款式</th>
                <th>颜色</th>
                <th>处理</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${page.data }" var="shoe" varStatus="i">
                <tr id="tr${shoe.sid }">
                    <td>${shoe.sid }</td>
                    <td>${shoe.tname }</td>
                    <td>${shoe.bname }</td>
                    <td>${shoe.sname }</td>
                    <td>${shoe.sprices }</td>
                    <td>${shoe.sproducer }</td>
                    <td>${shoe.sgender }</td>
                    <td>${shoe.scolor }</td>
                    <td><a href="edit/shoe/${shoe.sid} " title="修改"><i class="fa fa-pencil"></i></a>
                        <c:if test="${shoe.sdelete==0 }">
                            <a class="dela" id="del${shoe.sid }" href="javascript:void(0)" delid="${shoe.sid }" del="1">禁用</a>
                        </c:if>
                        <c:if test="${shoe.sdelete==1 }">
                            <a class="dela" id="del${shoe.sid }" href="javascript:void(0)" delid="${shoe.sid }" del="0">撤销禁用</a>
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
</div>
</body>
</html>
