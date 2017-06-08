simple_press_simulator

<!-- A brief introduction-->

This is a Java web made with Servlet, Jsp , JDBC and Mysql. The web application contains following functions.
One admin account arranges the forum with privilege to set other normal accounts as admin accounts, Also, as general know normal account can delete,edit and add their own news.

<!-- About files I used -->

<div class="webapp">
"index.jsp"=>direct to "login.index"
"login.jsp":
"register.jsp":
"account.jsp":
"common.jsp":
"message.jsp":
</div>

<div class="src">

<div package="database">
"adminSql.java"
"connectDB.java"
"userSql.java"
</div>

<div package="filter">
"characterencodingfilter.java"
</div>

<div package="servlet">
"exitServlet.java"
"loginServlet.java"
"registerServlet.java"
"IndividualServlet" function 1.add or modify news 2.delete account or news 3.go to public place to see news
                             4.sign out account
</div>

<div package="User">
"admin.java"
"User"
</div>
</div>


