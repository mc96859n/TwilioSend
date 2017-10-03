

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

/**
 * Servlet implementation class MoSer3
 */
public class MoSer3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MoSer3() {
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
		doGet(request, response);
		
		String accountSid = "ACdc3ed857be67ab08499e0608e55179a7"; 
		String authToken = "a9632c4a458078d0a237c508ac95e0ef"; 

		Twilio.init(accountSid, authToken);

		final String msg = "Hello from MANLU CHEN CS643 Fall 2017";
		final String toNum = "19173490168"; 
		Message message = Message.creator(new com.twilio.type.PhoneNumber(toNum) ,
				new com.twilio.type.PhoneNumber("14087695874"), msg).create();

		System.out.println(message.getSid());
	
		
		
	}

}
