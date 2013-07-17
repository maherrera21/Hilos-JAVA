/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author MIGUELH
 */
public class TortugaThread extends Thread {

    public void run() {
        int i = 0;
        System.out.println("Comienza la tortuga..");
        while (i < 5) {
            try {
                Thread.sleep(5000);
                System.out.println("Tortuga..");
            } catch (InterruptedException ex) {
            }
            i++;
        }
        System.out.println("Termina la tortuga");

    }
}
