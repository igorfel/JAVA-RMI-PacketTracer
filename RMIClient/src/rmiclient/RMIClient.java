/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiclient;

import RMIInterfaces.RMIInterfaces;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

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
}
