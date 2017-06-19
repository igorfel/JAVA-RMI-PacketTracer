/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiserver;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author igorf
 */
public class RMIServer  {

    /**
     * @param args the command line arguments
     * @throws java.rmi.RemoteException
     * @throws java.net.MalformedURLException
     */
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        try {
            Registry reg = LocateRegistry.createRegistry(5555);
            reg.rebind("rmiServer", new RMIServerImplementation());
            System.out.println("Starting Server...");
            System.out.println("");
        } catch (RemoteException remoteException) {
            System.out.println("Error! "+ remoteException);
        }
    }
}
