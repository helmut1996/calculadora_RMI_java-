package calculadora_rmi.calc;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

/**
 *
 * @author HelmutColin
 */
public class calcCliente {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            Registry r = LocateRegistry.getRegistry("localhost", 1099);
            calcInterface c = (calcInterface) Naming.lookup("//localhost/calcInterface"); 
            float x, y;

            while (true) {
                
                    System.out.println("menu\n" + "1 suma \n" + "2 resta\n" + " 3 multiplicacion\n" + "4 divicion \n" + "5 Potencia");
                    System.out.println("opcion");
                    int opcion = sc.nextInt();

                    switch (opcion) {
                        case 1: {
                            System.out.println("Valor de X y valor de Y");
                            x = sc.nextFloat();
                            y = sc.nextFloat();
                            System.out.println("La suma es" + c.suma(x, y)); /*Llamaremos a la función suma haciendo referencia al objeto c que hemos creado.*/
                            break;
                        }

                        case 2: {
                            System.out.println("Valor de X y valor de Y");
                            x = sc.nextFloat();
                            y = sc.nextFloat();
                            System.out.println("La resta es" + c.res(x, y));
                            break;
                        }

                        case 3: {
                            System.out.println("Valor de X y valor de Y");
                            x = sc.nextFloat();
                            y = sc.nextFloat();
                            System.out.println("La multiplicacion es" + c.mult(x, y));
                            break;
                        }

                        case 4: {
                            System.out.println("Valor de X y valor de Y");
                            x = sc.nextFloat();
                            y = sc.nextFloat();
                            System.out.println("La divicion es" + c.div(x, y));
                            break;
                        }
                                case 5: {
                            System.out.println("Valor de X y valor de Y");
                            x = sc.nextFloat();
                            y = sc.nextFloat();
                            System.out.println("La Potencia  es" + c.pot(x, y));
                            break;
                        }

                        default:
                            System.out.println("selecione una operacion");
                            break;
                    }
                 
        
            }
        } catch (Exception e) {
            System.out.println("Exception " + e);
        }
    }
}
