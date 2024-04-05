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
    private Regalo_Td pRTd;
    private int tmTD; 
    private Regalo_Pk[] pokemones;
    private Regalo_Pk pRPk;
    private int tmPk;
    
    public Regalo_Td men_may_Td(){
        Regalo_Td[] lista = this.getTienda();
        Regalo_Td[] viejo = null;
        Regalo_Td[] nuevo = null;
        
       
        int j = 0;
        for(int i=0; i < lista.length; i++){
            nuevo = new Regalo_Td[i+1];
            j = i;
            if(0<i){
                for(int l = 0; l < viejo.length; l++){
                    nuevo[l] = viejo[l];
                }
                nuevo[i] = lista[i];
                
                while(nuevo[j-1].getCosto()>nuevo[j].getCosto()){
                    Regalo_Td numero = nuevo[j];
                    nuevo[j] = nuevo[j-1];
                    nuevo[j-1] = numero;
                    
                    if(j-1 == 0){
                        break;
                    }
                    
                    j-=1;
                    
                }
                viejo = nuevo;
                    
                    
            }else{
                nuevo[i] = lista[i];
                viejo = nuevo;
                
            }
            
        }
        Orden arreglo = new Orden();
        for(int l = 0; l < nuevo.length; l++){
            nuevo[l].setIndice(l);
        }
        
        arreglo.setTienda(nuevo);
        
        nuevo = arreglo.ord_Td();
        
        this.setTienda(nuevo);
        this.pNodoTd();
    
        return this.getpRTd();
    }
    
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
        
        
        Orden cambio_1 = new Orden();
        cambio_1.setTienda(lista1);
        Regalo_Td[] lista3 = cambio_1.ord_Td();



        Orden cambio_2 = new Orden();
        cambio_2.setTienda(lista2);
        Regalo_Td[] lista4 = cambio_2.ord_Td();


        j = ordenada.length - 1 ;
        int l = lista3.length - 1;
        int t = lista4.length - 1;

            while(j > 0){
                if(l > t){
                    ordenada[j] = lista3[l];
                    j -= 1;
                    l -= 1;
                }
                ordenada[j] = lista4[t];
                j -= 1;
                t -= 1;
                ordenada[j] = lista3[l];
                j -= 1;
                l -= 1;
            }

        }
        
        return ordenada;  
        
    }
   
   public void pNodoTd() {
       this.setTmTD(this.getTienda().length);
       this.setpRTd(this.getTienda()[0]);
       for(int i = 1; i <this.getTienda().length; i++){
           this.getpRTd().insertar(this.getTienda()[i]);
       }
       
   }
    
    
    
    
    
    
    public Regalo_Pk[] men_may_Pk(){
        Regalo_Pk[] lista = this.getPokemones();
        Regalo_Pk[] viejo = null;
        Regalo_Pk[] nuevo = null;
        
       
        int j = 0;
        for(int i=0; i < lista.length; i++){
            nuevo = new Regalo_Pk[i+1];
            j = i;
            if(0<i){
                for(int l = 0; l < viejo.length; l++){
                    nuevo[l] = viejo[l];
                }
                nuevo[i] = lista[i];
                
                while(nuevo[j-1].getRelacion()>nuevo[j].getRelacion()){
                    Regalo_Pk numero = nuevo[j];
                    nuevo[j] = nuevo[j-1];
                    nuevo[j-1] = numero;
                    
                    if(j-1 == 0){
                        break;
                    }
                    
                    j-=1;
                    
                }
                viejo = nuevo;
                    
                    
            }else{
                nuevo[i] = lista[i];
                viejo = nuevo;
                
            }
            
        }
        
        for(int i = 0; i < nuevo.length; i++){
            nuevo[i].setIndice(i+1);
        }
        
        Orden arreglo = new Orden();
        
        arreglo.setPokemones(nuevo);
        
        
        return nuevo;
        
    
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
        
        
        
        Orden cambio_1 = new Orden();
        cambio_1.setPokemones(lista1);
        Regalo_Pk[] lista3 = cambio_1.ord_Pk();



        Orden cambio_2 = new Orden();
        cambio_2.setPokemones(lista2);
        Regalo_Pk[] lista4 = cambio_2.ord_Pk();


        j = ordenada.length - 1 ;
        int l = lista3.length - 1;
        int t = lista4.length - 1;

            while(j > 0){
                if(l > t){
                    ordenada[j] = lista3[l];
                    j -= 1;
                    l -= 1;
                }
                ordenada[j] = lista4[t];
                j -= 1;
                t -= 1;
                ordenada[j] = lista3[l];
                j -= 1;
                l -= 1;
            }

        }
        
        this.setPokemones(ordenada);
        return ordenada;
            
    
    }
    
    
    public Regalo_Pk pNodoPk() {
       this.setTmPk(this.getPokemones().length);
       Regalo_Pk inicial = this.getPokemones()[0];
       for(int i = 1; i < this.getPokemones().length; i++){
           Regalo_Pk nuevo = this.getPokemones()[i]; 
           inicial.insertar(nuevo);
       }
       
       
       return inicial;
        
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

    
    public Regalo_Td getpRTd() {
        return pRTd;
    }

    
    public void setpRTd(Regalo_Td pRTd) {
        this.pRTd = pRTd;
    }

    
    
    public Regalo_Pk getpRPk() {
        return pRPk;
    }

    public void setpRPk(Regalo_Pk pRPk) {
        this.pRPk = pRPk;
    }

    public int getTmTD() {
        return tmTD;
    }

    public void setTmTD(int tmTD) {
        this.tmTD = tmTD;
    }

    public int getTmPk() {
        return tmPk;
    }

    /**
     * @param tmPk the tmPk to set
     */
    public void setTmPk(int tmPk) {
        this.tmPk = tmPk;
    }

        
}

    
