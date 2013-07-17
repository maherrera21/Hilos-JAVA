/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.io.*;
import java.lang.*;

/**
 *
 * @author MIGUELH
 */
public class LiebreThread implements Runnable {

    public void run() {
        int i = 0;
        System.out.println("Comienza la liebre..");
        while (i < 5) {
            try {
                Thread.sleep(2000);
                System.out.println("Liebre..");
            } catch (InterruptedException ex) {
            }
            i++;
        }
        System.out.println("Termina la liebre");


    }
}
