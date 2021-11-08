/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antonio.gabarrus.hola.mundo.concurrente;

/**
 *
 * @author A10-PC114
 */
public class MiPrimerHilo extends Thread{
    @Override
    public void run(){
        System.out.println("Hola soy el hilo");
    }
}
