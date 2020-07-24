<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello Employee!</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<h1>LIST</h1>
<p><a href="<s:url action='new-user'/>">New More</a></p>
<%--<ul>--%>
<%--    <s:iterator value="users">--%>
<%--        <li>--%>
<%--            <s:property value="id"></s:property>&nbsp;-&nbsp;--%>
<%--            <s:property value="name"></s:property>&nbsp;-&nbsp;--%>
<%--            <s:property value="age"></s:property>&nbsp;-&nbsp;--%>
<%--            <s:property value="address"></s:property> ---%>
<%--            <s:property value="createdAt"></s:property> ---%>
<%--            <s:property value="updatedAt"></s:property> ---%>
<%--            <s:property value="status"></s:property>--%>
<%--        </li>--%>
<%--    </s:iterator>--%>
<%--</ul>--%>

<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Age</th>
        <th>Address</th>
        <th>Created</th>
        <th>Modified</th>
        <th>Status</th>
    </tr>
    <s:iterator value="users">
        <tr>
            <td><s:property value="id"></s:property></td>
            <td><s:property value="name"></s:property></td>
            <td><s:property value="age"></s:property></td>
            <td><s:property value="address"></s:property></td>
            <td><s:property value="createdAt"></s:property></td>
            <td><s:property value="updatedAt"></s:property></td>
            <td><s:property value="status"></s:property></td>
        </tr>
    </s:iterator>
</table>

</body>
</html>