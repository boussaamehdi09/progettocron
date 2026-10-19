/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestione_cronometro;

/**
 *
 * @author boussaa.mehdi
 */
public class Cronometro {
    String idCronometro;
    private int tempo = 0;
    private boolean stato = false;
    
    public Cronometro(String ID)
    {
        idCronometro = ID;
        
    }
    public int getTempo(){
        return tempo;
    }
    public void accendi()
    {
        stato = true;
    }
    public void aumentaTempo(int tempo)
    {
        if (stato == true){
            this.tempo = tempo;
        }
        else{
            System.out.println("il cronometro e spento");
        }
    }
    public void azzera(){
        if(stato == false){
            tempo = 0;
        }
        else{
            System.out.println("il cronometro deve essere spento per azzerare");
        }
    }
    public void stop()
    {
        stato = false;
    }
}
