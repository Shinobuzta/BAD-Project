<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
        <h1>charities</h1>
        <!---Temporary form-->
        <form role="form" method="post" action="charities/addProject">
                  <div class="form-group">
                      <label for="ProjectName"></label>
                      <input type="text" id="ProjectName" class="form-control" name="ProjectName"/>
                  </div>
                <div class="form-group">
                         <label for="ProjectDescription"></label>
                         <input type="text" id="ProjectDescription" class="form-control" name="ProjectDescription"/>
                 </div>
            <button class="btn btn-default" type="submit">ADD</button>
        </form>


    </div>
    <script src="/assets/js/jquery.js"></script>
    <script src="/assets/js/bootstrap.min.js"></script>
</body>
</html>