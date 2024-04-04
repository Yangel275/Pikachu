/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;
/**
 *
 * @author yangel
 */
public class Juego {
    private static long start;
    private static int time;
    private static Pokemon[] pokemones;
    private static int tamano;
    private static Regalo_Td pregalo;
    private static int watts;

    public void first_time(){
        this.setTamano(0);
        this.setTime(0);
        this.setWatts(0);
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
        if(this.getTamano()==0){
            
            Pokemon[] nueva = new Pokemon[1];
            nueva[0] = pokemon;
            
            this.setPokemones(nueva);
            this.setTamano(this.getTamano() +1);
        
        }else{
            Pokemon[] vieja = this.getPokemones();
            Pokemon[] nueva = new Pokemon[this.getPokemones().length + 1];

            for(int i = 0; i < vieja.length; i++){
                nueva[i] = vieja[i];
            }

            nueva[vieja.length] = pokemon;
            
            this.setPokemones(nueva);
            this.setTamano(this.getTamano() +1);
        }
        
    }
    
    
    
    
    public void agg_watt(int suma){
        this.setWatts(this.getWatts() + suma);
    }
    
    public void use_watt(){
        this.setWatts(this.getWatts() + 10);
    }
    
    
    
    public void agg_RTd(Regalo_Td regalo){
        if(this.getPregalo() == null){
            this.setPregalo(regalo);   
        }else{
            this.getPregalo().insertar(regalo);
        }
    
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

    
   
    
    public Regalo_Td getPregalo() {
        return pregalo;
    }

    public void setPregalo(Regalo_Td regalo){
        this.pregalo = regalo;
    }
    
    
    
    public int getWatts() {
        return watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }

    
    
    public int getTamano() {
        return tamano;
    }

    
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    
    
    
    
    

    
    
    
    
    
    
}