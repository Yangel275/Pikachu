/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author yangel
 */
public class Regalo_Pk {
    private int indice;
    private String nombre;
    private int cantidad;
    private int relacion;
    private Regalo_Pk izq;
    private Regalo_Pk der;

    public Regalo_Pk(int indice, String nombre, int cantidad, int relacion) {
        this.indice = indice;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.relacion = relacion;
        this.izq = null;
        this.der = null;
    }

    
    public void insertar(Regalo_Pk nuevo){
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



    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }



    public int getRelacion() {
        return relacion;
    }

    public void setRelacion(int relacion) {
        this.relacion = relacion;
    }



    public Regalo_Pk getIzq() {
        return izq;
    }

    public void setIzq(Regalo_Pk izq) {
        this.izq = izq;
    }


    public Regalo_Pk getDer() {
        return der;
    }

    public void setDer(Regalo_Pk der) {
        this.der = der;
    }
}
