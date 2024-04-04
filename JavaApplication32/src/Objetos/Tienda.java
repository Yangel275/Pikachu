/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author yangel
 */
public class Tienda {
    private static Regalo_Td inicial;

    public void insertar(Regalo_Td hab){
        if(this.getInicial() == null){
            this.setInicial(hab);   
        }else{
            this.getInicial().insertar(hab);
        }
    }

    /**
     * @return the inicial
     */
    public Regalo_Td getInicial() {
        return inicial;
    }

    /**
     * @param inicial the inicial to set
     */
    public void setInicial(Regalo_Td inicial) {
        this.inicial = inicial;
    }

    
    
}
