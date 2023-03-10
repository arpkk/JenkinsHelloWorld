<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "prueba de integracion continua con despliegue y commit con vault prueba desde jenkins docker" %>
</h1>
    </h2><%String username = application.getInitParameter("username");%><h2>
    El valor de miVariable es <%= username %>
<br/>
 <a href="hello-servlet">Hola tsoft</a>
</body>
</html>
