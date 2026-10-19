/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestione_cronometro;

/**
 *
 * @author boussaa.mehdi
 */
public class Gestione_Cronometro {

    public static void main(String[] args) {
        Cronometro c1 = new Cronometro("primo");
        // System.out.println(c1.stato);
        c1.accendi();
        c1.aumentaTempo(100);
        System.out.println(c1.getTempo());
        c1.stop();
        c1.azzera();
        System.out.println(c1.getTempo());
        
    }
}
