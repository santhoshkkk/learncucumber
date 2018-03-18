package in.cucumber.nicebank.web;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class AtmServer {
    private final Server server;

    public AtmServer(int port) {
        server = new Server(9988);

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);

        context.addServlet(new ServletHolder(new AtmServlet()), "/*");
    }

    public static void main(String[] args) throws Exception {
        new AtmServer(9988).start();
    }

    public void start() throws Exception {
        server.start();
        System.out.print("Listening on " + server.getURI());

    }

    public void stop() throws Exception {
        server.stop();
    }
}
