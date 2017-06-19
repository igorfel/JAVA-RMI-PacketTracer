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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author igorf
 */
public class RMIClient {
    
    RMIInterfaces rmiRequest;
    
    public void connect2Server() throws RemoteException, NotBoundException {
       Registry regclient = LocateRegistry.getRegistry("localhost", 5555);
       rmiRequest = (RMIInterfaces) regclient.lookup("rmiServer");
       
    }
    
    public String getRMIMessage() throws RemoteException{
        return rmiRequest.getMessage();
    }
    
    public int getCurrentServerPackets () {
        try {
            return rmiRequest.subscribe2watchPackets();
        } catch (RemoteException ex) {
            Logger.getLogger(RMIClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
