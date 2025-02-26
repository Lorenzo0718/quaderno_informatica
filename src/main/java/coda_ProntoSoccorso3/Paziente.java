/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coda_ProntoSoccorso3;

import java.util.Scanner;

/**
 *
 * @author lenovoù
 */
public class Paziente {
    public String nome;
    public int posizione;
    
    public Paziente(){
        Scanner input = new Scanner(System.in);
        System.out.println("inserisci il nome del paziente");
        nome = input.nextLine();
        
    }
    
    public String get_nome(){
        return nome;
    }
    public int get_posizione(){
        return posizione;
    }
}
