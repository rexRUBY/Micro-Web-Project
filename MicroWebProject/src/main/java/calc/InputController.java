package calc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//GET 방식의 처리
@WebServlet(name = "inputController", urlPatterns = "/calc/input")
public class InputController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Input Controller... doGet");
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/calc/input.jsp"); //서블릿에 전달된 요청을 다른 쪽으로 전달 혹은 배포하는 역할을 하는 객체
        dispatcher.forward(req,resp);
    }
}
