/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_rmi.calc;

import java.rmi.Remote;

/**
 *
 * @  author HelmutColin
 */
public interface calcInterface extends Remote {
    public int suma(int x, int y);
    public int res(int x, int y);
    public int mult(int x, int y);
    public int div(int x, int y);
    public int pot(int x, int y);
}
