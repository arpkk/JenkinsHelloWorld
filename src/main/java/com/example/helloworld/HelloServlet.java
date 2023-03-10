<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
<h1><%= "prueba de integracion continua con despliegue y commit con vault prueba desde jenkins docker" %>
</h1>
    <%String username = application.getInitParameter("username");%>
    </h2><%= username %><h2>
<br/>
 <a href="/hello-servlet">Hola tsoft</a>
</body>
</html>
