<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>The World Clock</title>
    <style type="text/css">
        select {
            width: 200px;
            height: 20px;
        }
    </style>
</head>
<body>
<form  action="caculator" method="post">
    <container style="text-align: center ;background-color: wheat">
        <h2>simple caculator</h2>
        <input type="text" name="nb1">
        <input type="text" name="nb2">
        <input type="submit" name="sl" value="addition">
        <input type="submit" name="sl" value="subtraction">
        <input type="submit" name="sl" value="multiplication">
        <input type="submit" name="sl" value="division">
    </container>
</form>
</body>
</html>