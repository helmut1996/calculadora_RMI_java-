/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_rmi.calc;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @  author HelmutColin
 */
public interface calcInterface extends Remote {
    public int suma(int x, int y)throws RemoteException;   
    public int res(int x, int y)throws RemoteException;
    public int mult(int x, int y)throws RemoteException;
    public int div(int x, int y)throws RemoteException;
    public int pot(int x, int y)throws RemoteException;
}
