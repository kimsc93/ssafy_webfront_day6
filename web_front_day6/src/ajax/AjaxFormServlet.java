package ajax;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AjaxFormServlet
 */
@WebServlet("/ajax/ajaxForm")
public class AjaxFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String[]> paramMap = request.getParameterMap();
		Set<String> keys = paramMap.keySet();
		for(String key: keys) {
			System.out.println("get: "+key+" : "+Arrays.toString(paramMap.get(key)));
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Map<String, String[]> paramMap = request.getParameterMap();
		Set<String> keys = paramMap.keySet();
		for(String key: keys) {
			System.out.println("post: "+key+" : "+Arrays.toString(paramMap.get(key)));
		}
	}
}
