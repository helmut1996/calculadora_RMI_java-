package calculadora_rmi.calc;

import java.rmi.registry.Registry;

/**
 *
 * @author HelmutColin
 */
public class calcServer {

    public static void main(String args[]){
    try{
    Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099); /*creo el registro donde se ejecuta el servidor*/
    r.rebind("calcInterface", new calcRmi()); /* la clase que se vincula de la  implementación es calcRmi a clacServer*/
    System.out.println("Servidor Corriendo!!!");   
}catch(Exception e)
{
       System.out.println("Falla de conexion con el Servidor!!!"+e); 
   
}
    }
}
