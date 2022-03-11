/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_felixdominguez_12141043;

import java.awt.Color;

/**
 *
 * @author Lenovo I7
 */
public class McQueen extends Auto{

    public McQueen() {
    }

    public McQueen(int id, String nombre, Color color) {
        super(id, nombre, color);
    }

    public McQueen(int id, String nombre, Color color, int distancia) {
        super(id, nombre, color, distancia);
    }
    
    @Override
    public void setDistancia(int distancia) {
        super.setDistancia(distancia);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
