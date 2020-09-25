<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglibs.jsp"%>
<html>
<head>
    <title>管理员登录</title>
    <link type="text/css" rel="stylesheet" href="${ctx}/resource/ml/css/style.css">
    <link type="text/css" rel="stylesheet" href="${ctx}/resource/css/pintuer.css">
    <link type="text/css" rel="stylesheet" href="${ctx}/resource/css/admin.css">
    <script src="${ctx}/resource/js/jquery.js"></script>
    <script src="${ctx}/resource/js/pintuer.js"></script>
</head>
<body>
<div class="bg"></div>
<div class="container">
    <div class="line bouncein">
        <div class="xs6 xm4 xs3-move xm4-move">
            <form action="${ctx}/login/tologin" method="post">
                <div class="panel login-box">
                    <div class="text-center margin-big padding-big-top">
                        <h1>管理员登录</h1>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
