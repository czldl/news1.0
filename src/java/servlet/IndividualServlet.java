package servlet;

/**
 * Created by weiyihu on 2017-05-31.
 */
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import user.User;
import database.userSql;

public class IndividualServlet extends HttpServlet {
    private static final long serialVersionUID = -3009431503363456888L;
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


            String email=request.getParameter("email");
            System.out.print(email);



    }


}
