/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coda_ProntoSoccorso3;

import java.util.ArrayList;

/**
 *
 * @author lenovoù
 */
public class Coda {
     ArrayList<Paziente> lista = new ArrayList<Paziente>(10);
    int contapazienti = 1;
    Paziente paz;
    int i = 0;
    
    
    public void inserisci(){
        paz = new Paziente();
        paz.posizione = contapazienti;
        lista.add(paz);
        System.out.println(lista.get(0).nome);
        System.out.println(contapazienti);
        contapazienti++;
        
    }
    
    public void servi(){
        //System.out.println("il paziente : " + lista.get(0).nome + " viene servito");
        System.out.println(lista.get(0).nome);
            lista.remove(0);

        contapazienti--;
    }
    
    public void visualizza_coda(){
        System.out.println("la coda e':");
        for(int i = 0; i<contapazienti; i++){
            System.out.print("\n- " + lista.get(i).posizione + lista.get(i).nome);
        }
    }
}
