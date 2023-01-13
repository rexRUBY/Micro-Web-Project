package calc;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "sampleServlet", urlPatterns = "/sample")
public class SampleServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp){
        System.out.println("doGet...." + this);
    }

    @Override
    public void destroy(){
        System.out.println("destroy.....");
    }

    @Override
    public void init(ServletConfig servletConfig){
        System.out.println("init(ServletConfig).....");
    }
}