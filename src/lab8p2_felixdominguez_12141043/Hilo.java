/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_felixdominguez_12141043;

import javax.swing.JProgressBar;

/**
 *
 * @author Lenovo I7
 */
public class Hilo extends Thread{
    private JProgressBar progreso;
    private boolean sigue;
    private boolean fin;

    public Hilo(JProgressBar progreso) {
        this.progreso = progreso;
        sigue=true;
        fin=true;
    }

    public JProgressBar getProgreso() {
        return progreso;
    }

    public void setProgreso(JProgressBar progreso) {
        this.progreso = progreso;
    }

    public boolean isSigue() {
        return sigue;
    }

    public void setSigue(boolean sigue) {
        this.sigue = sigue;
    }

    public boolean isFin() {
        return fin;
    }

    public void setFin(boolean fin) {
        this.fin = fin;
    }
    
    
    
    

    @Override
    public void run() {
        while(fin){
            if(sigue){
                progreso.setValue(progreso.getValue()+1);
                if(progreso.getValue()==progreso.getMaximum()){
                    fin=false;
                    
                }                
            } //FIN IF
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
