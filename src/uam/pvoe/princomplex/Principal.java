/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.princomplex;

import java.util.Scanner;
import uam.pvoe.complex.Complejo;
import uam.pvoe.opcomplex.OperacionesComplejos;



/**
 *
 * @author pedro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        Complejo q = new Complejo();
        
        System.out.println("How many complex numbers do you need?");
        n = sc.nextInt();
        Complejo c[] = new Complejo[n];

        c = ingreso(n);
        imprimirComplejos(c);
        q = sumatoria(c, n);
        System.out.println("The sum is: " + q.toString());
        comparacion(q);
        
    }
    
    public static void imprimirComplejos(Complejo [] c){
        OperacionesComplejos operaciones = new OperacionesComplejos();
        operaciones.imprimirComplejos(c);
    }
    
    public static Complejo sumatoria(Complejo [] c, int n){
        
        Complejo k = new Complejo();
        OperacionesComplejos operaciones = new OperacionesComplejos();
        k = operaciones.sumatoria(c, n);
        
        return k;
    }
    
    public static void comparacion(Complejo q){
        OperacionesComplejos operaciones = new OperacionesComplejos();
        operaciones.comparacion(q);
    }
    
    
    public static Complejo[] ingreso(int n){
        Scanner sc = new Scanner(System.in);
        int i;
        int j = 1;
        Complejo c[] = new Complejo[n];
        int f,k;
        
        System.out.println("Write the numbers");
        for (i = 0; i < n; i++){
            System.out.println("Write the real part: " + j);
            f = sc.nextInt();
            System.out.println("Write the imaginary part: " + j);
            k = sc.nextInt();
            c[i] = new Complejo(f, k);
            j++;
        }

        return c;
    }
    
}
