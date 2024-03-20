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

//Es defineix les constant multiplicadora per al pes de reproduccó i una altra per al máxim d'esser de cada tipus que existirá
public interface Poblacio {
    static final int pesReproduccio = 3;
    static final int nombreMaxim = 20;
    
    //tindrà com a finalitat que cada tipus d’esser quan siga menjat reduïsca el seu
    //propi nombre total d’individus i el general
    
    void  reduirPoblacio();
    
    //s’utilitzarà per a que cada tipus d’organismes definisca el seu mètode de
    //reproducció i puga incloure un nou esser del seu tipus en la llista de essers, per la qual cosa aquesta
    //formarà part de les dades d’entrada al mètode
    
    void  reproduir(ArrayList listaEssers);
 
}

