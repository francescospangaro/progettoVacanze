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
public class ThSnake extends Thread{
    private DatiCondivisi ptrDati;

    public ThSnake(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
    }

    public DatiCondivisi getPtrDati() {
        return ptrDati;
    }

    public void setPtrDati(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
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
