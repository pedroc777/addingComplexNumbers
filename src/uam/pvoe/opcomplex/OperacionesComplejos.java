/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.opcomplex;

import java.util.Arrays;
import uam.pvoe.complex.Complejo;

/**
 *
 * @author pedro
 */
public class OperacionesComplejos {
    
    public void imprimirComplejos(Complejo [] complejo){
        System.out.println(Arrays.toString(complejo));
    }
    
    public Complejo sumatoria(Complejo [] complejo,int n){
        int r = 0;
        int i = 0;
        
        Complejo c = new Complejo();
        
        for (int j = 0; j < n; j++){
            r += complejo[j].getParteReal();
            i += complejo[j].getParteImaginaria();
        }
        
        c.setParteReal(r);
        c.setParteImaginaria(i);
        
        return c;
    }
    
    public void comparacion(Complejo complejo){  
        Integer r = new Integer(complejo.getParteReal());
        Integer i = new Integer(complejo.getParteImaginaria());
        int z;
        
        z = r.compareTo(i);
        
        if(z == 0){
            System.out.println("The real part is equal to the imaginary part");
        }
        else if(z < 0){
            System.out.println("The real part is less than the imaginary part");
        }
        else{
            System.out.println("The real part is greater than the imaginary part");
        }
        
    }
    
}
