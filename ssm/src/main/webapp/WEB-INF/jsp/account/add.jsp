<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>新增账户信息</title>

</head>
<body>
<form id="accountForm"
      action="${pageContext.request.contextPath }/saveAccount.do"  method="post">
    新增账户信息：
    <table width="100%" border=1>
        <tr>
            <td>账户名称</td>
            <td><input type="text" name="name" value="" /></td>
        </tr>
        <tr>
            <td>金额</td>
            <td><input type="text" name="money" value="" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="提交" />
            </td>
        </tr>
    </table>

</form>
</body>

</html>