/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_rmi.calc;

import java.rmi.registry.Registry;

/**
 *
 * @author HelmutColin
 */
public class calcServer {

    public static void main(String args[]){
    try{
    Registry r = java.rmi.registry.LocateRegistry.createRegistry(8081);
    r.rebind("calculadora_rmi.calc", new calcRmi());
        System.out.println("Falla de conexion con el Servidor!!!");
}catch(Exception e)
{
    System.out.println("Servidor Corriendo!!!"+ e);   
}
    }
}
