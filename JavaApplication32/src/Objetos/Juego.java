/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import Objetos.Pokemon;
/**
 *
 * @author yangel
 */
public class Juego {
    private static long start;
    private static int time;
    private static Pokemon[] pokemones;
    private static int tamano;
    private static Pokemon seleccionado;
    private static Regalo_Td regalo;
    private static int watts;
    private static int cant_pk;

    public void first_time(){
        this.setStart(System.currentTimeMillis());
        this.setTamano(0);
        this.setTime(0);
        this.setWatts(0);
        this.setCant_pk(0);
    }
    
    public void inicio(){
        this.setStart(System.currentTimeMillis());
    }
    
    public void agg_tm(int time){
        int viejo = this.getTime();
        int suma = time - viejo;
        this.setTime(time);
        this.agg_tm(time);
        
    }
    
    public void agg_pk(Pokemon pokemon){
        Pokemon[] vieja = this.getPokemones();
        int indice = this.getPokemones().length + 1;
        Pokemon[] nueva = Pokemon[indice];
    }
    
    
    
    
    public void agg_watt(int suma){
        this.setWatts(this.getWatts() + suma);
    }
    
    public void use_watt(){
        this.setWatts(this.getWatts() + 10);
    }
    
    
    public void search_gift(){
        
    }
    
    public void gift(int costo){
        
    }
    
    
    
    
    
    
    
    
    
    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }


    
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }


    
    
    public Pokemon[] getPokemones() {
        return pokemones;
    }

    public void setPokemones(Pokemon[] pokemones) {
        this.pokemones = pokemones;
    }

    
    
    
    public Pokemon getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Pokemon seleccionado) {
        this.seleccionado = seleccionado;
    }

    
    
    public Regalo_Td getRegalo() {
        return regalo;
    }

    public void setRegalo(Regalo_Td regalo) {
        this.regalo = regalo;
    }

    
    
    
    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }

    
    
    
    public int getCant_pk() {
        return cant_pk;
    }

    public void setCant_pk(int cant_pk) {
        this.cant_pk = cant_pk;
    }

    
    public int getTamano() {
        return tamano;
    }

    
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    
    
    
    
    

    
    
    
    
    
    
}