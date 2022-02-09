/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.complex;

/**
 *
 * @author pedro
 */
public class Complejo {
    private int parteReal;
    private int parteImaginaria;

    public Complejo(int parteReal, int parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public Complejo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public int getParteReal() {
        return parteReal;
    }

    public void setParteReal(int parteReal) {
        this.parteReal = parteReal;
    }

    public int getParteImaginaria() {
        return parteImaginaria;
    }

    public void setParteImaginaria(int parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }

    @Override
    public String toString() {
        return "Complex number: " + parteReal + " + " + parteImaginaria;
    }
    
    
    
}
