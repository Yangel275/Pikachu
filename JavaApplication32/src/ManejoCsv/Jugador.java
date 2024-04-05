/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManejoCsv;
import Objetos.Tienda;
import ManejoCsv.Orden;
import Objetos.Juego;
import Objetos.Pokemon;
import Objetos.Pokemones;
import java.io.*;
import java.util.Scanner;


import Objetos.Regalo_Pk;
import Objetos.Regalo_Td;

/**
 *
 * @author yangel
 */
public class Jugador {
    
    public void Down_PokDis_Estandar(){
        Pokemon[] nueva = null;
        Pokemon[] vieja = null;
        Pokemon pk;
        String[] new_Pk;
        int indice = 0;
        int inicio = 0;

        
        
        try (Scanner scFile = new Scanner(new File("./Pikachu - Disponible.csv"))) {
            while (scFile.hasNextLine()) {
                if (inicio == 0) {
                    new_Pk = scFile.nextLine().split(",");
                    inicio = 1;
                }else{
                    new_Pk = scFile.nextLine().split(",");
                    indice += 1;
                    
                    pk = new Pokemon( Integer.parseInt(new_Pk[0]), new_Pk[1], Integer.parseInt(new_Pk[2]));
   
                    nueva = new Pokemon[indice]; 
                    if (indice > 1) {
                        for (int i = 0; i < vieja.length; i++) {
                            nueva[i] = vieja[i];
                        }
                    }
                    
                    nueva[indice - 1] = pk;
                    vieja = nueva;
                }
            }

        } catch (Exception e) {
            System.out.println("Error");
        }

        
        Pokemones disp = new Pokemones();
        disp.inicio();
        for(int i = 0 ; i< nueva.length ; i++){
            disp.agg_pk(nueva[i]);
            
        
        }
        
        this.Down_RPk_Estandar();
        
    } 
    
    public void Down_RPk_Estandar() {
        
        Regalo_Pk[] nueva = null;
        Regalo_Pk[] vieja = null;
        Regalo_Pk regalo_pk;
        String[] new_RPk;
        int indice = 0;
        int inicio = 0;

        
        
        try (Scanner scFile = new Scanner(new File("./Pikachu - Regalo recibido.csv"))) {
            while (scFile.hasNextLine()) {
                if (inicio == 0) {
                    new_RPk = scFile.nextLine().split(",");
                    inicio = 1;
                }else{
                    new_RPk = scFile.nextLine().split(",");
                    indice += 1;
                    regalo_pk = new Regalo_Pk( new_RPk[0], Integer.parseInt(new_RPk[1]), Integer.parseInt(new_RPk[2]));
                    nueva = new Regalo_Pk[indice];
                    if (indice > 1) {
                        for (int i = 0; i < vieja.length; i++) {
                            nueva[i] = vieja[i];
                            
                        }
                        
                    }
                    
                    
                        
                    
                    nueva[indice - 1] = regalo_pk;
                    
                    vieja = nueva;
                }
            }

        } catch (Exception e) {
            System.out.println("Error");
        }

        
        
        Orden orden = new Orden();
        orden.setPokemones(nueva);
        
        nueva = orden.men_may_Pk();
        
        orden.setPokemones(nueva);
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
        Regalo_Pk[] nuevo = orden.ord_Pk();
        
        orden.setPokemones(nuevo);
        
        
        
        Regalo_Pk nodo = orden.pNodoPk();
        orden.setpRPk(nodo);
        
        System.out.println(nodo.imprimir());
        System.out.println(nodo.getIzq().imprimir());
        System.out.println(nodo.getDer().imprimir());
        
        
        
        Pokemones list = new Pokemones();
        
        for (int i = 0; i < list.getTamano(); i++) {
            list.getPok_dis()[i].setRegalo(orden.getpRPk());
            list.getPok_dis()[i].setTamano(orden.getTmPk());
            
        }
        
        Regalo_Pk inicial = list.getPok_dis()[0].getRegalo();
        
        
        list.getPok_dis()[0].disp_Nd();
        
        
        
    }

    public void Down_RTd_Estandar() {
        
        
        Regalo_Td[] nueva = null;
        Regalo_Td[] vieja = null;
        Regalo_Td regalo_td;
        String[] new_td;
        int indice = 0;
        int inicio = 0;

        
        
        try (Scanner scFile = new Scanner(new File("./Pikachu - Regalos.csv"))) {
            while (scFile.hasNextLine()) {
                if (inicio == 0) {
                    new_td = scFile.nextLine().split(",");
                    inicio = 1;
                }else{
                    new_td = scFile.nextLine().split(",");
                    indice += 1;
                    regalo_td = new Regalo_Td( new_td[0], Integer.parseInt(new_td[1]), Integer.parseInt(new_td[2]));
                    nueva = new Regalo_Td[indice];
                    if (indice > 1) {
                        for (int i = 0; i < vieja.length; i++) {
                            nueva[i] = vieja[i];
                        }
                    }
                    nueva[indice - 1] = regalo_td;
                    vieja = nueva;
                }
            }

        } catch (Exception e) {
            System.out.println("Error");
        }

        Orden orden = new Orden();
        orden.setTienda(nueva);

        Regalo_Td pNodo = orden.men_may_Td();
        
        

        Tienda arbol = new Tienda();
        
        arbol.setInicial(pNodo);
        arbol.setTamano(orden.getTmTD());
           
        
        
    }
    
    public void Down_Estado_Estandar(){
        Pokemones el = new Pokemones();
        String estado;
        String[] new_est;
        int indice = 0;
        int inicio = 0;

        
        
        try (Scanner scFile = new Scanner(new File("./Pikachu - Estado Pokemon.csv"))) {
            while (scFile.hasNextLine()) {
                if (inicio == 0) {
                    new_est = scFile.nextLine().split(",");
                    inicio = 1;
                }else{
                    new_est = scFile.nextLine().split(",");
                    el.getPok_dis()[indice].setEstado(new_est);
                    indice += 1;
                    
                    
                }
            }
        }catch (Exception e) {
            System.out.println("Error");
        }

    }
    
    public void prueba(){
        File f = new File("./Pikachu - Disponible.csv");
        try (FileWriter fw = new FileWriter(f);) {
            fw.write("num_hab,tipo_hab,piso\n");
        } catch (Exception e) {
            System.out.println("Se a producido un error");
        }
    }
    
}


