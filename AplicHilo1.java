/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author MIGUELH
 */
public class AplicHilo1 {

    public static void main(String[] args) {
        TortugaThread tortuga = new TortugaThread();
        Thread liebre = new Thread(new LiebreThread());

        tortuga.start();
        liebre.start();
    }
}
