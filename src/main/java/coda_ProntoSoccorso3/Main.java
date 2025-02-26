/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coda_ProntoSoccorso3;

import java.util.Scanner;

/**
 *
 * @author lenovoù
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int selezione;
do{ 
            
            //Mostro un menù delle opzioni 
            System.out.println("Seleziona un operazione: ");
            System.out.println("\n1 - Aggiungi un paziente alla coda");   
            System.out.println("2 - visita il prossimo paziente");
            System.out.println("3 - Visualizza la coda");
            System.out.println("4 - Esci dalla coda");
            selezione = Input.nextInt();
            //Coda paziente = new Coda();
            Coda paziente = new Coda();
            switch (selezione) {
            case 1 -> {
                
                paziente.inserisci();
            
            }
            case 2  -> {
                
                paziente.servi();
                
            }
            case 3 -> {
                paziente.visualizza_coda();
            
            }
            }
        }while(selezione != 4);
    }
        
    }
    

