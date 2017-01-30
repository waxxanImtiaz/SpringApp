<%-- 
    Document   : hellopage
    Created on : Jan 30, 2017, 7:46:18 PM
    Author     : imtiaz-ali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Name:${person.getName()}</h1>
        <h1>Age:${person.getAge()}</h1>
    </body>
</html>
