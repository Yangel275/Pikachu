/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author yangel
 */
public class Regalo_Td {
    private int indice;
    private String nombre;
    private int costo;
    private int relacion;
    private Regalo_Td izq;
    private Regalo_Td der;

    public Regalo_Td(String nombre, int costo, int relacion) {
        this.indice = 0;
        this.nombre = nombre;
        this.costo = costo;
        this.relacion = relacion;
        this.izq = null;
        this.der = null;
    }

    
    public void insertar(Regalo_Td nuevo){
        if(nuevo.getIndice() < this.getIndice()){
            //Insertar habitación conectada en forma de su hoja en el lado izquierdo
            if(this.getIzq() == null){
                this.setIzq(nuevo);
            }else{
                this.getIzq().insertar(nuevo);    
            }
        }else{
            //Insertar habitación conectada en forma de su hoja en el lado derecho
            if(this.getDer() == null){
                this.setDer(nuevo);
            }else{
                this.getDer().insertar(nuevo);    
            }
        }
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



    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }



    public int getRelacion() {
        return relacion;
    }

    public void setRelacion(int relacion) {
        this.relacion = relacion;
    }



    public Regalo_Td getIzq() {
        return izq;
    }

    public void setIzq(Regalo_Td izq) {
        this.izq = izq;
    }


    public Regalo_Td getDer() {
        return der;
    }

    public void setDer(Regalo_Td der) {
        this.der = der;
    }

    
    
    
    
    
    
    
    

    
    
    
    
    
}
