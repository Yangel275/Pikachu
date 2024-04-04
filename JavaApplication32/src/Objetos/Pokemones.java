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
        this.setTamano(0);
    }
    
    public void agg_pk(Pokemon nuevo){
        if(this.getTamano() == 0){
           Pokemon[] list = new Pokemon[1];
           list[0] = nuevo;
           this.setPok_dis(list);
           this.setTamano(1);
        }else{
            Pokemon[] viejo = this.getPok_dis();
            this.setTamano(this.getTamano() + 1);
            Pokemon[] list = new Pokemon[this.getTamano()];
            
            int j = -1;
            for(int i =0 ; i < this.getTamano(); i++){
                list[i] = viejo[i];
                j += 1;
            }
            
            list[j] = nuevo;
            this.setPok_dis(list);
        }
    }
    
    
    
    public Pokemon[] getPok_dis() {
        return pok_dis;
    }

    public void setPok_dis(Pokemon[] pok_dis) {
        this.pok_dis = pok_dis;
    }

    public String imprimir(){
        String print = "";
        for(int i = 0; i < this.getTamano(); i++){
            print += this.getPok_dis()[i].imprimir();
        }
        return print;
    }
    
    
    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }


    
    
    
    
}
