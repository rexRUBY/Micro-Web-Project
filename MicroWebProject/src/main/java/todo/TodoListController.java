package todo;

import todo.dto.TodoDTO;
import todo.service.TodoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


//목록(GET)
@WebServlet(name = "todoListController", urlPatterns = "/todo/list")
public class TodoListController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("/todo/list");
        List<TodoDTO> dtoList = TodoService.INSTANCE.getList();
        req.setAttribute("list",dtoList); //이름이 list(이건 추후에 EL코드의 값으로 쓰임)인 속성의 값을 dtoList로 지정
        req.getRequestDispatcher("/WEB-INF/todo/list.jsp").forward(req,resp);
    }
}