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
public class ThCasella extends Thread{
    private Casella casella;
    private DatiCondivisi ptrDati;
    private boolean mela;
    private boolean snake;

    public ThCasella(DatiCondivisi ptrDati, Casella casella) {
        this.ptrDati = ptrDati;
        this.casella = casella;
        this.mela=casella.getMela();
        this.snake=casella.getSnake();
        
    }
    
    public boolean isMela(){
        return this.mela;
    }
    
    public void setMela(){
        this.mela=true;
    }
    
    public boolean isSnake(){
        return this.snake;
    }
    
    public void setSnake(){
        this.snake = true;
    }
    
    @Override
    public void run(){
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThCasella.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
