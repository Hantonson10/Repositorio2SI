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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //MiPrimerHilo hilo1 = new MiPrimerHilo();
        
        //hilo1.start();
        //System.out.println("Hola soy el padre");
        
        Thread t1 = new Thread(new MiSegundoHilo(10, "Soy A"));
        Thread t2 = new Thread(new MiSegundoHilo(10, "Soy B"));
        Thread t3 = new Thread(new MiSegundoHilo(10, "Soy C"));

        t1.start();
        t2.start();
        t3.start();
    }
    
}
