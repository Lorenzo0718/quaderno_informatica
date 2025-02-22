/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fila_poste;
import java.util.Scanner;
/**
 *
 * @author lenovoù
 */
public class Coda_Poste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Istanzio l'oggetto "Input" che appartiene alla classe di tipo Scanner
        Scanner Input = new Scanner(System.in);
    
        //Dichiaro e inizializzo l'attributo "dimensioni" che è di tipo intero  
        int dimensioni = 8;
        
        //Dichiaro l'array "coda" di tipo String che ha come dimensione il valore dell'attributo "dimensioni"
        String[] coda = new String[dimensioni];
        
        //Dichiaro l'attributo "a" di tipo int che fa da contatore del primo utente da servire 
        int a = 0;
        
        //Dichiaro l'attributo "b" di tipo int che fa da contatore dell'ultimo utente da servire
        int b = 0;
        
        //Dichiaro e inizializzo l'attributo "selezione" di tipo intero 
        int selezione = 0;
        
        //Mostro un messaggio per l'utente 
        System.out.println("Stai entrando nella coda di Poste Italiane...\n"); 
        
        //Ciclo che continua finchè l'utente esce (selezione = 4)
        do {
            
            //Mostro un menù delle opzioni 
            System.out.println("\n1 - Aggiungi un utente nella coda");   
            System.out.println("2 - Servi il prossimo cliente");
            System.out.println("3 - Visualizza la coda");
            System.out.println("4 - Esci dalla coda");
            System.out.println("Seleziona un operazione: ");
            
            //L'attributo "selezione" prende il valore inserito dall'utente
            selezione = Input.nextInt();
            
            //Per evitare errori con l'input  
            Input.nextLine();
            
            //Creo lo switch per gestire le varie opzioni 
            switch (selezione) {
                
                //Inserimento del nome 
                case 1: 
                    
                    //Controllo se ci sono posti nella coda
                    if (b < coda.length){
                        
                        //Mostro un messaggio per l'utente
                        System.out.println("Inserisci il nome del cliente: ");
                        
                        //Assegno all'array coda il nome del cliente inserito dall'utente
                        coda[b] = Input.nextLine();
                        
                        //Incremento il contatore
                        b++; 
                        
                        //Mostro un messaggio per l'utente
                        System.out.println("- Cliente inserito nella coda -\n\n");
                        
                    }
                    
                    else {
                        
                        //Mostro un messaggio per l'utente
                        System.out.println("La coda è piena! E' necessario servire un cliente");
                       
                    }
                    
                    //Uscita dallo switch
                    break;
                
                //Servire i clienti
                case 2: 
                    
                    //Verifico se ci sono clienti da servire
                    if (a < b) { 
                        
                        //Mostro un messaggio per l'utente
                        System.out.println("Il cliente: " + coda[a] + " viene servito");
                        
                        //Incremento il contatore
                        a++; 
                    }
                    
                    else {
                        
                        //Mostro un messaggio per l'utente
                        System.out.println("Non c'è nessun cliente da servire");
                        
                    }
                    
                    //Uscita dallo switch
                    break;
                
                //Visualizzare la coda 
                case 3:
                    
                    //Verifico se ci sono clienti nella coda da visualizzare
                    if (a < b) {
                        
                        //Mostro un messaggio per l'utente
                        System.out.println("\nLa coda al momento è: ");
                        
                        //Creo il ciclo che stampa la coda
                        for (int i = a; i < b; i++){ 
                            
                            System.out.println("\n- " + coda[i]);
                            
                        }
                        
                    }
                    
                    else {
                        
                        //Mostro un messaggio per l'utente
                        System.out.print("La coda è attualmente vuota");
                        
                    }
                    
                    //Uscita dallo switch
                    break;
                
                //Uscita dalla coda    
                case 4:
                    
                    //Mostro un messaggio per l'utente
                    System.out.println("Grazie per aver usufruito dei servizi di Poste Italiane");
                    
                    //Uscita dallo switch
                    break;
                
                //Se nessuno dei case viene eseguito, viene eseguito il default    
                default: 
                    
                    //Mostro un messaggio per l'utente
                    System.out.println("Riprova la selezione");
                    
            } 
        } while (selezione != 4);    }
    
}
