/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManejoCsv;
import Objetos.Juego;
import Objetos.Pokemones;
import java.io.*;
import java.util.Scanner;

import Objetos.Regalo_Pk;

/**
 *
 * @author yangel
 */
public class Estandar {
    public void Down_RPk() {
        
        
        Regalo_Pk[] nueva = null;
        Regalo_Pk[] vieja = null;
        Regalo_Pk regalo_pk;
        String[] new_RPk;
        int indice = 0;
        int inicio = 0;

        
        
        try (Scanner scFile = new Scanner(new File("./Estandar/Pikachu - Regalo recibido.csv"))) {
            while (scFile.hasNextLine()) {
                if (inicio == 0) {
                    new_RPk = scFile.nextLine().split(",");
                    inicio = 1;
                }else{
                    new_RPk = scFile.nextLine().split(",");
                    indice += 1;
                    regalo_pk = new Regalo_Pk(Integer.parseInt(new_RPk[0]), new_RPk[1], Integer.parseInt(new_RPk[2]), Integer.parseInt(new_RPk[3]));
                    nueva = new Regalo_Pk[indice];
                    if (indice > 1) {
                        for (int i = 0; i < vieja.length; i++) {
                            nueva[i] = vieja[i];
                        }
                    }
                    nueva[indice - 1] = realo_pk;
                    vieja = nueva;
                }
            }

        } catch (Exception e) {
            System.out.println("Error");
        }

        Orden orden = new Orden();
        orden.setPokemones(nueva);

        nueva = orden.ord_Pk();
        
        

        Pokemones arbol = new Pokemones();

        for (int i = 0; i < nueva.length; i++) {
            arbol.agg_pk(nueva[i]);

        }
        
    }
}
