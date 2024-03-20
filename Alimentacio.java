/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bichitos;

import java.util.ArrayList;

/**
 *
 * @author mc_ut
 */

//definiran les constants dels pesos que s’utilitzaran en el procés de creació dels diferents tipus 
//d’essers

public interface Alimentacio {
    static final int pesAmeba = 20;
    static final int pesBacteri = 10;
    static final int pesAlga = 3;
    static final int pesNutrients = 5;
    
    // on cada tipus d’esser especificarà com porta a terme l’alimentació 
    
    void menjar(ArrayList listaEssers);
    
    
}
