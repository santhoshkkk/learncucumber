package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import in.cucumber.nicebank.KnowsMyDomain;
import in.cucumber.nicebank.web.AtmServer;

public class ServerHooks {
    public static final int PORT = 9988;

    private AtmServer server;

    private KnowsMyDomain helper;

    public ServerHooks(KnowsMyDomain helper){
        this.helper = helper;
    }

    @Before
    public void startServer() throws Exception {
        System.out.print("Starting server");
        server = new AtmServer(9988, helper.getCashSlot(), helper.getMyAccount());
        server.start();
    }

    @After
    public void stopServer() throws Exception {
        System.out.print("Stopping server");
        server.stop();
    }


}
