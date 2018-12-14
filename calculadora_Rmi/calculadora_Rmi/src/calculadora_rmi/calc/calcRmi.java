package calculadora_rmi.calc;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author HelmutColin
 */
public class calcRmi extends UnicastRemoteObject implements calcInterface {
     float x,y;
    public calcRmi() throws RemoteException
    {
        float x,y;
    }
    public float suma (float x, float y)throws RemoteException
    {
        return x+y;
    }
    
    public float res (float x, float y)throws RemoteException
    {
        
        return x-y;
    }
    
    public float mult (float x, float y)throws RemoteException
    {
        
        return x*y;
    }
    
    public float div (float x, float y)throws RemoteException
    {
        
        return x/y;
    }
public float pot (float x, float y) throws RemoteException{
    return (int) (Math.pow(x, y));
}
   
   

   
    
}
