/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coda_ProntoSoccorsco2;

/**
 *
 * @author lenovoù
 */
public class Coda {
    Paziente array[] = new Paziente[10];
    int contapazienti = 1;
    int i = 0;
    Paziente paz;
    
    public void inserisci(){
        paz = new Paziente();
        array[i] = paz;
        paz.posizione = contapazienti;
        System.out.println("il nome e': " + array[i].nome + " in posizione: " + array[i].posizione);
        i = i + 1;
        contapazienti = contapazienti +1;
        System.out.println(i + " " + contapazienti);
    }
    
    public void servi(){
        System.out.println("il paziente : " + array[0].nome + " viene servito");
        for(i = 0; i<contapazienti; i++){
            
            array[i] = array[i+1];
            
        }
        contapazienti--;
    }
    
    public void visualizza_coda(){
        System.out.println("la coda e':");
        for(i=0; i<contapazienti; i++){
            System.out.print("\n- " + array[i]);
        }
    }
    
}
