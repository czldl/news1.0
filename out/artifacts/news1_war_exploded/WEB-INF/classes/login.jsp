<%--
  Created by IntelliJ IDEA.
  User: weiyihu
  Date: 2017-05-23
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="GBK"%>
<%@ page import='user.User' %>
<html>
<head>
    <title>'login.jsp'</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <script type="text/javascript">
        function fun(form){
            if(form.username.value == ""){
                alert("���ֲ���Ϊ��");
                return false;
            }
            if(form.password.value == ""){
                alert("���벻��Ϊ��");
                return false;
            }
            if(form.email.value == ""){
                alert("email����Ϊ��");
                return false;
            }

        }
    </script>
</head>
<body>

<h3>Thanks for using this applet, you need an account to transport your idea!!</h3>
<%
    //��ȡ��ʾ��Ϣ
    String info = (String)request.getAttribute("info");
    //�����ʾ��Ϣ��Ϊ�����������ʾ��Ϣ
    if(info != null){
        out.println(info);
    }
%>
<br><h9>�Բ����㻹û����</h9>
<form action="LoginServlet" method="post" onsubmit="return fun(this)">
    username:<input type="text" name="username" size="25" >
    <br>
    password:<input type="password" name="password" size="25">
    <br>
    <input type="submit" value="submit">
    <input type="reset" value="reset">
    <input type="button" value="register" onclick="location.href='register.jsp'">
</form>


</body>
</html>