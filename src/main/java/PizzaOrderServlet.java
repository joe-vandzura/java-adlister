import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "pizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String size = request.getParameter("size");
        String pepperoni = request.getParameter("pepperoni");
        String cheese = request.getParameter("cheese");
        String address = request.getParameter("address");

        System.out.println("Crust type: " + crust);
        System.out.println("Sauce type: " + sauce);
        System.out.println("Size : " + size);
        System.out.println("Pepperoni : " + pepperoni);
        System.out.println("Cheese : " + cheese);
        System.out.println("Address : " + address);
    }

}
