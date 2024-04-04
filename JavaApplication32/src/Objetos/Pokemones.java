/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author yangel
 */
public class Pokemones {
    private static Pokemon[] pok_dis;
    private static int tamano;


    public void inicio(){
        Pokemones.setTamano(0);
    }
    
    public void agg_pk(Pokemon nuevo){
        if(Pokemones.getTamano() == 0){
           Pokemon[] list = new Pokemon[1];
           list[0] = nuevo;
           Pokemones.setPok_dis(list);
           Pokemones.setTamano(1);
        }else{
            Pokemon[] viejo = Pokemones.getPok_dis();
            Pokemones.setTamano(Pokemones.getTamano() + 1);
            Pokemon[] list = new Pokemon[Pokemones.getTamano()];
            
            int j = -1;
            for(int i =0 ; i < Pokemones.getTamano(); i++){
                list[i] = viejo[i];
                j += 1;
            }
            
            list[j] = nuevo;
            Pokemones.setPok_dis(list);
        }
    }
    
    
    public static Pokemon[] getPok_dis() {
        return pok_dis;
    }

    public static void setPok_dis(Pokemon[] aPok_dis) {
        pok_dis = aPok_dis;
    }



    public static int getTamano() {
        return tamano;
    }

    public static void setTamano(int aTamano) {
        tamano = aTamano;
    }
    
    
}
