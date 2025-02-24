/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coda_ProntoSoccorso;
import java.util.Scanner;
/**
 *
 * @author lenovoù
 */
public class Coda {
    //inizializzo gli attributi della classe coda
    public int count;
    public int contapazienti;
    public int selezione;
    public int paz_servito;
    Paziente[] array = new Paziente[50];
    //inizializzo l' oggetto newpaziente di tipo class Paziente
    Paziente newpaziente = new Paziente();
    Scanner Input = new Scanner(System.in);
    //creo un metodo per passare i valori dell' oggetto paziente all' oggetto newpaziente
    public void set_newpaziente(Paziente paziente){
        newpaziente.nome = paziente.nome;
        newpaziente.emergenza = paziente.emergenza;
    }
    
    //creo un metodo che inserisca nell' array il nuovo paziente
    public void inserisci_paziente(){
        
        array[contapazienti] = newpaziente;
    }
    
    public void stampa_coda(){
        System.out.print("il paziente di nome: ");
        System.out.print(array[contapazienti].nome);
        System.out.print(" e di emergenza: ");
        System.out.println(array[contapazienti].emergenza);
       
    }
    
    public void gestione_coda(){
        do {
            
            //Mostro un menù delle opzioni 
            System.out.println("Seleziona un operazione: ");
            System.out.println("\n1 - Aggiungi un paziente alla coda");   
            System.out.println("2 - visita il prossimo paziente");
            System.out.println("3 - Visualizza la coda");
            System.out.println("4 - Esci dalla coda");
            
            
            //L'attributo "selezione" prende il valore inserito dall'utente
            selezione = Input.nextInt();
            
            
            //Creo lo switch per gestire le varie opzioni 
            switch (selezione) {
                case 1 -> {
                    if (contapazienti < array.length)
                    {
                        //inserisco i dati del paziente dall'utente
                        System.out.println("inserisci i dati del paziente: ");
                        newpaziente.input_Paziente();
                        array[contapazienti] = newpaziente;
                        contapazienti = contapazienti + 1;
                       
                    }else
                    {
                        //Mostro un messaggio per l'utente
                        System.out.println("La coda è piena! E' necessario visitare un altro paziente");
                    }
                    
                
            
            //Uscita dallo switch
            break;}
            
            case 2 ->{
                //riordino la lista con la priorità
            for (int i = 0; i < contapazienti - 1; i++) {
                for (int paz_servito = 0; paz_servito < contapazienti - 1 - i; paz_servito++) {
                    if (array[paz_servito].emergenza > array[paz_servito + 1].emergenza) {
                        Paziente temp = array[paz_servito];
                        array[paz_servito] = array[paz_servito + 1];
                        array[paz_servito + 1] = temp;
        }
    }
}           //stampo il prossimo paziente visitato
            if(contapazienti > paz_servito){
            System.out.print("il paziente di nome: ");
            System.out.print(array[paz_servito].nome);
            System.out.print(" e di emergenza: ");
            System.out.print(array[paz_servito].emergenza);
            System.out.println(" viene servito");
            paz_servito++;
        }else 
        {             
            //Mostro un messaggio per l'utente
            System.out.println("Non c'è nessun paziente da visitare");
                        
        } break;}
        
        case 3 -> {
                    int j = 0;
                    //Verifico se ci sono clienti nella coda da visualizzare
                    if (paz_servito < contapazienti) {
                        
                        //Mostro un messaggio per l'utente
                        System.out.println("\nLa coda al momento è: ");
                        
                        //riordino la coda in base alla priorità
                       
                        for (int i = 0; i < contapazienti - 1; i++) {
                            for (int paz_servito = 0; paz_servito < contapazienti - 1 - i; paz_servito++) {
                                if (array[paz_servito].emergenza > array[paz_servito + 1].emergenza) {
                                    Paziente temp = array[paz_servito];
                                    array[paz_servito] = array[paz_servito + 1];
                                    array[paz_servito + 1] = temp;
                }
            }
        }               //stampo la coda
                        for (int i = 0; i < contapazienti; i++) {
                        System.out.println("Nome: " + array[i].nome + ", emergenza: " + array[i].emergenza);
            }
    }
                        else {
                        //Mostro un messaggio per l'utente
                        System.out.println("Non c'è nessun paziente da visitare");
                    }break;
                    }
                    
                    //Uscita dalla coda    
                case 4 -> {
                    
                    //Mostro un messaggio per l'utente
                    System.out.println("sei uscito dal pronto soccorso");
                    
                    //Uscita dallo switch
                    break;}
                        
        
        }  
        }while (selezione != 4);
    }
}