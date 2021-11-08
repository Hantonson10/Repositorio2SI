/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antonio.gabarrus.hola.mundo.concurrente;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author A10-PC114
 */
public class MiSegundoHilo implements Runnable{
    private final int numVeces;
    private final String mensaje;

    public MiSegundoHilo(int numVeces, String mensaje) {
        this.numVeces = numVeces;
        this.mensaje = mensaje;
    }
    
    @Override
    public void run(){
        for(int i = 0; i < numVeces; i++){
            System.out.println(mensaje);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MiSegundoHilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
