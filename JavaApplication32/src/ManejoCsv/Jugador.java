/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManejoCsv;

import Objetos.Juego;
import Objetos.Pokemon;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author yangel
 */
public class Jugador {
        //Descargar Habitaciones y enlazarlo en forma de un ABB
    public void Down_Hab(){
        Pokemon[] nueva = null;
        Pokemon[] vieja = null;
        Pokemon Pk;
        String[] new_pok;
        int indice = 0;
        int inicio = 0;

        
        
        try (Scanner scFile = new Scanner(new File("./Pokemones - Pikachu.csv"))) {
            while (scFile.hasNextLine()) {
                if (inicio == 0) {
                    new_pok = scFile.nextLine().split(",");
                    inicio = 1;
                }else{
                    new_pok = scFile.nextLine().split(",");
                    indice += 1;
                    pk = new Pokemon(Integer.parseInt(new_pok[0]), new_pok[1], Integer.parseInt(new_pok[2]));
                    nueva = new Pokemon[indice];
                    if (indice > 1) {
                        for (int i = 0; i < vieja.length; i++) {
                            nueva[i] = vieja[i];
                        }
                    }
                    nueva[indice - 1] = Pokemon;
                    vieja = nueva;
                }
            }

        } catch (Exception e) {
            System.out.println("Error");
        }

        Orden orden = new Orden();
        orden.setHab(nueva);

        nueva = orden.men_may_hab();

        Habitaciones arbol = new Habitaciones();

        for (int i = 0; i < nueva.length; i++) {
            arbol.insertar(nueva[i]);

        }

        arbol.lim_may(arbol.getInicial());
        arbol.lim_men(arbol.getInicial());
    }

    //Guardar Habitaciones ABB
    public void Up_Pk() {
        Pokemon[] pokemones =  Juego.getPokemones();

        File f = new File("./Pokemones - Pikachu.csv");
        try (FileWriter fw = new FileWriter(f);) {
            fw.write(",tipo_hab,piso\n");
            for (int i = arbol.getMenor(); i <= arbol.getMayor(); i++) {
                Habitación buscado = arbol.disparador_busqueda(i);
                fw.write(buscado.toCSV() + "\n");
            }
        } catch (Exception e) {
            System.out.println("Se a producido un error");
        }

    }

}


