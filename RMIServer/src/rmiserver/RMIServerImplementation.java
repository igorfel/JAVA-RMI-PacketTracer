/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiserver;

import RMIInterfaces.RMIInterfaces;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author igorf
 */
public class RMIServerImplementation extends UnicastRemoteObject implements RMIInterfaces {
    
    public int packetsCounter = 0;
    public String message = "Start";
    public RMIServerImplementation() throws RemoteException{
        super();
        
        //startCountingPackets
    }
    
    @Override
    public String getMessage() throws RemoteException {
        packetsCounter++;
        return message;
    }

    @Override
    public void setMessage(String msg) throws RemoteException {
        packetsCounter++;
        message = msg;
    }

    @Override
    public String getPacket() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int subscribe2watchPackets() throws RemoteException {
        return packetsCounter;
    }
    
}
