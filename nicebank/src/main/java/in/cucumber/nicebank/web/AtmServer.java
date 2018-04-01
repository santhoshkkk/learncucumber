package in.cucumber.nicebank.web;

import in.cucumber.nicebank.Account;
import in.cucumber.nicebank.CashSlot;
import in.cucumber.nicebank.KnowsMyDomain;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class AtmServer {
    private final Server server;

    public AtmServer(int port, CashSlot cashSlot, Account account) {
        server = new Server(port);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);

        context.addServlet(new ServletHolder(new AtmServlet()), "/*");
        context.addServlet(new ServletHolder(new WithdrawServlet(cashSlot, account)), "/withdraw");
    }
/*
    public static void main(String[] args) throws Exception {
        KnowsMyDomain knowsMyDomain = new KnowsMyDomain();
        new AtmServer(9988, knowsMyDomain.getCashSlot(),knowsMyDomain.getMyAccount()).start();
    }*/

    public void start() throws Exception {
        server.start();
        System.out.print("Listening on " + server.getURI());

    }

    public void stop() throws Exception {
        server.stop();
    }
}
