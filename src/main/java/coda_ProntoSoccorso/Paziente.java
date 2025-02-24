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
public class Paziente {
    //inizializzo gli attributi della classe Paziente
    public String nome;
    public int emergenza;
    public int posizione;
    
    //creo un oggetto di tipo Scanner
Scanner input = new Scanner(System.in);    
    

//creo un metodo per l' inserimento dei dati dall' utente
public void input_Paziente(){
        System.out.println("nome: ");
        nome = input.nextLine();
        System.out.print("\nemergenza in un scala da 1 a 3: ");
        emergenza = input.nextInt();
        
    }

 }


