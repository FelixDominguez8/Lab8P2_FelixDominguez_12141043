/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_felixdominguez_12141043;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author Lenovo I7
 */
public class Auto implements Serializable{
    private int id;
    private String nombre;
    private Color color;
    private int distancia;

    public Auto() {
        
    }
    
    public Auto(int id, String nombre, Color color) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
    }

    public Auto(int id, String nombre, Color color, int distancia) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.distancia = distancia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    
    public void RandomDistancias(){
        setDistancia(0);
    }

    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre + ", color=" + color + ", distancia=" + distancia;
    }
    
}
