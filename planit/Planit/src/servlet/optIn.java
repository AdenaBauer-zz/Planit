package servlet;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sql.MySQLDriver;

/**
 * Servlet implementation class optIn
 */
@WebServlet("/optIn")
public class optIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public optIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//get info from request (UID / MeetingID)
		String meetingIDString = request.getParameter("meetingID");
		String UIDString = request.getParameter("UID");
		int meetingID = Integer.parseInt(meetingIDString);
		int UID = Integer.parseInt(UIDString);
		int optPref = 1;
		MySQLDriver.opt(UID, meetingID, optPref);
		
		// if exists,update
		
		//else create + initialize
		
	}

}
