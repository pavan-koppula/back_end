import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Test2 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
public Test2() {
	super();
}



@Override
public void init(ServletConfig config) throws ServletException {
	// TODO Auto-generated method stub
	System.out.println("servelet started");
	super.init(config);
}


@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	PrintWriter out =resp.getWriter();
	out.println("hello from servlet");
	System.out.println("servelt called at get method");
	System.out.println(req);
	
}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
		
	}
	
	
@Override
public void destroy() {
	// TODO Auto-generated method stub
	System.out.println("destroy");

}



}
