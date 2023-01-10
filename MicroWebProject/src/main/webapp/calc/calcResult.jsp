<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>NUM1 ${param.num1}</h2>
    <h2>NUM2 ${param.num2}</h2>
    <h2>SUM ${Integer.parseInt(param.num1)+Integer.parseInt(param.num2)}</h2> <!--EL(Expression Language)-->
</body>
</html>
