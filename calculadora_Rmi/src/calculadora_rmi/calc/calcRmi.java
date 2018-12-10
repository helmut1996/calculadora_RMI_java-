/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_rmi.calc;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author HelmutColin
 */
public class calcRmi extends UnicastRemoteObject implements calcInterface {
    public calcRmi() throws RemoteException
    {
        int a,b;
    }
    public int suma (int a, int b)throws RemoteException
    {
        return a+b;
    }
    
    public int res (int a, int b)throws RemoteException
    {
        
        return a-b;
    }
    
    public int mult (int a, int b)throws RemoteException
    {
        
        return a*b;
    }
    
    public int div (int a, int b)throws RemoteException
    {
        
        return a/b;
    }

    @Override
    public int pot(int x, int y) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
