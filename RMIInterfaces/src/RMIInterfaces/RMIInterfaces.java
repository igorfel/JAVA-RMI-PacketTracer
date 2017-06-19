/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMIInterfaces;

import java.rmi.*;

/**
 *
 * @author igorf
 */
public interface RMIInterfaces extends Remote {
    
    public String getMessage()
            throws RemoteException;
    
    public void setMessage(String msg) 
            throws RemoteException;
    
    public String getPacket()
            throws RemoteException;
}
