/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author yangel
 */
public class Pokemon {
    private int indice;
    private String nombre; 
    private Regalo regalo;
    private int relacion;
    private String[] estado;

    public Pokemon(int indice, String nombre, int relacion) {
        this.indice = indice;
        this.nombre = nombre;
        this.regalo = null;
        this.relacion = relacion;
        this.estado = null;
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

    
    
    public Regalo getRegalo() {
        return regalo;
    }

    public void setRegalo(Regalo regalo) {
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
    
    
    
}
