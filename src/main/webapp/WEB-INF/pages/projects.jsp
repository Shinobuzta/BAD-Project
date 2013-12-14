<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="/assets/css/font-awesome/css/font-awesome.min.css" rel="stylesheet">
</head>
<body>
    <%@ include file="templates/navbar.jsp"%>
    <div class="container">
        <br><br>
        <h1>projects</h1>
                       <c:forEach items="${projects}" var="project">
                             <li>${project.projectName}</li>
                       </c:forEach>
    </div>
    <script src="/assets/js/jquery.js"></script>
    <script src="/assets/js/bootstrap.min.js"></script>
</body>
</html>