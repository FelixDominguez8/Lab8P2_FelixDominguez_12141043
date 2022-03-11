/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_felixdominguez_12141043;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Lenovo I7
 */
public class Nascar extends Auto{
    Random r=new Random();

    public Nascar() {
    }

    public Nascar(int id, String nombre, Color color) {
        super(id, nombre, color);
    }

    public Nascar(int id, String nombre, Color color, int distancia) {
        super(id, nombre, color, distancia);
    }
    
    @Override
    public void RandomDistancias(){
        int ran=40+r.nextInt(140);
        super.setDistancia(ran);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
