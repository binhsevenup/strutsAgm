<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>SUP FAM</title>
</head>
<body>
<h1>Employee form</h1>
<p><a href="<s:url action='get-users'/>">Check The Damn List</a></p>
<s:form action="save-user" method="post">
    <div>
        <s:label value="Name"/>
        <s:textfield name="user.name"/>
    </div>
    <div>
        <s:label value="Age"/>
        <s:textfield name="user.age"/>
    </div>
    <div>
        <s:label value="Address"/>
        <s:textfield name="user.address"/>
    </div>
    <div>
        <s:submit value="Submit"/>
        <s:reset value="Reset"/>
    </div>
</s:form>
</body>
</html>