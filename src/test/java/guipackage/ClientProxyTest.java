/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guipackage;

import java.net.Socket;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import serverpackage.ChatServer;
import serverpackage.ClientServices;
import serverpackage.ClientThread;

/**
 *
 * @author Jmach
 */
public class ClientProxyTest
{
    
    public ClientProxyTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                 String[] args = new String[2];
                args[0] = "localhost";
                args[1] = "8080";
                ChatServer.main(args);
            }
        }).start();
    }
    
    @AfterClass
    public static void tearDownClass()
    {
        ChatServer.stopServer();
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of connect method, of class ClientProxy.
     */
    @Test
    public void testConnect() throws Exception
    {
        System.out.println("connect");
        String ip = "";
        int port = 0;
        ClientProxy instance = new ClientProxy();
        Socket expResult = null;
        Socket result = instance.connect(ip, port);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registrerObserver method, of class ClientProxy.
     */
    @Test
    public void testRegistrerObserver()
    {
        System.out.println("registrerObserver");
        ClientConnectGUI1 gui = null;
        ClientProxy instance = new ClientProxy();
        instance.registrerObserver(gui);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class ClientProxy.
     */
    @Test
    public void testRun()
    {
        System.out.println("run");
        ClientProxy instance = new ClientProxy();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of scan method, of class ClientProxy.
     */
    @Test
    public void testScan() throws Exception
    {
        System.out.println("scan");
        ClientProxy instance = new ClientProxy();
        instance.scan();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendMSG method, of class ClientProxy.
     */
    @Test
    public void testSendMSG() throws Exception
    {
        System.out.println("sendMSG");
        String users = "";
        String text = "";
        ClientProxy instance = new ClientProxy();
        instance.sendMSG(users, text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class ClientProxy.
     */
    @Test
    public void testLogin() throws Exception
    {
        System.out.println("login");
        ClientProxy client = new ClientProxy();
        client.connect("localhost", 8080);
        String username = "Mia";
        client.login(username);
        System.out.println("før liste");
        client.scan();
        String[] list = client.reslist;
        System.out.println(username +" : "+list[0]);
        assertEquals(username,list[0]);
    }

    /**
     * Test of logout method, of class ClientProxy.
     */
    @Test
    public void testLogout() throws Exception
    {
        System.out.println("logout");
        ClientProxy instance = new ClientProxy();
        instance.logout();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
