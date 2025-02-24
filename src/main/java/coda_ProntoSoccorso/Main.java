/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coda_ProntoSoccorso;

/**
 *
 * @author lenovoù
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //instanzio l' oggetto paziente di tipo Paziente
        Paziente paziente = new Paziente();
      
       //instanzio l' oggetto nuovopaziente di tipo coda
        Coda nuovopaziente = new Coda();

       //tramite l' oggetto nuovopaziente richiamo il suo metodo "stampa_coda"   
        
        nuovopaziente.gestione_coda();
        
    }
    
}