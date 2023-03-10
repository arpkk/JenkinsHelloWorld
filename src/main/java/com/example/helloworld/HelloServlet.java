package com.example.helloworld;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

<!DOCTYPE html>
<html>
<head>
	<title>Imprimir valor de variable</title>
</head>
<body>
	<h1>El valor de la variable "user" es:</h1>
	<%
	String miValor = application.getInitParameter("username");
	%>
	<p><%= miValor %></p>
</body>
</html>
