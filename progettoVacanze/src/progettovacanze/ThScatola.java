/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettovacanze;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Francesco Spangaro
 */
public class ThScatola extends Thread{
    private Casella casella;
    private DatiCondivisi ptrDati;
    private boolean mela;
    private boolean snake;

    public ThScatola(DatiCondivisi ptrDati, int numX, int numY) {
        this.ptrDati = ptrDati;
        if(this.ptrDati.getMela(numX, numY)==true){
            this.mela = true;
        }
        if(this.ptrDati.getSerpente(numX, numY)==true){
            this.snake = true;
        }
    }
    
    public boolean isMela(){
        return this.mela;
    }
    
    public boolean isSnake(){
        return this.snake;
    }
    
    @Override
    public void run(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThScatola.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
