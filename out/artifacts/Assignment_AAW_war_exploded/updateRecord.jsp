<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Record Detail</title>
</head>
<body>
<s:form action="update" method="post">

    <div>
        <s:textfield   name="id" key="Id"  value="%{record.id}"/>
    </div>
    <div>
        <s:textfield name="record.name" key="Name"/>
    </div>
    <div>
        <s:textfield name="record.subject" key="Subject"/>
    </div>
    <div>
        <s:textfield name="record.theoryS" key="Theory Score"/>
    </div>
    <div>
        <s:textfield name="record.practiceS" key="Practice Score"/>
    </div>
    <div>
        <s:textfield name="record.assignmentS" key="Assignment Score"/>
    </div>

    <div>
        <s:submit value="Submit"/>
        <s:reset value="Reset"/>
    </div>
</s:form>

</body>
<s:head></s:head>
</html>
