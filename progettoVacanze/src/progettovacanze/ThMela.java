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
public class ThMela extends Thread{
    private DatiCondivisi ptrDati;
    private Mela mela;
    private int xMela;
    private int yMela;

    public ThMela(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
        this.mela = ptrDati.getMela();
        this.xMela = mela.getPosX();
        this.yMela = mela.getPosY();
    }

    public ThMela() {
    }

    public DatiCondivisi getPtrDati() {
        return ptrDati;
    }

    public void setPtrDati(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
    }

    public Mela getMela() {
        return mela;
    }

    public void setMela(Mela mela) {
        this.mela = mela;
    }

    public int getxMela() {
        return xMela;
    }

    public void setxMela(int xMela) {
        this.xMela = xMela;
    }

    public int getyMela() {
        return yMela;
    }

    public void setyMela(int yMela) {
        this.yMela = yMela;
    }
    
    @Override    
    public void run(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThCasella.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
