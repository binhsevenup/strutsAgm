<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Hello</title>
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
<h1 style="text-align: center">List Record</h1>
<a href="/create-record">Make New Record</a>
<table id="customers">
    <tr>
        <th>RollNumber</th>
        <th>Name</th>
        <th>Subject</th>
        <th>Theory</th>
        <th>Practice</th>
        <th>Assignment</th>
        <th>Created</th>
        <th>Last Modified</th>
        <th></th>
    </tr>

    <s:iterator value="records">
        <tr>
            <td><s:property value="id"/></td>
            <td><s:property value="name"/></td>
            <td><s:property value="subject"/></td>
            <td><s:property value="theoryS"/></td>
            <td><s:property value="practiceS"/></td>
            <td><s:property value="assignmentS"/></td>
            <td><s:date name="createdAt" format="yyyy-MM-dd HH:mm:ss"/></td>
            <td><s:date name="updatedAt" format="yyyy-MM-dd HH:mm:ss"/></td>
            <td><s:url action="edit-record" var="urlGetId">
                <s:param name="id"><s:property value="id"/> </s:param>
            </s:url>

                <a href="<s:property value="#urlGetId"/>">Update</a>
            </td>
        </tr>
    </s:iterator>

</table>
</body>
</html>