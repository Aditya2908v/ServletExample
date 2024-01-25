<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<form action="hello-servlet">
    Principal Amount : <input type="text" name="amt"><br>
    Interest Rate : <input type="text" name="rate"><br>
    Tenure : <input type="text" name="time"><br>
    <input type="submit" value="calculate">
</form>

<% if (request.getAttribute("result") != null) { %>
    <div>
        Result: <%= request.getAttribute("result")%>
    </div>
<% } %>
</body>
</html>