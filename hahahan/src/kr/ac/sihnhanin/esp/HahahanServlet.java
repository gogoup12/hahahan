package kr.ac.sihnhanin.esp;

import java.io.IOException;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class HahahanServlet extends HttpServlet {
	@SuppressWarnings("unused")
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
	resp.setCharacterEncoding("UTF-8");
	resp.setContentType("text/plain");
	resp.getWriter().println("calle HahahanServlet.doPost() ");
	resp.getWriter().println("�̸�: " + req.getParameter("name") +"");
	resp.getWriter().println("�й� : "+ req.getParameter("id") +"");
	resp.getWriter().println("��ȭ��ȣ : "+ req.getParameter("socialNumber") +"");
	resp.getWriter().println("�����ּ� : "+ req.getParameter("t3") +"");
	resp.getWriter().println("īī���� ���̵�  : "+ req.getParameter("t4") +"");
	resp.getWriter().println(""+ req.getParameter("t5") +"");
	
	String t5=req.getParameter("t5");
	if(t5 != null)
	{
	resp.getWriter().println("������ �ƴԴϴ�");
	}
	else
	{
	  resp.getWriter().println("�����Դϴ�");
	}
	
	resp.getWriter().println("GitHub : "+ req.getParameter("t6") +"");
	
	resp.getWriter().println("");
	}
}
