/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManejoCsv;

import Objetos.Regalo_Pk;
import Objetos.Regalo_Td;

/**
 *
 * @author yangel
 */
public class Orden {
    private Regalo_Td[] tienda;
    private Regalo_Pk[] pokemones;
    
    public Regalo_Td[] ord_Td(){
        Regalo_Td[] Lista = this.getTienda();
        Regalo_Td[] ordenada = new Regalo_Td[Lista.length];
        
        if(Lista.length <= 3){
            
            if(Lista.length == 1){
                ordenada[0] = Lista[0];
                
        
            }
            
            if(Lista.length == 2){
                ordenada[0] = Lista[1];
                ordenada[1] = Lista[0];
                
            }
            
            if(Lista.length == 3){
                ordenada[0] = Lista[1];
                ordenada[1] = Lista[0];
                ordenada[2] = Lista[2];
                
            }

        }else{
            
            double mitad = Lista.length;
            mitad = mitad/2;
            mitad = Math.round(mitad);
            
            int primero = (int)mitad;
            int izq = primero; 
            int der = Lista.length - primero;
            
            if(izq == der){
                der -= 1;
                primero +=1;
            }else{
                izq -= 1;
            }
            

            Regalo_Td[] lista1 = new Regalo_Td[izq];
            Regalo_Td[] lista2 = new Regalo_Td[der];
            int j = 0;
            int k = 0;

            for(int i = 0; i < Lista.length; i++){
                if(i < primero -1){
                    lista1[j] = Lista[i];
                    j +=1;
                }
                
                if(i == primero - 1){
                    ordenada[0] = Lista[i];
                }
                
                if(i > primero - 1){
                    lista2[k] = Lista[i];
                    k +=1;
                }
            }
        }
        return ordenada;
    }
    

    public Regalo_Pk[] ord_Pk(){
        Regalo_Pk[] Lista = this.getPokemones();
        Regalo_Pk[] ordenada = new Regalo_Pk[Lista.length];
        
        if(Lista.length <= 3){
            
            if(Lista.length == 1){
                ordenada[0] = Lista[0];
                
        
            }
            
            if(Lista.length == 2){
                ordenada[0] = Lista[1];
                ordenada[1] = Lista[0];
                
            }
            
            if(Lista.length == 3){
                ordenada[0] = Lista[1];
                ordenada[1] = Lista[0];
                ordenada[2] = Lista[2];
                
            }

        }else{
            
            double mitad = Lista.length;
            mitad = mitad/2;
            mitad = Math.round(mitad);
            
            int primero = (int)mitad;
            int izq = primero; 
            int der = Lista.length - primero;
            
            if(izq == der){
                der -= 1;
                primero +=1;
            }else{
                izq -= 1;
            }
            

            Regalo_Pk[] lista1 = new Regalo_Pk[izq];
            Regalo_Pk[] lista2 = new Regalo_Pk[der];
            int j = 0;
            int k = 0;

            for(int i = 0; i < Lista.length; i++){
                if(i < primero -1){
                    lista1[j] = Lista[i];
                    j +=1;
                }
                
                if(i == primero - 1){
                    ordenada[0] = Lista[i];
                }
                
                if(i > primero - 1){
                    lista2[k] = Lista[i];
                    k +=1;
                }
            }
        }
        return ordenada;
    }
    
    
    
    
    
    public Regalo_Td[] getTienda() {
        return tienda;
    }

    public void setTienda(Regalo_Td[] tienda) {
        this.tienda = tienda;
    }

    
    
    
    public Regalo_Pk[] getPokemones() {
        return pokemones;
    }

    public void setPokemones(Regalo_Pk[] pokemones) {
        this.pokemones = pokemones;
    }

        
}

    
