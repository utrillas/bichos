/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bichitos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Heretarà de la superclasse. Podrà crear instancies però no permetrà la creació de subclasses
 * @author mc_ut
 */
public final class Ameba extends Esser{
    
    //Atribut de classe
    
    private static int TotalAmeba;
    
    //Atribut de instancia
    
    private Aliment aliment;
    private boolean reproduccio;
    
    //Constructor
    
    public Ameba(){
        super("AMEBA",pesAmeba);
        this.aliment = Aliment.Tot;
        this.reproduccio = true;
        TotalAmeba++;
    } 
    
    public static int dirPoblacio(){
     return TotalAmeba;   
    }
    
    //Métodes heretas
    
    @Override
    public String mostrarEstat(){
           return "@"+this.dirNom()+"=>PES: "+ this.dirPes();
    }
    
    @Override
    public String mostrarDetall(){
        return "@"+this.dirNom()+"=>PES: "+this.dirPes()+"ALIMENTACIO: "+ this.aliment+"REPRODUCCIÓ: "+ this.reproduccio;
    }
    
    @Override
    public void reduirPoblacio(){
         TotalAmeba--;
         setTotalEssers(Esser.dirPoblacio()-1);
    }
    
    //¡¡¡¡¡ME HE QUEDADO AQUI!!!!
    
    public void menjar(ArrayList listaEssers){
        int aleatori = Esser.generaAleatori(0,listaEssers.size());
        
        Esser menjat = (Esser)listaEssers.get(aleatori);
        if (!menjat.dirNom().equals(this.dirNom())) {
            this.canviaPes(menjat.dirPes()); 
            System.out.println("ALIMENTACIÓ ****" + this.dirNom()+" : m'he menjar a " + menjat.dirNom()+". Ara pese "+ this.dirPes());

        }
    }

    @Override
    public void reproduir(ArrayList listaEssers){
        if (this.pes >=60) {

        }
    }
}
