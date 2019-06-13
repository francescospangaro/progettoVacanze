/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettovacanze;

/**
 *
 * @author Francesco Spangaro
 */
public class Casella {
    private int posX;
    private int posY;
    private DatiCondivisi ptrDati;
    private boolean mela;

    public Casella(int posX, int posY, DatiCondivisi ptrDati) {
        this.posX = posX;
        this.posY = posY;
        this.ptrDati = ptrDati;
        this.mela = false;
    }

    public void setMela(boolean mela){
        this.mela = mela;
    }
    
    public boolean getMela(){
        return this.mela;
    }
    
    public Casella() {
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    
    public void setPtrDati(DatiCondivisi ptrDati){
        this.ptrDati = ptrDati;
    }
    
    public DatiCondivisi getPtrDati(){
        return this.ptrDati;
    }
    
}
