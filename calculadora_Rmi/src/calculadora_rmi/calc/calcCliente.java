/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_rmi.calc;

import java.rmi.Naming;
import java.util.Scanner;

/**
 *
 * @author HelmutColin
 */
public class calcCliente {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            calcInterface c = (calcInterface)Naming.lookup("//localhost/calculadora_rmi.calc");
            int choice = sc.nextInt();
            int x,y;
            System.out.println("menu"+ "1 suna \n"+ "resta\n" + "multiplicacion\n" + "4 divicion" +choice);
            switch (choice)
            {
                case 1:
                {
                    System.out.println("Valor de X y valor de Y"); 
                    x=sc.nextInt();
                    y =sc.nextInt();
                    System.out.println(c.suma(x,y));
                }
                
                case 2:
                {
                    System.out.println("Valor de X y valor de Y"); 
                    x=sc.nextInt();
                    y =sc.nextInt();
                    System.out.println(c.res(x,y));
                }
                
                case 3:
                {
                    System.out.println("Valor de X y valor de Y"); 
                    x=sc.nextInt();
                    y =sc.nextInt();
                    System.out.println(c.mult(x,y));
                }
                
                case 4:
                {
                    System.out.println("Valor de X y valor de Y"); 
                    x=sc.nextInt();
                    y =sc.nextInt();
                    System.out.println(c.div(x,y));
                }
            }
        }catch(Exception e)
        {
            System.out.println("Exception "+ e);
        }
    }
}
