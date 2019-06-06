<!DOCTYPE html>
<html>
<head>
    <title>Freemarker</title>
</head>
<body>
<#if loggedIn??>
    <h1>username: <span>${username}</span></h1>
<#else>
    <h1>You are not logged in</h1>
</#if>
</body>
</html>