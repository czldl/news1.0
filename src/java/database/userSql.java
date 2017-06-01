package database;/** * Created by weiyihu on 2017-05-25. */import java.sql.*;import user.User;public class userSql {    //method for register    public boolean emailIsExist(String email)    {        //获取对数据库连接对象        Connection conn=connectDB.getConnection();        // 根据指定用户名查询        String sql = "select * from user where email = ?";        try{            // 获取PreparedStatement对象            PreparedStatement ps = conn.prepareStatement(sql);            // 赋值            ps.setString(1,email);            // 执行查询获取结果集            ResultSet rs = ps.executeQuery();            // 判断结果集是否有效            if(!rs.next()){                return true;            }            // 释放rs资源            rs.close();            // 释放ps资源            ps.close();        }catch(SQLException e) {            e.printStackTrace();        }finally{            //关闭数据库链接            connectDB.closeConnection(conn);        }        return false;    }    public void insertUser(User user)    {        //获取数据库连接对象        Connection conn=connectDB.getConnection();        // 插入用户注册信息的SQL语句        String sql="insert into user(username,password,sex,email) values (?,?,?,?)";        try{            //获取插入对象            PreparedStatement ps=conn.prepareStatement(sql);            // 赋值            ps.setString(1, user.getUsername());            ps.setString(2, user.getPassword());            ps.setString(3, user.getSex());            ps.setString(4, user.getEmail());            // 更新操作            ps.executeUpdate();            // 释放此 PreparedStatement 对象的数据库和 JDBC 资源            ps.close();        }catch(Exception e)        {            e.printStackTrace();        }        finally {            //关闭数据库            connectDB.closeConnection(conn);        }    }    //method for login    public User login(String username, String password)    {        User User =null;        //获取数据库链接connection对象        Connection conn = connectDB.getConnection();        // 根据用户名及密码查询用户信息        String sql="select* from user where username=? and password=?";        try{            // 获取PreparedStatement对象            PreparedStatement ps = conn.prepareStatement(sql);            // 赋值            ps.setString(1, username);            ps.setString(2, password);            // 执行查询获取结果集            ResultSet rs = ps.executeQuery();            // 判断结果集是否有效            if(rs.next()){                // 实例化一个用户对象                User = new User();                // 对用户对象属性赋值                User.setId(rs.getInt("id"));                User.setUsername(rs.getString("username"));                User.setPassword(rs.getString("password"));                User.setSex(rs.getString("sex"));                User.setEmail(rs.getString("email"));            }            // 释放此 ResultSet 对象的数据库和 JDBC 资源            rs.close();            // 释放此 PreparedStatement 对象的数据库和 JDBC 资源            ps.close();        }catch (Exception e) {            e.printStackTrace();        }finally{            // 关闭数据库连接            connectDB.closeConnection(conn);        }        return User;    }    //method for delete account    //method for User news modifying    //public string createNews(String input)    //public string modifyNews(String input)    //public String deleteNews(String input)}