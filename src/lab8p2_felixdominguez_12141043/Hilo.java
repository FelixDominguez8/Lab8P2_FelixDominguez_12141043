/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_felixdominguez_12141043;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo I7
 */
public class Hilo extends Thread{
    private JProgressBar progreso;
    private ArrayList<Auto> autos=new ArrayList();
    private JTable tabla;
    private boolean sigue;
    private boolean fin;
    DefaultTableModel modelo= new DefaultTableModel();

    public Hilo(JProgressBar progreso, JTable tabla, ArrayList<Auto> autos) {
        this.progreso = progreso;
        this.tabla = tabla;
        this.autos = autos;
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

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public ArrayList<Auto> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Auto> autos) {
        this.autos = autos;
    }
    
    
    
    public void ordenar(){
        
        for (int i = 0; i < autos.size() - 1; i++) {
            for (int j = i + 1; j < autos.size(); j++) {
                if (autos.get(i).getDistancia() < autos.get(j).getDistancia()) {
                    Auto temp=autos.get(i);
                    autos.set(i,autos.get(j));
                    
                    autos.set(j, temp);
                    
                }
            }
        }
        
        /*for(int j=0;j<autos.size();j++){
            int idi=autos.get(j).getId();
            int idm=(Integer)tabla.getModel().getValueAt(j, 3);
           
        }
        for(int i=0;i<autos.size();i++){
            Object[] fila={
                autos.get(i).getId(),
                autos.get(i).getNombre(),
                autos.get(i).getDistancia()
            };
            modelo = (DefaultTableModel) tabla.getModel();
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);*/
    }
    
    
    @Override
    public void run() {
        while(fin){
            if(sigue){
                progreso.setValue(progreso.getValue()+1);
                ordenar();
                if(progreso.getValue()==progreso.getMaximum()){
                    fin=false;
                    JOptionPane.showMessageDialog(null, "Ha termina la carrera");
                }                
            } //FIN IF
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
