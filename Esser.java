/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bichitos;

/**
 *
 * @author mc_ut
 */

/*Serà la superclasse a partir de la qual es definirà la resta. Adoptarà els esquemes que s’hagen definit 
en el projecte, tant per a l’alimentació com per a la reproducció
*/

public abstract class Esser implements Alimentacio, Poblacio{
    
    //Atributs de classe.
    
    private static int totalEssers;
    private static int consecutiu;
    
    //Atributs de instancia.
    
    private String nom;
    private int pes;
    
    //Constructor.
    
    public Esser (String nom, int pes){
        this.nom = nom+consecutiu;
        this.pes = pes;
        consecutiu++;
        totalEssers++;
    }
    
    //método getter y setter

    public static void setTotalEssers(int totalEssers) {
        Esser.totalEssers = totalEssers;
    }
    
    public String dirNom(){
        return nom;
    }
    
    public int dirPes(){
        return pes;
    }
    
    
    //método canviapes
    
    public void canviaPes(int canviaPes){
        this.pes += canviaPes;
    }
    
    //método número aleatorio
    
    public static final int generaAleatori(int inicial, int quantitat){
        int aleatori = (int)(Math.random()*quantitat+inicial);
        return aleatori;
    }
    
    //metodo dirpoblació (indica el total de individus d'aquesta classe.)
    
    public int dirPoblacio(){
        return totalEssers;
    }
    
    //método mostrastEstat
    
    public abstract String mostrarEstat();
    
    //método mostratDetall
    
    public abstract String mostrarDetall();
    
}
