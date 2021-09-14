package servlets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;

@WebServlet(name="userinfo",
urlPatterns={"/UserInfo"})
public class UserInfo extends HttpServlet {
public void doPost(HttpServletRequest request,
					HttpServletResponse response)
	 throws ServletException, IOException {
	response.setContentType("text/html");

	PrintWriter out = response.getWriter();

	UserDAO u = new UserDAO();
	
	u.createUser(request.getParameter("name"), request.getParameter("nameF"), request.getParameter("mail"), request.getParameter("pwd"));
	out.println("<HTML>\n<BODY>\n" +
				"<H1>Recapitulatif des informations</H1>\n" +
				"<UL>\n" +			
		" <LI>Nom: "
				+ request.getParameter("nameF") + "\n" +
				" <LI>Prenom: "
				+ request.getParameter("name") + "\n" +
				" <LI>Mail: "
				+ request.getParameter("mail") + "\n" +
				" <LI>Pwd: "
				+ request.getParameter("pwd") + "\n" +
				"</UL>\n" + "<BR><BR>");
	
	
	out.println(u.showAllUser(u.getAllUser()) +"</BODY></HTML>");
}
}
