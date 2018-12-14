package calculadora_rmi.calc;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @  author HelmutColin
 */
public interface calcInterface extends Remote { /* lo que extendemos de la clase 
                                                 remota hace que la interfaz se identifica
                                                  a sí misma como una interfaz cuyos métodos pueden ser invocado por otro jvm*/
    
    public float suma(float x, float y)throws RemoteException;   
    public float res(float x, float y)throws RemoteException;
    public float mult(float x, float y)throws RemoteException;
    public float div(float x, float y)throws RemoteException;
    public float pot(float x, float y)throws RemoteException;
}
