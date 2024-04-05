/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import ManejoCsv.Orden;

/**
 *
 * @author yangel
 */
public class Pokemon {
    private int indice;
    private String nombre; 
    private Regalo_Pk regalo;
    private int tamano;
    private int relacion;
    private String[] estado;
    private String emocion;

    public Pokemon(int indice, String nombre, int relacion) {
        this.indice = indice;
        this.nombre = nombre;
        this.regalo = null;
        this.relacion = relacion;
        this.estado = null;
        this.emocion = null;
        this.tamano = 0;
    }

    public void disparador_aumento(int indice){
        Regalo_Pk regalo = this.getRegalo();
        Regalo_Pk buscado = this.buscar(regalo, indice);
        this.setRelacion(this.getRelacion() + buscado.getRelacion());
        
        Regalo_Pk[] regalos = new Regalo_Pk[9];
        for(int i = 1; i <= regalos.length; i++){
            regalos[i] = this.buscar(regalo, i);
            if(regalos[i].getNombre() == buscado.getNombre()){
                regalos[i].setCantidad(regalos[i].getCantidad() + 1);
            }
        }
        
        this.setRegalo(null);
        
        Orden nv = new Orden();
        nv.setPokemones(regalos);
        
        this.setRegalo(nv.getpRPk());
    }
    
    public Regalo_Pk buscar(Regalo_Pk regalo,  int indice){
        Regalo_Pk buscado = null;
        if(regalo.getIndice() == indice){
            buscado = regalo;
        }
        
        if(regalo.getIndice() > indice){
            if(regalo.getIzq() == null){
                buscado = null;
            }else{
                buscado = this.buscar(regalo.getIzq(), indice);
            }
        }
        
        if(regalo.getIndice() < indice){
           if(regalo.getDer() == null){
                buscado = null;
            }else{
                buscado = this.buscar(regalo.getDer(), indice);
            } 
        }
           
        return buscado;
    }
    
    

    public String def_estado(){
        String estado = null;
        
        if(this.relacion < 2000){
          estado = this.estado[0];
          this.setEmocion("Triste");
        }
        if(2000<= this.relacion && this.relacion < 4000 ){
            estado = this.estado[1];
            this.setEmocion("Preocupado");
        }
        if(4000<= this.relacion && this.relacion < 6000 ){
            estado = this.estado[2];
            this.setEmocion("Inspirado");
        }
        
        if(6000<= this.relacion && this.relacion < 8000 ){
            estado = this.estado[3];
            this.setEmocion("Feliz");
        }
        if(8000<= this.relacion && this.relacion <= 10000 ){
            estado = this.estado[4];
            this.setEmocion("Entusiasmado");
        }
        
        return estado;
        
    }
    
    public String imprimir(){
        String imprimir = null;
        imprimir = Integer.toString(this.getIndice()) + ".- " + this.getNombre()+"\n";
        imprimir += "Relación: +"+Integer.toBinaryString(this.getRelacion())+"  Emoción: "+this.getEmocion()+"\n\n";
        return imprimir;
    }
    
    public void disp_Nd(){
        Regalo_Pk inicial = this.getRegalo();
        this.print(inicial);
    }
    
    public void print(Regalo_Pk inicial){
        if(inicial == null){
            return;
        }
       this.print(inicial.getIzq());
      
       this.print(inicial.getDer());
        
        
    }
    
    public int getIndice() {
        return indice;
    }

    
    public void setIndice(int indice) {
        this.indice = indice;
    }

    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    public Regalo_Pk getRegalo() {
        return regalo;
    }

    public void setRegalo(Regalo_Pk regalo) {
        this.regalo = regalo;
    }

    
    
    
    public int getRelacion() {
        return relacion;
    }

    public void setRelacion(int relacion) {
        this.relacion = relacion;
    }

    
    
    
    public String[] getEstado() {
        return estado;
    }

    public void setEstado(String[] estado) {
        this.estado = estado;
    }

    
    public String getEmocion() {
        return emocion;
    }

    
    public void setEmocion(String emocion) {
        this.emocion = emocion;
    }

    /**
     * @return the tamano
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * @param tamano the tamano to set
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    
    
    
}
