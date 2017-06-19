/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiclient;

import RMIInterfaces.RMIInterfaces;
import static java.lang.Thread.sleep;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author igorf
 */
public class RMIClient  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException, InterruptedException, NotBoundException {
        Registry regclient = LocateRegistry.getRegistry("localhost", 5555);
        
        RMIInterfaces rmiRequest = (RMIInterfaces) regclient.lookup("rmiServer");
        for (int i = 0; i <= 10; i++) {
            sleep(300);
            String msg = rmiRequest.getMessage();
            System.out.println(msg + ":" + i);
        }
    }
    
}
