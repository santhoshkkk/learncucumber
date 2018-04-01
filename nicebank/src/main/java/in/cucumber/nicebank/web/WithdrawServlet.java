package in.cucumber.nicebank.web;

import in.cucumber.nicebank.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class WithdrawServlet extends HttpServlet {
    private CashSlot cashSlot;
    private Account account;

    public WithdrawServlet(CashSlot cashSlot, Account account) {
        this.cashSlot = cashSlot;
        this.account = account;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Teller teller = new AutomatedTeller(cashSlot);
        String amount1 = request.getParameter("amount");
        Money amount = new MoneyConverter().transform("Rs."+amount1);
        try {
            teller.withdraw(account, amount);
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);

        response.getWriter().println("<html><head><title>Nicebank ATM</title></head>" +
                "</body> Please take your Rs. " + amount + "</body>" +
                "</html>");
    }
}
